package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class to represent an empty statement in Java
 */
public class EmptyStatement extends Statement {

    /**
     * Construct an empty statement
     * @param token the semi-colon token comprising this statement
     */
    public EmptyStatement(Token token) {
        super(token);
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
