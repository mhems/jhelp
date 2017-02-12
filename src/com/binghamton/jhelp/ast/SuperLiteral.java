package com.binghamton.jhelp.ast;

/**
 * A class representing the Java super expression
 */
public class SuperLiteral extends LiteralExpression {

    /**
     * Construct an untyped super expression
     */
    public SuperLiteral() {
        super("super", null);
    }
}
