package com.binghamton.jhelp;

/**
 * Class representing an array type
 */
public class ArrayType extends Type {
    private int rank;

    /**
     * Construct a named array type
     * @param name the name of the array type
     * @param rank the dimensions of the array type
     */
    public ArrayType(String name, int rank) {
        super(name);
        this.rank = rank;
    }

    /**
     * Construct a named, annotated array type
     * @param name the name of the array type
     * @param annotations the annotations of the array type
     * @param rank the dimensions of the array type
     */
    public ArrayType(String name, Annotations annotations, int rank) {
        super(name, annotations);
        this.rank = rank;
    }
}
