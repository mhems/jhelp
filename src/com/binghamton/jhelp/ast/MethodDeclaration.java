package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing the declaration of a Java method
 */
public class MethodDeclaration extends Declaration {
    private Type returnType;
    private List<VariableDeclaration> params;
    private Dimension dim;
    private List<Type> exceptions;
    private List<TypeParameter> typeParams;
    private Block body;

    /**
     * Construct a method declaration
     * @param modifiers the modifiers of this method
     */
    public MethodDeclaration(List<Modifier> modifiers) {
        super(modifiers);
    }

    /**
     * Sets this method's return type
     * @param returnType this method's return type
     */
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    /**
     * Gets this method's return type
     * @return this method's return type
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Sets this method's parameters
     * @param parameters this method's parameters
     */
    public void setParameters(List<VariableDeclaration> parameters) {
        this.params = parameters;
    }

    /**
     * Gets this method's parameters
     * @return this method's parameters
     */
    public List<VariableDeclaration> getParameters() {
        return params;
    }

    /**
     * Sets the exceptions this method throws
     * @param exceptions the exceptions this method throws
     */
    public void setExceptions(List<Type> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * Gets the exceptions this method throws
     * @return the exceptions this method throws
     */
    public List<Type> getExceptions() {
        return exceptions;
    }

    /**
     * Gets the type parameters of this method
     * @return the type parameters of this method
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Sets the type parameters of this method
     * @param typeParams the new type parameters of this method
     */
    public void setTypeParameters(List<TypeParameter> typeParams) {
        this.typeParams = typeParams;
    }

    /**
     * Determines if this method has type parameters
     * @return true iff this method has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams != null && typeParams.size() > 0;
    }

    /**
     * Sets this method's body
     * @param body this method's body
     */
    public void setBody(Block body) {
        this.body = body;
    }

    /**
     * Gets this method's body
     * @return this method's body
     */
    public Block getBody() {
        return body;
    }


}
