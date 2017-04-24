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
                    addError("unknown inner class");
                }
            } else if (rKind == Kind.EXPRESSION) {
                VariableSymbol var = lType.getClassSymbol().getField(rName);
                if (var != null) {
                    ast.setSymbol(var);
                    ast.setType(var.getType());
                } else {
                    addError("unknown variable");
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

        ast.getTypeExpression().accept(this);
        ann = ast.getTypeExpression().getType().getClassSymbol();
        if (!ann.isAnnotation()) {
            addError("can only annotate with an annotation");
        }
        ast.setType(ann);

        for (MethodSymbol m : ann.getMethods()) {
            if (!m.hasModifier(Modifier.DEFAULT)) {
                needed.add(m.getName());
            }
        }
        if (ast.isSingleElement()) {
            arg = ast.getSingleValue();
            arg.accept(this);
            if (needed.size() != 1) {
                addError("single element annotation requires annotation with only one method");
            } else {
                method = ann.getMethod(needed.toArray(new String[1])[0]);
                annotationTypeCheck(method.getReturnType(), arg.getType());
            }
        } else {
            for (Token id : ast.getArguments().keySet()) {
                method = ann.getMethod(id.getText());
                if (method != null) {
                    needed.remove(id);
                    arg = ast.getValue(id);
                    arg.accept(this);
                    annotationTypeCheck(method.getReturnType(), arg.getType());
                } else {
                    addError("unknown annotation element");
                }
            }
            if (!needed.isEmpty()) {
                addError("non-default annotation element values omitted from annotation");
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
            addError("an array access must be on an array type");
        }
        ast.getIndexExpression().accept(this);
        if (!unaryPromotion(ast.getIndexExpression()).equals(PrimitiveType.INT)) {
            addError("an array access must be with an int index");
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
            addError("array element type must be reifiable");
        }
        if (ast.hasDimensionExpressions()) {
            for (DimensionExpression de : ast.getDimensionExpressions()) {
                de.accept(this);
                if (!unaryPromotion(de).equals(PrimitiveType.INT)) {
                    addError("an array must be constructed with integral dimension");
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
            if (!baseType.equals(ast.getInitializer().getType())) {
                addError("array must be initialized with array of same type as declared");
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
            addError("base type of array initializer must be reifiable");
        }
        for (Expression e : ast.getInitializers()) {
            e.accept(this);
            if (!isAssignable(baseType, e.getType())) {
                addError("elements of array initializer must be assignable to base type");
            }
        }
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        Type condType = ast.getCondition().getType();
        if (!isBooleanLike(condType)) {
            addError("assert condition must yield boolean");
        }
        if (ast.hasMessage()) {
            ast.getMessage().accept(this);
            if (ast.getMessage().getType().equals(PrimitiveType.VOID)) {
                addError("assert message cannot yield void");
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
        if (lval != null && lval.isFinal()) {
            addError("cannot assign to a final variable");
        }
        if (ast.isSimple()) {
            if (!isAssignable(lType, ast.getRHS().getType())) {
                addError("cannot assign rhs type to lhs type");
            }
        } else {
            BinaryExpression synthBin = new BinaryExpression(ast.getLHS(),
                                                             ast.getOperator(),
                                                             ast.getRHS());
            synthBin.accept(this);
            if (!canCast(synthBin.getType(), lType)) {
                addError("result of applying op is not castable to l-value");
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
                if (!isNumericLike(lType) || !isNumericLike(rType)) {
                    addError("binary arithmetic expressions must evaluate numeric types ");
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
            if (!lType.equals(PrimitiveType.INT) ||
                !rType.equals(PrimitiveType.INT)) {
                addError("shift operands must be ints");
            }
            ast.setType(lType);
        } else if (op == BinaryOperator.INSTANCE_OF) {
            if (!lType.isReference() && lType != NilType.TYPE) {
                addError("lhs of instanceof must be reference type or null");
            } else if (!rType.isReference() || !rType.isReifiable()) {
                addError("rhs of instanceof must be reifiable reference type");
            } else if (!canCast(lType, rType)) {
                addError("lhs could never be instanceof rhs");
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
                    addError("lhs could never be equal to rhs");
                }
                ast.setType(PrimitiveType.BOOLEAN);
            } else {
                addError("cannot equate given types");
            }
        } else if (op.isBitwise()) {
            if ((isNumericLike(lType) && isNumericLike(rType)) ||
                (isBooleanLike(lType) && isBooleanLike(rType))) {
                ast.setType(binaryPromotion(ast.getLHS(), ast.getRHS()));
            } else {
                addError("bitwise must be two numbers or two booleans");
            }
        } else if (op.isLogical()) {
            if (isBooleanLike(lType) && isBooleanLike(rType)) {
                ast.setType(binaryPromotion(ast.getLHS(), ast.getRHS()));
            }
        }
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        currentScope.enterScope();
        try {
            for (Statement stmt : ast.getStatements()) {
                stmt.accept(this);
            }
        } catch (Exception e) {
            // squelched
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
            v.accept(this);
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
        MyClassSymbol tmp = currentClass;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = tmp;
        }
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        MethodSymbol m = resolveMethod(ast, ast.getName() == null);
        // TODO check method appropriate (15.12.3)
        ast.setSymbol(m);
        if (m != null) {
            System.out.println("successfully resolved " + ast.getName());
            ast.setType(m.getReturnType());
        } else {
            addError("could not resolve method: " + ast.getName());
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
            if (!(targetType instanceof ClassSymbol)) {
                addError("cast with bounds must cast to class/interface type");
            }
            // TODO pairwise-different erasures, no subtypes of different parameterizations of same interface
            for (Expression bound : ast.getBoundExpressions()) {
                bound.accept(this);
            }
        }
        if (!canCast(sourceType, targetType)) {
            addError("source type could never be cast to target type");
        }
        ast.setType(targetType.captureConvert());
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        for (Expression expr : ast.getExceptionTypes()) {
            expr.accept(this);
            if (!expr.getType().getClassSymbol().extendsClass(fetch("Throwable"))) {
                addError("catch block exception must extend Throwable class");
            }
            if (expr.getType() instanceof TypeVariable) {
                addError("cannot catch on a type variable type");
            }
        }
        currentScope.enterScope();
        MyVariableSymbol var = new MyVariableSymbol(ast.getVariable().getName(),
                                                    ast.getVariable().getModifiers());
        var.setProgram(program);
        var.setAnnotations(makeAnnotations(ast.getVariable().getAnnotations()));
        Type[] exTypes = currentMethod.getExceptionTypes();
        if (exTypes.length == 1) {
            var.setType(exTypes[0]);
        } else {
            var.setType(Type.lub(exTypes));
        }
        ast.getVariable().setSymbol(var);
        currentScope.put(var);
        visit((Block)ast);
        currentScope.exitScope();
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
            addError("type in class literal must be valid");
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
            addError("cannot find constructor for enum constant");
        }

        if (!ast.isEmpty()) {
            MyClassSymbol tmp = currentClass;
            ClassDeclaration bodyAST = ast.getBody();
            bodyAST.setAnonymousParameterTypes(ctor.getParameterTypes());
            MyClassSymbol constant = new MyClassSymbol(currentClass);
            constant.setProgram(program);
            constant.setSuperClassForEnumConstant();
            bodyAST.setSymbol(constant);
            bodyAST.accept(superVisitor);
            if (constant.hasAbstractMethod()) {
                addError("an enum constant body cannot declare abstract methods");
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
        if (type.rank() > 1 ||
            type.getClassSymbol().extendsClass(fetch("Iterable"))) {
            Type source;
            if (type.rank() > 1) {
                source = ((ArrayType)type).getBaseType();
            } else {
                source = ((ParameterizedType)type).getParameter(0);
            }
            if (!isAssignable(var.getType(), source)) {
                addError("type of elements being iterated over does not match type of variable declared in this loop");
            }
        } else {
            addError("for each statement must iterate over arrays or an implementor of Iterable");
        }
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
                addError("a for loop condition must yield a boolean");
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
            addError("an if condition must yield a boolean, is: " + ast.getCondition().getType());
        }
        ast.getThenBlock().accept(this);
        ast.getElseBlock().accept(this);
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        System.out.println("instantiating " + ast.getSymbol());
        Type consType = ast.getSymbol().getReturnType();
        ClassSymbol consCls = consType.getClassSymbol();
        ast.setType(consType);
        if (consType instanceof ParameterizedType) {
            Type[] tArgs = ((ParameterizedType)consType).getParameters();
            if (tArgs.length == 0) {
                if (ast.hasAnonymousClass()) {
                    addError("cannot use diamond operator to instantiate an anonymous class");
                }
                if (ast.getTypeArguments().size() > 0) {
                    addError("cannot supply type arguments to constructor, but use diamond operator on class");
                }
            }
            if (!consCls.isGeneric() && !ast.hasAnonymousClass()) {
                addError("cannot construct a non-generic class with type arguments");
            }
            for (Type tArg : tArgs) {
                if (tArg instanceof WildcardType) {
                    addError("constructor cannot take wildcard type arguments");
                }
            }
        } else if (consCls.isGeneric() && !ast.hasAnonymousClass()) {
            addError(new StyleWarning("constructing generic class without type arguments"));
        }

        if (consCls.isEnum()) {
            addError("cannot construct an enum");
        }
        if (!ast.hasAnonymousClass()) {
            if (consCls.isAbstract()) {
                addError("cannot construct an abstract class or interface");
            }
        } else {
            if (consCls.isFinal()) {
                addError("cannot subclass a final class with an anonymous class");
            }
            MyClassSymbol anonCls = new MyClassSymbol(currentClass);
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
            bodyAST.accept(superVisitor);
            if (bodyAST.numConstructors() > 0) {
                addError("anonymous classes cannot declare constructors");
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
            addError("cannot jump outside of switch/(do)while/for");
        }
        if (ast.isLabelled() &&
            !labels.contains(ast.getLabel())) {
            addError("unknown label " + ast.getLabel());
        }
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        if (!labels.add(ast.getLabel().getText())) {
            addError("label already exists in current scope");
        }
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        addError(new UnimplementedFeatureWarning("I'm too dumb for lambda expressions"));
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
        cls.accept(this); // TODO
        cls.getSymbol().setLocal();
        if (cls.getSymbol().hasModifier(Modifier.STATIC)) {
            addError("local class cannot be static");
        }
        if (cls.getSymbol().getAccessLevel() != Symbol.AccessLevel.PACKAGE_PRIVATE) {
            addError("local class cannot have access modifier");
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
        if (ast.getSymbol() == null) {
            super.visit(ast);
        }
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
        if (!retType.equals(PrimitiveType.VOID)) {
            // TODO ensure every control path returns return type
        }
        currentMethod = null;
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        addError(new UnimplementedFeatureWarning("I'm too dumb for method references"));
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
        System.out.println("code name: " + ast.getText() + " (" + ast.getKind() + ")");
        if (ast.getKind() == Kind.AMBIGUOUS) {
            if (!ast.isQualified()) {
                var = currentScope.get(rName);
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
                        System.out.println("reclassifying amb. as expr. since has member " + rName);
                        ast.setKind(Kind.EXPRESSION);
                    } else if (type.getClassSymbol().hasMemberType(rName)) {
                        ast.setKind(Kind.TYPE);
                    } else {
                        addError("could not find such a qualified field, method, or type");
                    }
                }
            }
        }

        if (ast.getKind() == Kind.EXPRESSION) {
            if (!ast.isQualified()) {
                var = currentScope.get(rName);
                if (var != null) {
                    ast.setSymbol(var);
                    ast.setType(var.getType());
                } else {
                    addError("unknown variable");
                }
            } else {
                switch(qual.getKind()) {
                case PACKAGE:
                    addError("cannot access a variable from package name");
                    break;
                case TYPE:
                    var = qual.getType().getClassSymbol().getField(rName);
                    if (var != null) {
                        if (var.isStatic()) {
                            ast.setSymbol(var);
                            ast.setType(var.getType().captureConvert());
                        } else {
                            addError("cannot access instance field statically");
                        }
                    } else {
                        addError("class/interface does not have that field");
                    }
                    break;
                case EXPRESSION:
                    type = qual.getType();
                    System.out.println("qual type of expr. name expr: " + type);
                    if (type.isReference()) {
                        var = type.getClassSymbol().getField(rName);
                        if (var != null) {
                            ast.setSymbol(var);
                            ast.setType(var.getType().captureConvert());
                        } else {
                            addError("indicated class does not have that field");
                        }
                    } else {
                        addError("cannot access a field from a non-reference type");
                    }
                    break;
                }
            }
        } else if (ast.getKind() == Kind.TYPE) {
            boolean done = false;
            if ("super".equals(rName) || "this".equals(rName)) {
                type = qual.getType();
                if (type != null) {
                    type.setAnnotations(anns);
                    if ("super".equals(rName)) {
                        ast.setType(type.getClassSymbol().getSuperClass());
                    } else {
                        ast.setType(type);
                    }
                    done = true;
                }
            }
            if (!done) {
                super.visit(ast);
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
            addError("return statements can only go in methods or constructors");
        } else {
            Type expRetType = currentMethod.getReturnType();
            if (ast.getExpression().isNil()) {
                if (!currentMethod.isConstructor() &&
                    !expRetType.equals(PrimitiveType.VOID)) {
                    addError("empty return can only go in constructor or methods that return void");
                }
            } else {
                ast.getExpression().accept(this);
                Type retType = ast.getExpression().getType();
                if (!isAssignable(expRetType, retType)) {
                    addError("return type does not match method's");
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
            addError("switch condition type must promote to int or be String or enum");
        }
        currentScope.enterScope();
        for (CaseBlock cB: ast.getCases()) {
            cB.accept(this);
            for (Expression labelExpr : cB.getLabels()) {
                caseType = labelExpr.getType();
                if (!isAssignable(condType, caseType)) {
                    addError("switch label type must be assignable to switch condition typee");
                }
                if (enumClass != null) {
                    caseClass = caseType.getClassSymbol();
                    if (!caseClass.isEnum() || !caseClass.equals(enumClass)) {
                        addError("enum switches can only have constants of that enum");
                    }
                }
                if (labelExpr.getText().equals("null")) {
                    addError("switch cannot have null label");
                }
                if (labelExpr.getText().equals("default")) {
                    if (seenDefault) {
                        addError("cannot have multiple default cases");
                    }
                    seenDefault = true;
                }
                if (!caseConstants.add(labelExpr.getText())) {
                    addError("switch labels must be unique");
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
            addError("lock to synchronize on must be of reference type");
        }
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            addError("a ternary expression condition must be boolean type");
        }
        ast.getThenExpression().accept(this);
        Type lType = ast.getThenExpression().getType();
        Type rType = ast.getElseExpression().getType();
        ast.getElseExpression().accept(this);
        if (lType.equals(PrimitiveType.VOID) ||
            rType.equals(PrimitiveType.VOID)) {
            addError("ternary expression operands cannot be void");
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
            addError("must either throw null or instance of Throwable");
        }
        if (type != NilType.TYPE &&
            !type.getClassSymbol().implementsInterface(fetch("RuntimeException"))) {
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
                addError("throw statement must throw null, an unchecked exception, or be in a method that throws that exception type");
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
                addError("resource in try-with-resources must implement AutoCloseable");
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
                addError("unary expression must be numeric");
            }
            ast.setType(type);
        } else if (op.isLogical()) {
            if (!isBooleanLike(type)) {
                addError("negation demands boolean-like type");
            }
            ast.setType(PrimitiveType.BOOLEAN);
        } else {
            if (!isNumericLike(type)) {
                addError("unary expression must be numeric");
            } else {
                if (op == UnaryOperator.BITWISE_NEGATION &&
                    (type.equals(PrimitiveType.FLOAT) ||
                     type.equals(PrimitiveType.DOUBLE))) {
                    addError("bitwise negation must be on integral type");
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
        System.out.println("*****> var decl" + ast);
        MyVariableSymbol var = ast.getSymbol();
        if (var == null) {
            System.out.println("encountered new variable");
            var = new MyVariableSymbol(ast.getName(), ast.getModifiers());
            var.setProgram(program);
            ast.setSymbol(var);
            var.setDeclaringClass(currentClass);
            ast.getExpression().accept(this);
            var.setType(ast.getExpression().getType());
            if (var.getType() == null) {
                System.err.println("****> variable has no type");
                return;
            }
            System.out.println("added to scope");
        } else {
            System.out.println(var.getName() + " " + var.getType());
        }
        if (!var.isField()) {
            currentScope.put(var);
        }
        visitAnnotations(ast.getAnnotations());
        Expression init = ast.getInitializer();
        init.setInferredType(var.getType());
        init.accept(this);
        if (!init.isNil() && !isAssignable(var.getType(), init.getType())) {
            addError("cannot initialize a variable of one type with an expression of another type");
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
            addError("a while loop condition must yield boolean");
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
        throw new IllegalArgumentException(type + " cannot undergo unary promotion");
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
            return true;
        }
        Type boxedRType = rType.box();
        if (boxedRType != null && boxedRType.canWidenTo(lType)) {
            return true;
        }
        Type unboxedRType = rType.unbox();
        if (unboxedRType != null && unboxedRType.canWidenTo(lType)) {
            return true;
        }
        if (canUncheckConvert(rType, lType)) {
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

    private void annotationTypeCheck(Type expected, Type actual) {
        if (!(expected instanceof ArrayType)) {
            if (!isAssignable(expected, actual)) {
                addError("invalid annotation element value, must be assignable to element type");
            }
            if (actual == NilType.TYPE) {
                addError("annotation element value cannot be null");
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

        System.out.println("attempting to resolve method: " + ast);
        ast.getMethod().setInferredType(ast.getInferredType());
        MethodSymbol ret = null;
        ast.getMethod().accept(this);
        Type owningType = ast.getMethod().getType();
        System.out.println("owning type is " + owningType.getName());
        if (owningType == null) {
            // unqualified method
            assert(!isCtor);
            owningType = currentClass;
        }
        ClassSymbol owningCls = owningType.getClassSymbol();

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
                addError("method cannot take wildcard type arguments");
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
            System.out.println("looking for methods in " + owningCls.getName() + " named " + ast.getName().getText());
            System.out.println(owningCls.repr());
            choices = owningCls.getMethodsByName(ast.getName().getText());
        }

        return resolveMethodFromChoices(choices, argTypes, typeArgTypes);
    }

    private MethodSymbol resolveMethodFromChoices(MethodSymbol[] choices,
                                                  Type[] argTypes,
                                                  List<Type> typeArgTypes) {
        MethodSymbol ret = null;

        System.out.println("There are " + choices.length + " choices");

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
            addError("no applicable methods exist");
            return null;
        }

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
}
