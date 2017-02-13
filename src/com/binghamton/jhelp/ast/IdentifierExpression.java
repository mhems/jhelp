package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;

/**
 * A class representing a Java identifier, as an expression
 */
public class IdentifierExpression extends Expression {
    private Annotations annotations;
    private String identifier;

    /**
     * Construct a new identifier expression
     * @param identifier the name of this identifier
     */
    public IdentifierExpression(String identifier) {
        this(identifier, null);
    }

    /**
     * Construct a new identifier expression
     * @param identifier the name of this identifier
     * @param annotations the annotations of this identifier
     */
    public IdentifierExpression(String identifier,
                                List<Annotation> annotations) {
        this.identifier = identifier;
        this.annotations = new Annotations(annotations);
    }

    /**
     * Gets the name of the identifier
     * @return the name of the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Gets the annotations of this identifier, if any
     * @return the annotations of this identifier, if any
     */
    public Annotations getAnnotations() {
        return annotations;
    }
}
