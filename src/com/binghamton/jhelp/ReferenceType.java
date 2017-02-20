package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * An abstract class representing reference types.
 * Reference types include:
 * - classes
 * - interfaces
 * - type variables
 * - arrays
 */
public abstract class ReferenceType extends Type {

    /**
     * Construct a named reference type
     * @param name the Token holding the name of this type
     */
    public ReferenceType(Token name) {
        super(name, new ArrayList<>());
    }

    /**
     * Construct a named, annotated reference type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(Token name, List<Annotation> annotations) {
        super(name, annotations);
    }

    /**
     * Construct a named, annotated reference type
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(String name, List<Annotation> annotations) {
        super(name, annotations);
    }

    /**
     * Construct a reference type
     * @param first the first Token in this type declaration
     * @param last the last Token in this type declaration
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(Token first,
                         Token last,
                         Token name,
                         List<Annotation> annotations) {
        super(first, last, name, annotations);
    }

    /**
     * Construct a reference type
     * @param first the first Token in this type declaration
     * @param last the last Token in this type declaration
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public ReferenceType(Token first,
                         Token last,
                         String name,
                         List<Annotation> annotations) {
        super(first, last, name, annotations);
    }

    /**
     * Double dispatch super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
