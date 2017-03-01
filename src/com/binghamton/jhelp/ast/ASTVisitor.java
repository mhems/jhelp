package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.MethodType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.NilType;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.ReferenceType;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeArgument;
import com.binghamton.jhelp.TypeParameter;
import com.binghamton.jhelp.TypeVariable;

/**
 * Interface for visiting AST nodes
 */
public interface ASTVisitor {

    /**
     * Visit a AbstractBodyDeclaration node
     * @param ast the AST node being visited
     */
    void visit(AbstractBodyDeclaration ast);

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    void visit(AccessExpression ast);

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    void visit(Annotation ast);

    /**
     * Visit a Annotations node
     * @param ast the AST node being visited
     */
    void visit(Annotations ast);

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    void visit(AnnotationDeclaration ast);

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    void visit(ArrayAccessExpression ast);

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    void visit(ArrayConstruction ast);

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    void visit(ArrayInitializer ast);

    /**
     * Visit a ArrayType node
     * @param ast the AST node being visited
     */
    void visit(ArrayType ast);

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    void visit(AssertStatement ast);

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    void visit(AssignmentExpression ast);

    /**
     * Visit a ASTNode node
     * @param ast the AST node being visited
     */
    void visit(ASTNode ast);

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    void visit(BinaryExpression ast);

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    void visit(Block ast);

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    void visit(BodyDeclaration ast);

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    void visit(CallExpression ast);

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    void visit(CaseBlock ast);

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    void visit(CastExpression ast);

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    void visit(CatchBlock ast);

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    void visit(ClassDeclaration ast);

    /**
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    void visit(ClassInterfaceType ast);

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    void visit(CompilationUnit ast);

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    void visit(ConcreteBodyDeclaration ast);

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    void visit(Declaration ast);

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    void visit(Dimension ast);

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    void visit(DimensionExpression ast);

    /**
     * Visit a EmptyStatement node
     * @param ast the AST node being visited
     */
    void visit(EmptyStatement ast);

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    void visit(EnumConstant ast);

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    void visit(EnumDeclaration ast);

    /**
     * Visit a Expression node
     * @param ast the AST node being visited
     */
    void visit(Expression ast);

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    void visit(ForEachStatement ast);

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    void visit(ForStatement ast);

    /**
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    void visit(IdentifierExpression ast);

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    void visit(IfElseStatement ast);

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    void visit(ImportStatement ast);

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    void visit(InstantiationExpression ast);

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    void visit(InterfaceDeclaration ast);

    /**
     * Visit a JumpStatement node
     * @param ast the AST node being visited
     */
    void visit(JumpStatement ast);

    /**
     * Visit a KeywordExpression node
     * @param ast the AST node being visited
     */
    void visit(KeywordExpression ast);

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    void visit(LabelStatement ast);

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    void visit(LambdaExpression ast);

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    void visit(LiteralExpression ast);

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    void visit(LocalVariableStatement ast);

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    void visit(MethodDeclaration ast);

    /**
     * Visit a MethodType node
     * @param ast the AST node being visited
     */
    void visit(MethodType ast);

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    void visit(MethodReferenceExpression ast);

    /**
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    void visit(Modifier ast);

    /**
     * Visit a Modifiers node
     * @param ast the AST node being visited
     */
    void visit(Modifiers ast);

    /**
     * Visit a NilBlock node
     * @param ast the AST node being visited
     */
    void visit(NilBlock ast);

    /**
     * Visit a NilExpression node
     * @param ast the AST node being visited
     */
    void visit(NilExpression ast);

    /**
     * Visit a NilType node
     * @param ast the AST node being visited
     */
    void visit(NilType ast);

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    void visit(PackageStatement ast);

    /**
     * Visit a PrimitiveType node
     * @param ast the AST node being visited
     */
    void visit(PrimitiveType ast);

    /**
     * Visit a ReferenceType node
     * @param ast the AST node being visited
     */
    void visit(ReferenceType ast);

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    void visit(ReturnStatement ast);

    /**
     * Visit a Statement node
     * @param ast the AST node being visited
     */
    void visit(Statement ast);

    /**
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    void visit(SwitchStatement ast);

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    void visit(SynchronizedBlock ast);

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    void visit(TernaryExpression ast);

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    void visit(ThrowStatement ast);

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    void visit(TryCatchBlock ast);

    /**
     * Visit a Type node
     * @param ast the AST node being visited
     */
    void visit(Type ast);

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    void visit(TypeArgument ast);

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    void visit(TypeParameter ast);

    /**
     * Visit a TypeVariable node
     * @param ast the AST node being visited
     */
    void visit(TypeVariable ast);

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    void visit(UnaryExpression ast);

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    void visit(VariableDeclaration ast);

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    void visit(WhileStatement ast);
}
