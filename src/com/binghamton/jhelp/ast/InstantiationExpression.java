package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.TypeArgument;

/**
 * A class representing an instantion (constructor call) with possible anonymous
 * inner class.
 */
public class InstantiationExpression extends CallExpression {
    private List<TypeArgument> initialTypeArgs;
    private ConcreteBodyDeclaration classBody;

    /**
     * Construct an instantiation expression
     * @param initialTypeArguments the initial type arguments
     * @param annotations the annotations of this instantiation
     * @param name the name of the constructor being called
     * @param finalTypeArguments the final type arguments
     * @param arguments the arguments to the constructor call
     */
    public InstantiationExpression(List<TypeArgument> initialTypeArguments,
                                   List<Annotation> annotations,
                                   String name,
                                   List<TypeArgument> finalTypeArguments,
                                   List<Expression> arguments) {
        this(initialTypeArguments,
             new IdentifierExpression(name, annotations),
             finalTypeArguments,
             arguments);
    }

    /**
     * Construct an instantiation expression
     * @param initialTypeArguments the initial type arguments
     * @param methodExpr the underlying expression evaluating to the constructor
     * @param finalTypeArguments the final type arguments
     * @param arguments the arguments to the constructor call
     */
    public InstantiationExpression(List<TypeArgument> initialTypeArguments,
                                   Expression methodExpr,
                                   List<TypeArgument> finalTypeArguments,
                                   List<Expression> arguments) {
        super(methodExpr, arguments, finalTypeArguments);
        this.initialTypeArgs = initialTypeArguments;
        this.classBody = new ClassDeclaration();
    }

    /**
     * Determines if this instantiation has any initial type arguments
     * @return true iff this instantiation has any initial type arguments
     */
    public boolean hasInitialTypeArguments() {
        return initialTypeArgs != null && initialTypeArgs.size() > 0;
    }

    /**
     * Gets the initial type arguments of this instantiation, if any
     * @return the initial type arguments of this instantiation, if any
     */
    public List<TypeArgument> getInitialTypeArguments() {
        return initialTypeArgs;
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
