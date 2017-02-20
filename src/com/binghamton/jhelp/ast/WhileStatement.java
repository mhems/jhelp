package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java (do) while statement
 */
public class WhileStatement extends Block {
    private Expression condition;
    private boolean isDo;

    /**
     * Construct a new while statement
     * @param keyword the keyword of the while statement
     * @param condition the condition whose truth dictates iteration
     * @param body the code to conditionally execute
     */
    public WhileStatement(Token keyword, Expression condition, Block body) {
        super(body);
        setFirstToken(keyword);
        this.condition = condition;
        this.isDo = false;
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
                          Block body) {
        super(body);
        setFirstToken(keyword);
        setLastToken(last);
        this.condition = condition;
        this.isDo = true;

    }

    /**
     * Gets the conditon this statement is predicated on
     * @return the conditon this statement is predicated on
     */
    public Expression getCondition() {
        return condition;
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
}
