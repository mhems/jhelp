package com.binghamton.jhelp;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class representing a Java type argument
 */
public class TypeArgument extends ASTNode {
    private ReferenceType type;
    private Annotations annotations;
    private boolean isWildcard = false;
    private boolean isUpperBound;

    /**
     * Construct an empty (diamond) type argument
     */
    public TypeArgument() {
        super();
    }

    /**
     * Construct a type argument of a reference type
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param type the reference type
     */
    public TypeArgument(ReferenceType type) {
        super(type.getFirstToken(), type.getLastToken());
        this.type = type;
    }

    /**
     * Construct a wildcard type argument
     * @param literal the '?' literal
     * @param annotations the annotations of this type argument
     */
    public TypeArgument(Token literal, List<Annotation> annotations) {
        super(ASTNode.getFirstToken(literal, annotations), literal);
        this.isWildcard = true;
        this.annotations = new Annotations(annotations);
    }

    /**
     * Gets the type of this non-wildcard argument
     * @return the type of this argument if it is not a wildcard
     * @throws RuntimeException if this argument is a wildcard
     */
    public ReferenceType getType() {
        if (!isWildcard()) {
            return type;
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Gets the annotations of this type argument
     * @return the annotations of this type argument
     */
    public Annotations getAnnotations() {
        if (!isWildcard) {
            return type.getAnnotations();
        }
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
     * Determines if this argument is empty (i.e. the diamond operator)
     * @return true iff this argument is empty
     */
    public boolean isDiamond() {
        return type == null && !isWildcard();
    }

    /**
     * Gets the bounding type of this wildcard argument
     * @return the bounding type if this is a wildcard argument
     * @throws RuntimeException if this is not a wildcard argument
     */
    public ReferenceType getBoundType() {
        if (isWildcard()) {
            return type;
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Sets the bounding type of this wildcard argument
     * @param type the bounding type of this wildcard argument
     */
    public void setBoundType(ReferenceType type) {
        // TODO change last token
        this.type = type;
    }

    /**
     * Determines if the bound is an upper bound
     * @return true iff the argument is a wilcard and the bound is an upper bound
     * @throws RuntimeException if this is not a wildcarded argument
     */
    public boolean isUpperBounded() {
        if (!isWildcard) {
            throw new RuntimeException(); // TODO
        }
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
}
