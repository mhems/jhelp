package com.binghamton.jhelp.ast;

/**
 * A class representing a Java throws statement
 */
public class ThrowStatement extends Statement {
    private Expression expr;

    /**
     * Construct a new throw statement
     * @param expr the expression whose value is being thrown
     */
    public ThrowStatement(Expression expr) {
        this.expr = expr;
    }

    /**
     * Gets the expression being thrown
     * @return the expression being thrown
     */
    public Expression getExpression() {
        return expr;
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
