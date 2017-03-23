package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java identifier, as an expression
 */
public class IdentifierExpression extends Expression {
    private Annotation[] annotations = {};
    private Token identifier;

    /**
     * Construct a new identifier expression
     * @param identifier the Token of this identifier
     */
    public IdentifierExpression(Token identifier) {
        this(identifier, new ArrayList<>());
    }

    /**
     * Construct a new identifier expression
     * @param identifier the Token of this identifier
     * @param annotations the annotations of this identifier
     */
    public IdentifierExpression(Token identifier,
                                List<Annotation> annotations) {
        super(getFirstToken(identifier, annotations), identifier);
        this.identifier = identifier;
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the name of the identifier
     * @return the name of the identifier
     */
    public Token getIdentifier() {
        return identifier;
    }

    /**
     * Gets the annotations of this identifier, if any
     * @return the annotations of this identifier, if any
     */
    public Annotation[] getAnnotations() {
        return annotations;
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
