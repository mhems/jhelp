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
}
