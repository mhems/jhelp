package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyVariableSymbol extends VariableSymbol {
    private ClassSymbol owningClass;
    private Token token;

    public MyVariableSymbol(Token name, Modifiers modifiers) {
        super(name.getText(), modifiers);
        this.token = name;
    }

    public Type getType() {
        return type;
    }

    /**
     * Sets this variable's type
     * @param type this variable's type
     */
    public void setType(Type type) {
        this.type = type;
    }

    public ClassSymbol getDeclaringClass() {
        return owningClass;
    }

    public void setDeclaringClass(ClassSymbol sym) {
        owningClass = sym;
    }

    @Override
    public MyVariableSymbol adapt(Type[] args) {
        // TODO
        return null;
    }
}
