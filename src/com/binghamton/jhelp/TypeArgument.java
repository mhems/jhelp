package com.binghamton.jhelp;

import java.util.List;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class representing a Java type argument
 */
public class TypeArgument extends ASTNode {
    public static final TypeArgument DIAMOND = new TypeArgument();

    private ReferenceType type;
    private Annotations annotations;
    private boolean isWildcard = false;
    private boolean isUpperBound;

    /**
     * Construct an empty (diamond) type argument
     */
    public TypeArgument() { }

    /**
     * Construct a type argument of a reference type
     * @param type the reference type
     */
    public TypeArgument(ReferenceType type) {
        this.type = type;
    }

    /**
     * Construct a wildcard type argument
     * @param annotations the annotations of this type argument
     */
    public TypeArgument(List<Annotation> annotations) {
        this.isWildcard = true;
        this.annotations = new Annotations(annotations);
    }

    /**
     * Construct a bounded wildcard type argument
     * @param type the bounding type of this type argument
     * @param isUpperBound true iff `type` is the upper bound
     * @param annotations the annotations of this type argument
     */
    public TypeArgument(ReferenceType type,
                        boolean isUpperBound,
                        List<Annotation> annotations) {
        this.type = type;
        this.isWildcard = true;
        this.isUpperBound = isUpperBound;
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
        return type == null;
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
