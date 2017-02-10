package com.binghamton.jhelp;

/**
 * An abstract class representing reference types.
 * Reference types include:
 * - classes
 * - interfaces
 * - type variables
 * - arrays
 */
public abstract class ReferenceType extends Type {

    /**
     * Construct a named reference type
     * @param name the name of this type
     */
    public ReferenceType(String name) {
        super(name, new Annotations);
    }

    /**
     * Construct a named, annotated reference type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(String name, Annotations annotations) {
        super(name, annotations);
    }
}
