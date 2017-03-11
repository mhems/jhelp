package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * Class representing an array type
 */
public class ArrayType implements Type {
    private AnnotationSymbol[] annotations;
    private Type base;

    /**
     * Construct a named array type
     * @param base the base Type of the array
     */
    public ArrayType(Type base) {
        this.base = base;
    }

    public Type getBaseType() {
        return base;
    }

    public String getTypeName() {
        return base.getTypeName() + "[]";
    }

    public String getName() {
        return getTypeName();
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    public int rank() {
        return 1 + base.rank();
    }

    public boolean equals(Object other) {
        if (other instanceof ArrayType) {
            ArrayType type = (ArrayType)other;
            return Arrays.equals(annotations, type.annotations) &&
                base.equals(type);
        }
        return false;
    }

    public int hashCode() {
        return base.hashCode() ^ annotations.length;
    }
}
