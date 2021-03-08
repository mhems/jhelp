package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing enum declarations
 */
public class EnumDeclaration extends ConcreteBodyDeclaration {
    private final List<EnumConstant> constants = new ArrayList<>();

    /**
     * Construct a new enum declaration
     * @param name the name of the declaration
     * @param keyword the keyword Token of this declaration
     * @param modifiers the modifiers of the declaration
     * @param annotations the annotations of this declaration
     * @param implementees the interfaces this declaration implements
     */
    public EnumDeclaration(Token name,
                           Token keyword,
                           List<Modifier> modifiers,
                           List<Annotation> annotations,
                           List<Expression> implementees) {
        super(name, keyword, modifiers, annotations, implementees);
    }

    /**
     * Gets the enum constants in this declaration
     * @return the enum constants in this declaration
     */
    public List<EnumConstant> getConstants() {
        return constants;
    }

    /**
     * Add an enum constant to this declaration
     * @param c the enum constant to add
     */
    public void addConstant(EnumConstant c) {
        constants.add(c);
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
         for (Expression e : getSuperInterfaces())
         {
             e.acceptRec(visitor, order);
         }
         for (Block b : getStaticInitializers())
         {
             b.acceptRec(visitor, order);
         }
         for (Block b : getInstanceInitializers())
         {
             b.acceptRec(visitor, order);
         }
         for (MethodDeclaration md : getConstructors())
         {
             md.acceptRec(visitor, order);
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
         for (EnumConstant ec : constants)
         {
             ec.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
