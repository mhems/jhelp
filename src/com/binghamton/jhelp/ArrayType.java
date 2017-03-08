package com.binghamton.jhelp;

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
     * @param type the type of the array elements
     * @param dims the dimensions of the array type
     */
    public ArrayType(Type type) {
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

    public int rank() {
        return 1 + base.rank();
    }
}
