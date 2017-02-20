package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.NilType;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.ReferenceType;

/**
 * A class representing a Java cast expression
 */
public class CastExpression extends Expression {
    private Expression expr;
    private Type type;
    private List<ReferenceType> refTypes;

    /**
     * Construct a new cast expression
     * @param first the first token of this ASTNode
     * @param expr the expression to cast
     * @param type the type to cast the expression to
     */
    public CastExpression(Token first, Expression expr, Type type) {
        super(first, expr.getLastToken());
        this.expr = expr;
        this.type = type;
    }

    /**
     * Construct a new bounded cast expression
     * @param first the first token of this ASTNode
     * @param expr the expression to cast
     * @param refTypes the types to cast the expression to
     */
    public CastExpression(Token first,
                          Expression expr,
                          List<ReferenceType> refTypes) {
        super(first, expr.getLastToken());
        this.expr = expr;
        if (refTypes.size() == 1) {
            this.type = refTypes.get(0);
            this.refTypes = new ArrayList<>();
        } else {
            this.type = new NilType();
            this.refTypes = refTypes;
        }
    }

    /**
     * Gets the expression this cast is casting on
     * @return the expression this cast is casting on
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the type this cast is casting to
     * @return the type this cast is casting to
     * @throws RuntimeException if the cast is additionally bounded
     */
    public Type getTargetType() {
        if (!isAdditional()) {
            return type;
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Determines if this cast has additional bounds
     * @return true iff this cast has additional bounds
     */
    public boolean isAdditional() {
        return refTypes.size() > 0;
    }

    /**
     * Gets the type bounds of this cast
     * @return the type bounds of this cast
     * @throws RuntimeException if the cast is not additionally bounded
     */
    public List<ReferenceType> getTypeBounds() {
        if (isAdditional()) {
            return refTypes;
        }
        throw new RuntimeException(); // TODO
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
