package com.binghamton.jhelp.ast;

/**
 * A class representing the Java void literal
 */
public class VoidLiteral extends LiteralExpression {

    /**
     * Construct an untyped void expression
     */
    public VoidLiteral() {
        super("void", null);
    }
}
