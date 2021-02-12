package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java array access
 */
public class ArrayAccessExpression extends QualifiableExpression {
    private Expression arrayExpr;
    private QualifiableExpression qualExpr;
    private Expression indexExpr;

    /**
     * Constructs a qualifiable array access expression
     * @param last the terminating Token
     * @param arrayExpr the expression yielding the array being accessed
     * @param indexExpr the expression yielding the array index
     */
    public ArrayAccessExpression(Token last,
                                 QualifiableExpression arrayExpr,
                                 Expression indexExpr) {
        this(last, (Expression)arrayExpr, indexExpr);
        this.qualExpr = arrayExpr;
    }

    /**
     * Constructs an array access expression
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

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         qualExpr.acceptRec(visitor, order);
         arrayExpr.acceptRec(visitor, order);
         indexExpr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }

    @Override
    public void qualifyWith(Expression expr) {
        qualExpr.qualifyWith(expr);
        arrayExpr = qualExpr;
        setFirstToken(arrayExpr.getFirstToken());
    }
}
