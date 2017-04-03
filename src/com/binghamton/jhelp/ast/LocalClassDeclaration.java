package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.MyClassSymbol;

public class LocalClassDeclaration extends Statement {

    private ConcreteBodyDeclaration cls;

    public LocalClassDeclaration(ConcreteBodyDeclaration cls) {
        this.cls = cls;
        cls.setKind(BodyDeclaration.Kind.LOCAL);
    }

    public ConcreteBodyDeclaration getDeclaration() {
        return cls;
    }

    public MyClassSymbol getSymbol() {
        return cls.getSymbol();
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
