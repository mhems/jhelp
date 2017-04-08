package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java switch statement
 */
public class SwitchStatement extends Statement {
    // TODO defines new scope, local vars declared in case blocks are hoisted
    // (without initializer?)  outside their case block into this switch scope
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
        super.accept(v);
        v.visit(this);
    }
}
