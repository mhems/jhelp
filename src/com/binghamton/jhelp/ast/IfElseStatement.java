package com.binghamton.jhelp.ast;

/**
 * A class representing a Java if/else statement
 */
public class IfElseStatement extends Statement {
    private Expression condition;
    private Block thenBody;
    private Block elseBody;

    /**
     * Construct a new if statement with no else block
     * @param condition the condition being examined
     * @param thenBody the block to execute iff condition evalutes to true
     */
    public IfElseStatement(Expression condition, Block thenBody) {
        this(condition, thenBody, null);
    }

    /**
     * Construct a new if/else statement
     * @param condition the condition being examined
     * @param thenBody the block to execute iff condition evalutes to true
     * @param elseBody the block to execute iff condition evalutes to false
     */
    public IfElseStatement(Expression condition, Block thenBody, Block elseBody) {
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
    }

    /**
     * Gets this statement's condition
     * @return this statement's condition
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets this statement's then block
     * @return this statement's then block
     */
    public Block getThenBlock() {
        return thenBody;
    }

    /**
     * Gets this statement's else block
     * @return this statement's else block, may be null
     */
    public Block getElseBlock() {
        return elseBody;
    }

    /**
     * Determines if this statement has an else block
     * @return true iff this statement has an else block
     */
    public boolean hasElse() {
        return elseBody != null;
    }

    /**
     * Determines if this statement has an empty then block
     * @return true iff this statement has an empty then block
     */
    public boolean hasEmptyThenBlock() {
        return thenBody.isEmpty();
    }

    /**
     * Determines if this statement has a empty else block
     * @return true iff this statement has an empty else block
     */
    public boolean hasEmptyElseBlock() {
        return elseBody.isEmpty();
    }
}
