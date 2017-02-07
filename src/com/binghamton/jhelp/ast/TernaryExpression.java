package com.binghamton.jhelp.ast;

/**
 * A class representing a Java ternary expression
 */
public class TernaryExpression extends Expression {
    private Expression condition;
    private Expression ifExpr;
    private Expression elseExpr;

    /**
     * Construct a new ternary expression
     * @param condition the conditional to evaluate
     * @param ifExpr the expression whose value is to be returned iff condition
     * evaluates to true
     * @param elseExpr the expression whose value is to be returned iff condition
     * evaluates to false
     */
    public TernaryExpression(Expression condition,
                             Expression ifExpr,
                             Expression elseExpr) {
        this.condition = condition;
        this.ifExpr = ifExpr;
        this.elseExpr = elseExpr;
    }

    /**
     * Gets the predicate of this expression
     * @return the predicate of this expression
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets the expression to yield iff condition is true
     * @return the expression to yield iff condition is true
     */
    public Expression getIfExpression() {
        return ifExpr;
    }

    /**
     * Gets the expression to yield iff condition is false
     * @return the expression to yield iff condition is false
     */
    public Expression getElseExpression() {
        return elseExpr;
    }
}
