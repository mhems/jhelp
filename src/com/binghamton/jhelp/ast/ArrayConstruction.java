package com.binghamton.jhelp.ast;


/**
 * A class representing the construction of a new array
 */
public class ArrayConstruction extends Expression {
    private Type type;
    private List<DimensionExpression> dimExprs;
    private int dims;
    private ArrayInitializer initializer;

    /**
     * Constructs a new array construction expression
     * @param type the type of the array elements
     * @param dimExprs the dimension expressions
     * @param dims the number of remaining dimensions
     */
    public ArrayConstruction(Type type,
                             List<DimensionExpression> dimExprs,
                             int dims) {
        this.type = type;
        this.dimExprs = dimExprs;
        this.dims = dims;
        if (dimExprs != null) {
            this.dims += dimExprs.size();
        }
    }

    /**
     * Constructs a new array with initializer
     * @param type the type of the array elements
     * @param dims the number of dimensions of this array
     * @param initializer the initializer of this array
     */
    public ArrayConstruction(Type type,
                             int dims,
                             ArrayInitializer initializer) {
        this.type = type;
        this.dims = dims;
        this.initializer = initializer;
    }

    /**
     * Gets the element type of this array
     * @return the element type of this array
     */
    public Type getElementType() {
        return type;
    }

    /**
     * Determines if this array construction has an initializer
     * @return true iff this array construction has an initializer
     */
    public boolean hasInitializer() {
        return initializer != null;
    }

    /**
     * Gets the initializer of this array construction
     * @return the initializer of this array construction
     */
    public ArrayInitializer getInitializer() {
        return initializer;
    }

    /**
     * Determines if this construction has dimension expressions
     * @return true iff this construction has dimension expressions
     */
    public boolean hasDimensionExpressions() {
        return dimExprs != null && dimExprs.size() > 0;
    }

    /**
     * Gets the number of dimensions of this array construction
     * @return the number of dimensions of this array construction
     */
    public int getDimensions() {
        return dims;
    }

    /**
     * Gets the dimension expressions of this array construction
     * @return the number of dimensions of this array construction
     */
    public List<DimensionExpression> getDimensionExpressions() {
        return dimExprs;
    }
}
