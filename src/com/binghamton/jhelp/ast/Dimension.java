package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * Class representing a dimension
 */
public class Dimension extends ASTNode {
    private Annotation[] annotations = {};

    /**
     * Construct a new Dimension object
     * @param first the opening brace Token
     * @param last the closing brace Token
     */
    public Dimension(Token first, Token last) {
        super(first, last);
    }

    /**
     * Construct a new annotated Dimension object
     * @param first the opening brace Token
     * @param last the closing brace Token
     * @param annotations the annotations of this Dimension, if any
     */
    public Dimension(Token first, Token last, List<Annotation> annotations) {
        super(ASTNode.getFirstToken(first, annotations), last);
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the annotations of this expression
     * @return the annotations of this expression
     */
    public Annotation[] getAnnotations() {
        return annotations;
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
