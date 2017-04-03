package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java label statement
 */
public class LabelStatement extends Statement {
    private Statement stmt;
    private Token label;

    /**
     * Construct a new labelled statement
     * @param label the name of the label
     * @param statement the statement being labelled
     */
    public LabelStatement(Token label, Statement statement) {
        super(label, statement.getLastToken());
        this.stmt = statement;
        this.label = label;
    }

    public Statement getStatement() {
        return stmt;
    }

    /**
     * Gets the text of the label
     * @return the textname of the label
     */
    public Token getLabel() {
        return label;
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
