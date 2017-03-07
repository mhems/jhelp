package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.Dimension;

/**
 * Class representing an array type
 */
public class ArrayType extends ReferenceType {
    private List<Dimension> dims;

    /**
     * Construct a named array type
     * @param type the type of the array elements
     * @param dims the dimensions of the array type
     */
    public ArrayType(Type type, List<Dimension> dims) {
        super(type.getFirstToken(),
              dims.get(dims.size()-1).getLastToken(),
              type.name,
              type.annotations.getAnnotations());
        this.dims = dims;
    }

    /**
     * Augments the type into a new array type
     * @param dims the dimensions of the array type
     * @return a new array type with same base type and `dimensions`
     */
    @Override
    public ArrayType augment(List<Dimension> dims) {
        List<Dimension> newDims = new ArrayList<>(this.dims);
        newDims.addAll(dims);
        return new ArrayType(this, newDims);
    }

    @Override
    public ArrayType augment(Token ellipsis) {
        List<Dimension> newDims = new ArrayList<>(this.dims);
        newDims.add(new Dimension(ellipsis));
        return new ArrayType(this, newDims);
    }

    /**
     * Gets the dimensions of this array
     * @return the dimensions of this array
     */
    public List<Dimension> getDimensions() {
        return dims;
    }

    /**
     * Gets the number of dimensions of this array
     * @return the number of dimensions of this array
     */
    public int rank() {
        return dims.size();
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
