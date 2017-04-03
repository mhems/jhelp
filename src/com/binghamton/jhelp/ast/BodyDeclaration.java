package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MyClassSymbol;

/**
 * An abstract class representing a structure declaration.
 * This includes interfaces, annotations, classes, and enums.
 */
public abstract class BodyDeclaration extends Declaration {
    public enum Kind {TOP, INNER, ANONYMOUS, LOCAL};

    protected List<VariableDeclaration> fields = new ArrayList<>();
    protected List<MethodDeclaration> methods = new ArrayList<>();
    protected List<ConcreteBodyDeclaration> innerBodies = new ArrayList<>();
    protected List<AbstractBodyDeclaration> innerInterfaces = new ArrayList<>();
    protected Kind kind = Kind.TOP;

    /**
     * Construct an empty body declaration
     */
    public BodyDeclaration() {
        super();
    }

    /**
     * Construct a new declaration of a body
     * @param name the name of this declaration
     * @param keyword the keyword of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     */
    public BodyDeclaration(Token name,
                           Token keyword,
                           List<Modifier> modifiers,
                           List<Annotation> annotations) {
        super(name, keyword, modifiers, annotations);
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public boolean isTop() {
        return kind == Kind.TOP;
    }

    public boolean isInner() {
        return kind == Kind.INNER;
    }

    public boolean isAnonymous() {
        return kind == Kind.ANONYMOUS;
    }

    public boolean isLocal() {
        return kind == Kind.LOCAL;
    }

    /**
     * Gets the fields of this declaration
     * @return the fields of this declaration
     */
    public List<VariableDeclaration> getFields() {
        return fields;
    }

    /**
     * Gets the inner bodies of this declaration
     * @return the inner bodies of this declaration
     */
    public List<ConcreteBodyDeclaration> getInnerBodies() {
        return innerBodies;
    }

    /**
     * Gets the inner abstract bodies of this declaration
     * @return the inner abstract bodies of this declaration
     */
    public List<AbstractBodyDeclaration> getInnerInterfaces() {
        return innerInterfaces;
    }

    /**
     * Gets the methods of this declaration
     * @return the methods of this declaration
     */
    public List<MethodDeclaration> getMethods() {
        return methods;
    }

    /**
     * Adds a method declaration to this body
     * @param decl the declaration to add
     */
    public void addMethod(MethodDeclaration decl) {
        methods.add(decl);
    }

    /**
     * Gets the number of methods declared in this body
     * @return the number of methods declared in this body
     */
    public int numMethods() {
        return methods.size();
    }

    /**
     * Adds a variable declaration to this body
     * @param decl the declaration to add
     */
    public void addField(VariableDeclaration decl) {
        fields.add(decl);
    }

    /**
     * Gets the number of fields declared in this body
     * @return the number of fields declared in this body
     */
    public int numFields() {
        return fields.size();
    }

    /**
     * Adds a inner body declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerBody(ConcreteBodyDeclaration decl) {
        decl.setKind(Kind.INNER);
        innerBodies.add(decl);
    }

    /**
     * Gets the number of inner bodies declared in this body
     * @return the number of inner bodies declared in this body
     */
    public int numInnerBodies() {
        return innerBodies.size();
    }

    /**
     * Adds a inner abstract body declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerInterface(AbstractBodyDeclaration decl) {
        decl.setKind(Kind.INNER);
        innerInterfaces.add(decl);
    }

    /**
     * Gets the number of inner abstract bodies declared in this body
     * @return the number of inner abstract bodies declared in this body
     */
    public int numInnerInterfaces() {
        return innerInterfaces.size();
    }

    public MyClassSymbol getSymbol() {
        return (MyClassSymbol)sym;
    }

    /**
     * Double dispatch this super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
