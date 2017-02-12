package com.binghamton.jhelp.ast;

/**
 * A class representing the Java null expression
 */
public class NullLiteral extends LiteralExpression {

    /**
     * Construct an untyped null literal
     */
    public NullLiteral() {
        super("null", null);
    }
}
