package com.binghamton.jhelp.ast;

/**
 * A class representing the Java this expression
 */
public class ThisLiteral extends LiteralExpression {

    /**
     * Construct an untyped this expression
     */
    public ThisLiteral() {
        super("this", null);
    }
}
