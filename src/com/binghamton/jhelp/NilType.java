package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * A class representing an absent type.
 */
public class NilType extends Type {

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * A NilType is always nil
     * @return true
     */
    public boolean isNil() {
        return true;
    }
}
