package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java class literal
 */
public class ClassLiteralExpression extends Expression {
    private final Expression typeExpr;

    /**
     * Construct a new ClassLiteralExpression
     * @param expr the Expression yielding the class this literal refers to
     * @param kw the class keyword token
     */
    public ClassLiteralExpression(Expression expr, Token kw) {
        super(expr.getFirstToken(), kw);
        this.typeExpr = expr;
    }

    /**
     * Gets the Expression yielding the type of this literal
     * @return the Expression yielding the type of this literal
     */
    public Expression getTypeExpression() {
        return typeExpr;
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

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             this.accept(visitor);
         }
         typeExpr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
