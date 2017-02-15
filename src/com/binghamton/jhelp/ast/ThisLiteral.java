package com.binghamton.jhelp.ast;

/**
 * A class representing the Java this expression
 */
public class ThisLiteral extends LiteralExpression {

    /**
     * Construct an untyped this expression
     */
    public ThisLiteral() {
        super("this", null);
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
