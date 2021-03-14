package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java unary expression
 * e.g. {@code -5}
 */
public class UnaryExpression extends Expression {
    private final Expression expr;
    private final UnaryOperator op;

    /**
     * Construct a new unary expression
     * @param token the operator token
     * @param expr the sole expression
     * @param op the operation being performed upon expression
     */
    public UnaryExpression(Token token,
                           Expression expr,
                           UnaryOperator op) {
        super( (isPrefix(op) ? token : expr.getFirstToken()),
               (isPrefix(op) ? expr.getLastToken() : token) );
        this.expr = expr;
        this.op = op;
    }

    /**
     * Gets the expression being operated upon
     * @return the expression being operated upon
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the operation being executed
     * @return the operation being executed
     */
    public UnaryOperator getOperator() {
        return op;
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
         expr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }

    /**
     * Determines if a UnaryOperator is a prefix operator
     * @param op the UnaryOperator to examine
     * @return true iff the given UnaryOperator is a prefix operator
     */
    private static boolean isPrefix(UnaryOperator op) {
        return op == UnaryOperator.PRE_DECREMENT ||
            op == UnaryOperator.PRE_INCREMENT;
    }
}
