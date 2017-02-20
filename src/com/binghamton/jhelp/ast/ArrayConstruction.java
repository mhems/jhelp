package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Type;

/**
 * A class representing the construction of a new array
 */
public class ArrayConstruction extends Expression {
    private Type type;
    private List<DimensionExpression> dimExprs = new ArrayList<>();
    private List<Dimension> dims;
    private ArrayInitializer initializer;

    /**
     * Constructs a new array construction expression
     * @param first the first token of this ASTNode
     * @param type the type of the array elements
     * @param dimExprs the dimension expressions
     * @param dims the number of remaining dimensions
     */
    public ArrayConstruction(Token first,
                             Type type,
                             List<DimensionExpression> dimExprs,
                             List<Dimension> dims) {
        super(first,
              dims.size() > 0 ? dims.get(dims.size()-1).getLastToken()
                              : dimExprs.get(dimExprs.size()-1).getLastToken());
        this.type = type;
        this.dimExprs = dimExprs;
        this.dims = dims;
    }

    /**
     * Constructs a new array with initializer
     * @param first the first token of this ASTNode
     * @param type the type of the array elements
     * @param dims the number of dimensions of this array
     * @param initializer the initializer of this array
     */
    public ArrayConstruction(Token first,
                             Type type,
                             List<Dimension> dims,
                             ArrayInitializer initializer) {
        super(first, initializer.getLastToken());
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
        return dimExprs.size() > 0;
    }

    /**
     * Gets the number of dimensions of this array construction
     * @return the number of dimensions of this array construction
     */
    public List<Dimension> getDimensions() {
        return dims;
    }

    /**
     * Gets the dimension expressions of this array construction
     * @return the number of dimensions of this array construction
     */
    public List<DimensionExpression> getDimensionExpressions() {
        return dimExprs;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
