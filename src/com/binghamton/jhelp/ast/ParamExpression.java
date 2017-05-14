package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a parameterized type expression
 */
public class ParamExpression extends Expression {
    private final Expression expr;
    private final List<TypeArgument> targs;

    /**
     * Construct a new ParamExpression
     * @param expr the Expression yielding the type being parameterized
     * @param targs the TypeArguments parameterizing this type
     * @param last the last Token of this Expression
     */
    public ParamExpression(Expression expr,
                           List<TypeArgument> targs,
                           Token last) {
        super(expr.getFirstToken(), last);
        this.expr = expr;
        this.targs = targs;
    }

    /**
     * Gets the Expression yielding the type being parameterized
     * @return the Expression yielding the type being parameterized
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the TypeArguments parameterizing this type
     * @return the List of the TypeArguments parameterizing this type
     */
    public List<TypeArgument> getTypeArguments() {
        return targs;
    }

    /**
     * Determines if this ParamExpression is the diamond operator.
     * @return iff this ParamExpression has no type arguments
     */
    public boolean isDiamond() {
        return targs.isEmpty();
    }

    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
