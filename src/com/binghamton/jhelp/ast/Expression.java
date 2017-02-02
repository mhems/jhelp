package com.binghamton.jhelp.ast;

/**
 * Base class representing a Java syntactic expression
 */
public abstract class Expression extends ASTNode {

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
