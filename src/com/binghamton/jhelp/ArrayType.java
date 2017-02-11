package com.binghamton.jhelp;

/**
 * Class representing an array type
 */
public class ArrayType extends Type {
    private Type type;
    private int rank;

    /**
     * Construct a named array type
     * @param name the name of the array type
     * @param rank the dimensions of the array type
     */
    public ArrayType(Type type, int rank) {
        this.type = type;
        this.rank = rank;
    }

    /**
     * Gets the base type of this array
     * @return the base type of this array
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets the dimensions of this array
     * @return the dimensions of this array
     */
    public int getDimensions() {
        return rank;
    }
}
