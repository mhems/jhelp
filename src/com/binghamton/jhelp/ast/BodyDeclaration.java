package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.symbols.MyClassSymbol;

/**
 * An abstract class representing a body declaration.
 * This includes interfaces, annotations, classes, and enums.
 */
public abstract class BodyDeclaration extends Declaration {
    /**
     * An enum enumerating the kinds of BodyDeclarations
     */
    public enum Kind {TOP, INNER, ANONYMOUS, LOCAL};

    protected List<VariableDeclaration> fields = new ArrayList<>();
    protected List<MethodDeclaration> methods = new ArrayList<>();
    protected List<BodyDeclaration> innerBodies = new ArrayList<>();
    protected Kind kind = Kind.TOP;

    /**
     * Construct an empty body declaration
     */
    public BodyDeclaration() {
        super();
    }

    /**
     * Construct a new declaration of a body
     * @param name the name of this declaration
     * @param keyword the keyword of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     */
    public BodyDeclaration(Token name,
                           Token keyword,
                           List<Modifier> modifiers,
                           List<Annotation> annotations) {
        super(name, keyword, modifiers, annotations);
    }

    /**
     * Gets the Kind of this Declaration
     * @return the Kind of this Declaration
     */
    public Kind getKind() {
        return kind;
    }

    /**
     * Sets the Kind of this Declaration
     * @param kind the Kind of this Declaration
     */
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Determines if this Declaration is top-level
     * @return true iff this Declaration is top-level
     */
    public boolean isTop() {
        return kind == Kind.TOP;
    }

    /**
     * Determines if this Declaration is declared inside another
     * @return true iff this Declaration is declared inside another
     */
    public boolean isInner() {
        return kind == Kind.INNER;
    }

    /**
     * Determines if this Declaration is anonymous
     * @return true iff this Declaration is anonymous
     */
    public boolean isAnonymous() {
        return kind == Kind.ANONYMOUS;
    }

    /**
     * Determines if this Declaration is a local class
     * @return true iff this Declaration is a local class
     */
    public boolean isLocal() {
        return kind == Kind.LOCAL;
    }

    /**
     * Gets the fields of this declaration
     * @return the fields of this declaration
     */
    public List<VariableDeclaration> getFields() {
        return fields;
    }

    /**
     * Gets the inner bodies of this declaration
     * @return the inner bodies of this declaration
     */
    public List<BodyDeclaration> getInnerBodies() {
        return innerBodies;
    }

    /**
     * Gets the methods of this declaration
     * @return the methods of this declaration
     */
    public List<MethodDeclaration> getMethods() {
        return methods;
    }

    /**
     * Adds a method declaration to this body
     * @param decl the declaration to add
     */
    public void addMethod(MethodDeclaration decl) {
        methods.add(decl);
    }

    /**
     * Gets the number of methods declared in this body
     * @return the number of methods declared in this body
     */
    public int numMethods() {
        return methods.size();
    }

    /**
     * Adds a variable declaration to this body
     * @param decl the declaration to add
     */
    public void addField(VariableDeclaration decl) {
        fields.add(decl);
    }

    /**
     * Gets the number of fields declared in this body
     * @return the number of fields declared in this body
     */
    public int numFields() {
        return fields.size();
    }

    /**
     * Adds a inner body declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerBody(BodyDeclaration decl) {
        decl.setKind(Kind.INNER);
        innerBodies.add(decl);
    }

    /**
     * Gets the number of inner bodies declared in this body
     * @return the number of inner bodies declared in this body
     */
    public int numInnerBodies() {
        return innerBodies.size();
    }

    @Override
    public MyClassSymbol getSymbol() {
        return (MyClassSymbol)super.getSymbol();
    }

    /**
     * Double dispatch this super class and this class on parameter
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
         for (VariableDeclaration v : fields)
         {
             v.acceptRec(visitor, order);
         }
         for (BodyDeclaration b : innerBodies)
         {
             b.acceptRec(visitor, order);
         }
         for (MethodDeclaration m : methods)
         {
             m.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
