package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Token;

/**
 * Base class representing a node in the AST
 */
public abstract class ASTNode {
    private Token token;
    private Token endToken; // ???

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        // TODO
        return true;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        // TODO
        return 0;
    }
}
