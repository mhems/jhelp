package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java8 method reference
 */
public class MethodReferenceExpression extends Expression {
    private Expression lhs;
    private Expression rhs;

    /**
     * Construct a incomplete reference by method name
     * @param identifier the name of the method being referenced
     * @param typeArgs the type arguments to this reference
     */
    // public MethodReferenceExpression(Token identifier,
    //                                  List<TypeArgument> typeArgs) {
    //     this(new NilExpression(),
    //          new IdentifierExpression(identifier),
    //          typeArgs);
    // }

    /**
     * Construct a new parameterized reference
     * @param lhs the left hand side of the method reference
     * @param rhs the right hand side of the method reference
     */
    public MethodReferenceExpression(Expression lhs, Expression rhs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.rhs = rhs;
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
