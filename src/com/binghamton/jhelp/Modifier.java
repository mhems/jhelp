package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.Expression;

/**
 * Class representing Java modifiers and annotations
 */
public class Modifier extends Expression {
    public static final Modifier ABSTRACT  = new Modifier("abstract");
    public static final Modifier DEFAULT   = new Modifier("default");
    public static final Modifier FINAL     = new Modifier("final");
    public static final Modifier NATIVE    = new Modifier("native");
    public static final Modifier PRIVATE   = new Modifier("private");
    public static final Modifier PROTECTED = new Modifier("protected");
    public static final Modifier PUBLIC    = new Modifier("public");
    public static final Modifier STATIC    = new Modifier("static");
    public static final Modifier STRICT_FP = new Modifier("strictfp");
    public static final Modifier TRANSIENT = new Modifier("transient");
    public static final Modifier VOLATILE  = new Modifier("volatile");

    protected String name;

    public Modifier(String name) {
        super();
        this.name = name;
    }

    /**
     * Construct a named modifier
     * @param name the sole Token of this modifier
     */
    public Modifier(Token name) {
        super(name);
        this.name = name.getText();
    }

    /**
     * Construct a multi-token annotation modifier
     * @param expr the expression yielding the name of this modifier
     */
    // protected Modifier(Expression expr) {
    //     super(expr.getFirstToken(), expr.getLastToken());
    //     this.name = expr.getText();
    // }

    /**
     * Gets this modifier's name
     * @return this modifier's name
     */
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Modifier) {
            return name.equals(((Modifier)other).name);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return name.hashCode();
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
