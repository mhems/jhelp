package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.MethodType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.ReferenceType;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeArgument;
import com.binghamton.jhelp.TypeParameter;
import com.binghamton.jhelp.TypeVariable;

/**
 * A testing class to ensure AST is built without any null values
 */
public class NonNullVisitor extends EmptyVisitor {

    private int count = 0;

    /**
     * Gets the number of base entities verified to be non null
     * @return the number of base entities verified to be non null
     */
    public int getCount() {
        return count;
    }

    private void assertNonNull(Object o) {
        ++count;
        assert(o != null);
    }

    /*
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /*
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        for (String s : ast.getArguments().keySet()) {
            assertNonNull(s);
            ast.getValue(s).accept(this);
        }
    }

    /*
     * Visit a Annotations node
     * @param ast the AST node being visited
     */
    public void visit(Annotations ast) {
        for (Annotation a : ast.getAnnotations())
            a.accept(this);
    }

    /*
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast) {
        ast.getArrayExpression().accept(this);
        ast.getIndexExpression().accept(this);
    }

    /*
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) {
        ast.getElementType().accept(this);
        for (DimensionExpression e : ast.getDimensionExpressions())
            e.accept(this);
        ast.getInitializer().accept(this);
    }

    /*
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        for (Expression e : ast.getInitializers())
            e.accept(this);
    }

    /*
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        ast.getMessage().accept(this);
    }

    /*
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /*
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /*
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        for (Statement s : ast.getStatements())
            s.accept(this);
    }

    /*
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        ast.getMethod().accept(this);
        for (Expression e : ast.getArguments())
            e.accept(this);
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
    }

    /*
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast) {
        for (Expression e : ast.getLabels())
            e.accept(this);
    }

    /*
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) {
        ast.getExpression().accept(this);
        if (ast.isAdditional()) {
            for (ReferenceType t : ast.getTypeBounds())
                t.accept(this);
        } else {
            ast.getTargetType().accept(this);
        }
    }

    /*
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        ast.getVariable().accept(this);
        for (ClassInterfaceType t : ast.getExceptionTypes())
            t.accept(this);
    }

    /*
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        ast.getSuperClass().accept(this);
    }

    /*
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    public void visit(ClassInterfaceType ast) {
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
        if (ast.hasSuperType())
            ast.getSuperType().accept(this);
    }

    /*
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        ast.getPackage().accept(this);
        for (ImportStatement s : ast.getImports())
            s.accept(this);
        for (BodyDeclaration d : ast.getBodyDeclarations())
            d.accept(this);
    }

    /*
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        ast.getAnnotations().accept(this);
        ast.getExpression().accept(this);
    }

    /*
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        for (Expression e : ast.getArguments())
            e.accept(this);
    }

    /*
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        for (EnumConstant c : ast.getConstants())
            c.accept(this);
    }

    /*
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) {
        ast.getVariable().accept(this);
        ast.getIterable().accept(this);
    }

    /*
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) {
        for (Statement s : ast.getInitializers())
            s.accept(this);
        ast.getCondition().accept(this);
        for (Statement e : ast.getUpdaters())
            e.accept(this);
    }

    /*
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) {
        ast.getAnnotations().accept(this);
        assertNonNull(ast.getIdentifier());
    }

    /*
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) {
        ast.getCondition().accept(this);
        ast.getThenBlock().accept(this);
        if (ast.hasElse())
            ast.getElseBlock().accept(this);
    }

    /*
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        assertNonNull(ast.getName());
    }

    /*
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        for (TypeArgument t : ast.getInitialTypeArguments())
            t.accept(this);
        if (ast.hasAnonymousClass())
            ast.getAnonymousClass().accept(this);
    }

    /*
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        for (ClassInterfaceType t : ast.getSuperInterfaces())
            t.accept(this);
        for (MethodDeclaration m : ast.getMethods())
            m.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
    }

    /*
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        assertNonNull(ast.getLabel());
        ast.getStatement().accept(this);
    }

    /*
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        for (VariableDeclaration d : ast.getParameters())
            d.accept(this);
        ast.getBody().accept(this);
    }

    /*
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) {
        assertNonNull(ast.getValue());
    }

    /*
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        ast.getReturnType().accept(this);
        for (VariableDeclaration v : ast.getParameters())
            v.accept(this);
        for (Type t : ast.getExceptions())
            t.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        ast.getBody().accept(this);
    }

    /*
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        ast.getLHS().accept(this);
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
        ast.getRHS().accept(this);
    }

    /*
     * Visit a MethodType node
     * @param ast the AST node being visited
     */
    public void visit(MethodType ast) {
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        ast.getReturnType().accept(this);
        for (Type t : ast.getParameterTypes())
            t.accept(this);
    }

    /*
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    public void visit(Modifier ast) {
        assertNonNull(ast.getName());
    }

    /*
     * Visit a Modifiers node
     * @param ast the AST node being visited
     */
    public void visit(Modifiers ast) {
        ast.getAnnotations().accept(this);
        for (Modifier m : ast.getModifiers())
            m.accept(this);
    }

    /*
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        ast.getAnnotations().accept(this);
        for (String id : ast.getIdentifiers())
            assertNonNull(id);
    }

    /*
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast) {
        ast.getExpression().accept(this);
    }

    /*
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast) {
        ast.getSwitchExpression().accept(this);
        for (CaseBlock b : ast.getCases())
            b.accept(this);
    }

    /*
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) {
        ast.getLock().accept(this);
    }

    /*
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        ast.getThenExpression().accept(this);
        ast.getElseExpression().accept(this);
    }

    /*
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) {
        ast.getExpression().accept(this);
    }

    /*
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) {
        ast.getTryBody().accept(this);
        for (VariableDeclaration d : ast.getResources())
            d.accept(this);
        for (CatchBlock b : ast.getCatches())
            b.accept(this);
        ast.getFinallyBody().accept(this);
    }

    /*
     * Visit a Type node
     * @param ast the AST node being visited
     */
    public void visit(Type ast) {
        ast.getAnnotations().accept(this);
        assertNonNull(ast.getName());
    }

    /*
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        ast.getType().accept(this);
        ast.getAnnotations().accept(this);
    }

    /*
     * Visit a TypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(TypeExpression ast) {
        ast.getType().accept(this);
    }

    /*
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        ast.getType().accept(this);
        for (ReferenceType t : ast.getSuperTypes())
            t.accept(this);
    }

    /*
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) {
        ast.getExpression().accept(this);
        assertNonNull(ast.getOperator());
    }

    /*
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        ast.getType().accept(this);
        for (String s : ast.getNames()) {
            assertNonNull(s);
            ast.getInitializer(s).accept(this);
        }
    }

    /*
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        ast.getCondition().accept(this);
    }
}
