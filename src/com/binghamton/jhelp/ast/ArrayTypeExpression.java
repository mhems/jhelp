package com.binghamton.jhelp.ast;

import java.util.List;

public class ArrayTypeExpression extends Expression {
    private final Expression expr;
    private final List<Dimension> dims;

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
