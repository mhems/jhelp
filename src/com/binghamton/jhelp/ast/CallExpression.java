package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java method call
 */
public class CallExpression extends Expression {
    private Expression methodExpr;
    private List<Expression> args;

    /**
     * Construct a new call expression
     * @param identifier the name of the method being called
     * @param args the list of arguments to the method call
     */
    public CallExpression(String identifier, List<Expression> args) {
        this(new IdentifierExpression(identifier), args);
    }

    /**
     * Construct a new call expression
     * @param methodExpr the expression yielding the method being called
     * @param args the list of arguments to the method call
     */
    public CallExpression(Expression methodExpr, List<Expression> args) {
        this.methodExpr = methodExpr;
        this.args = args;
    }

    /**
     * Gets the expression that yields the method being called
     * @return the expression that yields the method being called
     */
    public Expression getMethod() {
        return methodExpr;
    }

    /**
     * Gets the arguments of this method call
     * @return the arguments of this method call
     */
    public List<Expression> getArguments() {
        return args;
    }

    /**
     * Gets a particular argument of this method call
     * @param index the 0-indexed index of the argument to get
     * @return the argument at index `index` in this method call
     */
    public Expression getArgument(int index) {
        return args.get(index);
    }

    /**
     * Gets the number of arguments to this method call
     * @return the number of arguments to this method call
     */
    public int getNumArguments() {
        return args.size();
    }
}
