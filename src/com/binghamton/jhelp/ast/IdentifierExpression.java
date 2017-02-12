package com.binghamton.jhelp.ast;

/**
 * A class representing a Java identifier, as an expression
 */
public class IdentifierExpression extends Expression {
    private List<Annotation> annotations;
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
        this.annotations = annotations;
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
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * Determines if this identifier is annotated
     * @return true iff this identifier is annotated
     */
    public boolean hasAnnotations() {
        return annotations != null;
    }
}
