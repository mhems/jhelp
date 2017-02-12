package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Annotation;

/**
 * Class representing a dimension expression
 */
public class DimensionExpression extends Expression {
    private List<Annotation> annotations;
    private Expression expr;

    /**
     * Construct an annotated dimension expression
     * @param annotations the annotations of this expression, if any
     * @param expr the comprising expression of this dimension
     */
    public DimensionExpression(List<Annotation> annotations, Expression expr) {
        this.annotations = annotations;
        this.expr = expr;
    }

    /**
     * Gets the annotations of this expression
     * @return the annotations of this expression
     */
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * Gets the interior expression of this expression
     * @return the interior expression of this expression
     */
    public Expression getExpression() {
        return expr;
    }
}
