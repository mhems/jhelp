package com.binghamton.jhelp.ast;

/**
 * A class representing a Java assert statement
 */
public class AssertStatement extends Statement {
    private Expression condition;
    private Expression message;

    /**
     * Construct a new assert statement
     * @param condition the condition being asserted
     */
    public AssertStatement(Expression condition) {
        this(condition, null);
    }

    /**
     * Construct a new assert statement
     * @param condition the condition being asserted
     * @param message the message to emit iff condition evaluates to false
     */
    public AssertStatement(Expression condition, Expression message) {
        this.condition = condition;
        this.message = message;
    }

    /**
     * Gets the condition this statement asserts
     * @return the condition this statement asserts
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Determine if assert statement includes a message
     * @return true iff assert statement includes a message
     */
    public boolean hasMessage() {
        return message != null;
    }

    /**
     * Gets the message this statement produces, if any
     * @return the message this statement produces, if any
     */
    public Expression getMessage() {
        return message;
    }
}
