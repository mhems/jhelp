package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java for statement
 */
public class ForStatement extends Statement {
    private List<Statement> initializers;
    private Expression condition;
    private List<Expression> updates;
    private Block body;

    /**
     * Construct a new for statement with a single statement body
     * @param initializers the initializing statements of the for statement
     * @param condition the iteration condition of the for statement
     * @param updates the updating statements of the for statement
     * @param statement the single statement of the for statement body
     */
    public ForStatement(List<Statement> initializers,
                        Expression condition,
                        List<Expression> updates,
                        Statement statement) {
        this(initializers, condition, updates, new Block(statement));
    }

    /**
     * Construct a new for statement
     * @param initializers the initializing statements of the for statement
     * @param condition the iteration condition of the for statement
     * @param updates the updating statements of the for statement
     * @param body the body of the for statement
     */
    public ForStatement(List<Statement> initializers,
                        Expression condition,
                        List<Expression> updates,
                        Block body) {
        this.initializers = initializers;
        this.condition = condition;
        this.updates = updates;
        this.body = body;
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
    public Statement getInitializer(int index;) {
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
     * Gets the updater expressions that update this statement
     * @return the updater expressions that update this statement
     */
    public List<Expression> getUpdaters() {
        return updates;
    }

    /**
     * Gets a particular updater of this statement
     * @param index the 0-indexed updater to retrieve
     * @return the update at index `index`
     */
    public Expression getUpdate(int index;) {
        return updates.get(index);
    }

    /**
     * Gets the number of updaters of this case statement
     * @return the number of updaters of this case statement
     */
    public int getNumUpdaters() {
        return updaters.size();
    }

    /**
     * Gets the body of the for statement
     * @return the body of the for statement
     */
    public Block getBody() {
        return body;
    }

}
