package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

public class TypeExpression extends Expression {
    private Expression expr;
    private List<TypeArgument> targs;

    public TypeExpression(Expression expr, List<TypeArgument> targs) {
        super(expr.getFirstToken(), targs.get(targs.size()-1).getLastToken());
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
