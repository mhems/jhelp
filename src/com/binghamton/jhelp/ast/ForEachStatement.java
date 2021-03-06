package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java for-each statement
 * e.g. {@code for (Foo f : foos)}
 */
public class ForEachStatement extends Statement {
    private VariableDeclaration variable;
    private Expression iterable;
    private Statement body;

    /**
     * Construct a new for each statement
     * @param keyword the for keyword Token
     * @param variable the iteration variable
     * @param iterable the iterable being iterated
     * @param statement the body of the for each loop
     */
    public ForEachStatement(Token keyword,
                            VariableDeclaration variable,
                            Expression iterable,
                            Statement statement) {
        super(keyword);
        setFirstToken(keyword);
        this.variable = variable;
        this.iterable = iterable;
        this.body = statement;
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
     * Gets the body of this statement
     * @return the body of this statement
     */
    public Statement getBody() {
        return body;
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
         variable.acceptRec(visitor, order);
         iterable.acceptRec(visitor, order);
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
