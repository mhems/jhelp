package com.binghamton.jhelp.ast;

/**
 * A class representing a Java synchronized block
 */
public class SynchronizedBlock extends Statement {
    private Expression lock;
    private Block body;

    /**
     * Construct a new synchronized block
     * @param lock the expression on which to synchronize
     * @param body the statements to execute synchronously
     */
    public SynchronizedBlock(Expression lock, Block body) {
        this.lock = lock;
        this.body = body;
    }

    /**
     * Gets the expression to synchronize on
     * @return the expression to synchronize on
     */
    public Expression getLock() {
        return lock;
    }

    /**
     * Gets the code to execute synchronously
     * @return the code to execute synchronously
     */
    public Block getBody() {
        return body;
    }
}
