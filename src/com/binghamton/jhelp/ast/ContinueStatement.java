package com.binghamton.jhelp.ast;

/**
 * A class representing a Java continue statement
 */
public class ContinueStatement extends Statement {
    private String label;

    /**
     * Construct a continue statement
     */
    public ContinueStatement() {
        this(null);
    }

    /**
     * Construct a labelled continue statement
     */
    public ContinueStatement(String label) {
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
}
