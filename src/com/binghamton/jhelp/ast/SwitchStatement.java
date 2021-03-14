package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java switch statement
 * e.g. {@code switch { case 5: break; }}
 */
public class SwitchStatement extends Statement {
    private final Expression condition;
    private final List<CaseBlock> cases;

    /**
     * Construct a new switch statement
     * @param keyword the switch keyword
     * @param last the terminating curly brace Token
     * @param condition the expression whose value is being switched on
     * @param cases the list of cases in this switch statement
     */
    public SwitchStatement(Token keyword,
                           Token last,
                           Expression condition,
                           List<CaseBlock> cases) {
        super(keyword, last);
        this.condition = condition;
        this.cases = cases;
    }

    /**
     * Gets the expression being switched upon
     * @return the expression being switched upon
     */
    public Expression getSwitchExpression() {
        return condition;
    }

    /**
     * Gets the blocks of this switch statement
     * @return the blocks of this switch statement
     */
    public List<CaseBlock> getCases() {
        return cases;
    }

    /**
     * Gets a particular block of this switch statement
     * @param index the 0-indexed index of the block to retrieve
     * @return the block at index `index`
     */
    public CaseBlock getCase(int index) {
        return cases.get(index);
    }

    /**
     * Gets the number of cases of this switch statement
     * @return the number of cases of this switch statement
     */
    public int getNumCases() {
        return cases.size();
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
         condition.acceptRec(visitor, order);
         for (CaseBlock cb : cases)
         {
             cb.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
