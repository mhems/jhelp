package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

public class ParamExpression extends Expression {
    private final Expression expr;
    private final List<TypeArgument> targs;

    public ParamExpression(Expression expr,
                           List<TypeArgument> targs,
                           Token last) {
        super(expr.getFirstToken(), last);
        this.expr = expr;
        this.targs = targs;
    }

    public Expression getExpression() {
        return expr;
    }

    public List<TypeArgument> getTypeArguments() {
        return targs;
    }

    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
