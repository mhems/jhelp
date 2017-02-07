package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.VariableSymbol;

/**
 * A class representing a Java for-each statement
 */
public class ForEachStatement extends Statement {
    private VariableDeclaration variable;
    private Expression iterable;
    private Block body;

    /**
     * Construct a new for each statement with a one statement body
     * @param variable the iteration variable
     * @param iterable the iterable being iterated
     * @param statement the single statement of the for each statement
     */
    public ForEachStatement(VariableDeclaration variable,
                            Expression iterable,
                            Statement statement) {
        this(variable, iterable, new Block(statement));
    }

    /**
     * Construct a new for each statement
     * @param variable the iteration variable
     * @param iterable the iterable being iterated
     * @param body the body of the for loop
     */
    public ForEachStatement(VariableDeclaration variable,
                            Expression iterable,
                            Block body) {
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    /**
     * Gets the variable being iterated with
     * @return the variable being iterated with
     */
    public VariableDeclaration getVariable() {
        return variable;
    }

    /**
     * Gets the iterable being iterated on
     * @return the iterable being iterated on
     */
    public Expression getIterable() {
        return iterable;
    }

    /**
     * Gets the body of the for each statement
     * @return the body of the for each statement
     */
    public Block getBody() {
        return body;
    }
}
