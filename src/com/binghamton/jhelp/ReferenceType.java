package com.binghamton.jhelp;

import java.util.List;

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
     * @param name the name of this type
     */
    public ReferenceType(String name) {
        super(name, null);
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
     * Double dispatch super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
