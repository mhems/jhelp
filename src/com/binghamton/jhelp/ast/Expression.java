package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.Symbol;

/**
 * Base class representing a Java syntactic expression
 */
public abstract class Expression extends Statement {

    protected Type type;
    protected Type inferredType;
    protected Symbol sym;

    /**
     * Construct an empty Expression
     */
    public Expression() {
        super();
    }

    /**
     * Construct a new Expression with a single underlying Token
     * @param token the sole Token of this ASTNode
     */
    public Expression(Token token) {
        super(token);
    }

    /**
     * Construct a new Expression spanning multiple ANTLR tokens
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public Expression(Token first, Token last) {
        super(first, last);
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getInferredType() {
        return inferredType;
    }

    public void setInferredType(Type type) {
        this.inferredType = type;
    }

    public Symbol getSymbol() {
        return sym;
    }

    public void setSymbol(Symbol sym) {
        this.sym = sym;
    }
}
