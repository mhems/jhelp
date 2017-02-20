package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java keyword expression
 */
public class KeywordExpression extends IdentifierExpression {

    /**
     * Construct a keyword expression
     * @param the keyword token
     */
    public KeywordExpression(Token keyword) {
        super(keyword);
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
