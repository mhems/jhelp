package com.binghamton.jhelp.ast;

public class LocalClassDeclaration extends Statement {

    private final ConcreteBodyDeclaration cls;

    public LocalClassDeclaration(ConcreteBodyDeclaration cls) {
        this.cls = cls;
        cls.setKind(BodyDeclaration.Kind.LOCAL);
    }

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
