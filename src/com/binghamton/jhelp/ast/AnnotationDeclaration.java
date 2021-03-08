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
     * @param annotations the annotations of this declaration
     */
    public AnnotationDeclaration(Token name,
                                 Token at,
                                 List<Modifier> modifiers,
                                 List<Annotation> annotations) {
        super(name, at, modifiers, annotations);
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         for (Annotation a : getAnnotations())
         {
             a.acceptRec(visitor, order);
         }
         for (VariableDeclaration vd : getFields())
         {
             vd.acceptRec(visitor, order);
         }
         for (MethodDeclaration md : getMethods())
         {
             md.acceptRec(visitor, order);
         }
         for (BodyDeclaration bd : getInnerBodies())
         {
             bd.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
