package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * Base class representing a Java syntactic statement
 */
public abstract class Statement extends ASTNode {

    /**
     * Construct an nil statement
     */
    public Statement() {
        super();
    }

    /**
     * Construct a new Statement with a single underlying Token
     * @param token the sole Token of this ASTNode
     */
    public Statement(Token token) {
        super(token);
    }

    /**
     * Construct a new Statement spanning multiple ANTLR tokens
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public Statement(Token first, Token last) {
        super(first, last);
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
