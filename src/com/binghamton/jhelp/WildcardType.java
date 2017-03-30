package com.binghamton.jhelp;

import java.util.Arrays;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

public class WildcardType extends Type {
    private boolean upper;
    private ReferenceType bound;
    private boolean bounded; // non-trivially by Object

    public WildcardType() {
        this(true, fetch("Object"));
    }

    public WildcardType(boolean upper, ReferenceType bound) {
        this.upper = upper;
        this.bound = bound;
        bounded = !bound.equals(fetch("Object"));
    }

    public String getName() {
        String ret = "?";
        ret += " " + (upper ? "extends" : "super") + " ";
        ret += bound.getName();
        return ret;
    }

    public ClassSymbol getClassSymbol() {
        return bound.getClassSymbol();
    }

    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException();
    }

    public String getTypeName() {
        String ret = "?";
        ret += " " + (upper ? "extends" : "super") + " ";
        ret += bound.getTypeName();
        return ret;
    }

    public boolean isBounded() {
        return bounded;
    }

    public boolean isUpperBounded() {
        return upper;
    }

    public ReferenceType getBound() {
        return bound;
    }

    @Override
    public WildcardType adapt(Type[] args) {
        return new WildcardType(upper, bound.adapt(args));
    }

    public boolean equals(Object other) {
        if (other instanceof WildcardType) {
            WildcardType type = (WildcardType)other;
            return Arrays.equals(annotations, type.annotations) &&
                bound.equals(type.bound) &&
                upper == type.upper;
        }
        return false;
    }

    public int hashCode() {
        return bound.hashCode() ^ Boolean.hashCode(upper);
    }
}
