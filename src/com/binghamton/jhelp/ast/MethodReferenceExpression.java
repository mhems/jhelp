package com.binghamton.jhelp.ast;

/**
 * A class representing a Java8 method reference
 */
public class MethodReferenceExpression extends Expression {
    private Expression lhs;
    private String methodName;

    /**
     * Construct a new reference by name
     * @param identifier the name of the method being referenced
     */
    public MethodReferenceExpression(String identifier) {
        this(new IdentifierExpression(identifier), null);
    }

    /**
     * Construct a new reference by possessed name
     * @param identifier ?
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(String identifier, String methodName) {
        this(new IdentifierExpression(identifier), methodName);
    }

    /**
     * Construct a new reference by possessed name
     * @param lhs the left hand side of the method reference
     * @param methodName the name of method being referenced
     */
    public MethodReferenceExpression(Expression lhs, String methodName) {
        this.lhs = lhs;
        this.methodName = methodName;
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
}
