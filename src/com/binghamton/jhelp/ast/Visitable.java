
package com.binghamton.jhelp.ast;

/**
 * An interface to represent objects able to be visited by a visitor
 */
public interface Visitable {

    enum Order {
        PRE,
        POST,
    }

    /**
     * Visits the implementor with `visitor`
     * @param visitor the visitor to visit with
     */
    void accept(ASTVisitor visitor);

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    void acceptRec(ASTVisitor visitor, Visitable.Order order);
}
