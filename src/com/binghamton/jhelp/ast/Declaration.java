package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.Symbol;

/**
 * Abstract base class for all Java declarations
 */
public abstract class Declaration extends Statement {
    protected Symbol sym;
    protected Token name;
    protected Modifiers modifiers = new Modifiers();
    protected Annotation[] annotations = {};

    /**
     * Construct an empty declaration
     */
    public Declaration() {
        super();
    }

    /**
     * Construct an unnamed modified declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     */
    public Declaration(List<Modifier> modifiers, List<Annotation> annotations) {
        this.modifiers = new Modifiers(modifiers);
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Construct an empty declaration
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public Declaration(Token first, Token last) {
        super(first, last);
    }

    /**
     * Construct an named modified declaration
     * @param name the name Token of this declaration
     * @param keyword the keyword of this declaration
     * @param modifiers the modifiers of this declaration
     * @param annotations the annotations of this declaration
     */
    public Declaration(Token name,
                       Token keyword,
                       List<Modifier> modifiers,
                       List<Annotation> annotations) {
        super(ASTNode.getFirstToken(keyword, modifiers));
        this.name = name;
        this.modifiers = new Modifiers(modifiers);
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the Symbol this Declaration declares
     * @return the Symbol this Declaration declares
     */
    public abstract Symbol getSymbol();

    /**
     * Sets the Symbol this Declaration declares
     * @param sym the Symbol this Declaration declares
     */
    public void setSymbol(Symbol sym) {
        this.sym = sym;
    }

    /**
     * Gets the name of this declaration
     * @return the name of this declaration
     */
    public Token getName() {
        return name;
    }

    /**
     * Sets the name of this declaration
     * @param name the new name of this declaration
     */
    public void setName(Token name) {
        this.name = name;
    }

    /**
     * Gets the modifiers of this declaration
     * @return the modifiers of this declaration
     */
    public Modifiers getModifiers() {
        return modifiers;
    }

    /**
     * Gets the Annotations of this Declaration
     * @return the Annotations of this Declaration
     */
    public Annotation[] getAnnotations() {
        return annotations;
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
