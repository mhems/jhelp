package com.binghamton.jhelp.types;

import java.util.Map;

import com.binghamton.jhelp.symbols.ClassSymbol;

/**
 * A singleton class to represent the type of a null reference
 */
public final class NilType extends Type {
    public static final NilType TYPE = new NilType();

    /**
     * Constructs a new NilType
     */
    private NilType() {
        // prevent public instantiation
    }

    @Override
    public NilType copy() {
        return TYPE;
    }

    @Override
    public String getTypeName() {
        return "null";
    }

    @Override
    public String getName() {
        return "null";
    }

    @Override
    public ClassSymbol getClassSymbol() {
        throw new UnsupportedOperationException("the nil type represents no class");
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException("the nil type has no declaring class");
    }

    @Override
    public boolean isReference() {
        return false;
    }

    @Override
    public Type adapt(Map<TypeVariable, Type> map) {
        return this;
    }

    @Override
    public boolean equals(Object other) {
        return this == other;
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
