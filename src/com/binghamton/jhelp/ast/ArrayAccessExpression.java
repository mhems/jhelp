package com.binghamton.jhelp.ast;

/**
 * A class representing a Java array access
 */
public class ArrayAccessExpression extends Expression {
    private Expression arrayExpr;
    private Expression indexExpr;

    /**
     * Construct an array access expression
     * @param identifier the name of the array being accessed
     * @param indexExpr the expression yielding the array index
     */
    public ArrayAccessExpression(String identifier, Expression indexExpr) {
        this(new IdentifierExpression(identifier), indexExpr);
    }

    /**
     * Construct an array access expression
     * @param arrayExpr the expression yielding the array being accessed
     * @param indexExpr the expression yielding the array index
     */
    public ArrayAccessExpression(Expression arrayExpr, Expression indexExpr) {
        this.arrayExpr = arrayExpr;
        this.indexExpr = indexExpr;
    }
}
