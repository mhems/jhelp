package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

public class ArrayTypeExpression extends Expression {
    private Expression expr;
    private List<Dimension> dims;

    public ArrayTypeExpression(Expression expr, List<Dimension> dims) {
        super(expr.getFirstToken(), dims.get(dims.size()-1).getLastToken());
        this.expr = expr;
        this.dims = dims;
    }

    public Expression getExpression() {
        return expr;
    }

    public List<Dimension> getDimensions() {
        return dims;
    }
}
