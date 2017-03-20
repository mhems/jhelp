package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyMethodSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyVariableSymbol;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;

/**
 * The body level Visitor for visiting the member declarations contained within
 * body declarations
 */
public class BodyLevelVisitor extends DeclarationLevelVisitor {

    private static final Modifier[] FORBIDDEN = {Modifier.PRIVATE,
                                                 Modifier.STATIC,
                                                 Modifier.FINAL,
                                                 Modifier.NATIVE,
                                                 Modifier.STRICT_FP,
                                                 Modifier.SYNCHRONIZED};
    private MethodSymbol currentMethod;

    public BodyLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = ast.getSymbol();

        MyVariableSymbol cur;
        for (VariableDeclaration v : ast.getFields()) {
            v.accept(this);
            cur = v.getSymbol();
            currentClass.addField(cur);
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        addMethods(ast.getMethods());
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        visitInnerBodies(ast);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        MyVariableSymbol var = new MyVariableSymbol(ast.getName(),
                                                    new Modifiers(Modifier.PUBLIC,
                                                                  Modifier.STATIC,
                                                                  Modifier.FINAL));
        var.setDeclaringClass(currentClass);
        var.setType(currentClass);
        ast.setSymbol(var);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        Set<String> memberNames = new HashSet<>();
        for (EnumConstant c : ast.getConstants()) {
            if (!memberNames.add(c.getName().getText())) {
                System.err.println("enum cannot have two members with same name");
            }
            c.accept(this);
            currentClass.addField(c.getSymbol());
        }
        visitInnerBodies(ast);
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        addMethods(ast.getMethods());
        visitInnerBodies(ast);
    }

    /**
     * Visit a KeywordExpression node
     * @param ast the AST node being visited
     */
    public void visit(KeywordExpression ast) {
        Type type = PrimitiveType.UNBOX_MAP.get(ast.getIdentifier().getText());
        type.setAnnotations(makeAnnotations(ast.getAnnotations()));
        ast.setType(type);
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        MyMethodSymbol method = new MyMethodSymbol(ast.getName(), ast.getModifiers());
        int pos;
        ast.setSymbol(method);
        method.setDeclaringClass(currentClass);

        Modifiers mods = method.getModifiers();
        if (mods.contains(Modifier.ABSTRACT)) {
            for (Modifier bad : FORBIDDEN) {
                if (mods.contains(bad)) {
                    System.err.println("method cannot both be abstract and " + bad);
                }
            }
            if (!ast.getBody().isNil()) {
                System.err.println("an abstract method must have no body");
            }
        }

        if (currentClass.isClassLike()) {
            if (ast.getBody().isNil() && !mods.contains(Modifier.ABSTRACT)) {
                System.err.println("a method with no body must be abstract");
            }
        }

        if (ast.hasTypeParameters()) {
            TypeVariable[] typeParams = makeTypeParameters(ast.getTypeParameters());
            method.setTypeParameters(typeParams);
            currentClass.enterMethodScope(typeParams);
        }
        Type[] paramTypes = new Type[ast.getParameters().size()];
        pos = 0;
        for (VariableDeclaration v : ast.getParameters()) {
            if (!v.isReceiverParameter()) {
                v.accept(this);
                paramTypes[pos] = v.getSymbol().getType();
                if (v.isVariadic()) {
                    method.setVariadic(true);
                    paramTypes[pos] = new ArrayType(paramTypes[pos]);
                }
                ++pos;
            }
        }
        method.setParameterTypes(paramTypes);
        method.constructType();

        Type[] excTypes = new Type[ast.getExceptions().size()];
        pos = 0;
        for (Expression ex : ast.getExceptions()) {
            ex.accept(this);
            excTypes[pos] = ex.getType();
            ++pos;
        }
        method.setExceptionTypes(excTypes);

        if (ast.isConstructor()) {
            method.setConstructor(true);
            method.setReturnType(currentClass);
        } else {
            Expression ret = ast.getReturnTypeExpression();
            ret.accept(this);
            method.setReturnType(ret.getType());
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
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        String name = ast.getName();
        TypeVariable type;
        if (ast.hasSuperTypes()) {
            Type[] bounds = new Type[ast.getSuperTypes().size()];
            int pos = 0;
            for (Expression rt : ast.getSuperTypes()) {
                rt.accept(this);
                bounds[pos] = rt.getType();
                ++pos;
            }
            type = new TypeVariable(name, bounds);
        } else {
            type = new TypeVariable(name);
        }
        type.setAnnotations(makeAnnotations(ast.getAnnotations()));
        ast.setType(type);
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        MyVariableSymbol var = new MyVariableSymbol(ast.getName(),
                                                    ast.getModifiers());
        ast.setSymbol(var);
        var.setDeclaringClass(currentClass);
        ast.getExpression().accept(this);
        var.setType(ast.getExpression().getType());

        if (var.getModifiers().contains(Modifier.FINAL) &&
            var.getModifiers().contains(Modifier.VOLATILE)) {
            System.err.println("field cannot both be final and volatile");
        }

        if (currentClass.isInterfaceLike()) {
            var.getModifiers().addModifier(Modifier.PUBLIC);
            var.getModifiers().addModifier(Modifier.STATIC);
            var.getModifiers().addModifier(Modifier.FINAL);
            var.setAccessLevel(Symbol.AccessLevel.PUBLIC);
        }
    }

    private void addMethods(List<MethodDeclaration> methods) {
        MyMethodSymbol cur;
        for (MethodDeclaration m : methods) {
            m.accept(this);
            cur = m.getSymbol();
            cur.setDeclaringClass(currentClass);
            if (cur.isConstructor()) {
                currentClass.addConstructor(cur);
            } else {
                currentClass.addMethod(cur);
            }
        }
    }
}
