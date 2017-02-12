package com.binghamton.jhelp;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends ReferenceType {

    /**
     * Construct a named type variable
     * @param name the name of this type
     */
    public TypeVariable(String name) {
        super(name, new Annotations());
    }

    /**
     * Construct a named, annotated type variable
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public TypeVariable(String name, Annotations annotations) {
        super(name, annotations);
    }
}
