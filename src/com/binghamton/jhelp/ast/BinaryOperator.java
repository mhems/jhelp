package com.binghamton.jhelp.ast;

/**
 * Enum representing valid binary operators
 */
public enum BinaryOperator {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    MODULUS,
    LEFT_SHIFT,
    RIGHT_SHIFT,
    RIGHT_LOGICAL_SHIFT,
    BITWISE_AND,
    BITWISE_OR,
    BITWISE_XOR,
    AND,
    OR,
    EQUALITY,
    INEQUALITY,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    LESS_THAN,
    LESS_THAN_OR_EQUAL,
    INSTANCE_OF;

    public boolean undergoesBinaryPromotion() {
        return isAdditive() || isMultiplicative() || (isRelational() && this != INSTANCE_OF);
    }

    public boolean isAdditive() {
        return this == ADDITION || this == SUBTRACTION;
    }

    public boolean isMultiplicative() {
        return this == MULTIPLICATION || this == DIVISION || this == MODULUS;
    }

    public boolean isShift() {
        return this == LEFT_SHIFT ||
            this == RIGHT_SHIFT ||
            this == RIGHT_LOGICAL_SHIFT;
    }

    public boolean isRelational() {
        return this == GREATER_THAN ||
            this == GREATER_THAN_OR_EQUAL ||
            this == LESS_THAN ||
            this == LESS_THAN_OR_EQUAL ||
            this == INSTANCE_OF;
    }

    public boolean isEquality() {
        return this == EQUALITY || this == INEQUALITY;
    }

    public boolean isBitwise() {
        return this == BITWISE_AND || this == BITWISE_OR || this == BITWISE_XOR;
    }

    public boolean isLogical() {
        return this == AND || this == OR;
    }
}
