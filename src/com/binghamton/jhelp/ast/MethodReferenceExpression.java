package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.TypeArgument;

/**
 * A class representing a Java8 method reference
 */
public class MethodReferenceExpression extends Expression {
    private Expression lhs;
    private Expression rhs;
    private List<TypeArgument> typeArgs;

    /**
     * Construct a incomplete reference by method name
     * @param identifier the name of the method being referenced
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(String identifier,
                                     List<TypeArgument> typeArgs) {
        this(null ,new IdentifierExpression(identifier), typeArgs);
    }

    /**
     * Construct a new reference by name
     * @param identifier the name of the owning symbol
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(String identifier, String methodName) {
        this(new IdentifierExpression(identifier),
             new IdentifierExpression(methodName),
             null);
    }

    /**
     * Construct a new parameterized reference by possessed name
     * @param identifier the name of the owning symbol
     * @param methodName the name of method being referenced
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(String identifier,
                                     String methodName,
                                     List<TypeArgument> typeArgs) {
        this(new IdentifierExpression(identifier),
             new IdentifierExpression(methodName),
             typeArgs);
    }

    /**
     * Construct a new reference
     * @param lhs the left hand side of the method reference
     * @param rhs the right hand side of the method reference
     */
    public MethodReferenceExpression(Expression lhs, Expression rhs) {
        this(lhs, rhs, null);
    }

    /**
     * Construct a new parameterized reference by method name
     * @param lhs the left hand side of the method reference
     * @param methodName the name of method being referenced
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(Expression lhs,
                                     String methodName,
                                     List<TypeArgument> typeArgs) {
        this(lhs, new IdentifierExpression(methodName), typeArgs);
    }

    /**
     * Construct a new reference by method name
     * @param lhs the left hand side of the method reference
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(Expression lhs,
                                     String methodName) {
        this(lhs, new IdentifierExpression(methodName), null);
    }

    /**
     * Construct a new parameterized reference
     * @param lhs the left hand side of the method reference
     * @param rhs the right hand side of the method reference
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(Expression lhs,
                                     Expression rhs,
                                     List<TypeArgument> typeArgs) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.typeArgs = typeArgs;
    }

    /**
     * Gets the expression resolving the method referee's owner
     * @return the expression resolving the method referee's owner
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Sets the expression resolving the method referee's owner
     * @param expr the expression resolving the method referee's owner
     */
    public void setLHS(Expression expr) {
        this.lhs = expr;
    }

    /**
     * Gets the expression resolving the method name
     * @return the expression resolving the method name
     */
    public Expression getRHS() {
        return rhs;
    }

    /**
     * Determines if this reference has any type arguments
     * @return true iff this reference has any type arguments
     */
    public boolean hasTypeArguments() {
        return typeArgs != null && typeArgs.size() > 0;
    }

    /**
     * Gets the type arguments of this reference, if any
     * @return the type arguments of this reference, if any
     */
    public List<TypeArgument> getTypeArguments() {
        return typeArgs;
    }

    /**
     * Sets the type arguments of this reference
     * @param typeArgs the type arguments of this reference
     */
    public void setTypeArguments(List<TypeArgument> typeArgs) {
        this.typeArgs = typeArgs;
    }

    /**
     * Gets the number of type arguments of this reference
     * @return the number of type arguments of this reference
     */
    public int numTypeArguments() {
        if (hasTypeArguments()) {
            return typeArgs.size();
        }
        return 0;
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
