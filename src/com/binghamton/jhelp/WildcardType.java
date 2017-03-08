package com.binghamton.jhelp;

public class WildcardType implements Type {
    private AnnotationSymbol[] annotations;
    private boolean bounded = false;
    private boolean upper;
    private Type bound;

    public WildcardType() {

    }

    public WildcardType(boolean upper, Type bound) {
        bounded = true;
        this.upper = upper;
        this.bound = bound;
    }

    public String getName() {
        String ret = "?";
        if (bounded) {
            ret += " " + (upper ? "extends" : "super") + " ";
            ret += bound.getName();
        }
        return ret;
    }

    public String getTypeName() {
        String ret = "?";
        if (bounded) {
            ret += " " + (upper ? "extends" : "super") + " ";
            ret += bound.getTypeName();
        }
        return ret;
    }

    public boolean isBounded() {
        return bounded;
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public boolean isUpperBounded() {
        return bounded && upper;
    }

    public Type getBound() {
        return bound;
    }
}
