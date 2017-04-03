package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

public abstract class QualifiableExpression extends Expression {

    public QualifiableExpression(Token first, Token last) {
        super(first, last);
    }

    public abstract void qualifyWith(Expression expr);

    /**
     * Double dispatch this super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
