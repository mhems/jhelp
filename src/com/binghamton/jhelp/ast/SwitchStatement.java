package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java switch statement
 */
public class SwitchStatement extends Statement {
    private Expression condition;
    private List<CaseBlock> cases;

    /**
     * Construct a new switch statement
     * @param condition the expression whose value is being switched on
     * @param cases the list of cases in this switch statement
     */
    public SwitchStatement(Expression condition, List<CaseBlock> cases) {
        this.condition = condition;
        this.cases = cases;
    }

    /**
     * Gets the expression being switched upon
     * @return the expression being switched upon
     */
    public Expression getSwitch() {
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
     * @param the 0-indexed index of the block to retrieve
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
}
