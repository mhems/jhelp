package com.binghamton.jhelp.ast;

/**
 * A class representing a Java type argument
 */
public class TypeArgument {
    private ReferenceType type;
    private Annotations annotations;
    private boolean isWildcard = false;
    private boolean isUpperBound;

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
    public TypeArgument(Annotations annotations) {
        this.isWildcard = true;
        this.annotations = annotations;
    }

    /**
     * Construct a bounded wildcard type argument
     * @param type the bounding type of this type argument
     * @param isUpperBound true iff `type` is the upper bound
     * @param annotations the annotations of this type argument
     */
    public TypeArgument(ReferenceType type,
                        boolean isUpperBound,
                        Annotations annotations) {
        this.type = type;
        this.isWildcard = true;
        this.isUpperBound = isUpperBound;
        this.annotations = annotations;
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
            return type.getAnnotations;
        }
        return annotations;
    }

    /**
     * Determines if this argument is a wildcard
     * @return true iff this argument is a wildcard
     */
    public boolean isWildCard() {
        return isWildcard;
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
}
