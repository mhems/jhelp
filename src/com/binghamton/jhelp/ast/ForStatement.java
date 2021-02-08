package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java for statement
 */
public class ForStatement extends Statement {
    private List<Statement> initializers;
    private Expression condition;
    private List<Statement> updates;
    private Statement body;

    /**
     * Construct a new for statement
     * @param keyword the for keyword Token
     * @param initializers the initializing statements of the for statement
     * @param condition the iteration condition of the for statement
     * @param updates the updating statements of the for statement
     * @param statement the body of the for statement
     */
    public ForStatement(Token keyword,
                        List<Statement> initializers,
                        Expression condition,
                        List<Statement> updates,
                        Statement statement) {
        super(keyword);
        setFirstToken(keyword);
        this.initializers = initializers;
        this.condition = condition;
        this.updates = updates;
        this.body = statement;
    }

    /**
     * Gets the statements that initialize this statement
     * @return the statements that initialize this statement
     */
    public List<Statement> getInitializers() {
        return initializers;
    }

    /**
     * Gets a particular initializer of this statement
     * @param index the 0-indexed initializer to retrieve
     * @return the initializer at index `index`
     */
    public Statement getInitializer(int index) {
        return initializers.get(index);
    }

    /**
     * Gets the number of initializers of this statement
     * @return the number of initializers of this statement
     */
    public int getNumInitializers() {
        return initializers.size();
    }

    /**
     * Gets the condition this statement is predicated on
     * @return the condition this statement is predicated on
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Gets the updater statements that update this statement
     * @return the updater statements that update this statement
     */
    public List<Statement> getUpdaters() {
        return updates;
    }

    /**
     * Gets a particular updater of this for statement
     * @param index the 0-indexed updater to retrieve
     * @return the update at index `index`
     */
    public Statement getUpdate(int index) {
        return updates.get(index);
    }

    /**
     * Gets the number of updaters of this for statement
     * @return the number of updaters of this for statement
     */
    public int getNumUpdaters() {
        return updates.size();
    }

    /**
     * Gets the body of this statement
     * @return the body of this statement
     */
    public Statement getBody() {
        return body;
    }

    public void acceptBody(ASTVisitor v) {
        super.accept(v);
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
        // must visit block statements explicitly
    }
}
