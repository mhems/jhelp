package com.binghamton.jhelp.ast;

/**
 * A singleton class representing a nil-valued AST node.
 * Useful as a placeholder for optional nodes.
 */
public class NilNode extends ASTNode {

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
