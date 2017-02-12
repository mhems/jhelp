package com.binghamton.jhelp.ast;

/**
 * A class representing a Java8 method reference
 */
public class MethodReferenceExpression extends Expression {
    private Expression lhs;
    private String methodName;
    private List<TypeArgument> typeArgs;

    /**
     * Construct a new reference by name
     * @param identifier the name of the method being referenced
     */
    public MethodReferenceExpression(String identifier) {
        this(new IdentifierExpression(identifier), null, null);
    }

    /**
     * Construct a new reference by possessed name
     * @param identifier the name of the owning symbol
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(String identifier, String methodName) {
        this(new IdentifierExpression(identifier), methodName, null);
    }

    /**
     * Construct a new reference by possessed name
     * @param identifier the name of the owning symbol
     * @param methodName the name of method being referenced
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(String identifier,
                                     String methodName,
                                     List<TypeArgument> typeArgs) {
        this(new IdentifierExpression(identifier), methodName, typeArgs);
    }


    /**
     * Construct a new reference by possessed name
     * @param lhs the left hand side of the method reference
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(Expression lhs, String methodName) {
        this(lhs, methodName, null);
    }

    /**
     * Construct a new reference by possessed name
     * @param lhs the left hand side of the method reference
     * @param methodName the name of method being referenced
     * @param typeArgs the type arguments to this reference
     */
    public MethodReferenceExpression(Expression lhs,
                                     String methodName,
                                     List<TypeArgument> typeArgs) {
        this.lhs = lhs;
        this.methodName = methodName;
        this.typeArgs = typeArgs;
    }

    /**
     * Gets the expression resolving the method referee's owner
     * @return the expression resolving the method referee's owner
     */
    public Expression getLHSExpression() {
        return lhs;
    }

    /**
     * Gets the name of the method being referred to
     * @return the name of the method being referred to
     */
    public String getMethodName() {
        return methodName;
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
     * Gets the number of type arguments of this reference
     * @return the number of type arguments of this reference
     */
    public int numTypeArguments() {
        if (hasTypeArguments()) {
            return typeArgs.size();
        }
        return 0;
    }
}
