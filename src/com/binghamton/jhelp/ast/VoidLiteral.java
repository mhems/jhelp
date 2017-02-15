package com.binghamton.jhelp.ast;

/**
 * A class representing the Java void literal
 */
public class VoidLiteral extends LiteralExpression {

    /**
     * Construct an untyped void expression
     */
    public VoidLiteral() {
        super("void", null);
    }

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
