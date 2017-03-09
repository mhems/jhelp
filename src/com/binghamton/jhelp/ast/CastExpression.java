package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java cast expression
 */
public class CastExpression extends Expression {
    private Expression source;
    private List<Expression> targets = new ArrayList<>();

    /**
     * Construct a new cast expression
     * @param first the first token of this ASTNode
     * @param source the expression to cast
     * @param target the Expression yielding the type to cast to
     */
    public CastExpression(Token first, Expression source, Expression target) {
        super(first, source.getLastToken());
        this.source = source;
        targets.add(target);
    }

    /**
     * Construct a new bounded cast expression
     * @param first the first token of this ASTNode
     * @param source the expression to cast
     * @param targets the Expressions yielding the types to cast to
     */
    public CastExpression(Token first,
                          Expression source,
                          List<Expression> targets) {
        super(first, source.getLastToken());
        this.source = source;
        this.targets = targets;
    }

    /**
     * Gets the expression this cast is casting on
     * @return the expression this cast is casting on
     */
    public Expression getSourceExpression() {
        return source;
    }

    public List<Expression> getTargetExpressions() {
        return targets;
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
