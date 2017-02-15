package com.binghamton.jhelp.ast;

/**
 * An interface to represent objects able to be visited by a visitor
 */
public interface Visitable {

    /**
     * Default action is to double dispatch on parameter
     * @param visitor the visitor to accept
     */
    void accept(ASTVisitor visitor);
}
