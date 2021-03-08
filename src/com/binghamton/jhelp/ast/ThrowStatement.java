package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java throws statement
 */
public class ThrowStatement extends Statement {
    private final Expression expr;

    /**
     * Construct a new throw statement
     * @param keyword the throw keyword
     * @param last the terminating semi-colon Token
     * @param expr the expression whose value is being thrown
     */
    public ThrowStatement(Token keyword, Token last, Expression expr) {
        super(keyword, last);
        this.expr = expr;
    }

    /**
     * Gets the expression being thrown
     * @return the expression being thrown
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
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
         expr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
