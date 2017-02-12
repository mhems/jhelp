package com.binghamton.jhelp.ast;

/**
 * A class representing the Java class expression
 */
public class ClassLiteral extends LiteralExpression {

    /**
     * Construct an untyped class expression
     */
    public ClassLiteral() {
        super("class", null);
    }
}
