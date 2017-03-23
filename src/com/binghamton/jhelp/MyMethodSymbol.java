package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyMethodSymbol extends MethodSymbol {
    private ClassSymbol owner;
    private Type[] paramTypes = {};
    private TypeVariable[] typeVars = {};
    private Type[] exceptions = {};
    private Token token;
    private boolean variadic = false;
    private Type returnType;
    private boolean constructor = false;

    public MyMethodSymbol(Token token) {
        super(token.getText());
        this.token = token;
    }

    public MyMethodSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

    public Token getToken() {
        return token;
    }

    /**
     * Sets the return type of this method
     * @param type the return type of this method
     */
    public void setReturnType(Type type) {
        returnType = type;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Type[] getParameterTypes() {
        return paramTypes;
    }

    public Type[] getExceptionTypes() {
        return exceptions;
    }

    public TypeVariable[] getTypeParameters() {
        return typeVars;
    }

    public void setParameterTypes(Type[] types) {
        paramTypes = types;
    }

    public void setExceptionTypes(Type[] types) {
        exceptions = types;
    }

    public void setTypeParameters(TypeVariable[] vars) {
        typeVars = vars;
    }

    public ClassSymbol getDeclaringClass() {
        return owner;
    }

    public void setDeclaringClass(ClassSymbol sym) {
        owner = sym;
    }

    public boolean isVariadic() {
        return variadic;
    }

    public void setVariadic(boolean variadic) {
        this.variadic = variadic;
    }

    public boolean isConstructor() {
        return constructor;
    }

    public void setConstructor(boolean constructor) {
        this.constructor = constructor;
    }
}
