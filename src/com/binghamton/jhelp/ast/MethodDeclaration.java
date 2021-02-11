package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.symbols.MyMethodSymbol;

/**
 * A class representing the declaration of a Java method
 */
public class MethodDeclaration extends Declaration {
    private Expression returnType;
    private List<VariableDeclaration> params = new ArrayList<>();
    private List<Expression> exceptions = new ArrayList<>();
    private List<TypeParameter> typeParams = new ArrayList<>();
    private Block body = new NilBlock();
    private Annotation[] returnTypeAnnotations = {};
    private boolean constructor = false;

    /**
     * Construct a method declaration
     * @param modifiers the modifiers of this method
     * @param annotations the annotations of this method
     */
    public MethodDeclaration(List<Modifier> modifiers,
                             List<Annotation> annotations) {
        super(modifiers, annotations);
    }

    /**
     * Sets this method's return type
     * @param returnTypeExpr this method's return type
     */
    public void setReturnType(Expression returnTypeExpr) {
        this.returnType = returnTypeExpr;
    }

    /**
     * Gets this method's return type
     * @return this method's return type
     */
    public Expression getReturnTypeExpression() {
        return returnType;
    }

    /**
     * Determines if this method has a return type
     * @return true if this method has a return type (i.e. is not a constructor)
     */
    public boolean hasReturnType() {
        return returnType != null;
    }

    /**
     * Sets this method's parameters
     * @param parameters this method's parameters
     */
    public void setParameters(List<VariableDeclaration> parameters) {
        this.params = parameters;
    }

    /**
     * Gets this method's parameters
     * @return this method's parameters
     */
    public List<VariableDeclaration> getParameters() {
        return params;
    }

    /**
     * Sets the exceptions this method throws
     * @param exceptions the exceptions this method throws
     */
    public void setExceptions(List<Expression> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * Gets the exceptions this method throws
     * @return the exceptions this method throws
     */
    public List<Expression> getExceptions() {
        return exceptions;
    }

    /**
     * Gets the type parameters of this method
     * @return the type parameters of this method
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Sets the type parameters of this method
     * @param typeParams the new type parameters of this method
     */
    public void setTypeParameters(List<TypeParameter> typeParams) {
        this.typeParams = typeParams;
    }

    /**
     * Gets the annotations on the return type
     * @return the annotations on the return type
     */
    public Annotation[] getReturnTypeAnnotations() {
        return returnTypeAnnotations;
    }

    /**
     * Sets the annotations on the return type
     * @param annotations the annotations on the return type
     */
    public void setReturnTypeAnnotations(List<Annotation> annotations) {
        returnTypeAnnotations = annotations.toArray(returnTypeAnnotations);
    }

    /**
     * Determines if this method has type parameters
     * @return true iff this method has type parameters
     */
    public boolean hasTypeParameters() {
        return !typeParams.isEmpty();
    }

    /**
     * Sets this method's body
     * @param body this method's body
     */
    public void setBody(Block body) {
        this.body = body;
    }

    /**
     * Gets this method's body
     * @return this method's body
     */
    public Block getBody() {
        return body;
    }

    /**
     * Gets the MethodSymbol associated with this declaration
     * @return the MethodSymbol associated with this declaration
     */
    public MyMethodSymbol getSymbol() {
        return (MyMethodSymbol)sym;
    }

    /**
     * Determines if this method is a constructor
     * @return true iff this method is a constructor
     */
    public boolean isConstructor() {
        return constructor;
    }

    /**
     * Establishes whether this class is a constructor
     * @param constructor true iff this class is a constructor
     */
    public void setConstructor(boolean constructor) {
        this.constructor = constructor;
    }

    /**
     * Determines if this method is variadic
     * @return true iff this method is variadic
     */
    public boolean isVariadic() {
        return !params.isEmpty() && params.get(params.size() - 1).isVariadic();
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
             this.accept(visitor);
         }
         for (Annotation a : annotations)
         {
             a.acceptRec(visitor, order);
         }
         returnType.acceptRec(visitor, order);
         for (TypeParameter tp : typeParams)
         {
             tp.acceptRec(visitor, order);
         }
         for (VariableDeclaration vd : params)
         {
             vd.acceptRec(visitor, order);
         }
         for (Expression e : exceptions)
         {
             e.acceptRec(visitor, order);
         }
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
