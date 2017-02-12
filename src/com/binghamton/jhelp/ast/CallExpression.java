package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.TypeArgument;

/**
 * A class representing a Java method call, including explicit constructor calls
 */
public class CallExpression extends Expression {
    private Expression methodExpr;
    private List<Expression> args;
    private List<TypeArgument> typeArgs;

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
     * Construct a new call expression
     * @param identifier the name of the method being called
     * @param args the list of arguments to the method call
     * @param typeArgs the list of type arguments to the method call
     */
    public CallExpression(String identifier,
                          List<Expression> args,
                          List<TypeArgument> typeArgs) {
        this(new IdentifierExpression(identifier), args, typeArgs);
    }

    /**
     * Construct a new call expression
     * @param methodExpr the expression yielding the method being called
     * @param args the list of arguments to the method call
     * @param typeArgs the list of type arguments to the method call
     */
    public CallExpression(Expression methodExpr,
                          List<Expression> args,
                          List<TypeArgument> typeArgs) {
        this.methodExpr = methodExpr;
        this.args = args;
        this.typeArgs = typeArgs;
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

    /**
     * Determines if this call has any type arguments
     * @return true iff this call has any type arguments
     */
    public boolean hasTypeArguments() {
        return typeArgs != null && typeArgs.size() > 0;
    }

    /**
     * Gets the type arguments to this call, if any
     * @return the type arguments to this call, if any
     */
    public List<TypeArgument> getTypeArguments() {
        return typeArgs;
    }

    /**
     * Gets the number of type arguments to this call, if any
     * @return the number of type arguments to this call, if any
     */
    public int numTypeArguments() {
        if (hasTypeArguments()) {
            return typeArgs.size();
        }
        return 0;
    }
}
