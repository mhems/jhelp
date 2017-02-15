package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.FileToken;

/**
 * Base class representing a node in the AST
 */
public abstract class ASTNode implements Visitable {
    private FileToken first;
    private FileToken last;
    private boolean singular;

    /**
     * Construct a new empty ASTNode, to be used sparingly
     */
    protected ASTNode() {
        first = last = null;
        singular = true;
    }

    /**
     * Construct a new ASTNode with a single underlying ANTLR Token
     * @param token the sole Token of this ASTNode
     */
    public ASTNode(Token token) {
        this(new FileToken(token));
    }

    /**
     * Construct a new ASTNode with a single underlying FileToken
     * @param token the sole FileToken of this ASTNode
     */
    public ASTNode(FileToken token) {
        first = last = token;
        singular = true;
    }

    /**
     * Construct a new ASTNode spanning multiple ANTLR tokens
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public ASTNode(Token first, Token last) {
        this(new FileToken(first), new FileToken(last));
    }

    /**
     * Construct a new ASTNode spanning multiple tokens
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public ASTNode(FileToken first, FileToken last) {
        this.first = first;
        this.last = last;
        this.singular = first.equals(last);
    }

    /**
     * Determine if this ASTNode spans only one token
     * @return true  if this ASTNode spans only one token
     *         false if this ASTNode spans more than one token
     */
    public boolean isSingular() {
        return singular;
    }

    /**
     * Gets the first token of this ASTNode
     * @return the first token of this ASTNode
     */
    public FileToken getFirstToken() {
        return first;
    }

    /**
     * Gets the last token of this ASTNode
     * @return the last token of this ASTNode
     */
    public FileToken getLastToken() {
        return last;
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof ASTNode) {
            ASTNode node = (ASTNode)other;
            return first.equals(node.first) &&
                (singular || last.equals(node.last));
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        int ret = first.hashCode();
        if (!singular) {
            ret ^= last.hashCode();
        }
        return ret;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
