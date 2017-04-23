package com.binghamton.jhelp;

import java.util.Map;

/**
 * A base class representing a Java type
 */
public abstract class Type extends Symbol {

    {
        kind = SymbolKind.TYPE;
    }

    public abstract String getTypeName();

    public abstract ClassSymbol getClassSymbol();

    @Override
    public abstract Type adapt(Map<TypeVariable, Type> map);

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

    public ClassSymbol box() {
        return null;
    }

    public PrimitiveType unbox() {
        return null;
    }

    public Type captureConvert() {
        return this;
    }

    public boolean canWidenTo(Type type) {
        return false;
    }

    public boolean canCastTo(Type target) {
        return false;
    }

    public boolean canNarrowTo(Type type) {
        return false;
    }

    public String repr() {
        return getTypeName();
    }

    public int rank() {
        return 0;
    }

    public abstract String getName();

    public String toString() {
        return getTypeName();
    }

    public boolean isSubTypeOf(Type other) {
        return other.isSuperTypeOf(this);
    }

    // TODO implement
    public /*abstract*/ boolean isSuperTypeOf(Type other) {return true;}

    public boolean isReifiable() {
        return false;
    }

    public boolean isRaw() {
        return false;
    }

    public boolean isReference() {
        return false;
    }

    public boolean isValidClassLiteralType() {
        return true;
    }

    public static Type lub(Type... types) {
        if (types.length == 1) {
            return types[0];
        }
        return types[0]; // TODO
    }
}
