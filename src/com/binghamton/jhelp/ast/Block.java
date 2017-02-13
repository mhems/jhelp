package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * Class representing a scope-delimiting block,
 * i.e. { ... }
 */
public class Block extends Statement {
    private List<Statement> statements;

    /**
     * Construct an empty block
     */
    public Block() {
        statements = new ArrayList<Statement>();
    }

    /**
     * Construct a block comprised of a single statement
     * @param statement the sole statement of this block
     */
    public Block(Statement statement) {
        this();
        statements.add(statement);
    }

    /**
     * Construct a block
     * @param statements the statements comprising this block
     */
    public Block(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Deep-copy construct a block from another
     * @param block the other block whose values are to copied
     */
    public Block(Block block) {
        this.statements = new ArrayList<>(block.statements);
    }

    /**
     * Gets the statements within this block
     * @return the statements within this block
     */
    public List<Statement> getStatements() {
        return statements;
    }

    /**
     * Sets the statements within this block
     * @param statements the statements within this block
     */
    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Gets the statement at index `index`
     * @param index the index of the statement to get
     * @return the statement at index `index`
     */
    public Statement getStatement(int index) {
        return statements.get(index);
    }

    /**
     * Gets the number of statements in this block
     * @return the number of statements in this block
     */
    public int size() {
        return statements.size();
    }

    /**
     * Determines if this block has no statements
     * @return true iff this block has no statements
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Adds a Statement to this block
     * @param stmt the Statement to add to this block
     */
    public void addStatement(Statement stmt) {
        statements.add(stmt);
    }

    /**
     * Adds Statements to this block
     * @param statements the Statements to add to this block
     */
    public void addStatements(List<Statement> statements) {
        statements.addAll(statements);
    }

    /**
     * Adds a Statement to this block at the specified index
     * @param index the index to insert the statement at
     * @param stmt the Statement to add to this block
     */
    public void addStatement(int index, Statement stmt) {
        statements.add(index, stmt);
    }
}
