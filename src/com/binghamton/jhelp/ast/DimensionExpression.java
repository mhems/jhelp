package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * Class representing a dimension expression
 */
public class DimensionExpression extends Expression {
    private Annotation[] annotations;
    private Expression expr;

    /**
     * Construct an annotated dimension expression
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param annotations the annotations of this expression, if any
     * @param expr the comprising expression of this dimension
     */
    public DimensionExpression(Token first,
                               Token last,
                               List<Annotation> annotations,
                               Expression expr) {
        super(first, last);
        this.annotations = annotations.toArray(this.annotations);
        this.expr = expr;
    }

    /**
     * Gets the annotations of this expression
     * @return the annotations of this expression
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Gets the interior expression of this expression
     * @return the interior expression of this expression
     */
    public Expression getExpression() {
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
}
