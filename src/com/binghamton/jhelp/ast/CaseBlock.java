package com.binghamton.jhelp.ast;

/**
 * A class representing a Java case block of a Java switch statement
 */
public class CaseBlock extends ASTNode {
    private List<Expression> labels;
    private Block body;

    /**
     * Construct a new, empty case block
     * @param labels the list of labels for this case block
     */
    public CaseBlock(List<Expression> labels) {
        this(labels, null);
    }

    /**
     * Construct a new case block
     * @param labels the list of labels for this case block
     * @param body the body of the case block
     */
    public CaseBlock(List<Expression> labels, Block body) {
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
    public Expression getLabel(int index;) {
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
     * Gets the body that executes for this case block
     * @return the body that executes for this case block
     */
    public Block getBody() {
        return body;
    }

    /**
     * Determines if the block has a body
     * @return true iff the block has a body
     */
    public boolean hasBody() {
        return body != null;
    }
}
