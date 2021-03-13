package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

/**
 * Class representing a scope-delimiting block,
 * e.g. { ... }
 */
public class Block extends Statement {
    private List<Statement> statements = new ArrayList<>();

    /**
     * Construct an empty block
     */
    public Block() {
        super();
    }

    /**
     * Construct an empty open-ended block
     * @param first the first token of this ASTNode
     */
    public Block(Token first) {
        super(first);
    }

    /**
     * Construct an empty block
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public Block(Token first, Token last) {
        super(first, last);
    }


    /**
     * Construct a block comprised of a single statement
     * @param statement the sole statement of this block
     */
    public Block(Statement statement) {
        super(statement.getFirstToken(), statement.getLastToken());
        statements.add(statement);
    }

    /**
     * Construct a block comprised of a single statement
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param statement the sole statement of this block
     */
    public Block(Token first, Token last, Statement statement) {
        super(first, last);
        statements.add(statement);
    }

    /**
     * Construct a block
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param statements the statements comprising this block
     */
    public Block(Token first, Token last, List<Statement> statements) {
        super(first, last);
        this.statements = statements;
    }

    /**
     * Construct a block
     * @param statements the statements comprising this block
     */
    public Block(List<Statement> statements) {
        this(statements.get(0).getFirstToken(),
             statements.get(statements.size()-1).getLastToken(),
             statements);
    }

    /**
     * Copy construct a block from another
     * @param block the other block whose values are to copied
     */
    public Block(Block block) {
        this(block.getFirstToken(), block.getLastToken(), block.statements);
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
        this.statements.addAll(statements);
    }

    /**
     * Adds a Statement to this block at the specified index
     * @param index the index to insert the statement at
     * @param stmt the Statement to add to this block
     */
    public void addStatement(int index, Statement stmt) {
        statements.add(index, stmt);
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         for (Statement s : statements)
         {
             s.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
