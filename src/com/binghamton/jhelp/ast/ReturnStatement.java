package com.binghamton.jhelp.ast;

/**
 * A class representing a Java return statement
 */
public class ReturnStatement extends Statement {
    private Expression expr;

    /**
     * Construct a new return statement
     * @param expr the possibly null expression to return
     */
    public ReturnStatement(Expression expr) {
        this.expr = expr;
    }

    /**
     * Gets the expression this statement returns
     * @return the expression this statement returns
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Determines if this statement returns anything
     * @return true iff this statement returns anything
     */
    public boolean isNonVoid() {
        return expr != null;
    }
}
