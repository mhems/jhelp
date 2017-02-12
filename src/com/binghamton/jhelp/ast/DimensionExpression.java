package com.binghamton.jhelp.ast;

/**
 * Class representing a dimension expression
 */
public class DimensionExpression extends Expression {
    private List<Annotation> annotations;
    private Expresion expr;

    /**
     * Construct an annotated dimension expression
     */
    public DimensionExpression(List<Annotations> annotations, Expression expr) {
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
