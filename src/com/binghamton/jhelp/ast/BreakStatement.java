package com.binghamton.jhelp.ast;

/**
 * A class representing a Java break statement
 */
public class BreakStatement extends Statement {
    private String label;

    /**
     * Construct a break statement
     */
    public BreakStatement() {
        this(null);
    }

    /**
     * Construct a labelled break statement
     */
    public BreakStatement(String label) {
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
