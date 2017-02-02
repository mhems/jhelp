package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a scope-delimiting block,
 * i.e. { ... }
 */
public class Block extends ASTNode {
    private List<Statement> statements = new ArrayList<>();

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
     * Adds a Statement to this block
     * @param stmt the Statement to add to this block
     */
    public void addStatement(Statement stmt) {
        statements.add(stmt);
    }

    /**
     * Determines if this block is equivalent to another
     * @param other the Object to compare against
     * @return true iff this block is equivalent to `other`
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Block) {
            Block b = (Block)other;
            return statements.equals(b.statements);
        }
        return false;
    }

    /**
     * Determines the hash code of this block
     * @return the hash code of this block
     */
    @Override
    public int hashCode() {
        return statements.hashCode();
    }

}
