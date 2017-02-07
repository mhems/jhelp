package com.binghamton.jhelp.ast;

/**
 * A class representing a Java cast expression
 */
public class CastExpression extends Expression {
    private Expression expr;
    private Type type;

    /**
     * Construct a new cast expression
     * @param expr the expression to cast
     * @param type the type to cast the expression to
     */
    public CastExpression(Expression expr, Type type) {
        this.expr = expr;
        this.type = type;
    }

    /**
     * Gets the expression this cast is casting on
     * @return the expression this cast is casting on
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the type this cast is casting to
     * @return the type this cast is casting to
     */
    public Type getTargetType() {
        return type;
    }
}
