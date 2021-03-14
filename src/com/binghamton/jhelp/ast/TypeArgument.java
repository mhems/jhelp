package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.types.Type;

/**
 * A class representing a Java type argument
 * e.g. {@code <K>}
 *      {@code <? extends V>}
 */
public class TypeArgument extends ASTNode {
    // either expresses a reference type or wildcard bound
    private Expression typeExpr = new NilExpression();
    private Annotation[] annotations = {};
    private boolean isWildcard = false;
    private boolean isUpperBound;
    private Type type;
    private Token wildcard;

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
        this.wildcard = literal;
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
     * Gets the Token of this wildcard TypeArgument
     * @return the Token of this wildcard TypeArgument
     */
    public Token getWildCard() {
        return wildcard;
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

    /**
     * Determines if this TypeArgument is a wildcard with an explicit bound
     * @return true iff this TypeArgument is a wildcard with an explicit bound
     */
    public boolean hasExplicitBound() {
        return !typeExpr.isNil();
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
        v.visit(this);
    }

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         for (Annotation a : annotations)
         {
             a.acceptRec(visitor, order);
         }
         typeExpr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }

    /**
     * Gets the Type this TypeArgument evaluates to
     * @return the Type this TypeArgument evaluates to
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the Type this TypeArgument evaluates to
     * @param type the Type this TypeArgument evaluates to
     */
    public void setType(Type type) {
        this.type = type;
    }
}
