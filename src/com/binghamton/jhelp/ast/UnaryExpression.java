package com.binghamton.jhelp.ast;

/**
 * A class representing a Java unary expression
 */
public class UnaryExpression extends Expression {
    private Expression expr;
    private UnaryOperator op;
}
