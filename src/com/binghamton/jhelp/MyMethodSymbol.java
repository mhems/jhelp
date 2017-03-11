package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyMethodSymbol extends MethodSymbol {
    private ClassSymbol owner;
    private Type returnType;
    private VariableSymbol[] params = {};
    private Type[] paramTypes = {};
    private TypeVariable[] typeVars = {};
    private Type[] exceptions = {};
    private Token token;

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

    public VariableSymbol[] getParameters() {
        return params;
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

    public void setParameters(VariableSymbol[] syms) {
        params = syms;
        paramTypes = new Type[syms.length];
        for (int i = 0; i < paramTypes.length; i++) {
            paramTypes[i] = syms[i].getType();
        }
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
}
