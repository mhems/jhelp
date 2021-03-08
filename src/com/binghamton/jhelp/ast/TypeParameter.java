package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.types.TypeVariable;

/**
 * A class representing a Java type parameter
 */
public class TypeParameter extends ASTNode {
    private Token name;
    private List<Expression> superTypes = new ArrayList<>();
    private TypeVariable type;
    private Annotation[] annotations;

    /**
     * Construct a named type parameter
     * @param name the Token holding the name of the type parameter
     */
    public TypeParameter(Token name) {
        this(name, new ArrayList<>());
    }

    /**
     * Construct a named, annotated type parameter
     * @param name the Token holding the name of the type parameter
     * @param annotations the annotations of the type parameter
     */
    public TypeParameter(Token name, List<Annotation> annotations) {
        this(name, annotations, new ArrayList<>());
    }

    /**
     * Construct a named, annotated type parameter
     * @param name the Token holding the name of the type parameter
     * @param annotations the annotations of the type parameter
     * @param superTypes the super types (bounds) of the type parameter
     */
    public TypeParameter(Token name,
                         List<Annotation> annotations,
                         List<Expression> superTypes) {
        super(ASTNode.getFirstToken(name, annotations),
              ASTNode.getLastToken(name, superTypes));
        this.annotations = annotations.toArray(new Annotation[annotations.size()]);
        this.name = name;
        this.superTypes = superTypes;
    }

    /**
     * Determines if this TypeParameter has any Annotations
     * @return true iff this TypeParameter has any Annotations
     */
    public boolean isAnnotated() {
        return annotations.length > 0;
    }

    /**
     * Gets the Annotations on this TypeParameter
     * @return the Annotations on this TypeParameter
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Gets the underlying type variable of this parameter
     * @return the underlying type variable of this parameter
     */
    public String getName() {
        return name.getText();
    }

    /**
     * Gets the Token holding the name of this TypeParameter
     * @return the Token holding the name of this TypeParameter
     */
    public Token getToken() {
        return name;
    }

    /**
     * Gets the super types of this parameter, if any
     * @return the super types of this parameter, if any
     */
    public List<Expression> getSuperTypes() {
        return superTypes;
    }

    /**
     * Determines if this parameters has any super types
     * @return true iff this parameters has any super types
     */
    public boolean hasSuperTypes() {
        return numSuperTypes() > 0;
    }

    /**
     * Gets the number of super types of this parameter
     * @return the number of super types of this parameter
     */
    public int numSuperTypes() {
        return superTypes.size();
    }

    /**
     * Adds a super type to this type parameter
     * @param superType the super type of this type parameter
     */
    public void addSuperType(Expression superType) {
        superTypes.add(superType);
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
         for (Annotation a : annotations)
         {
             a.acceptRec(visitor, order);
         }
         for (Expression e : superTypes)
         {
             e.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }

    /**
     * Gets the TypeVariable this TypeParameter evaluates to
     * @return the TypeVariable this TypeParameter evaluates to
     */
    public TypeVariable getType() {
        return type;
    }

    /**
     * Sets the TypeVariable this TypeParameter evaluates to
     * @param type the TypeVariable this TypeParameter evaluates to
     */
    public void setType(TypeVariable type) {
        this.type = type;
    }
}
