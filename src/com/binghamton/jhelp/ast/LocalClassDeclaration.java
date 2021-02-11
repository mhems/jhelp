package com.binghamton.jhelp.ast;

/**
 * A class representing the declaration of a local class
 */
public class LocalClassDeclaration extends Statement {

    private final ConcreteBodyDeclaration cls;

    /**
     * Constructs a LocalClassDeclaration
     * @param cls the class declaration this declaration declares
     */
    public LocalClassDeclaration(ConcreteBodyDeclaration cls) {
        this.cls = cls;
        cls.setKind(BodyDeclaration.Kind.LOCAL);
    }

    /**
     * Gets the Declaration this Declaration declares
     * @return the Declaration this Declaration declares
     */
    public ConcreteBodyDeclaration getDeclaration() {
        return cls;
    }

    /**
     * Double dispatch this super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
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
             this.accept(visitor);
         }
         cls.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
