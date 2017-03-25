package com.binghamton.jhelp;

public class NilType extends Type {
    public static final NilType TYPE = new NilType();

    private NilType() {

    }

    public Type erase() {
        return this;
    }

    public String getTypeName() {
        return "null";
    }

    public ClassSymbol getClassSymbol() {
        throw new UnsupportedOperationException("the nil type represents no class");
    }

    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException("the nil type has no declaring class");
    }

    @Override
    public Type adapt(Type[] args) {
        throw new UnsupportedOperationException("the nil type cannot be adapted");
    }

    public boolean equals(Object other) {
        return this == other;
    }

    public int hashCode() {
        return 31;
    }
}
