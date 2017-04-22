package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class denoting an array type
 */
public class ArrayTypeExpression extends Expression {
    private final Expression expr;
    private final List<Dimension> dims;

    /**
     * Constructs an ArrayTypeExpression
     * @param expr the Expression yielding the base type of this array type
     * @param dims a List of the Dimensions of this array type
     */
    public ArrayTypeExpression(Expression expr, List<Dimension> dims) {
        super(expr.getFirstToken(), dims.get(dims.size()-1).getLastToken());
        this.expr = expr;
        this.dims = dims;
    }

    /**
     * Gets the Expression yielding the base type of this array type
     * @return the Expression yielding the base type of this array type
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the List of the Dimensions of this array type
     * @return the List of the Dimensions of this array type
     */
    public List<Dimension> getDimensions() {
        return dims;
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
