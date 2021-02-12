package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * Visits and prints each AST node
 */
public class PrintVisitor implements ASTVisitor {
    private int indent = 0;
    private String indent_string = "  ";

    private void printNode(ASTNode node)
    {
        Token t;
        for (int i = 0; i < indent; i++)
        {
            System.out.print(indent_string);
        }
        System.out.print(node.getClass().getSimpleName());
        System.out.print("\t\t\t\t\t");
        t = node.getFirstToken();
        if (t != null)
            System.out.print(t.getText());
        else
            System.out.print("NULL");
        System.out.print("\t\t\t\t\t");
        t = node.getLastToken();
        if (t != null)
            System.out.print(t.getText());
        else
            System.out.print("NULL");
        System.out.println();
    }

    /**
     * Visit a AbstractBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AbstractBodyDeclaration ast){ printNode(ast); }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast){ printNode(ast); }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast){ printNode(ast); }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast){ printNode(ast); }

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast){ printNode(ast); }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast){ printNode(ast); }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast){ printNode(ast); }

    /**
     * Visit a ArrayTypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayTypeExpression ast){ printNode(ast); }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast){ printNode(ast); }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast){ printNode(ast); }

    /**
     * Visit a ASTNode node
     * @param ast the AST node being visited
     */
    public void visit(ASTNode ast){ printNode(ast); }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast){ printNode(ast); }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast){ printNode(ast); }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast){ printNode(ast); }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast){ printNode(ast); }

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast){ printNode(ast); }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast){ printNode(ast); }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast){ printNode(ast); }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast)
    {
        printNode(ast);
    }

    /**
     * Visit a ClassLiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteralExpression ast){ printNode(ast); }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast)
    {
        printNode(ast);
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast){ printNode(ast); }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast){ printNode(ast); }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast){ printNode(ast); }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast){ printNode(ast); }

    /**
     * Visit a EmptyStatement node
     * @param ast the AST node being visited
     */
    public void visit(EmptyStatement ast){ printNode(ast); }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast){ printNode(ast); }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast){ printNode(ast); }

    /**
     * Visit a Expression node
     * @param ast the AST node being visited
     */
    public void visit(Expression ast){ printNode(ast); }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast){ printNode(ast); }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast){ printNode(ast); }

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast){ printNode(ast); }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast){ printNode(ast); }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast){ printNode(ast); }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast){ printNode(ast); }

    /**
     * Visit a JumpStatement node
     * @param ast the AST node being visited
     */
    public void visit(JumpStatement ast){ printNode(ast); }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast){ printNode(ast); }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast){ printNode(ast); }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast){ printNode(ast); }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast){ printNode(ast); }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast){ printNode(ast); }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast){ printNode(ast); }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast){ printNode(ast); }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast){ printNode(ast); }

    /**
     * Visit a NilBlock node
     * @param ast the AST node being visited
     */
    public void visit(NilBlock ast){ printNode(ast); }

    /**
     * Visit a NilExpression node
     * @param ast the AST node being visited
     */
    public void visit(NilExpression ast){ printNode(ast); }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast){ printNode(ast); }

    /**
     * Visit a ParamExpression node
     * @param ast the AST node being visited
     */
    public void visit(ParamExpression ast){ printNode(ast); }

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast){ printNode(ast); }

    /**
     * Visit a Statement node
     * @param ast the AST node being visited
     */
    public void visit(Statement ast){ printNode(ast); }

    /**
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast){ printNode(ast); }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast){ printNode(ast); }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast){ printNode(ast); }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast){ printNode(ast); }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast){ printNode(ast); }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast){ printNode(ast); }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast){ printNode(ast); }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast){ printNode(ast); }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast){ printNode(ast); }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast){ printNode(ast); }
}
