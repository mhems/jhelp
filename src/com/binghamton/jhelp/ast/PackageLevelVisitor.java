package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;

/**
 * The package (highest) level Visitor for visiting packages and their top level
 * declarations
 */
public class PackageLevelVisitor extends EmptyVisitor {

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        System.out.println("annotation declaration");
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            c.accept(this);
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            a.accept(this);
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        System.out.printf("this class has name '%s'\n", ast.getName().getText());
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        if (ast.hasPackage()) {
            ast.getPackage().accept(this);
        }
        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            decl.accept(this);
        }
    }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast) {
        System.out.printf("this declaration has name '%s'\n", ast.getName().getText());
        ast.getModifiers().accept(this);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        System.out.println("enum declared");
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        System.out.printf("declaring interface '%s'\n", ast.getName().getText());
    }

    /**
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    public void visit(Modifier ast) {
        System.out.printf("modifier '%s'\n", ast.getName());
    }

    /**
     * Visit a Modifiers node
     * @param ast the AST node being visited
     */
    public void visit(Modifiers ast) {
        for (Modifier m : ast.getModifiers()) {
            m.accept(this);
        }
        ast.getAnnotations().accept(this);
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        System.out.printf("in package '%s'\n", ast.getName());
        ast.getAnnotations().accept(this);
    }
}
