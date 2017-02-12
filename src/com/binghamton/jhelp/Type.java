package com.binghamton.jhelp;

/**
 * Abstract base class representing a Java type
 */
public abstract class Type {
    private Annotations annotations;
    private String name;

    /**
     * Construct a named type
     * @param name the name of this type
     */
    public Type(String name) {
        this(name, new Annotations());
    }

    /**
     * Construct a named, annotated type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public Type(String name, Annotations annotations) {
        this.name = name;
        this.annotations = annotations;
    }

    /**
     * Gets this type's name
     * @return this type's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets this type's annotations
     * @return this type's annotations
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Augments the type into a new array type
     * @param dimensions the dimensions of the array type
     * @return a new array type with same base type and `dimensions`
     */
    public ArrayType augment(int dimensions) {
        return new ArrayType(this, dimensions);
    }

    /**
     * Determines if this type and `other` are type-equivalent
     * @param other the other Type to inspect
     * @return true  if this type and `other` are type-equivalent
     * @       false otherwise
     */
    public abstract boolean matches(Type other);

    /**
     * Determines if this type is a sub-type of `other`
     * @param other the other Type to inspect
     * @return true  if this type is a sub-type of `other`
     * @       false otherwise
     */
    public abstract boolean isSubtype(Type other);

    /**
     * Determines if this type is a sub-type of `other`
     * @param other the other Type to inspect
     * @return true  if this type is a sub-type of `other`
     * @       false otherwise
     */
    public abstract boolean isSupertype(Type other);

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        // TODO
        return true;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        // TODO
        return 0;
    }

}
