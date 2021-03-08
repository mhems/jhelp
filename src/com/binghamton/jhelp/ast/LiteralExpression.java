package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.types.Type;

/**
 * A class representing a Java literal
 */
public class LiteralExpression extends Expression {
    private final String value;

    /**
     * Construct a new LiteralExpression
     * @param token the token of the literal
     * @param type the type of the literal
     */
    public LiteralExpression(Token token, Type type) {
        super(token);
        this.value = token.getText();
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
