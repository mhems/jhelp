package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java (do) while statement
 */
public class WhileStatement extends Statement {
    private final Expression condition;
    private final boolean isDo;
    private Statement body;

    /**
     * Construct a new while statement
     * @param keyword the keyword of the while statement
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     */
    public WhileStatement(Token keyword, Expression condition, Statement body) {
        super(keyword);
        setFirstToken(keyword);
        this.condition = condition;
        this.isDo = false;
        this.body = body;
    }

    /**
     * Construct a new do-while statement
     * @param keyword the keyword of the do-while statement
     * @param last the terminating Token
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     */
    public WhileStatement(Token keyword,
                          Token last,
                          Expression condition,
                          Statement body) {
        super(keyword, last);
        setFirstToken(keyword);
        setLastToken(last);
        this.condition = condition;
        this.isDo = true;
        this.body = body;
    }

    /**
     * Gets the conditon this statement is predicated on
     * @return the conditon this statement is predicated on
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets the statement this statement envelops
     * @return the statement this statement envelops
     */
    public Statement getBody() {
        return body;
    }

    /**
     * Determines if this while statement is a do-while statement
     * @return true iff this while statement is a do-while statement
     */
    public boolean isDoWhile() {
        return isDo;
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
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
