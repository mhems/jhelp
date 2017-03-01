package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.ReferenceType;
import com.binghamton.jhelp.TypeArgument;
import com.binghamton.jhelp.TypeParameter;

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
     * Visit a Annotations node
     * @param ast the AST node being visited
     */
    public void visit(Annotations ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        System.out.println("annotation declaration");
    }

    /**
     * Visit a ArrayType node
     * @param ast the AST node being visited
     */
    public void visit(ArrayType ast) {
        System.out.printf("array type has %d dims\n.", ast.rank());
        for (Dimension d : ast.getDimensions()) {
            d.accept(this);
        }
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
            System.out.printf("this class extends class '%s'\n", ast.getSuperClass().getName());
        }

    }

    /**
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    public void visit(ClassInterfaceType ast) {
        System.out.printf("class/interface type '%s'\n", ast.getName());
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
        if (ast.hasSuperType())
            ast.getSuperType().accept(this);
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        if (ast.hasPackage()) {
            ast.getPackage().accept(this);
        }
        for (ImportStatement s : ast.getImports()) {
            s.accept(this);
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
        ast.getAnnotations().accept(this);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        System.out.println("enum declared");
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        System.out.printf("importing '%s', static ? %s, demand ? %s\n",
                          ast.getNameExpression().getText(),
                          ast.isStatic(),
                          ast.isDemand());
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
        System.out.printf("modifiers detected");
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

    /**
     * Visit a ReferenceType node
     * @param ast the AST node being visited
     */
    public void visit(ReferenceType ast) {
        System.out.printf("ref. type '%s'\n", ast.getName());
        ast.getAnnotations().accept(this);
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        System.out.println("type argument");
        if (ast.isWildcard()) {
            System.out.println("its a wildcard");
            ast.getAnnotations().accept(this);
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
        ast.getType().accept(this);
        if (ast.hasSuperType()) {
            for (ReferenceType rt : ast.getSuperTypes()) {
                rt.accept(this);
            }
        }
    }
}
