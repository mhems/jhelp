package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java jump statement.
 * This includes break and continue.
 */
public class JumpStatement extends Statement {
    private Token label;
    private boolean isBreak;

    /**
     * Construct a jump statement
     * @param keyword the jump keyword, either break or continue
     * @param last the last Token of this statement
     */
    public JumpStatement(Token keyword, Token last) {
        this(keyword, last, null);
    }

    /**
     * Construct a labelled jump statement
     * @param keyword the jump keyword, either break or continue
     * @param last the last Token of this statement
     * @param label the jump label
     */
    public JumpStatement(Token keyword, Token last, Token label) {
        super(keyword, last);
        this.label = label;
        this.isBreak = keyword.getText().equals("break");
    }

    /**
     * Gets the label of the statement
     * @return the label of the statement, may be null
     */
    public String getLabel() {
        return label == null ? null : label.getText();
    }

    /**
     * Determines if the statement is labelled
     * @return true iff the statement is labelled
     */
    public boolean isLabelled() {
        return label != null;
    }

    /**
     * Determines if the statement is a break statement
     * @return true  if the statement is a break statement
     *         false if the statement is a continue statement
     */
    public boolean isBreakStatement() {
        return isBreak;
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
