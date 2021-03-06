package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java assert statement
 * e.g. {@code assert False : "message";}
 *      {@code assert True;}
 */
public class AssertStatement extends Statement {
    private final Expression condition;
    private Expression message = new NilExpression();

    /**
     * Construct a new assert statement
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param condition the condition being asserted
     */
    public AssertStatement(Token first, Token last, Expression condition) {
        super(first, last);
        this.condition = condition;
    }

    /**
     * Construct a new assert statement
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param condition the condition being asserted
     * @param message the message to emit iff condition evaluates to false
     */
    public AssertStatement(Token first,
                           Token last,
                           Expression condition,
                           Expression message) {
        super(first, last);
        this.condition = condition;
        this.message = message;
    }

    /**
     * Gets the condition this statement asserts
     * @return the condition this statement asserts
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Determine if assert statement includes a message
     * @return true iff assert statement includes a message
     */
    public boolean hasMessage() {
        return !message.isNil();
    }

    /**
     * Gets the message this statement produces, if any
     * @return the message this statement produces, if any
     */
    public Expression getMessage() {
        return message;
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
         condition.acceptRec(visitor, order);
         message.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
