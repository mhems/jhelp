package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * Class representing an array type
 */
public class ArrayType extends ReferenceType {
    private int rank;

    /**
     * Construct a named array type
     * @param type the type of the array elements
     * @param rank the dimensions of the array type
     */
    public ArrayType(Type type, int rank) {
        super(type.name, type.annotations.getAnnotations());
        this.rank = rank;
    }

    /**
     * Augments the type into a new array type
     * @param dimensions the dimensions of the array type
     * @return a new array type with same base type and `dimensions`
     */
    @Override
    public ArrayType augment(int dimensions) {
        return new ArrayType(this, rank + dimensions);
    }

    /**
     * Gets the dimensions of this array
     * @return the dimensions of this array
     */
    public int getDimensions() {
        return rank;
    }

    /**
     * Double dispatch super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
