package com.binghamton.jhelp.ast;

/**
 * A class representing a Java (do) while statement
 */
public class WhileStatement extends Block {
    private Expression condition;
    private boolean isDo;

    /**
     * Construct a new while statement
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     */
    public WhileStatement(Expression condition, Block body) {
        this(condition, body, false);
    }

    /**
     * Construct a new while statement
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     * @param isDo true iff this while statement is a do-while statement
     */
    public WhileStatement(Expression condition, Block body, boolean isDo) {
        super(body);
        this.condition = condition;
        this.isDo = isDo;
    }

    /**
     * Gets the conditon this statement is predicated on
     * @return the conditon this statement is predicated on
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Determines if this while statement is a do-while statement
     * @return true iff this while statement is a do-while statement
     */
    public boolean isDoWhile() {
        return isDo;
    }
}
