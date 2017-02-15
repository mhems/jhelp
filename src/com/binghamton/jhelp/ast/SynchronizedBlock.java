package com.binghamton.jhelp.ast;

/**
 * A class representing a Java synchronized block
 */
public class SynchronizedBlock extends Block {
    private Expression lock;

    /**
     * Construct a new synchronized block
     * @param lock the expression on which to synchronize
     * @param body the statements to execute synchronously
     */
    public SynchronizedBlock(Expression lock, Block body) {
        super(body);
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
}
