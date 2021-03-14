package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java return statement
 * e.g. {@code return 5;}
 */
public class ReturnStatement extends Statement {
    private Expression expr = new NilExpression();

    /**
     * Construct a new value-less return statement
     * @param keyword the return keyword
     * @param last the terminating semi-colon
     */
    public ReturnStatement(Token keyword, Token last) {
        super(keyword, last);
    }

    /**
     * Construct a new return statement
     * @param keyword the return keyword
     * @param last the terminating semi-colon
     * @param expr the expression to return
     */
    public ReturnStatement(Token keyword, Token last, Expression expr) {
        super(keyword, last);
        this.expr = expr;
    }

    /**
     * Gets the expression this statement returns
     * @return the expression this statement returns
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Determines if this statement returns anything
     * @return true iff this statement returns anything
     */
    public boolean isNonTrivial() {
        return !expr.isNil();
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
