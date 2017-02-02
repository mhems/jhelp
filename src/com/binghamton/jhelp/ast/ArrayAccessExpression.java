package com.binghamton.jhelp.ast;

/**
 * A class representing a Java array access
 */
public class ArrayAccessExpression extends Expression {
    private Expression arrayExpr;
    private Expression indexExpr;
}
