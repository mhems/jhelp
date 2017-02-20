package com.binghamton.jhelp.ast;

/**
 * A class representing an absent expression
 */
public class NilExpression extends Expression {

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
    public boolean isNil() {
        return true;
    }
}
