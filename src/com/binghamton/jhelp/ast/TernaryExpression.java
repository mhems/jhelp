package com.binghamton.jhelp.ast;

/**
 * A class representing a Java ternary expression
 */
public class TernaryExpression extends Expression {
    private final Expression condition;
    private final Expression thenExpr;
    private final Expression elseExpr;

    /**
     * Construct a new ternary expression
     * @param condition the conditional to evaluate
     * @param thenExpr the expression whose value is to be returned if
     * condition evaluates to true
     * @param elseExpr the expression whose value is to be returned if
     * condition evaluates to false
     */
    public TernaryExpression(Expression condition,
                             Expression thenExpr,
                             Expression elseExpr) {
        super(condition.getFirstToken(), elseExpr.getLastToken());
        this.condition = condition;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    /**
     * Gets the predicate of this expression
     * @return the predicate of this expression
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets the expression to yield iff condition is true
     * @return the expression to yield iff condition is true
     */
    public Expression getThenExpression() {
        return thenExpr;
    }

    /**
     * Gets the expression to yield iff condition is false
     * @return the expression to yield iff condition is false
     */
    public Expression getElseExpression() {
        return elseExpr;
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
         condition.acceptRec(visitor, order);
         thenExpr.acceptRec(visitor, order);
         elseExpr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
