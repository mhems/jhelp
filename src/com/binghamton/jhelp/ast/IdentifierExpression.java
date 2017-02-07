package com.binghamton.jhelp.ast;

/**
 * A class representing a Java identifier, as an expression
 */
public class IdentifierExpression extends Expression {
    private String identifier;

    /**
     * Construct a new identifier expression
     * @param identifier the name of this identifier
     */
    public IdentifierExpression(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the name of the identifier
     * @return the name of the identifier
     */
    public String getIdentifier() {
        return identifier;
    }
}
