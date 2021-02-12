package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java8 method reference
 */
public class MethodReferenceExpression extends QualifiableExpression {
    private Expression lhs;
    private final Expression rhs;
    private List<TypeArgument> targs;

    /**
     * Construct a new parameterized reference
     * @param lhs the left hand side of the method reference
     * @param rhs the right hand side of the method reference
     * @param targs any TypeArguments to the method being referenced
     */
    public MethodReferenceExpression(Expression lhs,
                                     Expression rhs,
                                     List<TypeArgument> targs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.rhs = rhs;
    }

    /**
     * Gets the expression resolving the method referee's owner
     * @return the expression resolving the method referee's owner
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Sets the expression resolving the method referee's owner
     * @param expr the expression resolving the method referee's owner
     */
    public void setLHS(Expression expr) {
        this.lhs = expr;
    }

    /**
     * Gets the expression resolving the method name
     * @return the expression resolving the method name
     */
    public Expression getRHS() {
        return rhs;
    }

    /**
     * Gets the type arguments to this Expression
     * @return the List of type arguments to this Expression
     */
    public List<TypeArgument> getTypeArguments() {
        return targs;
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

    @Override
    public void qualifyWith(Expression expr) {
        lhs = expr;
        setFirstToken(lhs.getFirstToken());
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
         for (TypeArgument ta : targs)
         {
             ta.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
