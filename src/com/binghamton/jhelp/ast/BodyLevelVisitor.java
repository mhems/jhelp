package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.ConstructorSymbol;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyMethodSymbol;
import com.binghamton.jhelp.MyConstructorSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyVariableSymbol;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.VariableSymbol;

/**
 * The body level Visitor for visiting the member declarations contained within
 * body declarations
 */
public class BodyLevelVisitor extends DeclarationLevelVisitor {

    public BodyLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = (MyClassSymbol)ast.getSymbol();

        VariableSymbol[] fields = new VariableSymbol[ast.getFields().size()];
        int pos = 0;
        MyVariableSymbol cur;
        for (VariableDeclaration v : ast.getFields()) {
            v.accept(this);
            cur = (MyVariableSymbol)v.getSymbol();
            fields[pos] = cur;
            cur.setDeclaringClass(currentClass);
            ++pos;
        }
        currentClass.setFields(fields);

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
        // TODO does it have initializers?

        ConstructorSymbol[] ctors = new ConstructorSymbol[ast.getConstructors().size()];
        int pos = 0;
        MyConstructorSymbol cur;
        for (MethodDeclaration m : ast.getConstructors()) {
            m.accept(this);
            cur = (MyConstructorSymbol)m.getSymbol();
            ctors[pos] = cur;
            cur.setDeclaringClass(currentClass);
            ++pos;
        }

        currentClass.setMethods(makeMethods(ast.getMethods()));
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
        currentClass.setMethods(makeMethods(ast.getMethods()));
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        // TODO
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
        // TODO
        System.out.printf("declaring variable '%s':\n",
                          ast.getName().getText());
        ast.getExpression().accept(this);
    }

    private MethodSymbol[] makeMethods(List<MethodDeclaration> methods) {
        MethodSymbol[] ret = new MethodSymbol[methods.size()];
        int pos = 0;
        MyMethodSymbol cur;
        for (MethodDeclaration m : methods) {
            m.accept(this);
            cur = (MyMethodSymbol)m.getSymbol();
            ret[pos] = cur;
            cur.setDeclaringClass(currentClass);
            ++pos;
        }
        return ret;
    }
}
