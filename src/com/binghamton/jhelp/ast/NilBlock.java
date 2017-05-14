package com.binghamton.jhelp.ast;

/**
 * A class representing an absent block.
 * This is different than an empty block with no statements.
 */
public class NilBlock extends Block {

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * A NilBlock is always nil
     * @return true
     */
    @Override
    public boolean isNil() {
        return true;
    }
}
