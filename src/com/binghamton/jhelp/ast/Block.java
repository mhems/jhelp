package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * Class representing a scope-delimiting block,
 * i.e. { ... }
 */
public class Block extends ASTNode {
    private List<Statement> statements;

    /**
     * Construct an empty block
     */
    public Block() {
        statements = new ArrayList<Statement>();
    }

    /**
     * Construct a block comprised of a single statement
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
     * Gets the statements within this block
     * @return the statements within this block
     */
    public List<Statement> getStatements() {
        return statements;
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
}
