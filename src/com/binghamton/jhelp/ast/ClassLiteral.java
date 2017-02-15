package com.binghamton.jhelp.ast;

/**
 * A class representing the Java class expression
 */
public class ClassLiteral extends LiteralExpression {

    /**
     * Construct an untyped class expression
     */
    public ClassLiteral() {
        super("class", null);
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
