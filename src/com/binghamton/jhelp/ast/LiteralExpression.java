package com.binghamton.jhelp.ast;

/**
 * A class representing a Java literal
 */
public class LiteralExpression extends Expression {
    public static final LiteralExpression NULL = new LiteralExpression("null", null);

    private String value;
    private Type type;

    /**
     * Construct a new LiteralExpression
     * @param value the value of the literal
     * @param type the type of the literal
     */
    public LiteralExpression(String value, Type type) {
        this.value = value;
        this.type = type;
    }

    /**
     * Gets the value of this literal
     * @return the value of this literal
     */
    public String getValue() {
        return value;
    }

    /**
     * Gets the type of this literal
     * @return the type of this literal
     */
    public Type getType() {
        return type;
    }
}
