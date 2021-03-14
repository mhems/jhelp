package com.binghamton.jhelp.ast;

/**
 * A class representing a Java symbol access expression
 * e.g. {@code a.b}
 */
public class AccessExpression extends QualifiableExpression {
    private Expression lhs;
    private final NameExpression rhs;

    /**
     * Construct a new Java symbol access expression
     * @param lhs the left hand side of the access expression
     * @param rhs the expression of the symbol being accessed
     */
    public AccessExpression(Expression lhs, NameExpression rhs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.rhs = rhs;
    }

    /**
     * Gets the left hand side of this expression
     * @return the left hand side of this expression
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public NameExpression getRHS() {
        return rhs;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
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
             visitor.visit(this);
         }
         lhs.acceptRec(visitor, order);
         rhs.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }

    @Override
    public void qualifyWith(Expression expr) {
        lhs = expr;
        setFirstToken(lhs.getFirstToken());
    }
}
