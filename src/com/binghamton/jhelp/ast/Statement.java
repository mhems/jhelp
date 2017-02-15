package com.binghamton.jhelp.ast;

/**
 * Base class representing a Java syntactic statement
 */
public abstract class Statement extends ASTNode {

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
