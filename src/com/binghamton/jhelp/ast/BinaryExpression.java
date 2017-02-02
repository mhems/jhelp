package com.binghamton.jhelp.ast;

/**
 * A class representing a Java binary expression
 */
public class BinaryExpression extends Expression {
    private Expression lhs;
    private Expression rhs;
    private BinaryOperator op;
}
