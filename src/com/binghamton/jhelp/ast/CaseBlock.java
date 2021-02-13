package com.binghamton.jhelp.ast;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java case block of a Java switch statement
 */
public class CaseBlock extends Statement {
    private List<CaseBlock.CaseExpression> labels;
    private Statement body;

    public static class CaseExpression extends Expression {
        private Expression expr = new NilExpression();
        private Token defaultKeyword;

        public CaseExpression(Expression expr) {
            super(expr.getFirstToken(), expr.getLastToken());
            this.expr = expr;
        }

        public CaseExpression(Token defaultKeyword) {
            super(defaultKeyword, defaultKeyword);
            this.defaultKeyword = defaultKeyword;
        }

        public boolean isDefaultCase() {
            return defaultKeyword != null;
        }

        public Expression getExpr() {
            return expr;
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

        /**
         * Visits the implementor's constituents and then the implementor
         * @param visitor the visitor to visit with
         * @param order the order to vist the implementor with respect to its constituents
         */
        public void acceptRec(ASTVisitor visitor, Visitable.Order order) {
            if (order == Visitable.Order.PRE) {
                visitor.visit(this);
            }
            expr.acceptRec(visitor, order);
            if (order == Visitable.Order.POST) {
                visitor.visit(this);
            }
        }
    }

    /**
     * Construct a new, empty case block with one label
     * @param label the label for this case block
     */
    public CaseBlock(CaseBlock.CaseExpression label) {
        this(new ArrayList<>(Arrays.asList(label)), new NilBlock());
    }

    /**
     * Construct a new, empty case block
     * @param labels the list of labels for this case block
     * @param body the body of this case block
     */
    public CaseBlock(List<CaseBlock.CaseExpression> labels, Block body) {
        super(labels.get(0).getFirstToken(),
              labels.get(labels.size()-1).getLastToken());
        this.labels = labels;
        this.body = body;
    }

    /**
     * Gets the labels that execute this case block
     * @return the labels that execute this case block
     */
    public List<CaseBlock.CaseExpression> getLabels() {
        return labels;
    }

    /**
     * Gets a particular label of this case block
     * @param index the 0-indexed label to retrieve
     * @return the label at index `index`
     */
    public CaseBlock.CaseExpression getLabel(int index) {
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
     * Gets the body of this case block
     * @return the body of this case block
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
        super.accept(v);
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
         for (CaseExpression e : labels)
         {
             e.acceptRec(visitor, order);
         }
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
