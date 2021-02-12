package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing the declaration of a Java interface
 */
public class InterfaceDeclaration extends AbstractBodyDeclaration {
    private List<Expression> implementees = new ArrayList<>();
    private List<TypeParameter> typeParams = new ArrayList<>();

    /**
     * Construct a new InterfaceDeclaration
     * @param name the name of this declaration
     * @param keyword the keyword token of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     * @param implementees the interfaces this declaration implements
     */
    public InterfaceDeclaration(Token name,
                                Token keyword,
                                List<Modifier> modifiers,
                                List<Annotation> annotations,
                                List<Expression> implementees) {
        this(name, keyword, modifiers, annotations, implementees, new ArrayList<>());
    }

    /**
     * Construct a new InterfaceDeclaration
     * @param name the name of this declaration
     * @param keyword the keyword token of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     * @param implementees the interfaces this declaration implements
     * @param typeParams the type parameters of this declaration
     */
    public InterfaceDeclaration(Token name,
                                Token keyword,
                                List<Modifier> modifiers,
                                List<Annotation> annotations,
                                List<Expression> implementees,
                                List<TypeParameter> typeParams) {
        super(name, keyword, modifiers, annotations);
        this.implementees = implementees;
        this.typeParams = typeParams;
    }

    /**
     * Gets the list of type parameters of this interface
     * @return the list of type parameters of this interface
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this interface has type parameters
     * @return true iff this interface has type parameters
     */
    public boolean hasTypeParameters() {
        return !typeParams.isEmpty();
    }

    /**
     * Determines if this declaration implements any interfaces
     * @return true iff this declaration implements any interfaces
     */
    public boolean hasSuperInterfaces() {
        return !implementees.isEmpty();
    }

    /**
     * Gets the implemented interfaces of this declaration
     * @return the implemented interfaces of this declaration
     */
    public List<Expression> getSuperInterfaces() {
        return implementees;
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
         for (TypeParameter tp : typeParams)
         {
             tp.acceptRec(visitor, order);
         }
         for (Expression e : implementees)
         {
             e.acceptRec(visitor, order);
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
