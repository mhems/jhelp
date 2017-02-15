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
 * Base class for visiting AST nodes
 */
public abstract class EmptyVisitor implements ASTVisitor {

    /*
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) { }

    /*
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) { }

    /*
     * Visit a Annotations node
     * @param ast the AST node being visited
     */
    public void visit(Annotations ast) { }

    /*
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) { }

    /*
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast) { }

    /*
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) { }

    /*
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) { }

    /*
     * Visit a ArrayType node
     * @param ast the AST node being visited
     */
    public void visit(ArrayType ast) { }

    /*
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) { }

    /*
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) { }

    /*
     * Visit a ASTNode node
     * @param ast the AST node being visited
     */
    public void visit(ASTNode ast) { }

    /*
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) { }

    /*
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) { }

    /*
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) { }

    /*
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast) { }

    /*
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) { }

    /*
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) { }

    /*
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) { }

    /*
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    public void visit(ClassInterfaceType ast) { }

    /*
     * Visit a ClassLiteral node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteral ast) { }

    /*
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) { }

    /*
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) { }

    /*
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) { }

    /*
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) { }

    /*
     * Visit a Expression node
     * @param ast the AST node being visited
     */
    public void visit(Expression ast) { }

    /*
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) { }

    /*
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) { }

    /*
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) { }

    /*
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) { }

    /*
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) { }

    /*
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) { }

    /*
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) { }

    /*
     * Visit a JumpStatement node
     * @param ast the AST node being visited
     */
    public void visit(JumpStatement ast) { }

    /*
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) { }

    /*
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) { }

    /*
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) { }

    /*
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) { }

    /*
     * Visit a MethodType node
     * @param ast the AST node being visited
     */
    public void visit(MethodType ast) { }

    /*
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) { }

    /*
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    public void visit(Modifier ast) { }

    /*
     * Visit a Modifiers node
     * @param ast the AST node being visited
     */
    public void visit(Modifiers ast) { }

    /*
     * Visit a NilNode node
     * @param ast the AST node being visited
     */
    public void visit(NilNode ast) { }

    /*
     * Visit a NullLiteral node
     * @param ast the AST node being visited
     */
    public void visit(NullLiteral ast) { }

    /*
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) { }

    /*
     * Visit a PrimitiveType node
     * @param ast the AST node being visited
     */
    public void visit(PrimitiveType ast) { }

    /*
     * Visit a ReferenceType node
     * @param ast the AST node being visited
     */
    public void visit(ReferenceType ast) { }

    /*
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast) { }

    /*
     * Visit a Statement node
     * @param ast the AST node being visited
     */
    public void visit(Statement ast) { }

    /*
     * Visit a SuperLiteral node
     * @param ast the AST node being visited
     */
    public void visit(SuperLiteral ast) { }

    /*
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast) { }

    /*
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) { }

    /*
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) { }

    /*
     * Visit a ThisLiteral node
     * @param ast the AST node being visited
     */
    public void visit(ThisLiteral ast) { }

    /*
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) { }

    /*
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) { }

    /*
     * Visit a Type node
     * @param ast the AST node being visited
     */
    public void visit(Type ast) { }

    /*
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) { }

    /*
     * Visit a TypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(TypeExpression ast) { }

    /*
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) { }

    /*
     * Visit a TypeVariable node
     * @param ast the AST node being visited
     */
    public void visit(TypeVariable ast) { }

    /*
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) { }

    /*
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) { }

    /*
     * Visit a VoidLiteral node
     * @param ast the AST node being visited
     */
    public void visit(VoidLiteral ast) { }

    /*
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) { }
}
