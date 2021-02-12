package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * An abstract class representing a non-constructible (abstract) body
 * declaration.
 * This includes interfaces and annotation types.
 */
public abstract class AbstractBodyDeclaration extends BodyDeclaration {

    /**
     * Construct a new declaration of an abstract body
     * @param name the name of this declaration
     * @param keyword the keyword token of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     */
    public AbstractBodyDeclaration(Token name,
                                   Token keyword,
                                   List<Modifier> modifiers,
                                   List<Annotation> annotations) {
        super(name, keyword, modifiers, annotations);
    }

    /**
     * Double dispatch this super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
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
