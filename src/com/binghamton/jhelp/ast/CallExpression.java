package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java method call, including explicit constructor calls
 */
public class CallExpression extends Expression {
    private Expression methodExpr;
    private List<Expression> args;
    private List<TypeArgument> typeArgs = new ArrayList<>();

    /**
     * Construct a new call expression
     * @param last the last token of this ASTNode
     * @param id the token of the method being called
     * @param args the list of arguments to the method call
     */
    public CallExpression(Token last,
                          Token id,
                          List<Expression> args) {
        this(last, new IdentifierExpression(id), args);
    }

    /**
     * Construct a new call expression
     * @param last the last token of this ASTNode
     * @param methodExpr the expression yielding the method being called
     * @param args the list of arguments to the method call
     */
    public CallExpression(Token last,
                          Expression methodExpr,
                          List<Expression> args) {
        super(methodExpr.getFirstToken(), last);
        this.methodExpr = methodExpr;
        this.args = args;
    }

    /**
     * Construct a new call expression
     * @param last the last token of this ASTNode
     * @param id the token of the methd being called
     * @param args the list of arguments to the method call
     * @param typeArgs the list of type arguments to the method call
     */
    public CallExpression(Token last,
                          Token id,
                          List<Expression> args,
                          List<TypeArgument> typeArgs) {
        this(ASTNode.getFirstToken(id, typeArgs),
             last,
             new IdentifierExpression(id),
             args,
             typeArgs);
    }

    /**
     * Construct a new call expression
     * @param last the last token of this ASTNode
     * @param methodExpr the expression yielding the method being called
     * @param args the list of arguments to the method call
     * @param typeArgs the list of type arguments to the method call
     */
    public CallExpression(Token last,
                          Expression methodExpr,
                          List<Expression> args,
                          List<TypeArgument> typeArgs) {
        super(methodExpr.getFirstToken(), last);
        this.methodExpr = methodExpr;
        this.args = args;
        this.typeArgs = typeArgs;
    }

    /**
     * Construct a new call expression
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param methodExpr the expression yielding the method being called
     * @param args the list of arguments to the method call
     * @param typeArgs the list of type arguments to the method call
     */
    public CallExpression(Token first,
                          Token last,
                          Expression methodExpr,
                          List<Expression> args,
                          List<TypeArgument> typeArgs) {
        super(ASTNode.getFirstToken(first, typeArgs), last);
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
        return typeArgs.size() > 0;
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
