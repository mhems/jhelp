package com.binghamton.jhelp;

import java.util.Arrays;

public class WildcardType extends Type {
    private boolean upper;
    private Type bound;

    public WildcardType() {
        upper = true;
        bound = ImportManager.get("java.lang.Object");
    }

    public WildcardType(boolean upper, Type bound) {
        this.upper = upper;
        this.bound = bound;
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

    public boolean isUpperBounded() {
        return upper;
    }

    public Type getBound() {
        return bound;
    }

    @Override
    public boolean isReference() {
        return false;
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
