package com.binghamton.jhelp;

/**
 * A base class representing a Java type
 */
public abstract class Type extends Symbol {

        {
            kind = SymbolKind.TYPE;
        }


    public abstract String getTypeName();
    public abstract ClassSymbol getClassSymbol();

    public Type() {

    }

    public Type(String name) {
        super(name);
    }

    public Type(String name, AnnotationSymbol[] annotations) {
        super(name, annotations);
    }

    public Type(AnnotationSymbol[] annotations) {
        super(annotations);
    }

    public Type(String name, int modifiers) {
        super(name, modifiers);
    }

    public Type(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public Type erase() {
        return this;
    }

    public String repr() {
        return getTypeName();
    }

    public int rank() {
        return 0;
    }

    public String getName() {
        return getTypeName();
    }

    public String toString() {
        return getTypeName();
    }

    // For now, until type checking
    public boolean isEquivalentTo(Type other) { return true; }
    public boolean isSubTypeOf(Type other) { return other.isSuperTypeOf(this); }
    public boolean isSuperTypeOf(Type other) { return true; }
}
