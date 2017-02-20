package com.binghamton.jhelp;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class abstracting a list of Java annotations
 */
public class Annotations extends ASTNode {
    private List<Annotation> annotations = new ArrayList<>();

    /**
     * Construct a emtpy list of annotations
     */
    public Annotations() {
        super();
    }

    /**
     * Construct a list of annotations with a given list
     * @param annotations the annotations to construct with
     */
    public Annotations(List<Annotation> annotations) {
        super(annotations);
        this.annotations = annotations;
    }

    /**
     * Gets the underlying list of annotations
     * @return the underlying list of annotations
     */
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * Adds an annotation to this collection
     * @param annotation the annotation to add
     */
    public void addAnnotation(Annotation annotation) {
        annotations.add(annotation);
    }

    /**
     * Gets the number of annotations
     * @return the number of annotations
     */
    public int numAnnotations() {
        return annotations.size();
    }

    /**
     * Determines if any annotations are present
     * @return true  if any annotations are present
     *         false if no annotations are present
     */
    public boolean hasAnnotations() {
        return numAnnotations() > 0;
    }

    /**
     * Determines if an annotation is a member
     * @param a the annotation to check for
     * @return true iff `a` if is among these annotations
     */
    public boolean contains(Annotation a) {
        return annotations.contains(a);
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Annotations) {
            Annotations ans = (Annotations)other;
            return annotations.equals(ans.annotations);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return annotations.hashCode();
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
