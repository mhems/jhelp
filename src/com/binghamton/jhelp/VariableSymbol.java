package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

/**
 * A base class representing a Java variable at any scope
 */
public abstract class VariableSymbol extends Symbol {
        {
            kind = SymbolKind.VARIABLE;
        }

    public enum VariableKind {FIELD, LOCAL, PARAMETER};

    private VariableKind varKind;
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

    public VariableKind getVariableKind() {
        return varKind;
    }

    @Override
    public abstract VariableSymbol adapt(Type[] args);

    public void setVariableKind(VariableKind kind) {
        varKind = kind;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getModifiers().toString());
        sb.append(" ");
        sb.append(getType().getTypeName());
        sb.append(" ");
        sb.append(getName());
        return sb.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof VariableSymbol) {
            VariableSymbol sym = (VariableSymbol)other;
            return getName().equals(sym.getName()) &&
                varKind == sym.varKind &&
                getDeclaringClass().equals(sym.getDeclaringClass()) &&
                getType().equals(sym.getType());
        }
        return false;
    }

    public int hashCode() {
        return getName().hashCode() ^
            getDeclaringClass().hashCode() ^
            getType().hashCode();
    }
}
