package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyVariableSymbol extends VariableSymbol {
    private Type type;
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
}
