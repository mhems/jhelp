package com.binghamton.jhelp;

import java.util.List;

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
        super(name, null);
    }

    /**
     * Construct a named, annotated reference type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(String name, List<Annotation> annotations) {
        super(name, annotations);
    }
}
