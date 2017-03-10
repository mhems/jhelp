package com.binghamton.jhelp;

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
}
