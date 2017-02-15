package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a Java annotation type declaration
 */
public class AnnotationDeclaration extends AbstractBodyDeclaration {

    /**
     * Construct a new annotation declaration
     * @param name the name of the annotation
     * @param modifiers the modifiers of the annotation
     */
    public AnnotationDeclaration(String name, List<Modifier> modifiers) {
        super(name, modifiers);
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
