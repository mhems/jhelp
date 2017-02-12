package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.FileToken;

/**
 * Base class representing a node in the AST
 */
public abstract class ASTNode {
    private FileToken token;

    /**
     * Construct a new ASTNode with underlying FileToken
     * @param token the FileToken of this ASTNode
     */
    // public ASTNode(FileToken token) {
    //     this.token = token;
    // }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
	if (other instanceof ASTNode) {
	    ASTNode node = (ASTNode)other;
	    return token.equals(node.token);
	}
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return token.hashCode();
    }
}
