package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing Expression that may be qualified in the future by a
 * qualifying Expression.
 */
public abstract class QualifiableExpression extends Expression {

    /**
     * Constructs a new QualifiableExpression, to be qualified later
     * @param first the first Token of this Expression
     * @param last the last Token of this Expression
     */
    protected QualifiableExpression(Token first, Token last) {
        super(first, last);
    }

    /**
     * Qualifies this Expression with a qualifying Expression
     * @param expr the Expression to qualify this Expression with
     */
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
