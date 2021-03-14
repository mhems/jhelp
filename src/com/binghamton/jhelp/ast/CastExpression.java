package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java cast expression
 * e.g. {@code (float)5}
 */
public class CastExpression extends Expression {
    private Expression source;
    private Expression target;
    private List<Expression> bounds;

    /**
     * Construct a new cast expression
     * @param first the first token of this ASTNode
     * @param source the expression to cast
     * @param target the Expression yielding the type to cast to
     */
    public CastExpression(Token first, Expression source, Expression target) {
        this(first, source, target, new ArrayList<>());
    }

    /**
     * Construct a new bounded cast expression
     * @param first the first token of this ASTNode
     * @param source the expression to cast
     * @param target the Expression yielding the type to cast to
     * @param bounds the Expressions yielding additional bounds on the type to
     * cast to
     */
    public CastExpression(Token first,
                          Expression source,
                          Expression target,
                          List<Expression> bounds) {
        super(first, source.getLastToken());
        this.source = source;
        this.target = target;
        this.bounds = bounds;
    }

    /**
     * Gets the expression this cast is casting on
     * @return the expression this cast is casting on
     */
    public Expression getSourceExpression() {
        return source;
    }

    /**
     * Gets the Expression yielding the type this cast is to
     * @return the Expression yielding the type this cast is to
     */
    public Expression getTargetExpression() {
        return target;
    }

    /**
     * Gets the Expressions yielding the bounds of this cast
     * @return the List of Expressions yielding the bounds of this cast
     */
    public List<Expression> getBoundExpressions() {
        return bounds;
    }

    /**
     * Determines if this CastExpression is bounded
     * @return true iff this CastExpression is bounded
     */
    public boolean hasBounds() {
        return !bounds.isEmpty();
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
         source.acceptRec(visitor, order);
         target.acceptRec(visitor, order);
         for (Expression e : bounds)
         {
             e.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
