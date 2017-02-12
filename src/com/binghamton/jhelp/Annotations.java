package com.binghamton.jhelp;

import java.util.List;
import java.util.ArrayList;

/**
 * A class abstracting a list of Java annotations
 */
// TODO is subclassing the right choice here?
//        for typing, yes; for re-use, no
public class Annotations extends Modifiers {
    private List<Annotation> annotations;

    /**
     * Construct an empty list of annotations
     */
    public Annotations() {
        annotations = new ArrayList<Annotation>();
    }

    /**
     * Construct a list of annotations with a given list
     * @param annotations the annotations to construct with
     */
    public Annotations(List<Annotation> annotations) {
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
    public boolean annotated() {
        return annotations != null && numAnnotations() > 0;
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
}
