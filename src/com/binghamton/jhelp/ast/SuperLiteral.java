package com.binghamton.jhelp.ast;

/**
 * A class representing the Java super expression
 */
public class SuperLiteral extends LiteralExpression {

    /**
     * Construct an untyped super expression
     */
    public SuperLiteral() {
        super("super", null);
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
