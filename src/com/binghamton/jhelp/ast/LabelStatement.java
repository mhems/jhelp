package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java label statement
 * e.g. OuterLoop:
 */
public class LabelStatement extends Statement {
    private final Statement stmt;
    private final Token label;

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

    /**
     * Gets the Statement this Statement labels
     * @return the Statement this Statement labels
     */
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
         stmt.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
