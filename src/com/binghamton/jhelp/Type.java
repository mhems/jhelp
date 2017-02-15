package com.binghamton.jhelp;

import java.util.List;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.Visitable;

/**
 * Abstract base class representing a Java type
 */
public abstract class Type implements Visitable {
    protected Annotations annotations;
    protected String name;

    /**
     * Construct a named type
     * @param name the name of this type
     */
    public Type(String name) {
        this(name, null);
    }

    /**
     * Construct a named, annotated type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public Type(String name, List<Annotation> annotations) {
        this.name = name;
        this.annotations = new Annotations(annotations);
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
     * Sets this type's annotations
     * @param annotations this type's new annotations
     */
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = new Annotations(annotations);
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
    //public abstract boolean matches(Type other);

    /**
     * Determines if this type is a sub-type of `other`
     * @param other the other Type to inspect
     * @return true  if this type is a sub-type of `other`
     * @       false otherwise
     */
    //public abstract boolean isSubtype(Type other);

    /**
     * Determines if this type is a sub-type of `other`
     * @param other the other Type to inspect
     * @return true  if this type is a sub-type of `other`
     * @       false otherwise
     */
    //public abstract boolean isSupertype(Type other);

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Type) {
            Type type = (Type)other;
            return name.equals(type.name) &&
                annotations.equals(type.annotations);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return name.hashCode() ^ annotations.hashCode();
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
