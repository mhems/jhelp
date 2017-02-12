package com.binghamton.jhelp;

import java.util.List;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends ReferenceType {

    /**
     * Construct a named type variable
     * @param name the name of this type
     */
    public TypeVariable(String name) {
        super(name, null);
    }

    /**
     * Construct a named, annotated type variable
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public TypeVariable(String name, List<Annotation> annotations) {
        super(name, annotations);
    }
}
