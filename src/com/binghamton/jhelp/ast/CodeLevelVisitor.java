package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyMethodSymbol;
import com.binghamton.jhelp.MyVariableSymbol;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.NilType;
import com.binghamton.jhelp.ParameterizedType;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;
import com.binghamton.jhelp.WildcardType;
import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.error.StyleWarning;
import com.binghamton.jhelp.error.UnimplementedFeatureWarning;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;
import static com.binghamton.jhelp.ast.NameExpression.Kind;

/**
 * The code (lowest) level Visitor for visiting each line of code contained
 * within all declarations.
 */
public class CodeLevelVisitor extends BodyLevelVisitor {

    private Set<String> labels;
    private boolean inJumpContext = false;
    private boolean staticContext = false;
    private MyMethodSymbol currentMethod;
    private NamedSymbolTable<VariableSymbol> currentScope;
    private final BodyLevelVisitor superVisitor;

    /**
     * Constructs a CodeLevelVisitor for a given Program
     * @param program the Program to visit
     * @param superVisitor the BodyLevelVisitor to use to visit the bodies of
     *        anonymous classes
     */
    public CodeLevelVisitor(Program program, BodyLevelVisitor superVisitor) {
        super(program);
        this.superVisitor = superVisitor;
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        Expression lhs = ast.getLHS();
        NameExpression rhs = ast.getRHS();

        lhs.accept(this);
        Type lType = lhs.getType();

        // rhs is guaranteed to be unqualified NameExpression
        // instead of visiting, we just hoist its data
        visitAnnotations(rhs.getAnnotations());
        String rName = rhs.getName();
        Kind rKind = rhs.getKind();

        if (lType != null) {
            if (rKind == Kind.TYPE) {
                Type type = lType.getClassSymbol().getType(rName);
                if (type != null) {
                    ast.setType(type);
                } else {
                    addError(rhs,
                             lType.getClassSymbol().getName() + " has no type named " + rName,
                             String.format("Did you make a typo or forget to add %s to %s?",
                                           rName,
                                           lType.getClassSymbol().getName()));
                }
            } else if (rKind == Kind.EXPRESSION) {
                VariableSymbol var = lType.getClassSymbol().getField(rName);
                if (var != null) {
                    ast.setSymbol(var);
                    ast.setType(var.getType());
                } else {
                    addError(rhs,
                             lType.getClassSymbol().getName() + " has no field named " + rName,
                             String.format("Did you make a typo or forget to add %s to %s?",
                                           rName,
                                           lType.getClassSymbol().getName()));
                }
            } else if (rKind == Kind.METHOD) {
                // set type to type of lhs
                // call will use that type when hoisting name in method resolution
                ast.setType(lType);
            }
        } else {
            super.visit(ast);
        }
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        Expression arg;
        MethodSymbol method;
        Set<String> needed = new HashSet<>();
        ClassSymbol ann;

        if (ast.getType() == null) {
            updateSuperVisitor();
            superVisitor.visit(ast);
        }
        ann = ast.getType();

        for (MethodSymbol m : ann.getDeclaredMethods()) {
            if (!m.hasModifier(Modifier.DEFAULT)) {
                needed.add(m.getName());
            }
        }
        if (ast.isSingleElement()) {
            arg = ast.getSingleValue();
            arg.accept(this);
            if (needed.size() != 1) {
                addError(ast,
                         ann.getName() + " requires more than one argument",
                         "Supply the missing necessary arguments");
            } else {
                method = ann.getMethod(needed.toArray(new String[1])[0]);
                annotationTypeCheck(method.getReturnType(), arg);
            }
        } else {
            for (Token id : ast.getArguments().keySet()) {
                method = ann.getMethod(id.getText());
                if (method != null) {
                    needed.remove(id);
                    arg = ast.getValue(id);
                    arg.accept(this);
                    annotationTypeCheck(method.getReturnType(), arg);
                } else {
                    addError((MyToken)id,
                             id.getText() + " is not a known element of " + ann.getName(),
                             "Add the element to the annotation or omit the argument");
                }
            }
            if (!needed.isEmpty()) {
                addError(ast,
                         "Insufficient arguments, necessary annotation elements are missing",
                         "Supply the missing necessary arguments");
            }
        }
    }

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast) {
        ast.getArrayExpression().accept(this);
        Type arrayType = ast.getArrayExpression().getType();
        if (arrayType.rank() == 0) {
            addError(ast.getArrayExpression(),
                     "An array access must be on an array type",
                     "Change the type to be an array type");
        }
        ast.getIndexExpression().accept(this);
        if (!unaryPromotion(ast.getIndexExpression()).equals(PrimitiveType.INT)) {
            addError(ast.getIndexExpression(),
                     "An array access must be with an expression that evaluates to an int",
                     "Change the index expression to evaluate to an int");
        }
        if (arrayType.rank() != 0) {
            ast.setType(((ArrayType)arrayType).getBaseType());
        }
    }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) {
        ast.getElementTypeExpression().accept(this);
        int dims = 0;
        Type baseType = ast.getElementTypeExpression().getType();
        if (!baseType.isReifiable()) {
            addError(ast.getElementTypeExpression(),
                     "The base type of an array must be reifiable",
                     "Use a reifiable type or a different data structure");
        }
        if (ast.hasDimensionExpressions()) {
            for (DimensionExpression de : ast.getDimensionExpressions()) {
                de.accept(this);
                if (!unaryPromotion(de).equals(PrimitiveType.INT)) {
                    addError(de,
                             "An array must be constructed with an integer dimension",
                             "Provide an integer dimension");
                }
                ++dims;
            }
        }
        for (Dimension d : ast.getDimensions()) {
            d.accept(this);
            ++dims;
        }
        for (int i = 0; i < dims; i++) {
            baseType = new ArrayType(baseType);
            baseType.setProgram(program);
        }
        if (ast.hasInitializer()) {
            ast.getInitializer().setInferredType(baseType);
            ast.getInitializer().accept(this);
            // TODO will this always be true?
            if (!baseType.equals(ast.getInitializer().getType())) {
                addError(ast,
                         "An array must be initialized with elements of the same type as the declared element type of the array",
                         "Correct the type of each specified element of the array");
            }
        }
        ast.setType(baseType);
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        Type baseType = ((ArrayType)ast.getInferredType()).getBaseType();
        if (!baseType.isReifiable()) {
            addError(ast,
                     "The element type of array initializer must be reifiable",
                     "Ensure each element is of a reifiable type");
        }
        for (Expression e : ast.getInitializers()) {
            e.accept(this);
            if (!isAssignable(baseType, e.getType())) {
                addError(e,
                         "Elements of array initializer must correspond to the declared base type of the array",
                         "Correct the type of each specified element in the array initializer");
            }
        }
        ast.setType(ast.getInferredType());
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        Type condType = ast.getCondition().getType();
        if (!isBooleanLike(condType)) {
            addError(ast.getCondition(),
                     "An assert condition must evaluate to a boolean",
                     "Ensure the expression results in a boolean");
        }
        if (ast.hasMessage()) {
            ast.getMessage().accept(this);
            if (ast.getMessage().getType().equals(PrimitiveType.VOID)) {
                addError(ast.getMessage(),
                         "An assert message cannot result in a void type",
                         "Change the message expression to result in a non-void type");
            }
        }
    }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().setInferredType(ast.getLHS().getType());
        ast.getRHS().accept(this);
        Type lType = ast.getLHS().getType();
        Symbol lval = ast.getLHS().getSymbol();

        // lval will be null if lhs is array access since array elements can never be final
        if (lval != null &&
            lval.isFinal() &&
            (currentMethod != null &&
             !currentMethod.isConstructor())) {
            addError(ast.getLHS(),
                     "A final variable cannot be assigned to",
                     "Make the variable non-final or do not assign to it");
        }
        if (ast.isSimple()) {
            if (!isAssignable(lType, ast.getRHS().getType())) {
                addError(ast,
                         "The type of the right hand side is not compatible with the type of the left hand side",
                         "Change either the left or right hand side such that the types are compatible");
            }
        } else {
            BinaryExpression synthBin = new BinaryExpression(ast.getLHS(),
                                                             ast.getOperator(),
                                                             ast.getRHS());
            synthBin.accept(this);
            if (!canCast(synthBin.getType(), lType)) {
                addError(ast,
                         "The type of the right hand side is not compatible with the type of the left hand side",
                         "Change either the left or right hand side such that the types are compatible");
            }
        }
        ast.setType(lType.captureConvert());
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
        Type lType = ast.getLHS().getType();
        Type rType = ast.getRHS().getType();
        ClassSymbol STRING_TYPE = fetch("String");
        BinaryOperator op = ast.getOperator();
        if (op.undergoesBinaryPromotion()) {
            if (op == BinaryOperator.ADDITION &&
                (lType.equals(STRING_TYPE) ||
                 rType.equals(STRING_TYPE))) {
                ast.setType(STRING_TYPE);
            } else {
                if (!isNumericLike(lType)) {
                    addError(ast.getLHS(),
                             "The " + op + " operator expects a left hand side with numeric type",
                             "Change the left hand side to result in a numeric type");
                } else if (!isNumericLike(rType)) {
                    addError(ast.getRHS(),
                             "The " + op + " operator expects a right hand side with numeric type",
                             "Change the right hand side to result in a numeric type");
                } else {
                    Type ret = binaryPromotion(ast.getLHS(), ast.getRHS());
                    if (op.isRelational()) {
                        ast.setType(PrimitiveType.BOOLEAN);
                    } else {
                        ast.setType(ret);
                    }
                }
            }
        } else if (op.isShift()) {
            lType = unaryPromotion(ast.getLHS());
            rType = unaryPromotion(ast.getRHS());
            if (!lType.equals(PrimitiveType.INT)) {
                addError(ast.getLHS(),
                         "The " + op + " shift operand expects a left hand with int type",
                         "Change the left hand side to result in a numeric type");
            } else if (!rType.equals(PrimitiveType.INT)) {
                addError(ast.getRHS(),
                         "The " + op + " shift operand expects a right hand with int type",
                         "Change the right hand side to result in a numeric type");
            }
            ast.setType(lType);
        } else if (op == BinaryOperator.INSTANCE_OF) {
            if (!lType.isReference() && lType != NilType.TYPE) {
                addError(ast.getLHS(),
                         "The left hand side of the instanceof operator must be of a reference type or null",
                         "Change the left hand side to be a reference type or null");
            } else if (!rType.isReference() || !rType.isReifiable()) {
                addError(ast.getRHS(),
                         "The right hand side of the instanceof operator must be a reifiable reference type",
                         "Change the right hand side to be a reifiable reference type");
            } else if (!canCast(lType, rType)) {
                addError(ast,
                         "The left hand side could never be an instance of the right hand side",
                         "Change either side such that the left hand side could be an instance of the right hand side");
            }
            ast.setType(PrimitiveType.BOOLEAN);
        } else if (op.isEquality()) {
            if ((isNumericLike(lType) && isNumericLike(rType)) ||
                (isBooleanLike(lType) && isBooleanLike(rType))) {
                ast.setType(PrimitiveType.BOOLEAN);
            } else if ((lType.isReference() || lType == NilType.TYPE) &&
                       (rType.isReference() || rType == NilType.TYPE)) {
                if (lType != NilType.TYPE &&
                    rType != NilType.TYPE &&
                    !canCast(lType, rType)) {
                    addError(ast,
                             "The left hand side could never be equal to the right hand side",
                             "Change either side such that they could be equal or use the 'equals' method");
                }
                ast.setType(PrimitiveType.BOOLEAN);
            } else {
                addError(ast,
                         "The " + op + " operator expects reference types or numeric types",
                         "Provide reference types or numeric types");
            }
        } else if (op.isBitwise()) {
            if ((isNumericLike(lType) && isNumericLike(rType)) ||
                (isBooleanLike(lType) && isBooleanLike(rType))) {
                ast.setType(binaryPromotion(ast.getLHS(), ast.getRHS()));
            } else {
                addError("The bitwise operator, " + op + ", requires two numbers or two booleans",
                         "Provide two numbers or two boolean values");
            }
        } else if (op.isLogical()) {
            if (isBooleanLike(lType) && isBooleanLike(rType)) {
                ast.setType(PrimitiveType.BOOLEAN);
            }
        }
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        currentScope.enterScope();
        for (Statement stmt : ast.getStatements()) {
            try {
                stmt.accept(this);
            } catch (Exception e) {
                // e.printStackTrace();
                // squelched
            }
        }
        currentScope.exitScope();
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = ast.getSymbol();
        currentScope = currentClass.getFieldTable();

        for (VariableDeclaration v : ast.getFields()) {
            try {
                v.accept(this);
            } catch (Exception e) {
                // e.printStackTrace();
                // squelched
            }
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
        MyClassSymbol tmp = currentClass;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = tmp;
        }

        if (!currentClass.isTop()) {
            currentScope = currentClass.getDeclaringClass().getFieldTable();
        }
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        MethodSymbol m = resolveMethod(ast, ast.getName() == null);
        if (ast.hasTypeArguments()) {
            addError(new UnimplementedFeatureWarning(ast.getArgument(0),
                                                     "Calls to generic methods"));
        }
        // TODO check method appropriate (15.12.3)
        ast.setSymbol(m);
        if (m != null) {
            System.out.println("method resolved to return: " + m.getReturnType());
            ast.setType(m.getReturnType());
        } else {
            // System.out.println("UNABLE to resolve: " + ast);
            addError(ast.getName(),
                     "The call to method " + ast.getName().getText() + " could not be resolved",
                     "Supply the proper arguments or change the method's parameters");
        }
    }

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast) {
        for (Expression e : ast.getLabels()) {
            e.accept(this);
        }
    }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) {
        ast.getSourceExpression().accept(this);
        Type sourceType = ast.getSourceExpression().getType();
        ast.getTargetExpression().accept(this);
        Type targetType = ast.getTargetExpression().getType();
        if (ast.hasBounds()) {
            if (ast.getBoundExpressions().size() > 1) {
                addError(new UnimplementedFeatureWarning(ast.getBoundExpressions().get(1),
                                                         "casts with additional bounds"));
            }
            if (!(targetType instanceof ClassSymbol)) {
                addError(ast.getTargetExpression(),
                         "A cast with bounds must cast to a class or interface type",
                         "Change the bounds to name class or interface types");
            }
            for (Expression bound : ast.getBoundExpressions()) {
                bound.accept(this);
            }
        }
        if (!canCast(sourceType, targetType)) {
            addError(ast,
                     "The source type could never be cast to the target type",
                     "Alter either the source or target types or alter their inheritance hierarchies");
        }
        ast.setType(targetType.captureConvert());
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        Type[] exTypes = new Type[ast.getExceptionTypes().size()];
        int pos = 0;
        boolean error = false;
        for (Expression expr : ast.getExceptionTypes()) {
            expr.accept(this);
            if (!expr.getType().getClassSymbol().extendsClass(fetch("Throwable"))) {
                addError(expr,
                         "Cannot catch an Object that is not an exception",
                         "Change " + expr.getType().getClassSymbol().getName() + " to extend Throwable or remove the catch block");
                error = true;
            }
            else if (expr.getType() instanceof TypeVariable) {
                addError(expr,
                         "Cannot catch a type variable",
                         "Change the type to name a class or interface that extends Throwable");
                error = true;
            } else {
                exTypes[pos] = expr.getType();
                ++pos;
            }
        }

        if (!error) {
            currentScope.enterScope();
            MyVariableSymbol var = new MyVariableSymbol(ast.getVariable().getName(),
                                                        ast.getVariable().getModifiers());
            var.setProgram(program);
            var.setAnnotations(makeAnnotations(ast.getVariable().getAnnotations()));
            if (exTypes.length == 1) {
                var.setType(exTypes[0]);
            } else {
                addError(new UnimplementedFeatureWarning(ast.getVariable(),
                                                         "Multi-catch clauses"));
            }
            ast.getVariable().setSymbol(var);
            currentScope.put(var);
            visit((Block)ast);
            currentScope.exitScope();
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        // first see if exists, if does, visit members,
        // otherwise must be local or anon, or inner of the one of the former
        // add to appropriate tables and visit and establish member decl.s

        // TODO local/anonymous but not enum constant anonymous


        for (MethodDeclaration ctor : ast.getConstructors()) {
            ctor.accept(this);
        }
        for (Block sB : ast.getStaticInitializers()) {
            inJumpContext = false;
            labels = new HashSet<>();
            sB.accept(this);
        }
        for (Block iB : ast.getInstanceInitializers()) {
            inJumpContext = false;
            labels = new HashSet<>();
            iB.accept(this);
        }

    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        // override to do nothing
    }

    /**
     * Visit a ClassLiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteralExpression ast) {
        ast.getTypeExpression().accept(this);
        Type type = ast.getTypeExpression().getType();
        Type tmp = type.box();
        if (tmp != null) {
            type = tmp;
        }
        if (!type.isValidClassLiteralType()) {
            addError(ast.getTypeExpression(),
                     "A class literal must be of valid type",
                     "Provide a valid type, such as a class or array");
        }
        ast.setType(new ParameterizedType(fetch("Class"), type));
        ast.getType().setProgram(program);
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        visitAnnotations(ast.getAnnotations());
        ast.getExpression().accept(this);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        Type[] ctorParamTypes = new Type[ast.getArguments().size()];
        int pos = 0;
        for (Expression arg : ast.getArguments()) {
            arg.accept(this);
            ctorParamTypes[pos] = arg.getType();
            ++pos;
        }

        MethodSymbol ctor = resolveCtorForAnonymousClass(ast.getSymbol().getType().getClassSymbol(),
                                                         ctorParamTypes,
                                                         new ArrayList<Type>());
        if (ctor == null) {
            addError(ast,
                     "Cannot find a constructor for the given arguments to the enum constant",
                     "Supply the proper argument types or add an appropriate constructor to the enum");
        }

        if (!ast.isEmpty()) {
            MyClassSymbol tmp = currentClass;
            ClassDeclaration bodyAST = ast.getBody();
            bodyAST.setAnonymousParameterTypes(ctor.getParameterTypes());
            MyClassSymbol constant = new MyClassSymbol(currentClass, currentClass);
            constant.setProgram(program);
            constant.setSuperClassForEnumConstant();
            bodyAST.setSymbol(constant);
            updateSuperVisitor();
            bodyAST.accept(superVisitor);
            if (constant.hasAbstractMethod()) {
                addError(ast.getName(),
                         "An enum constant body cannot declare abstract methods",
                         "Remove the abstract methods or make them non-abstract");
            }

            bodyAST.accept(this);
            currentClass = tmp;
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        for (EnumConstant c : ast.getConstants()) {
            c.accept(this);
        }
    }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) {
        inJumpContext = true;
        currentScope.enterScope();
        ast.getVariable().accept(this);
        ast.getIterable().accept(this);
        Type type = ast.getIterable().getType();
        VariableSymbol var = ast.getVariable().getSymbol();
        if (type.rank() > 0 ||
            type.getClassSymbol().implementsInterface(fetch("Iterable"))) {
            Type source;
            if (type.rank() > 0) {
                source = ((ArrayType)type).getBaseType();
            } else {
                source = ((ParameterizedType)type).getParameter(0);
            }
            if (!isAssignable(var.getType(), source)) {
                addError(ast.getIterable(),
                         "The type of elements being iterated over does not match the type of the variable declared in this loop",
                         "Alter the type of the iteration variable or the type of the Iterable");
            }
        } else {
            addError(ast.getIterable(),
                     "For each loops must iterate over arrays or an implementor of the Iterable interface",
                     "Specify an array or Iterable to iterate over");
        }
        // TODO this is wrong!
        visit((Block)ast);
        currentScope.exitScope();
    }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) {
        inJumpContext = true;
        currentScope.enterScope();
        for (Statement init : ast.getInitializers()) {
            init.accept(this);
        }
        if (!ast.getCondition().isNil()) {
            ast.getCondition().accept(this);
            if (!isBooleanLike(ast.getCondition().getType())) {
                addError(ast.getCondition(),
                         "The condition in a for loop must evaluate to a boolean",
                         "Change the condition to result in a boolean");
            }
        } else {
            ast.getCondition().setType(PrimitiveType.BOOLEAN);
        }

        for (Statement up : ast.getUpdaters()) {
            up.accept(this);
        }
        visit((Block)ast);
        currentScope.exitScope();
    }

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            addError(ast.getCondition(),
                     "The condition in an if statement must evaluate to a boolean",
                     "Change the condition to result in a boolean");
        }
        ast.getThenBlock().accept(this);
        ast.getElseBlock().accept(this);
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        Type consType = ast.getSymbol().getReturnType();
        ClassSymbol consCls = consType.getClassSymbol();
        ast.setType(consType);
        if (consType instanceof ParameterizedType) {
            Type[] tArgs = ((ParameterizedType)consType).getParameters();
            if (tArgs.length == 0) {
                if (ast.hasAnonymousClass()) {
                    addError(ast.getMethod(),
                             "Cannot use diamond operator to instantiate an anonymous class",
                             "Specify type arguments");
                }
                if (ast.getTypeArguments().size() > 0) {
                    addError(ast.getMethod(),
                             "Cannot supply type arguments to the constructor but use the diamond operator when specifying the class",
                             "Do not supply type arguments to the constructor or specify type arguments to the class");
                }
            }
            if (!consCls.isGeneric() && !ast.hasAnonymousClass()) {
                addError(ast.getMethod(),
                         "Cannot specify type arguments when constructing a non-generic class",
                         "Remove the type arguments or make the class generic");
            }
            int index = 0;
            for (Type tArg : tArgs) {
                if (tArg instanceof WildcardType) {
                    addError(ast.getArgument(index),
                             "Constructor cannot take a wildcard type argument",
                             "Specify a type argument that is not a wildcard");
                }
                ++index;
            }
        }
        if (consCls.isGeneric() && !ast.argsSupplied()) {
            ast.setType(((ParameterizedType)ast.getType()).getWrappedType());
            addError(new StyleWarning(ast.getMethod(),
                                      "Constructing a generic class without type arguments is not recommended",
                                      "Specify type arguments or use the diamond operator '<>'"));
        }
        if (consCls.isEnum()) {
            addError(ast.getMethod(),
                     "Cannot construct an enum",
                     "Refer directly to an enum constant");
        }
        if (!ast.hasAnonymousClass()) {
            if (consCls.isAbstract()) {
                addError(ast.getMethod(),
                         "Cannot construct an abstract class or interface without specifying an anonymous subclass",
                         "Specify an anonymous subclass body");
            }
        } else {
            if (consCls.isFinal()) {
                addError(ast.getMethod(),
                         "Cannot subclass a final class, even with an anonymous class",
                         "Remove the anonymous class body or make the class non-final");
            }
            MyClassSymbol anonCls = new MyClassSymbol(currentClass, consCls);
            anonCls.setProgram(program);
            if (consCls.isInterfaceLike()) {
                anonCls.setSuperClassForClass();
                anonCls.addInterface(consCls);
            } else {
                anonCls.setSuperClass(consCls);
            }

            ClassDeclaration bodyAST = ast.getAnonymousClass();
            bodyAST.setSymbol(anonCls);
            MethodSymbol ctor = ast.getSymbol();
            bodyAST.setAnonymousParameterTypes(ctor.getParameterTypes());

            MyClassSymbol tmp = currentClass;
            updateSuperVisitor();
            bodyAST.accept(superVisitor);
            if (bodyAST.numConstructors() > 0) {
                addError(ast.getMethod(),
                         "Anonymous classes cannot declare any constructors",
                         "Remove all constructors");
            }

            bodyAST.accept(this);
            currentClass = tmp;
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        // override to do nothing
    }

    /**
     * Visit a JumpStatement node
     * @param ast the AST node being visited
     */
    public void visit(JumpStatement ast) {
        if (!inJumpContext) {
            addError(ast,
                     "Cannot jump outside of a switch, (do)while, or for statement",
                     "Remove the jump statement or move it inside a loop statement");
        }
        if (ast.isLabelled() &&
            !labels.contains(ast.getLabel())) {
            addError(ast.getLabel(),
                     "Unknown label " + ast.getLabel(),
                     "Introduce a label named " + ast.getLabel());
        }
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        if (!labels.add(ast.getLabel().getText())) {
            addError(ast.getLabel(),
                     "Label with that name already exists in current scope",
                     "Rename or remove the duplicate label");
        }
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        addError(new UnimplementedFeatureWarning(ast.getFirstToken(),
                                                 "Lambda expressions"));
    }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) {
        if (ast.getType() == null) {
            if (ast.getValue().charAt(0) == '"') {
                ast.setType(fetch("String"));
            } else {
                ast.setType(NilType.TYPE);
            }
        }
    }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast) {
        MyClassSymbol decl = currentClass;
        ConcreteBodyDeclaration cls = ast.getDeclaration();
        cls.setKind(BodyDeclaration.Kind.LOCAL);

        // TODO
        // TODO also sidenote, check other uses of super, do those states need to synced
        //        should i be making protected static versions of those super methods that get called so I can call them from down here?
        //        or just duplicate the necessary logic if its enough of a subset/specialized?

        cls.getSymbol().setLocal();
        if (cls.getSymbol().hasModifier(Modifier.STATIC)) {
            addError(ast.getDeclaration().getName(),
                     "Local class cannot have the 'static' modifier",
                     "Remove the 'static' modifier or move the class to be non-local");
        }
        if (cls.getSymbol().getAccessLevel() != Symbol.AccessLevel.PACKAGE_PRIVATE) {
            addError(ast.getDeclaration().getName(),
                     "Local class cannot have an access modifier",
                     "Remove the access modifier");
        }
        currentClass = decl;
    }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast) {
        for (VariableDeclaration var : ast.getVariables()) {
            var.accept(this);
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        currentMethod = ast.getSymbol();
        visitAnnotations(ast.getAnnotations());
        inJumpContext = false;
        labels = new HashSet<>();
        Type retType = ast.getSymbol().getReturnType();
        currentScope.enterScope();
        for (VariableDeclaration param : ast.getParameters()) {
            param.accept(this);
        }
        ast.getBody().accept(this);
        currentScope.exitScope();
        currentMethod = null;
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        addError(new UnimplementedFeatureWarning(ast.getFirstToken(),
                                                 "Method references"));
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        AnnotationSymbol[] anns = makeAnnotations(ast.getAnnotations());
        String rName = ast.getToken().getText();
        NameExpression qual = ast.getQualifyingName();
        VariableSymbol var;
        Type type;
        if (ast.getKind() == Kind.AMBIGUOUS) {
            if (!ast.isQualified()) {
                var = currentScope.get(rName);
                if (var == null) {
                    var = currentUnit.getImportedField(rName);
                }
                if (var != null) {
                    ast.setKind(Kind.EXPRESSION);
                    ast.setSymbol(var);
                    ast.setType(var.getType());
                } else {
                    super.visit(ast);
                }
            } else {
                qual.accept(this);
                if (qual.getKind() == Kind.PACKAGE) {
                    ast.setKind(Kind.PACKAGE_OR_TYPE);
                    super.visit(ast);
                } else {
                    type = qual.getType();
                    if (type.getClassSymbol().hasMember(rName)) {
                        ast.setKind(Kind.EXPRESSION);
                    } else if (type.getClassSymbol().hasMemberType(rName)) {
                        ast.setKind(Kind.TYPE);
                    } else {
                        addError(ast.getToken(),
                                 "Could not find such a qualified field, method, or type belonging to the class " + type.getClassSymbol().getName(),
                                 "Did you forget to add such a member to the class or make a typo?");
                    }
                }
            }
        }

        if (ast.getKind() == Kind.EXPRESSION) {
            if (!ast.isQualified()) {
                var = currentScope.get(rName);
                if (var == null) {
                    var = currentUnit.getImportedField(rName);
                }
                if (var != null) {
                    ast.setSymbol(var);
                    ast.setType(var.getType());
                } else {
                    addError(ast,
                             "A variable named " + rName + " is not in scope",
                             "Introduce a variable named " + rName);
                }
            } else {
                switch(qual.getKind()) {
                case PACKAGE:
                    addError(ast.getToken(),
                             "Cannot access a variable from a package",
                             "Qualify the variable with the name of a class, not a package");
                    break;
                case TYPE:
                    var = qual.getType().getClassSymbol().getField(rName);
                    if (var != null) {
                        if (var.isStatic()) {
                            ast.setSymbol(var);
                            ast.setType(var.getType().captureConvert());
                        } else {
                            addError(ast.getToken(),
                                     "Cannot access an instance field statically",
                                     "Access the field with an instance of the class, not the class name");
                        }
                    } else {
                        addError(ast.getToken(),
                                 "The class " + qual.getType().getClassSymbol().getName() + " does not have a field with that name",
                                 "Fix the typo or add a field with that name to that class");
                    }
                    break;
                case EXPRESSION:
                    type = qual.getType();
                    if (type.isReference()) {
                        var = type.getClassSymbol().getField(rName);
                        if (var != null) {
                            ast.setSymbol(var);
                            ast.setType(var.getType().captureConvert());
                        } else {
                            addError(ast.getToken(),
                                 "The class " + qual.getType().getClassSymbol().getName() + " does not have a field with that name",
                                 "Fix the typo or add a field with that name to that class");
                        }
                    } else {
                        addError(ast.getToken(),
                                 "Cannot access a field from a non-reference type",
                                 "Change the type to be a reference type");
                    }
                    break;
                }
            }
        } else if (ast.getKind() == Kind.TYPE) {
            ClassSymbol cls = null;
            if ("super".equals(rName) || "this".equals(rName)) {
                if (ast.isQualified()) {
                    type = qual.getType();
                    if (type != null) {
                        type.setAnnotations(anns);
                        cls = type.getClassSymbol();
                    }
                } else {
                    cls = currentClass;
                }
            }
            if (cls == null) {
                super.visit(ast);
            } else if ("super".equals(rName)) {
                ast.setType(cls.getSuperClass());
            } else {
                ast.setType(cls);
            }
        } else if (ast.getKind() != Kind.METHOD) {
            super.visit(ast);
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        visitAnnotations(ast.getAnnotations());
    }

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast) {
        if (currentMethod == null) {
            addError(ast,
                     "Return statements can only go in methods or constructors",
                     "Remove the return statement or move it into a method or constructor");
        } else {
            Type expRetType = currentMethod.getReturnType();
            if (ast.getExpression().isNil()) {
                if (!currentMethod.isConstructor() &&
                    !expRetType.equals(PrimitiveType.VOID)) {
                    addError(ast,
                             "Empty return can only go in constructor or methods that return void",
                             "Remove the return, specify a return value, or change the method return type to 'void'");
                }
            } else {
                ast.getExpression().accept(this);
                Type retType = ast.getExpression().getType();
                if (!isAssignable(expRetType, retType)) {
                    addError(ast.getExpression(),
                             "Return type does not match the method's return type",
                             "Change the return statement's type to match the method's or change the method return type");
                } else {
                    System.out.println("looks like " + retType + " is assignable to " + expRetType);
                    System.out.println(isAssignable(retType, expRetType));
                }
            }
        }
    }

    /**
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast) {
        boolean seenDefault = false;
        List<String> caseConstants = new ArrayList<>();
        ast.getSwitchExpression().accept(this);
        Type condType = ast.getSwitchExpression().getType();
        Type caseType;
        ClassSymbol enumClass = null;
        ClassSymbol caseClass;
        inJumpContext = true;
        if (condType.getClassSymbol().isEnum()) {
            enumClass = condType.getClassSymbol();
        }
        if (!isValidSwitchType(condType)) {
            addError(ast.getSwitchExpression(),
                     "Switch condition type must be an int, String or enum",
                     "Change condition type to be int, String, or enum");
        }
        currentScope.enterScope();
        for (CaseBlock cB: ast.getCases()) {
            cB.accept(this);
            for (Expression labelExpr : cB.getLabels()) {
                caseType = labelExpr.getType();
                if (labelExpr.getText().equals("default")) {
                    if (seenDefault) {
                        addError(labelExpr,
                                 "A switch statement can only have one default case",
                                 "Merge the code into the first default case and remove the repetitive label");
                    }
                    seenDefault = true;
                    continue;
                }
                if (!isAssignable(condType, caseType)) {
                    addError(labelExpr,
                             "Switch label type must be compatible with type in switch condition",
                             "Change label type to match that of switch condition");
                }
                if (enumClass != null) {
                    caseClass = caseType.getClassSymbol();
                    if (enumClass.getField(labelExpr.getText()) == null) {
                        addError(labelExpr,
                                 "Switch statements over enums can only have constants of that enum",
                                 "Remove this label or add it as an enum constant of that enum");
                    }
                }
                if (labelExpr.getText().equals("null")) {
                    addError(labelExpr,
                             "Switch labels cannot be 'null'",
                             "Change the label to be non-null");
                }

                if (!caseConstants.add(labelExpr.getText())) {
                    addError(labelExpr,
                             "Switch labels cannot be repeated",
                             "Merge the code into the first unique label and remove the repetitive label");
                }
            }
        }
        currentScope.exitScope();
    }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) {
        ast.getLock().accept(this);
        if (!ast.getLock().getType().isReference()) {
            addError(ast.getLock(),
                     "Can only synchronize on a reference type",
                     "Specify a reference type to synchronize on");
        }
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            addError(ast.getCondition(),
                     "A ternary expression condition must be boolean type",
                     "Specify a boolean type for the condition");
        }
        ast.getThenExpression().accept(this);
        ast.getElseExpression().accept(this);
        Type lType = ast.getThenExpression().getType();
        Type rType = ast.getElseExpression().getType();
        if (lType.equals(PrimitiveType.VOID)) {
            addError(ast.getThenExpression(),
                     "The then expression of a ternary expression cannot be void",
                     "Specify a non-void then expression");
        } else if (rType.equals(PrimitiveType.VOID)) {
            addError(ast.getElseExpression(),
                     "The else expression of a ternary expression cannot be void",
                     "Specify a non-void else expression");
        }
        if (lType.equals(rType)) {
            ast.setType(lType);
        } else if (lType.equals(PrimitiveType.BOOLEAN) ||
                   rType.equals(PrimitiveType.BOOLEAN)) {
            ast.setType(PrimitiveType.BOOLEAN);
        } else if (isNumericLike(lType) && isNumericLike(rType)) {
            Type ulType = lType.unbox();
            if (ulType != null) {
                lType = ulType;
            }
            Type urType = rType.unbox();
            if (urType != null) {
                rType = urType;
            }

            if (ulType.equals(urType)) {
                ast.setType(ulType);
            } else if ((ulType.equals(PrimitiveType.BYTE) ||
                        urType.equals(PrimitiveType.BYTE)) &&
                       (ulType.equals(PrimitiveType.SHORT) ||
                        urType.equals(PrimitiveType.SHORT))) {
                ast.setType(PrimitiveType.SHORT);
                // skipped over 15.25.2, if int representable in T ...
            } else {
                ast.setType(binaryPromotion(ast.getThenExpression(),
                                            ast.getElseExpression()));
            }
        } else {
            if (lType == NilType.TYPE) {
                ast.setType(rType);
            } else if (rType == NilType.TYPE) {
                ast.setType(lType);
            } else {
                ast.setType(Type.lub(lType.box(), rType.box()).captureConvert());
            }
        }
    }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) {
        Expression expr = ast.getExpression();
        expr.accept(this);
        Type type = expr.getType();
        if (type != NilType.TYPE && !isAssignable(type, fetch("Throwable"))) {
            addError(expr,
                     "Can only throw null or an instance of the Throwable class",
                     "Throw null or an instance of the Throwable class");
        }
        if (type != NilType.TYPE &&
            !type.getClassSymbol().isUncheckedException()) {
            boolean good = false;
            if (currentMethod != null) {
                for (Type exType : currentMethod.getExceptionTypes()) {
                    if (isAssignable(exType, type)) {
                        good = true;
                        break;
                    }
                }
            }
            if (!good) {
                addError(expr,
                         "Throw statement must throw null, an unchecked exception, or be in a method that throws that exception type",
                         "Change the statement to throw null or an unchecked exception or add the exception to the list of the exceptions this methods throws");
            }
        }
    }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) {
        currentScope.enterScope();
        for (VariableDeclaration var : ast.getResources()) {
            var.accept(this);
            var.getSymbol().addModifier(Modifier.FINAL);
            if (!var.getSymbol().getType().getClassSymbol().implementsInterface(fetch("AutoCloseable"))) {
                addError(var,
                         "The resource in a try-with-resources block must implement the AutoCloseable interface",
                         "Change the type of the resource or have it implement the AutoCloseable interface");
            }
        }
        ast.getTryBody().accept(this);
        currentScope.exitScope();
        for (CatchBlock cB : ast.getCatches()) {
            cB.accept(this);
        }
        ast.getFinallyBody().accept(this);
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        visitAnnotations(ast.getAnnotations());
        super.visit(ast);
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        visitAnnotations(ast.getAnnotations());
    }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) {
        ast.getExpression().accept(this);
        Type type = ast.getExpression().getType();
        UnaryOperator op = ast.getOperator();
        if (op.isAdditive()) {
            if (!isNumericLike(type)) {
                addError(ast.getExpression(),
                         "The " + op + " operator expects a numeric argument",
                         "Provide a numeric type");
            }
            ast.setType(type);
        } else if (op.isLogical()) {
            if (!isBooleanLike(type)) {
                addError(ast.getExpression(),
                         "The ! operator expectes a boolean argument",
                         "Provide a boolean type");
            }
            ast.setType(PrimitiveType.BOOLEAN);
        } else {
            if (!isNumericLike(type)) {
                addError(ast.getExpression(),
                         "The " + op + " expects a numeric argument",
                         "Provide a numeric argument");
            } else {
                if (op == UnaryOperator.BITWISE_NEGATION &&
                    (type.equals(PrimitiveType.FLOAT) ||
                     type.equals(PrimitiveType.DOUBLE))) {
                    addError(ast.getExpression(),
                             "The ~ operator expects an integer type",
                             "Provide an integer argument");
                }
                ast.setType(unaryPromotion(ast.getExpression()));
            }
            ast.setType(type);
        }
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        MyVariableSymbol var = ast.getSymbol();
        if (var == null) {
            var = new MyVariableSymbol(ast.getName(), ast.getModifiers());
            var.setProgram(program);
            ast.setSymbol(var);
            var.setDeclaringClass(currentClass);
            ast.getExpression().accept(this);
            var.setType(ast.getExpression().getType());
            checkForRawType(var.getType(), ast.getExpression());
        }
        if (!var.isField()) {
            currentScope.put(var);
        }
        visitAnnotations(ast.getAnnotations());
        Expression init = ast.getInitializer();
        init.setInferredType(var.getType());
        init.accept(this);
        if (!init.isNil() && !isAssignable(var.getType(), init.getType())) {
            addError(init,
                     "This variable's declared type does not match the type of its initial value",
                     "Provide an initial value of appropriate type or change the variable's type");
        }
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        inJumpContext = true;
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            addError(ast.getCondition(),
                     "A while loop condition expects a boolean",
                     "Provide a boolean condition");
        }
    }

    private static boolean isBooleanLike(Type type) {
        return type.equals(PrimitiveType.BOOLEAN) ||
            PrimitiveType.BOOLEAN.box().equals(type);
    }

    private static boolean isNumericLike(Type type) {
        if (type instanceof PrimitiveType &&
            ((PrimitiveType)type).isNumeric()) {
            return true;
        }
        PrimitiveType unboxed = type.unbox();
        if (unboxed != null) {
            return unboxed.isNumeric();
        }
        return false;
    }

    private static boolean isValidSwitchType(Type type) {
        return unaryPromotion(type).equals(PrimitiveType.INT) ||
            type.equals(fetch("String")) ||
            type.getClassSymbol().isEnum();
    }

    private static Type unaryPromotion(Type type) {
        if (PrimitiveType.BYTE.box().equals(type) ||
            PrimitiveType.SHORT.box().equals(type) ||
            PrimitiveType.CHAR.box().equals(type) ||
            PrimitiveType.INT.box().equals(type) ||
            type.equals(PrimitiveType.CHAR) ||
            type.equals(PrimitiveType.BYTE) ||
            type.equals(PrimitiveType.SHORT)) {
            return PrimitiveType.INT;
        } else if (PrimitiveType.LONG.box().equals(type)) {
            return PrimitiveType.LONG;
        } else if (PrimitiveType.FLOAT.box().equals(type)) {
            return PrimitiveType.FLOAT;
        } else if (PrimitiveType.DOUBLE.box().equals(type)) {
            return PrimitiveType.DOUBLE;
        }
        return type;
    }

    private static Type unaryPromotion(Expression expr) {
        Type type = unaryPromotion(expr.getType());
        expr.setType(type);
        return type;
    }

    private static Type binaryPromotion(Expression lhs, Expression rhs) {
        Type lType = lhs.getType();
        Type rType = rhs.getType();
        Type tmp = lType.unbox();
        if (tmp != null) {
            lType = tmp;
        }
        tmp = rType.unbox();
        if (tmp != null) {
            rType = tmp;
        }
        if (lType.equals(PrimitiveType.DOUBLE) ||
            rType.equals(PrimitiveType.DOUBLE)) {
            lType = rType = PrimitiveType.DOUBLE;
        } else if (lType.equals(PrimitiveType.FLOAT) ||
                   rType.equals(PrimitiveType.FLOAT)) {
            lType = rType = PrimitiveType.FLOAT;
        } else if (lType.equals(PrimitiveType.LONG) ||
                   rType.equals(PrimitiveType.LONG)) {
            lType = rType = PrimitiveType.LONG;
        } else {
            lType = rType = PrimitiveType.INT;
        }
        lhs.setType(lType);
        rhs.setType(rType);
        return lType;
    }

    private static boolean canCast(Type source, Type target) {
        if (source.canCastTo(target) || isAssignable(target, source)) {
            return true;
        }
        // TODO
        return true;
    }

    private static boolean canUncheckConvert(Type source, Type target) {
        return source.isRaw() &&
            source.getClassSymbol().equals(target.getClassSymbol()) &&
            source.rank() == target.rank();
    }

    /**
     * Determines if rType is equivalent to lType in an assignment-context
     * @param lType the type of the l-value being assigned to
     * @param rType the type of the expression being assigned with
     * @return true iff rType is assignable to lType
     */
    private static boolean isAssignable(Type lType, Type rType) {
        // TODO incomplete, non-recursive
        if (lType.equals(rType) ||
            rType.canWidenTo(lType) ||
            rType == NilType.TYPE && lType.isReference()) {
            System.out.println(lType + " == " + rType);
            System.out.println(lType.equals(rType) + ", " + rType.canWidenTo(lType));
            return true;
        }
        Type boxedRType = rType.box();
        if (boxedRType != null && boxedRType.canWidenTo(lType)) {
            System.out.println("boxed");
            return true;
        }
        Type unboxedRType = rType.unbox();
        if (unboxedRType != null && isAssignable(lType, unboxedRType)) {
            System.out.println("unboxed");
            return true;
        }
        if (canUncheckConvert(rType, lType)) {
            System.out.println("unchecked");
            return true;
        }
        if (rType.equals(PrimitiveType.BYTE) ||
            rType.equals(PrimitiveType.SHORT) ||
            rType.equals(PrimitiveType.CHAR) ||
            rType.equals(PrimitiveType.INT)) {
            Type toUse = lType;
            if (unboxedRType != null) {
                toUse = unboxedRType;
            }
            if (toUse.equals(PrimitiveType.BYTE) ||
                toUse.equals(PrimitiveType.SHORT) ||
                toUse.equals(PrimitiveType.CHAR)) {
                // erroneously assume toUse can represent r-value const. expr.
                System.out.println("primitive narrow");
                return rType.canNarrowTo(toUse);
            }
        }
        return false;
    }

    private void visitAnnotations(Annotation[] asts) {
        for (Annotation ast : asts) {
            ast.accept(this);
        }
    }

    private void annotationTypeCheck(Type expected, Expression arg) {
        Type actual = arg.getType();
        if (!(expected instanceof ArrayType)) {
            if (!isAssignable(expected, actual)) {
                addError(arg,
                         "Invalid annotation element value, must be compatible with element type",
                         "Provide argument with compatible type to element value");
            }
            if (actual == NilType.TYPE) {
                addError(arg,
                         "An annotation element value cannot be null",
                         "Specify a non-null element value");
            }
        }
    }

    private MethodSymbol resolveCtorForAnonymousClass(ClassSymbol superCls,
                                                      Type[] argTypes,
                                                      List<Type> typeArgTypes) {
        MethodSymbol ret = null;
        if (typeArgTypes.isEmpty()) {
            ret = superCls.getConstructor(argTypes);
            if (ret != null) {
                return ret;
            }
        }
        return resolveMethodFromChoices(superCls.getConstructors(),
                                        argTypes,
                                        typeArgTypes);

    }

    private MethodSymbol resolveMethod(CallExpression ast, boolean isCtor) {
        // System.out.println("resolving: " + ast);
        ast.getMethod().setInferredType(ast.getInferredType());
        MethodSymbol ret = null;
        ast.getMethod().accept(this);
        Type owningType = ast.getMethod().getType();
        if (owningType == null) {
            // unqualified method
            owningType = currentClass;
        }
        ClassSymbol owningCls = owningType.getClassSymbol();
        // System.out.println("checking class: " + owningCls.getName());
        // System.out.println("class type: " + owningType.getTypeName());

        // early exit if anonymous subclass of interface,
        // there is no constructor to be found
        if (owningCls.isInterfaceLike() &&
            ast instanceof InstantiationExpression) {
            if (((InstantiationExpression)ast).hasAnonymousClass()) {
                return null;
            }
        }

        Type[] argTypes = new Type[ast.getArguments().size()];
        for (int i = 0; i < argTypes.length; i++) {
            ast.getArgument(i).accept(this);
            argTypes[i] = ast.getArgument(i).getType();
        }

        List<Type> typeArgTypes = new ArrayList<>();
        for (TypeArgument tArg : ast.getTypeArguments()) {
            tArg.accept(this);
            if (tArg.getType() instanceof WildcardType) {
                addError(tArg,
                         "A method cannot take wildcard type arguments",
                         "Provide a type argument that is not a wildcard");
            }
            typeArgTypes.add(tArg.getType());
        }

        // early exit if not generic and types match exactly
        if (typeArgTypes.isEmpty()) {
            if (isCtor) {
                ret = owningCls.getConstructor(argTypes);
            } else {
                ret = owningCls.getMethod(ast.getName().getText(), argTypes);
            }
            if (ret != null) {
                return ret;
            }
        }

        MethodSymbol[] choices;
        if (isCtor) {
            choices = owningCls.getConstructors();
        } else {
            choices = owningCls.getMethodsByName(ast.getName().getText());
        }

        return resolveMethodFromChoices(choices, argTypes, typeArgTypes);
    }

    private MethodSymbol resolveMethodFromChoices(MethodSymbol[] choices,
                                                  Type[] argTypes,
                                                  List<Type> typeArgTypes) {
        MethodSymbol ret = null;
        List<MethodSymbol> potCands = new ArrayList<>();
        for (MethodSymbol m : choices) {
            if (((argTypes.length >= m.arity() - 1) &&
                 (m.isVariadic() || argTypes.length == m.arity())) &&
                (!m.isGeneric() ||
                 m.numTypeParameters() == typeArgTypes.size())) {
                potCands.add(m);
            }
        }
        if (potCands.isEmpty()) {
            return null;
        }
        choices = potCands.toArray(new MethodSymbol[potCands.size()]);

        ret = selectCandidates(choices,
                               argTypes,
                               (m, i) -> m.getParameterTypes(),
                               CodeLevelVisitor::strictCompatible);
        if (ret != null) {
            return ret;
        }

        ret = selectCandidates(choices,
                               argTypes,
                               (m, i) -> m.getParameterTypes(),
                               CodeLevelVisitor::looseCompatible);

        if (ret != null) {
            return ret;
        }

        ret = selectCandidates(choices,
                               argTypes,
                               (m, i) -> m.getVariadicParameterTypesFor(i),
                               CodeLevelVisitor::looseCompatible);
        return ret;
    }

    private MethodSymbol selectCandidates(MethodSymbol[] choices,
                                          Type[] argTypes,
                                          BiFunction<MethodSymbol, Integer, Type[]> getTypes,
                                          BiFunction<Type, Type, Boolean> isValid) {
        List<MethodSymbol> cands = new ArrayList<>();
        Type[] methodParamTypes;
    OUTER:
        for (MethodSymbol m : choices) {
            methodParamTypes = getTypes.apply(m, argTypes.length);
            for (int i = 0; i < argTypes.length; i++) {
                if (!isValid.apply(methodParamTypes[i], argTypes[i])) {
                    continue OUTER;
                }
            }
            cands.add(m);
        }

        if (!cands.isEmpty()) {
            return MethodSymbol.mostSpecificMethod(cands);
        }
        return null;
    }

    private static boolean strictCompatible(Type a, Type b) {
        return a.equals(b) || b.canWidenTo(a) || (b == NilType.TYPE && a.isReference());
    }

    private static boolean looseCompatible(Type a, Type b) {
        if (strictCompatible(a, b)) {
            return true;
        }
        Type boxedB = b.box();
        if (boxedB != null) {
            if (a.equals(boxedB) || boxedB.canWidenTo(a)) {
                return true;
            }
            if (canUncheckConvert(boxedB, a)) {
                return true;
            }
        }
        Type unboxedB = b.unbox();
        if (unboxedB != null) {
            if (a.equals(unboxedB) || unboxedB.canWidenTo(a)) {
                return true;
            }
            if (canUncheckConvert(unboxedB, a)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Syncs the state of the BodyLevelVisitor to that of this Visitor's state.
     */
    private void updateSuperVisitor() {
        superVisitor.currentClass = currentClass;
        superVisitor.currentUnit = currentUnit;
        superVisitor.pkg = pkg;
    }
}
