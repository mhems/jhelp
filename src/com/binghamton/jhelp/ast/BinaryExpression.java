package com.binghamton.jhelp.ast;

/**
 * A class representing a Java binary expression
 * e.g. {@code 5 + 4}
 */
public class BinaryExpression extends Expression {
    private final Expression lhs;
    private final Expression rhs;
    private final BinaryOperator op;

    /**
     * Construct a new binary expression
     * @param lhs the left hand side of the expression
     * @param op the binary operation being performed
     * @param rhs the right hand side of the expression
     */
    public BinaryExpression(Expression lhs,
                            BinaryOperator op,
                            Expression rhs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.op = op;
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
     * Gets the operation being executed
     * @return the operation being executed
     */
    public BinaryOperator getOperator() {
        return op;
    }

    /**
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public Expression getRHS() {
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
}
