package com.binghamton.jhelp.ast;

/**
 * Enum representing valid unary operators
 */
public enum UnaryOperator {
    BITWISE_NEGATION,
    NEGATION,
    PLUS,
    MINUS,
    INCREMENT,
    PRE_INCREMENT,
    DECREMENT,
    PRE_DECREMENT;

    /**
     * Determines if this operator is additive
     * @return true iff this operator is additive
     */
    public boolean isAdditive() {
        return isIncrement() || isDecrement();
    }

    /**
     * Determines if this operator is an increment operator
     * @return true iff this operator is an increment operator
     */
    public boolean isIncrement() {
        return this == INCREMENT || this == PRE_INCREMENT;
    }

    /**
     * Determines if this operator is a decrement operator
     * @return true iff this operator is a decrement operator
     */
    public boolean isDecrement() {
        return this == DECREMENT || this == PRE_DECREMENT;
    }

    /**
     * Determines if this operator is a logical operator
     * @return true iff this operator is logical operator
     */
    public boolean isLogical() {
        return this == NEGATION;
    }
}
