package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java if/else statement
 */
public class IfElseStatement extends Statement {
    private final Expression condition;
    private final Statement thenBody;
    private Statement elseBody = null;

    /**
     * Construct a new if statement with no else statement
     * @param keyword the if keyword
     * @param condition the condition being examined
     * @param thenBody the statement to execute iff condition evalutes to true
     */
    public IfElseStatement(Token keyword,
                           Expression condition,
                           Statement thenBody) {
        super(keyword, thenBody.getLastToken());
        this.condition = condition;
        this.thenBody = thenBody;
    }

    /**
     * Construct a new if/else statement
     * @param keyword the if keyword
     * @param condition the condition being examined
     * @param thenBody the statement to execute if condition evalutes to true
     * @param elseBody the statement to execute if condition evalutes to false
     */
    public IfElseStatement(Token keyword,
                           Expression condition,
                           Statement thenBody,
                           Statement elseBody) {
        super(keyword, (elseBody.isNil() ? thenBody : elseBody).getLastToken());
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
    }

    /**
     * Gets this statement's condition
     * @return this statement's condition
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets this statement's then statement
     * @return this statement's then statement
     */
    public Statement getThenStatement() {
        return thenBody;
    }

    /**
     * Gets this statement's else statement
     * @return this statement's else statement
     */
    public Statement getElseStatement() {
        return elseBody;
    }

    /**
     * Determines if this statement has an else statement
     * @return true iff this statement has an else statement
     */
    public boolean hasElseStatement() {
        boolean ret = (elseBody != null);

        if (ret && (elseBody instanceof Block))
        {
            ret = ((Block)elseBody).isNil();
        }

        return ret;
    }

    /**
     * Determines if this statement has an empty then statement
     * @return true iff this statement has an empty then statement
     */
    public boolean hasEmptyThenStatement() {
        return (thenBody instanceof Block) && ((Block)thenBody).isEmpty();
    }

    /**
     * Determines if this statement has a empty else statement
     * @return true iff this statement has an empty else statement
     */
    public boolean hasEmptyElseStatement() {
        return (elseBody instanceof Block) && ((Block)elseBody).isEmpty();
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
             visitor.visit(this);
         }
         condition.acceptRec(visitor, order);
         thenBody.acceptRec(visitor, order);
         elseBody.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
