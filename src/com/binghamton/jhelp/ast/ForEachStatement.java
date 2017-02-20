package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.VariableSymbol;

/**
 * A class representing a Java for-each statement
 */
public class ForEachStatement extends Block {
    private VariableDeclaration variable;
    private Expression iterable;

    /**
     * Construct a new for each statement with a one statement body
     * @param keyword the for keyword Token
     * @param variable the iteration variable
     * @param iterable the iterable being iterated
     * @param statement the single statement of the for each statement
     */
    public ForEachStatement(Token keyword,
                            VariableDeclaration variable,
                            Expression iterable,
                            Statement statement) {
        this(keyword, variable, iterable, new Block(statement));
    }

    /**
     * Construct a new for each statement
     * @param keyword the for keyword Token
     * @param variable the iteration variable
     * @param iterable the iterable being iterated
     * @param body the body of the for loop
     */
    public ForEachStatement(Token keyword,
                            VariableDeclaration variable,
                            Expression iterable,
                            Block body) {
        super(body);
        setFirstToken(keyword);
        this.variable = variable;
        this.iterable = iterable;
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
