package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.NilType;
import com.binghamton.jhelp.Type;

/**
 * The code (lowest) level Visitor for visiting each line of code contained
 * within all declarations.
 */
public class CodeLevelVisitor extends BodyLevelVisitor {

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
        if (ast.getArrayExpression().getType().rank() == 0) {
            System.err.println("an array access must be on an array type");
        }
        ast.getIndexExpression().accept(this);
        if (!ast.getIndexExpression().getType().equals(PrimitiveType.INT)) {
            System.err.println("an array access must be with an int index");
        }
    }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) {
        ast.getElementTypeExpression().accept(this);
        for (DimensionExpression de : ast.getDimensionExpressions()) {
            de.accept(this);
        }
        for (Dimension d : ast.getDimensions()) {
            d.accept(this);
        }
        if (ast.hasInitializer()) {
            ast.getInitializer().accept(this);
        }
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        for (Expression e : ast.getInitializers()) {
            e.accept(this);
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
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        for (Statement stmt : ast.getStatements()) {
            stmt.accept(this);
        }
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
        for (Expression target : ast.getTargetExpressions()) {
            target.accept(this);
        }
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        for (Expression type : ast.getExceptionTypes()) {
            type.accept(this);
            if (!type.getType().getClassSymbol().extendsClass(ImportManager.get("java.lang.Throwable"))) {
                System.err.println("catch block exception must extend Throwable class");
            }
        }
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
            sB.accept(this);
        }
        for (Block iB : ast.getInstanceInitializers()) {
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
        ast.getIterable().accept(this);
        Type type = ast.getIterable().getType();
        if (type.rank() == 0 && !type.getClassSymbol().extendsClass(ImportManager.get("java.lang.Iterable"))) {
            System.err.println("for each statement must iterate over arrays or an implementor of Iterable");
        }
    }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) {
        for (Statement init : ast.getInitializers()) {
            init.accept(this);
        }
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.err.println("a for loop condition must yield a boolean");
        }
        for (Statement up : ast.getUpdaters()) {
            up.accept(this);
        }
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
        // TODO assert in switch/while/do/for
        if (ast.isLabelled()) {
            // TODO label must local
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
        // TODO add label to scope
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
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
        ast.getBody().accept(this);
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
        ast.getSwitchExpression().accept(this);
        if (!isValidSwitchType(ast.getSwitchExpression().getType())) {
            System.err.println("switch condition must be one of char, byte, short, int, String, or enum");
        }
        for (CaseBlock cB: ast.getCases()) {
            cB.accept(this);
        }
    }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) {
        ast.getLock().accept(this);
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.err.println("a ternary expression condition must yield boolean");
        }
        ast.getThenExpression().accept(this);
        if (ast.getThenExpression().getType().equals(PrimitiveType.VOID)) {
            System.err.println("then expression cannot be void");
        }
        ast.getElseExpression().accept(this);
        if (ast.getElseExpression().getType().equals(PrimitiveType.VOID)) {
            System.err.println("then expression cannot be void");
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
        if (!type.equals(NilType.TYPE) && !type.getClassSymbol().extendsClass(ImportManager.get("java.lang.Throwable"))) {
            System.err.println("must either throw null or instance of Throwable");
        }
    }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) {
        for (VariableDeclaration var : ast.getResources()) {
            var.accept(this);
        }
        ast.getTryBody().accept(this);
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
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        // TODO
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        ast.getCondition().accept(this);
        if (!isBooleanLike(ast.getCondition().getType())) {
            System.err.println("a while loop condition must yield boolean");
        }
    }

    private static boolean isBooleanLike(Type type) {
        return type.equals(PrimitiveType.BOOLEAN) ||
            PrimitiveType.BOOLEAN.box().equals(type);
    }

    private static boolean isValidSwitchType(Type type) {
        return type.equals(PrimitiveType.CHAR) ||
            type.equals(PrimitiveType.BYTE) ||
            type.equals(PrimitiveType.SHORT) ||
            type.equals(PrimitiveType.INT) ||
            PrimitiveType.CHAR.box().equals(type) ||
            PrimitiveType.BYTE.box().equals(type) ||
            PrimitiveType.SHORT.box().equals(type) ||
            PrimitiveType.INT.box().equals(type) ||
            type.equals(ImportManager.get("java.lang.String")) ||
            type.getClassSymbol().isEnum();
    }
}
