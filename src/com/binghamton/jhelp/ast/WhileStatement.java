package com.binghamton.jhelp.ast;

/**
 * A class representing a Java (do) while statement
 */
public class WhileStatement extends Statement {
    private Expression condition;
    private Block body;

    /**
     * Construct a new while statement
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     */
    public WhileStatement(Expression condition, Block body) {
        this.condition = condition;
        this.body = body;
    }

    /**
     * Gets the conditon this statement is predicated on
     * @return the conditon this statement is predicated on
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets the code this statement conditionally executes
     * @return the code this statement conditionally executes
     */
    public Block getBody() {
        return body;
    }
}
