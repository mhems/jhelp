package com.binghamton.jhelp.ast;

/**
 * A class representing a Java binary expression
 */
public class BinaryExpression extends Expression {
    private Expression lhs;
    private Expression rhs;
    private BinaryOperator op;

    /**
     * Construct a new binary expression
     * @param lhs the left hand side of the expression
     * @param op the binary operation being performed
     * @param rhs the right hand side of the expression
     */
    public BinaryExpression(Expression lhs,
                            BinaryOperator op,
                            Expression rhs) {
        this.lhs = lhs;
        this.op = op;
        this.rhs = rhs;
    }

    /**
     * Gets the left hand side of this expression
     * @return the left hand side of this expression
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Gets the operation being executed
     * @return the operation being executed
     */
    public BinaryOperator getOperator() {
        return op;
    }

    /**
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public Expression getRHS() {
        return rhs;
    }
}
