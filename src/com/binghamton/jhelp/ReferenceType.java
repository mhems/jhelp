package com.binghamton.jhelp;

import java.util.Map;

/**
 * A base class representing Java reference types:
 *   arrays, classes/interfaces, type variables
 */
public abstract class ReferenceType extends Type {

    /**
     * Construct an empty ReferenceType
     */
    protected ReferenceType() {
        // no-op
    }

    /**
     * Construct a named ReferenceType
     * @param name the name of this Type
     */
    protected ReferenceType(String name) {
        super(name);
    }

    /**
     * Construct an named ReferenceType
     * @param name the name of this Type
     * @param modifiers a bit-mask of this Type's Modifiers
     */
    protected ReferenceType(String name, int modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct an named ReferenceType
     * @param name the name of this Type
     * @param modifiers the Modifiers of this Type
     */
    protected ReferenceType(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct an annotated ReferenceType
     * @param annotations the annotations of this Type
     */
    protected ReferenceType(AnnotationSymbol[] annotations) {
        super(annotations);
    }

    @Override
    public abstract ReferenceType adapt(Map<TypeVariable, Type> map);

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
