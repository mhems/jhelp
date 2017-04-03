package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java array access
 */
public class ArrayAccessExpression extends Expression {
    private Expression arrayExpr;
    private Expression indexExpr;

    /**
     * Construct an array access expression
     * @param last the terminating Token
     * @param arrayExpr the expression yielding the array being accessed
     * @param indexExpr the expression yielding the array index
     */
    public ArrayAccessExpression(Token last,
                                 Expression arrayExpr,
                                 Expression indexExpr) {
        super(arrayExpr.getFirstToken(), last);
        this.arrayExpr = arrayExpr;
        this.indexExpr = indexExpr;
    }

    /**
     * Gets the expression yielding the array to access
     * @return the expression yielding the array to access
     */
    public Expression getArrayExpression() {
        return arrayExpr;
    }

    /**
     * Gets the expression yielding the index to access
     * @return the expression yielding the index to access
     */
    public Expression getIndexExpression() {
        return indexExpr;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
