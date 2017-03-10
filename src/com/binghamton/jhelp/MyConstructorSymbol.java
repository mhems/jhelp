package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyConstructorSymbol extends ConstructorSymbol {
    private VariableSymbol[] params = {};
    private Type[] paramTypes = {};
    private TypeVariable[] typeVars = {};
    private Type[] exceptions = {};
    private Token token;

    public MyConstructorSymbol(Token token) {
        super(token.getText());
        this.token = token;
    }

    public MyConstructorSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

    public Token getToken() {
        return token;
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
}
