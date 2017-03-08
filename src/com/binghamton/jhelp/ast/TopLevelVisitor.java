package com.binghamton.jhelp.ast;

/**
 * The top level Visitor for visiting top-level declarations and adding them to
 * the symbol table
 */
public class TopLevelVisitor extends EmptyVisitor {

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        System.out.printf("encountered annotation '%s'\n", ast.getTypeExpression());
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        System.out.println("annotation declaration");
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        System.out.printf("this class has name '%s'\n", ast.getName().getText());
        if (ast.hasTypeParameters()) {
            for (TypeParameter tp : ast.getTypeParameters()) {
                tp.accept(this);
            }
        }
        if (ast.hasSuperClass()) {
            System.out.printf("this class extends class '%s'\n",
                              ast.getSuperClass().getText());
            ast.getSuperClass().accept(this);
        }

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
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        if (ast.hasSuperInterfaces()) {
            System.out.printf("this declaration implements '%s'\n", ast.getSuperInterfaces());
        }
    }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast) {
        System.out.printf("this declaration has name '%s'\n", ast.getName().getText());
        System.out.printf("this declaration has modifiers '%s'\n", ast.getModifiers().getText());
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
        if (ast.hasTypeParameters()) {
            for (TypeParameter tp : ast.getTypeParameters()) {
                tp.accept(this);
            }
        }
        if (ast.hasSuperInterfaces()) {
            System.out.printf("it extends interfaces '%s'\n", ast.getSuperInterfaces());
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        System.out.printf("in package '%s'\n", ast.getName());
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        System.out.println("type argument");
        if (ast.isWildcard()) {
            System.out.println("its a wildcard");
            for (Annotation a : ast.getAnnotations()) {
                a.accept(this);
            }
            if (ast.hasBound()) {
                System.out.printf("upper bounded ? %s\n", ast.isUpperBounded());
                ast.getBoundType().accept(this);
            }
        }
        else if (!ast.isDiamond()) {
            ast.getType().accept(this);
        } else {
            System.out.println("its a diamond");
        }
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        System.out.println("type parameter");
        for (Expression rt : ast.getSuperTypes()) {
            rt.accept(this);
        }
    }
}
