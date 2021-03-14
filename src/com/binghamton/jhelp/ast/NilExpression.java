package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing an absent expression
 */
public class NilExpression extends Expression {

    /**
     * Construct a NilExpression with no token
     */
    public NilExpression()
    {

    }

    /**
     * Constructs a new NilExpression with defaultKw keyword
     * To be used to construct default switch labels only
     * @param defaultKw the {@code default} keyword in the switch label
     */
    public NilExpression(Token defaultKw)
    {
        super(defaultKw);
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * A NilExpression is always nil
     * @return true
     */
    @Override
    public boolean isNil() {
        return true;
    }
}
