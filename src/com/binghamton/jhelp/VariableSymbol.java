package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

/**
 * A base class representing a Java variable at any scope
 */
public abstract class VariableSymbol extends Symbol {
        {
            kind = SymbolKind.VARIABLE;
        }

    private Type type;

    public VariableSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    public VariableSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    /**
     * Gets the type of this variable
     * @return the type of this variable
     */
    public abstract Type getType();


}
