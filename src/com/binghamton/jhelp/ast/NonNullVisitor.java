package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

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
        assert(o != null);
        // if (o instanceof Token) {
        //     System.out.println(((Token)o).getText());
        // } else {
        //     System.out.println(o);
        // }
        ++count;
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
        if (ast.isMarker()) {
            ast.getTypeExpression().accept(this);
        } else if (ast.isSingleElement()) {
            ast.getSingleValue().accept(this);
        } else {
            for (Token s : ast.getArguments().keySet()) {
                assertNonNull(s);
                ast.getValue(s).accept(this);
            }
        }
    }

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast) {
        ast.getArrayExpression().accept(this);
        ast.getIndexExpression().accept(this);
    }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) {
        ast.getElementTypeExpression().accept(this);
        for (DimensionExpression e : ast.getDimensionExpressions())
            e.accept(this);
        if (ast.hasInitializer())
            ast.getInitializer().accept(this);
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        for (Expression e : ast.getInitializers())
            e.accept(this);
    }

    /**
     * Visit a ArrayTypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayTypeExpression ast) {
        ast.getExpression().accept(this);
        for (Dimension dim : ast.getDimensions()) {
            dim.accept(this);
        }
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        ast.getMessage().accept(this);
    }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /**
     * Visit a ASTNode node
     * @param ast the AST node being visited
     */
    public void visit(ASTNode ast) {
        if (!ast.isNil()) {
        //     System.out.println("<" + ast.getFirstToken() + ", " +
        //                              ast.getLastToken() + ">");
        }
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        for (Statement s : ast.getStatements()) {
            s.accept(this);
        }
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        for (VariableDeclaration var : ast.getFields())
            var.accept(this);
        for (MethodDeclaration m : ast.getMethods())
            m.accept(this);
        for (BodyDeclaration b : ast.getInnerBodies())
            b.accept(this);
    }

    /**
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

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast) {
        for (Expression e : ast.getLabels())
            e.accept(this);
    }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) {
        ast.getSourceExpression().accept(this);
        ast.getTargetExpression().accept(this);
        for (Expression e : ast.getBoundExpressions()) {
            e.accept(this);
        }
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        ast.getVariable().accept(this);
        for (Expression t : ast.getExceptionTypes())
            t.accept(this);
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        if (ast.hasSuperClass())
            ast.getSuperClass().accept(this);
    }

    /**
     * Visit a ClassLiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteralExpression ast) {
        ast.getTypeExpression().accept(this);
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        if (ast.hasPackage())
            ast.getPackageStatement().accept(this);
        for (ImportStatement s : ast.getImports())
            s.accept(this);
        for (BodyDeclaration d : ast.getBodyDeclarations())
            d.accept(this);
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (Expression im : ast.getSuperInterfaces())
            im.accept(this);
        for (MethodDeclaration ctor : ast.getConstructors())
            ctor.accept(this);
        for (Block sb : ast.getStaticInitializers())
            sb.accept(this);
        for (Block ib : ast.getInstanceInitializers())
            ib.accept(this);
    }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast) {
        assertNonNull(ast.getName());
    }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
        ast.getExpression().accept(this);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        for (Expression e : ast.getArguments())
            e.accept(this);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        for (EnumConstant c : ast.getConstants())
            c.accept(this);
    }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) {
        ast.getVariable().accept(this);
        ast.getIterable().accept(this);
    }

    /**
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

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) {
        ast.getCondition().accept(this);
        ast.getThenBlock().accept(this);
        ast.getElseBlock().accept(this);
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        ast.getNameExpression().accept(this);
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        if (ast.hasAnonymousClass())
            ast.getAnonymousClass().accept(this);
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        for (Expression t : ast.getSuperInterfaces())
            t.accept(this);
        for (MethodDeclaration m : ast.getMethods())
            m.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        ast.getStatement().accept(this);
        assertNonNull(ast.getLabel());
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        for (VariableDeclaration d : ast.getParameters())
            d.accept(this);
        ast.getBody().accept(this);
    }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) {
        assertNonNull(ast.getValue());
    }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast) {
        ast.getDeclaration().accept(this);
    }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast) {
        for (VariableDeclaration var : ast.getVariables())
            var.accept(this);
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        ast.getReturnTypeExpression().accept(this);
        for (VariableDeclaration v : ast.getParameters())
            v.accept(this);
        for (Expression t : ast.getExceptions())
            t.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
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
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
        if (ast.isQualified()) {
            ast.getQualifyingName().accept(this);
        }
        assertNonNull(ast.getName());
        assertNonNull(ast.getKind());
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
        ast.getName().accept(this);
    }

    /**
     * Visit a ParamExpression node
     * @param ast the AST node being visited
     */
    public void visit(ParamExpression ast) {
        ast.getExpression().accept(this);
        for (TypeArgument arg : ast.getTypeArguments()) {
            arg.accept(this);
        }
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
        for (CaseBlock b : ast.getCases())
            b.accept(this);
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
        ast.getThenExpression().accept(this);
        ast.getElseExpression().accept(this);
    }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) {
        ast.getExpression().accept(this);
    }

    /**
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

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        if (ast.isWildcard()) {
            for (Annotation a : ast.getAnnotations())
                a.accept(this);
            if (ast.hasExplicitBound()) {
                ast.getBoundType().accept(this);
            }
        }
        else if (!ast.isDiamond()) {
            ast.getTypeExpression().accept(this);
        }
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        assertNonNull(ast.getToken());
        for (Expression t : ast.getSuperTypes())
            t.accept(this);
    }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) {
        ast.getExpression().accept(this);
        assertNonNull(ast.getOperator());
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        assertNonNull(ast.getName());
        ast.getExpression().accept(this);
        ast.getInitializer().accept(this);
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        ast.getCondition().accept(this);
    }
}
