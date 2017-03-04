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
import com.binghamton.jhelp.util.StringUtils;

/**
 * The body level Visitor for visiting the member declarations contained within
 * body declarations
 */
public class BodyLevelVisitor extends EmptyVisitor {

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
        System.out.printf("in annotation declaration '%s'\n",
                          ast.getName().getText());
    }

    /**
     * Visit a ArrayType node
     * @param ast the AST node being visited
     */
    public void visit(ArrayType ast) {
        System.out.println("array type, rank " + ast.rank());
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
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
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        System.out.println("in class " + ast.getName().getText());
        if (ast.hasSuperClass()) {
            ast.getSuperClass().accept(this);
        }
    }

    /**
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    public void visit(ClassInterfaceType ast) {
        System.out.printf("class type: %s", ast.getName());
        if (ast.hasArgs()) {
            System.out.printf("<%s>",
                              StringUtils.join(", ",
                                               ast.getTypeArguments()));
        }
        if (ast.hasSuperType()) {
            System.out.printf(" extends ");
            ast.getSuperType().accept(this);
        }
        System.out.println();
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            decl.accept(this);
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (MethodDeclaration m : ast.getConstructors()) {
            m.accept(this);
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(this);
        }
    }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast) {
        System.out.printf("in declaration '%s %s'\n",
                          ast.getModifiers().getText(),
                          ast.getName().getText());
    }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast) {
        ast.getAnnotations().accept(this);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        System.out.println("enum member " + ast.getName().getText());
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        System.out.printf("in enum '%s'\n", ast.getName().getText());
        for (EnumConstant c : ast.getConstants()) {
            c.accept(this);
        }
    }

    /**
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) {
        System.out.println("id expression named " + ast.getText());
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        System.out.printf("in interface '%s'\n", ast.getName().getText());
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
        ast.getReturnType().accept(this);
        if (ast.hasTypeParameters()) {
            System.out.println("type params:");
            for (TypeParameter tp : ast.getTypeParameters()) {
                tp.accept(this);
            }
        }
        System.out.println("parameters:");
        for (VariableDeclaration v : ast.getParameters()) {
            v.getType().accept(this);
            System.out.println("is variadic ? " + v.isVariadic());
            System.out.println("is receiver ? " + v.isReceiverParameter());
        }
        if (ast.getExceptions().size() > 0) {
            System.out.println("throws:");
            for (Type t : ast.getExceptions()) {
                t.accept(this);
            }
        }
    }

    /**
     * Visit a MethodType node
     * @param ast the AST node being visited
     */
    public void visit(MethodType ast) {
        System.out.println("method type");
    }

    /**
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    public void visit(Modifier ast) {
        System.out.println(ast.getName());
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
        System.out.println("in package " + ast.getText());
    }

    /**
     * Visit a PrimitiveType node
     * @param ast the AST node being visited
     */
    public void visit(PrimitiveType ast) {
        System.out.println("primitive " + ast.getText());
    }

    /**
     * Visit a ReferenceType node
     * @param ast the AST node being visited
     */
    public void visit(ReferenceType ast) {
        System.out.println("reference type " + ast.getText());
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        System.out.println("type argument " + ast.getText());
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        System.out.println("type parameter " + ast.getText());
    }

    /**
     * Visit a TypeVariable node
     * @param ast the AST node being visited
     */
    public void visit(TypeVariable ast) {
        System.out.println("type variable " + ast.getText());
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        System.out.printf("declaring variable '%s':\n",
                          ast.getName().getText());
        ast.getType().accept(this);
    }
}
