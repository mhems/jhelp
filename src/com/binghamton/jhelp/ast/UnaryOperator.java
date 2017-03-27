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

    public boolean isAdditive() {
        return isIncrement() || isDecrement();
    }

    public boolean isIncrement() {
        return this == INCREMENT || this == PRE_INCREMENT;
    }

    public boolean isDecrement() {
        return this == DECREMENT || this == PRE_DECREMENT;
    }

    public boolean isLogical() {
        return this == NEGATION;
    }
}
