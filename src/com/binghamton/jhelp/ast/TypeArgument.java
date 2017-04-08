package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Type;

/**
 * A class representing a Java type argument
 */
public class TypeArgument extends ASTNode {
    // either expresses a reference type or wildcard bound
    private Expression typeExpr = new NilExpression();
    private Annotation[] annotations = {};
    private boolean isWildcard = false;
    private boolean isUpperBound;
    private Type type;

    /**
     * Construct a type argument of a reference type
     * @param type the reference type
     */
    public TypeArgument(Expression type) {
        super(type.getFirstToken(), type.getLastToken());
        this.typeExpr = type;
    }

    /**
     * Construct a wildcard type argument
     * @param literal the '?' literal
     * @param annotations the annotations of this type argument
     */
    public TypeArgument(Token literal, List<Annotation> annotations) {
        super(ASTNode.getFirstToken(literal, annotations), literal);
        this.isWildcard = true;
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the type of this non-wildcard argument
     * @return the type of this argument if it is not a wildcard
     * @throws RuntimeException if this argument is a wildcard
     */
    public Expression getTypeExpression() {
        return typeExpr;
    }

    /**
     * Gets the annotations of this type argument
     * @return the annotations of this type argument
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Determines if this argument is a wildcard
     * @return true iff this argument is a wildcard
     */
    public boolean isWildcard() {
        return isWildcard;
    }

    public boolean hasExplicitBound() {
        return typeExpr.isNil();
    }

    /**
     * Gets the bounding type of this wildcard argument
     * @return the bounding type if this is a wildcard argument
     * @throws RuntimeException if this is not a wildcard argument
     */
    public Expression getBoundType() {
        return typeExpr;
    }

    /**
     * Sets the bounding type of this wildcard argument
     * @param type the bounding type of this wildcard argument
     */
    public void setBoundType(Expression type) {
        this.typeExpr = type;
        setLastToken(type.getLastToken());
    }

    /**
     * Determines if the bound is an upper bound
     * @return true iff the argument is a wilcard and the bound is an upper bound
     * @throws RuntimeException if this is not a wildcarded argument
     */
    public boolean isUpperBounded() {
        return isUpperBound;
    }

    /**
     * Sets if this bound is an upper or lower bound
     * @param isUpperBound true if upper bound,
     *                     false if lower bound
     */
    public void setIsUpperBounded(boolean isUpperBound) {
        this.isUpperBound = isUpperBound;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
