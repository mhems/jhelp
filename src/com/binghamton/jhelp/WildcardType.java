package com.binghamton.jhelp;

import java.util.Arrays;

public class WildcardType implements Type {
    private AnnotationSymbol[] annotations;
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

    public String getTypeName() {
        String ret = "?";
        ret += " " + (upper ? "extends" : "super") + " ";
        ret += bound.getTypeName();
        return ret;
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    public boolean isUpperBounded() {
        return upper;
    }

    public Type getBound() {
        return bound;
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
