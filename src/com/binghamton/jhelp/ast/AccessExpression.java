package com.binghamton.jhelp.ast;

/**
 * A class representing a Java symbol access expression
 */
public class AccessExpression extends Expression {
    private Expression lhs;
    private Expression rhs;

    /**
     * Construct a new Java symbol access expression
     * @param lhs the left hand side of the access expression
     * @param identifier the name of the symbol being accessed
     */
    public AccessExpression(Expression lhs, String identifier) {
        this(lhs, new IdentifierExpression(identifier));
    }

    /**
     * Construct a new Java symbol access expression
     * @param lhs the left hand side of the access expression
     * @param rhs the expression of the symbol being accessed
     */
    public AccessExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
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
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public Expression getRHS() {
        return rhs;
    }
}