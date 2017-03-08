package com.binghamton.jhelp;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

public class MyMethodSymbol extends MethodSymbol {
    private Type returnType;
    private List<VariableSymbol> params = new ArrayList<>();
    private List<Type> typeVars = new ArrayList<>();
    private List<ClassSymbol> exceptions = new ArrayList<>();
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

    /**
     * Adds a parameter to this method's parameters
     * @param param the parameter to add
     */
    public void addParameter(VariableSymbol param) {
        params.add(param);
    }

    /**
     * Attempts to add an exception to this method's exceptions
     * @param ex the exception to attempt to add
     * @return true iff the exception successfully added
     */
    public boolean addException(ClassSymbol ex) {
        return exceptions.add(ex);
    }

    public Type[] getParameterTypes() {
        return null; // params.toArray(Symbol.VARIABLE_ARRAY);
    }

    public ClassSymbol[] getExceptionClasses() {
        return exceptions.toArray(Symbol.CLASS_ARRAY);
    }

    public TypeVariable[] getTypeParameters() {
        return null; // TODO
    }
}
