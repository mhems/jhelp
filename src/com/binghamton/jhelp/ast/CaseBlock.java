package com.binghamton.jhelp.ast;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a Java case block of a Java switch statement
 */
public class CaseBlock extends Block {
    private List<Expression> labels;

    /**
     * Construct a new, empty case block with one label
     * @param label the label for this case block
     */
    public CaseBlock(Expression label) {
        this(new ArrayList<>(Arrays.asList(label)), new NilBlock());
    }

    /**
     * Construct a new, empty case block
     * @param labels the list of labels for this case block
     * @param body the body of this case block
     */
    public CaseBlock(List<Expression> labels, Block body) {
        super(labels.get(0).getFirstToken(),
              labels.get(labels.size()-1).getLastToken(),
              body.getStatements());
        this.labels = labels;
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        // Case block is not really a scope-delimiting Block, just a sequence of
        // Statements. Thus do not visit Block superclass.
        v.visit(this);
    }
}
