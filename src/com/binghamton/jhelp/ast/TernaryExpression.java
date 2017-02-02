package com.binghamton.jhelp.ast;

/**
 * A class representing a Java ternary expression
 */
public class TernaryExpression extends Expression {
    private Expression condition;
    private Expression ifExpr;
    private Expression elseExpr;
}
