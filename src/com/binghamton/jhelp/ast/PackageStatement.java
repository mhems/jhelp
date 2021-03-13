package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java package statement
 * e.g. package foo;
 */
public class PackageStatement extends Statement {
    private Annotation[] annotations = {};
    private final NameExpression name;

    /**
     * Construct a new package statement
     * @param name the name of this package
     * @param keyword the package keyword
     * @param last the terminating semi-colon Token
     * @param annotations list of package annotations, if any
     */
    public PackageStatement(NameExpression name,
                            Token keyword,
                            Token last,
                            List<Annotation> annotations) {
        super(ASTNode.getFirstToken(keyword, annotations), last);
        this.name = name;
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the annotations, if any, of this package declaration
     * @return the annotations, if any, of this package declaration
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Gets the period-separated name of the declared package
     * @return the period-separated name of the declared package
     */
    public NameExpression getName() {
        return name;
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
         for (Annotation a : annotations)
         {
             a.acceptRec(visitor, order);
         }
         name.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
