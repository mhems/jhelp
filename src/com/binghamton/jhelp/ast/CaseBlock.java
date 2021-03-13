package com.binghamton.jhelp.ast;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java case block of a Java switch statement
 * e.g. case 5:
 *          System.out.println(5);
 */
public class CaseBlock extends Statement {
    private List<Expression> labels;
    private List<Statement> statements;
    private Token defaultKw;

    /**
     * Construct a new, empty case block with one label
     * @param label the label for this case block
     */
    public CaseBlock(Expression label) {
        this(new ArrayList<>(Arrays.asList(label)), new ArrayList<Statement>());
    }

    /**
     * Construct a new, empty case block
     * @param labels the list of labels for this case block
     * @param statements the statements within this case block
     */
    public CaseBlock(List<Expression> labels, List<Statement> statements) {
        super(labels.get(0).getFirstToken(),
              labels.get(labels.size()-1).getLastToken());
        this.labels = labels;
        this.statements = statements;
    }

    /**
     * Gets the labels that execute this case block
     * @return the labels that execute this case block
     */
    public List<Expression> getLabels() {
        return labels;
    }

    /**
     * Gets a particular label of this case block
     * @param index the 0-indexed label to retrieve
     * @return the label at index `index`
     */
    public Expression getLabel(int index) {
        return labels.get(index);
    }

    /**
     * Gets the number of labels of this case block
     * @return the number of labels of this case block
     */
    public int getNumLabels() {
        return labels.size();
    }

    /**
     * Gets the statements within this case block
     * @return the statements within this case block
     */
    public List<Statement> getStatements() {
        return statements;
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
         for (Expression e : labels)
         {
             e.acceptRec(visitor, order);
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
