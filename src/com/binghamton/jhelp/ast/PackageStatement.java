package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;

/**
 * A class representing a Java package statement
 */
public class PackageStatement extends ASTNode {
    private Annotations annotations;
    private List<String> ids;

    /**
     * Construct a new package statement
     * @param ids a list of package identifiers
     * @param annotations list of package annotations, if any
     */
    public PackageStatement(List<String> ids, List<Annotation> annotations) {
        this.ids = ids;
        this.annotations = new Annotations(annotations);
    }

    /**
     * Gets the annotations, if any, of this package declaration
     * @return the annotations, if any, of this package declaration
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Gets the elements that comprise this package declaration
     * @return the elements that comprise this package declaration
     */
    public List<String> getIdentifiers() {
        return ids;
    }

    /**
     * Gets the period-separated name of the declared package
     * @return the period-separated name of the declared package
     */
    public String getName() {
        return String.join(".", ids);
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
