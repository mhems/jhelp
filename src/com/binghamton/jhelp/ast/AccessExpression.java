package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java symbol access expression
 */
public class AccessExpression extends Expression {
    private Expression lhs;
    private Expression rhs;

    /**
     * Construct a new Java symbol access expression
     * @param lhs the left hand side of the access expression
     * @param token the token of the symbol being accessed
     */
    public AccessExpression(Expression lhs, Token token) {
        this(lhs, new IdentifierExpression(token));
    }

    /**
     * Construct a new Java symbol access expression
     * @param token the token of the symbol being accessed
     * @param rhs the right hand side of the access expression
     */
    public AccessExpression(Token token, Expression rhs) {
        this(new IdentifierExpression(token), rhs);
    }

    /**
     * Construct a new Java symbol access expression
     * @param lhs the left hand side of the access expression
     * @param rhs the expression of the symbol being accessed
     */
    public AccessExpression(Expression lhs, Expression rhs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.rhs = rhs;
    }

    /**
     * Gets the left hand side of this expression
     * @return the left hand side of this expression
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public Expression getRHS() {
        return rhs;
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
