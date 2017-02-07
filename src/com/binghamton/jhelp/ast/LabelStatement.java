package com.binghamton.jhelp.ast;

/**
 * A class representing a Java label statement
 */
public class LabelStatement extends Statement {
    private String label;
    private Statement statement;

    /**
     * Construct a new labelled statement
     * @param label the name of the label
     * @param statement the statement being labelled
     */
    public LabelStatement(String label, Statement statement) {
        this.label = label;
        this.statement = statement;
    }

    /**
     * Gets the name of the label
     * @return the name of the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Gets the labelled statement
     * @return the labelled statement
     */
    public Statement getStatement() {
        return statement;
    }
}
