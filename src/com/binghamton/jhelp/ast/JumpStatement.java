package com.binghamton.jhelp.ast;

/**
 * A class representing a Java jump statement.
 * This includes break and continue.
 */
public class JumpStatement extends Statement {
    private String label;
    private boolean isBreak;

    /**
     * Construct a jump statement
     * @param isBreak true  if this is a break statement
     *                false if this is a continue statement
     */
    public JumpStatement(boolean isBreak) {
        this(isBreak, null);
    }

    /**
     * Construct a labelled jump statement
     * @param label the label this statement jumps to
     * @param isBreak true  if this is a break statement
     *                false if this is a continue statement
     */
    public JumpStatement(boolean isBreak, String label) {
        this.isBreak = isBreak;
        this.label = label;
    }

    /**
     * Gets the label of the statement
     * @return the label of the statement, may be null
     */
    public String getLabel() {
        return label;
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
