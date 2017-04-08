package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing an instantion (constructor call) with possible anonymous
 * inner class.
 */
public class InstantiationExpression extends CallExpression {
    private final ConcreteBodyDeclaration classBody = new ClassDeclaration();

    /**
     * Construct an instantiation expression
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param classExpr the Expression yielding the class being instantiated
     * @param arguments the arguments to the constructor call
     * @param typeArgs the type arguments to the constructor call
     */
    public InstantiationExpression(Token first,
                                   Token last,
                                   Expression classExpr,
                                   List<Expression> arguments,
                                   List<TypeArgument> typeArgs) {
        super(first, last, classExpr, arguments, typeArgs);
    }

    /**
     * Determines if this instantiation has an anonymous class
     * @return true iff this instantiation has an anonymous class
     */
    public boolean hasAnonymousClass() {
        return classBody != null;
    }

    /**
     * Gets this instantiation's anonymous class, if any
     * @return this instantiation's anonymous class, if any
     */
    public ConcreteBodyDeclaration getAnonymousClass() {
        return classBody;
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
