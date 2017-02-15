package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Type;

/**
 * A class representing a Java type expression
 */
public class TypeExpression extends Expression {
    private Type type;

    /**
     * Construct a new type expression of given type
     * @param type the type that comprises this expression
     */
    public TypeExpression(Type type) {
        this.type = type;
    }

    /**
     * Gets the type that comprises this expression
     * @return the type that comprises this expression
     */
    public Type getType() {
        return type;
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
