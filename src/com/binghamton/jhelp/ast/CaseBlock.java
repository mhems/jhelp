package com.binghamton.jhelp.ast;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a Java case block of a Java switch statement
 */
public class CaseBlock extends Statement {
    private List<Expression> labels;
    private Statement body;

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
              labels.get(labels.size()-1).getLastToken());
        this.labels = labels;
        this.body = body;
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
}
