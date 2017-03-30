package com.binghamton.jhelp;

/**
 * A base class representing Java reference types:
 *   arrays, classes/interfaces, type variables
 */
public abstract class ReferenceType extends Type {

    public ReferenceType() {

    }

    public ReferenceType(String name) {
        super(name);
    }

    public ReferenceType(String name, int modifiers) {
        super(name, modifiers);
    }

    public ReferenceType(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public ReferenceType(AnnotationSymbol[] annotations) {
        super(annotations);
    }

    @Override
    public abstract ReferenceType adapt(Type[] args);

    @Override
    public boolean canWidenTo(Type type) {
        return this.isSubTypeOf(type);
    }



    @Override
    public boolean canNarrowTo(Type type) {
        return !this.equals(type) && this.isSuperTypeOf(type);
    }

    @Override
    public boolean isReference() {
        return true;
    }
}
