package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a Java annotation type declaration
 */
public class AnnotationDeclaration extends AbstractBodyDeclaration {

    /**
     * Construct a new annotation declaration
     * @param name the token holding the name of the annotation
     * @param at the token holding the @ symbol
     * @param modifiers the modifiers of the annotation
     */
    public AnnotationDeclaration(Token name,
                                 Token at,
                                 List<Modifier> modifiers) {
        super(name, at, modifiers);
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
