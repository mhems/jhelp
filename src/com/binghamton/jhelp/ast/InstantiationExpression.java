package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing an instantion (constructor call) with possible anonymous
 * inner class.
 * e.g. {@code new Foo() { ... }}
 */
public class InstantiationExpression extends CallExpression {
    private final ClassDeclaration classBody = new ClassDeclaration();

    /**
     * Construct an instantiation expression
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param classExpr the Expression yielding the class being instantiated
     * @param name the Token holding the name of the class being instantiated
     * @param arguments the arguments to the constructor call
     * @param typeArgs the type arguments to the constructor call
     */
    public InstantiationExpression(Token first,
                                   Token last,
                                   Expression classExpr,
                                   Token name,
                                   List<Expression> arguments,
                                   List<TypeArgument> typeArgs) {
        super(first, last, classExpr, name, arguments, typeArgs);
    }

    /**
     * Determines if this instantiation has an anonymous class
     * @return true iff this instantiation has an anonymous class
     */
    public boolean hasAnonymousClass() {
        return !classBody.isEmpty();
    }

    /**
     * Gets this instantiation's anonymous class, if any
     * @return this instantiation's anonymous class, if any
     */
    public ClassDeclaration getAnonymousClass() {
        return classBody;
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
         getMethod().acceptRec(visitor, order);
         getNameExpression().acceptRec(visitor, order);
         for (TypeArgument ta : getTypeArguments())
         {
             ta.acceptRec(visitor, order);
         }
         for (Expression e : getArguments())
         {
             e.acceptRec(visitor, order);
         }
         classBody.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
