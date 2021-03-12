package com.binghamton.jhelp.ast;

/**
 * Enum representing valid binary operators
 */
public enum BinaryOperator {
    EMPTY(""),
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULUS("%"),
    LEFT_SHIFT("<<"),
    RIGHT_SHIFT(">>"),
    RIGHT_LOGICAL_SHIFT(">>>"),
    BITWISE_AND("&"),
    BITWISE_OR("|"),
    BITWISE_XOR("^"),
    AND("&&"),
    OR("||"),
    EQUALITY("=="),
    INEQUALITY("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    INSTANCE_OF("instanceof");

    private String text;

    BinaryOperator(String text)
    {
        this.text = text;
    }

    /**
     * Determines if this operator undergoes binary promotion
     * @return true iff this operator undergoes binary promotion
     */
    public boolean undergoesBinaryPromotion() {
        return isAdditive() ||
            isMultiplicative() ||
            (isRelational() && this != INSTANCE_OF);
    }

    /**
     * Determines if this operator is additive
     * @return true iff this operator is additive
     */
    public boolean isAdditive() {
        return this == ADDITION || this == SUBTRACTION;
    }

    /**
     * Determines if this operator is multiplicative
     * @return true iff this operator is multiplicative
     */
    public boolean isMultiplicative() {
        return this == MULTIPLICATION || this == DIVISION || this == MODULUS;
    }

    /**
     * Determines if this operator is a shift operator
     * @return true iff this operator is shift operator
     */
    public boolean isShift() {
        return this == LEFT_SHIFT ||
            this == RIGHT_SHIFT ||
            this == RIGHT_LOGICAL_SHIFT;
    }

    /**
     * Determines if this operator is a relational operator
     * @return true iff this operator is relational operator
     */
    public boolean isRelational() {
        return this == GREATER_THAN ||
            this == GREATER_THAN_OR_EQUAL ||
            this == LESS_THAN ||
            this == LESS_THAN_OR_EQUAL ||
            this == INSTANCE_OF;
    }

    /**
     * Determines if this operator is an equality operator
     * @return true iff this operator is an equality operator
     */
    public boolean isEquality() {
        return this == EQUALITY || this == INEQUALITY;
    }

    /**
     * Determines if this operator is a bitwise operator
     * @return true iff this operator is bitwise operator
     */
    public boolean isBitwise() {
        return this == BITWISE_AND || this == BITWISE_OR || this == BITWISE_XOR;
    }

    /**
     * Determines if this operator is a logical operator
     * @return true iff this operator is logical operator
     */
    public boolean isLogical() {
        return this == AND || this == OR;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
