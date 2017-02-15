package com.binghamton.jhelp;

import java.util.List;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends ReferenceType {

    /**
     * Construct a named type variable
     * @param name the name of this type
     */
    public TypeVariable(String name) {
        super(name, null);
    }

    /**
     * Construct a named, annotated type variable
     * @param name the name of this type
     * @param annotations the annotations of this type
     */
    public TypeVariable(String name, List<Annotation> annotations) {
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
