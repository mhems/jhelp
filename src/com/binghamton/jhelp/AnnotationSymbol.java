package com.binghamton.jhelp;

import java.lang.annotation.Annotation;

/**
 * A class representing the annotation of a declaration with an
 * instance of an annotation declaration
 */
public class AnnotationSymbol {
    private final ClassSymbol type;

    /**
     * Construct a new AnnotationSymbol from a ClassSymbol
     * @param type the ClassSymbol of the annotation declaration being used
     */
    public AnnotationSymbol(ClassSymbol type) {
        this.type = type;
    }

    /**
     * Construct a new AnnotationSymbol from an Annotation
     * @param annotation the reflected annotation being used
     */
    public AnnotationSymbol(Annotation annotation) {
        this.type = ReflectedClassSymbol.get(annotation.annotationType());
    }

    /**
     * Gets the ClassSymbol that is annotating the declaration
     * @return the ClassSymbol that is annotating the declaration
     */
    public ClassSymbol getType() {
        return type;
    }

    /**
     * Gets the name of the annotating Classsymbol
     * @return the name of the annotating Classsymbol
     */
    public String getName() {
        return type.getName();
    }

    /**
     * Determines if this is equivalent to another Object
     * @param other the Object to check
     * @return true iff other is an AnnotationSymbol with the same
     * underlying ClassSymbol as this instance
     */
    public boolean equals(Object other) {
        if (other instanceof AnnotationSymbol) {
            AnnotationSymbol sym = (AnnotationSymbol)other;
            return type.equals(sym.type);
        }
        return false;
    }

    /**
     * Computes the hash code of this AnnotationSymbol
     * @return the hash code of this AnnotationSymbol
     */
    public int hashCode() {
        return type.hashCode();
    }
}
