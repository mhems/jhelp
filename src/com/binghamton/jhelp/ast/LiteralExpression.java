package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Type;

/**
 * A class representing a Java literal
 */
public class LiteralExpression extends Expression {
    private String value;
    private Type type;

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
     * Gets the type of this literal
     * @return the type of this literal
     */
    public Type getType() {
        return type;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
