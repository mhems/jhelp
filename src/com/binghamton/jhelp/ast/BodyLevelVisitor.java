package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.MyClassSymbol;

/**
 * The body level Visitor for visiting the member declarations contained within
 * body declarations
 */
public class BodyLevelVisitor extends TopLevelVisitor {

    public BodyLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = (MyClassSymbol)ast.getSymbol();

        for (VariableDeclaration v : ast.getFields()) {
            v.accept(this);
        }
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            c.accept(this);
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            a.accept(this);
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        // does it have initializers?

        for (MethodDeclaration m : ast.getConstructors()) {
            m.accept(this);
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {

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
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        System.out.printf("method '%s'\n", ast.getName().getText());
        System.out.println("  returns ");
        ast.getReturnTypeExpression().accept(this);
        if (ast.hasTypeParameters()) {
            System.out.println("type params:");
            for (TypeParameter tp : ast.getTypeParameters()) {
                tp.accept(this);
            }
        }
        System.out.println("parameters:");
        for (VariableDeclaration v : ast.getParameters()) {
            v.getExpression().accept(this);
            System.out.println("is receiver ? " + v.isReceiverParameter());
        }
        if (ast.getExceptions().size() > 0) {
            System.out.println("throws:");
            for (Expression t : ast.getExceptions()) {
                t.accept(this);
            }
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        pkg = program.getPackage(ast.getName());
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        System.out.printf("declaring variable '%s':\n",
                          ast.getName().getText());
        ast.getExpression().accept(this);
    }
}
