package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.NilType;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;

/**
 * The code (lowest) level Visitor for visiting each line of code contained
 * within all declarations.
 */
public class CodeLevelVisitor extends BodyLevelVisitor {

    private Set<String> labels;
    private boolean inJumpContext = false;
    // TODO can we get away with this? I think so.
    private NamedSymbolTable<VariableSymbol> localVars = new NamedSymbolTable<>();

    public CodeLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        ast.getTypeExpression().accept(this);
        for (Token arg : ast.getArguments().keySet()) {
            ast.getValue(arg).accept(this);
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
            System.err.println("an array access must be on an array type");
        }
        ast.getIndexExpression().accept(this);
        if (!unaryPromotion(ast.getIndexExpression()).equals(PrimitiveType.INT)) {
            System.err.println("an array access must be with an int index");
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
            System.err.println("array element type must be reifiable");
        }
        if (ast.hasDimensionExpressions()) {
            for (DimensionExpression de : ast.getDimensionExpressions()) {
                de.accept(this);
                if (!unaryPromotion(de).equals(PrimitiveType.INT)) {
                    System.err.println("an array must be constructed with integral dimension");
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
        }
        if (ast.hasInitializer()) {
            ast.getInitializer().accept(this);
            if (!baseType.equals(ast.getInitializer().getType())) {
                System.err.println("array must be initialized with array of same type as declared");
            }
        }
        ast.setType(baseType);
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        for (Expression e : ast.getInitializers()) {
            e.accept(this);
        }
        // TODO assert each elem assignment-compatible with each other, parent type?
        // i.e. how to infer or know you cannot?
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        Type condType = ast.getCondition().getType();
        if (!isBooleanLike(condType)) {
            System.err.println("assert condition must yield boolean");
        }
        if (ast.hasMessage()) {
            ast.getMessage().accept(this);
            if (ast.getMessage().getType().equals(PrimitiveType.VOID)) {
                System.err.println("assert message cannot yield void");
            }
        }
    }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
        Type lType = ast.getLHS().getType();
        Type rType = ast.getRHS().getType();
        // TODO lType must be l-value (variable)
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
        ClassSymbol STRING_TYPE = ImportManager.get("java.lang.String");
        BinaryOperator op = ast.getOperator();
        if (op.undergoesBinaryPromotion()) {
            if (op == BinaryOperator.ADDITION &&
                (lType.equals(STRING_TYPE) ||
                 rType.equals(STRING_TYPE))) {
                ast.setType(STRING_TYPE);
            } else {
                if (!isNumericLike(lType) || !isNumericLike(rType)) {
                    System.err.println("binary arithmetic expressions must evaluate numeric types ");
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
                System.err.println("shift operands must be ints");
            }
            ast.setType(lType);
        } else if (op == BinaryOperator.INSTANCE_OF) {
            if (!lType.isReference() && lType != NilType.TYPE) {
                System.err.println("lhs of instanceof must be reference type or null");
            } else if (!rType.isReference() || !rType.isReifiable()) {
                System.err.println("rhs of instanceof must be reifiable reference type");
            } else if (!canCast(lType, rType)) {
                System.err.println("lhs could never be instanceof rhs");
            }
            ast.setType(PrimitiveType.BOOLEAN);
        } else if (op.isEquality()) {
            if ((isNumericLike(lType) && isNumericLike(rType)) ||
                (isBooleanLike(lType) && isBooleanLike(rType))) {
                ast.setType(binaryPromotion(ast.getLHS(), ast.getRHS()));
            } else if ((lType.isReference() || lType == NilType.TYPE) &&
                       (rType.isReference() || rType == NilType.TYPE)) {
                if (lType != NilType.TYPE && rType != NilType.TYPE) {
                    if (!canCast(lType, rType)) {
                        System.err.println("lhs could never be equal to rhs");
                    }
                }
                ast.setType(PrimitiveType.BOOLEAN);
            } else {
                System.err.println("cannot equate given types");
            }
        } else if (op.isBitwise()) {
            if ((isNumericLike(lType) && isNumericLike(rType)) ||
                (isBooleanLike(lType) && isBooleanLike(rType))) {
                ast.setType(binaryPromotion(ast.getLHS(), ast.getRHS()));
            } else {
                System.err.println("bitwise must be two numbers or two booleans");
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
        // TODO enter scope
        for (Statement stmt : ast.getStatements()) {
            stmt.accept(this);
        }
        // TODO exit scope
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        if (!ast.isAnonymous()) { // TODO correct?
            currentClass = ast.getSymbol();
        }
        for (VariableDeclaration v : ast.getFields()) {
            v.accept(this);
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
        visitInnerBodies(ast);
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        ast.getMethod().accept(this);
        for (TypeArgument tArg : ast.getTypeArguments()) {
            tArg.accept(this);
        }
        for (Expression arg : ast.getArguments()) {
            arg.accept(this);
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
                System.err.println("cast with bounds must cast to class/interface type");
            }
            // TODO pairwise-different erasures, no subtypes of different parameterizations of same interface
            for (Expression bound : ast.getBoundExpressions()) {
                bound.accept(this);
            }
        }
        if (!canCast(sourceType, targetType)) {
            System.err.println("source type could never be cast to target type");
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
            if (!expr.getType().getClassSymbol().extendsClass(ImportManager.get("java.lang.Throwable"))) {
                System.err.println("catch block exception must extend Throwable class");
            }
            if (expr.getType() instanceof TypeVariable) {
                System.err.println("cannot catch on a type variable type");
            }
        }
        // TODO enter scope
        ast.getVariable().accept(this);
        Type varType = null; // TODO implement
        // TODO fetch that var and update type in sym. table and AST
        visit((Block)ast);
        // TODO exit scope
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
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

    public void visit(ClassDeclaration ast) {
        // override to do nothing
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        ast.getExpression().accept(this);
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        // TODO
        // visit body as anon. class
        for (Expression arg : ast.getArguments()) {
            arg.accept(this);
        }
        ast.getBody().accept(this);
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
        // TODO push var into scope
        // TODO enter scope
        ast.getVariable().accept(this);
        ast.getIterable().accept(this);
        Type type = ast.getIterable().getType();
        // TODO check that var. type == iteratable type arg. or array base type
        if (type.rank() == 0 && !type.getClassSymbol().extendsClass(ImportManager.get("java.lang.Iterable"))) {
            System.err.println("for each statement must iterate over arrays or an implementor of Iterable");
        }
        visit((Block)ast);
        // TODO exit scope
    }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) {
        inJumpContext = true;
        // TODO enter scope
        for (Statement init : ast.getInitializers()) {
            init.accept(this);
        }
        if (!ast.getCondition().isNil()) {
            ast.getCondition().accept(this);
            if (!isBooleanLike(ast.getCondition().getType())) {
                System.err.println("a for loop condition must yield a boolean");
            }
        } else {
            ast.getCondition().setType(PrimitiveType.BOOLEAN);
        }

        for (Statement up : ast.getUpdaters()) {
            up.accept(this);
        }
        visit((Block)ast);
        // TODO exit scope
    }

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.out.println("an if condition must yield boolean");
        }
        ast.getThenBlock().accept(this);
        ast.getElseBlock().accept(this);
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        if (ast.hasAnonymousClass()) {
            ast.getAnonymousClass().accept(this);
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
            System.err.println("cannot jump outside of switch/(do)while/for");
        }
        if (ast.isLabelled()) {
            if (!labels.contains(ast.getLabel())) {
                System.err.println("unknown label " + ast.getLabel());
            }
        }
    }

    /**
     * Visit a KeywordExpression node
     * @param ast the AST node being visited
     */
    public void visit(KeywordExpression ast) {
        // TODO
        String kw = ast.getIdentifier().getText();
        switch (kw) {
        case "super":
            break;
        case "this":
            break;
        case "class":
            break;
        case "new":
            break;
        default:
            super.visit(ast);
        }
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        if (!labels.add(ast.getLabel().getText())) {
            System.err.println("label already exists in current scope");
        }
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        labels = new HashSet<>();
        for (VariableDeclaration param : ast.getParameters()) {
            param.accept(this);
        }
        ast.getBody().accept(this);
    }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) {
        if (ast.getType() == null) {
            if (ast.getValue().charAt(0) == '"') {
                ast.setType(ImportManager.get("java.lang.String"));
            } else {
                ast.setType(NilType.TYPE);
            }
        }
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
        inJumpContext = false;
        labels = new HashSet<>();
        MethodSymbol method = ast.getSymbol();
        Type retType = ast.getSymbol().getReturnType();
        // TODO enterScope
        for (VariableDeclaration param : ast.getParameters()) {
            param.accept(this);
        }
        ast.getBody().accept(this);
        // TODO exitScope
        if (!retType.equals(PrimitiveType.VOID)) {
            // TODO ensure every control path returns return type
        }
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast) {
        ast.getExpression().accept(this);
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
            System.err.println("switch condition type must promote to int or be String or enum");
        }
        // TODO enter scope
        for (CaseBlock cB: ast.getCases()) {
            cB.accept(this);
            for (Expression labelExpr : cB.getLabels()) {
                caseType = labelExpr.getType();
                // TODO check caseType assig-compat w/ condType
                if (enumClass != null) {
                    caseClass = caseType.getClassSymbol();
                    if (!caseClass.isEnum() || !caseClass.equals(enumClass)) {
                        System.err.println("enum switches can only have constants of that enum");
                    }
                }
                if (labelExpr.getText().equals("null")) {
                    System.err.println("switch cannot have null label");
                }
                if (labelExpr.getText().equals("default")) {
                    if (seenDefault) {
                        System.err.println("cannot have multiple default cases");
                    }
                    seenDefault = true;
                }
                if (!caseConstants.add(labelExpr.getText())) {
                    System.err.println("switch labels must be unique");
                }
            }
        }
        // TODO exit scope
    }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) {
        ast.getLock().accept(this);
        if (!ast.getLock().getType().isReference()) {
            System.err.println("lock to synchronize on must be of reference type");
        }
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.err.println("a ternary expression condition must be boolean type");
        }
        ast.getThenExpression().accept(this);
        if (ast.getThenExpression().getType().equals(PrimitiveType.VOID)) {
            System.err.println("then expression cannot be void");
        }
        ast.getElseExpression().accept(this);
        if (ast.getElseExpression().getType().equals(PrimitiveType.VOID)) {
            System.err.println("then expression cannot be void");
        }
        // TODO not totally correct, may need lub or something else
        // could make look-up table...
        ast.setType(binaryPromotion(ast.getThenExpression(),
                                    ast.getElseExpression()));
    }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) {
        Expression expr = ast.getExpression();
        expr.accept(this);
        Type type = expr.getType();
        if (!type.isReference()) {
            System.out.println("can only throw reference types");
        } else if (!type.getClassSymbol().extendsClass(ImportManager.get("java.lang.Throwable"))) {
            // TODO technically should be assering assignable to Throwable
            System.err.println("must either throw null or instance of Throwable");
        }
        if (type != NilType.TYPE &&
            type.getClassSymbol().implementsInterface(ImportManager.get("java.lang.RuntimeException"))) {
            // TODO make sure we're in a method with a throws that we are assignable to
        }
    }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) {
        // TODO enter scope
        for (VariableDeclaration var : ast.getResources()) {
            var.accept(this);
            // TODO make var final

            if (!var.getSymbol().getType().getClassSymbol().implementsInterface(ImportManager.get("java.lang.AutoCloseable"))) {
                System.err.println("resource in try-with-resources must implement AutoCloseable");
            }
        }
        ast.getTryBody().accept(this);
        // TODO exit scope
        for (CatchBlock cB : ast.getCatches()) {
            cB.accept(this);
        }
        ast.getFinallyBody().accept(this);
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
                System.err.println("unary expression must be numeric");
            }
            ast.setType(type);
        } else if (op.isLogical()) {
            if (!isBooleanLike(type)) {
                System.err.println("negation demands boolean-like type");
            }
            ast.setType(PrimitiveType.BOOLEAN);
        } else {
            if (!isNumericLike(type)) {
                System.err.println("unary expression must be numeric");
            } else {
                if (op == UnaryOperator.BITWISE_NEGATION &&
                    (type.equals(PrimitiveType.FLOAT) ||
                     type.equals(PrimitiveType.DOUBLE))) {
                    System.err.println("bitwise negation must be on integral type");
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
        // TODO
        /*
        if known, grab it, otherwise, make it and add to scope
        */
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        inJumpContext = true;
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.err.println("a while loop condition must yield boolean");
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
        PrimitiveType unboxed = unbox(type);
        if (unboxed != null) {
            return unboxed.isNumeric();
        }
        return false;
    }

    private static PrimitiveType unbox(Type type) {
        if (type instanceof ReflectedClassSymbol) {
            return ((ReflectedClassSymbol)type).unbox();
        }
        return null;
    }

    private static boolean isValidSwitchType(Type type) {
        return unaryPromotion(type).equals(PrimitiveType.INT) ||
            type.equals(ImportManager.get("java.lang.String")) ||
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
        Type tmp = unbox(lType);
        if (tmp != null) {
            lType = tmp;
        }
        tmp = unbox(rType);
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
        // TODO section 5.5.1
        return true;
    }
}
