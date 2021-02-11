package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java synchronized block
 */
public class SynchronizedBlock extends Block {
    private final Expression lock;

    /**
     * Construct a new synchronized block
     * @param keyword the synchronized keyword
     * @param lock the expression on which to synchronize
     * @param body the statements to execute synchronously
     */
    public SynchronizedBlock(Token keyword, Expression lock, Block body) {
        super(body);
        setFirstToken(keyword);
        this.lock = lock;
    }

    /**
     * Gets the expression to synchronize on
     * @return the expression to synchronize on
     */
    public Expression getLock() {
        return lock;
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
             this.accept(visitor);
         }
         lock.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
