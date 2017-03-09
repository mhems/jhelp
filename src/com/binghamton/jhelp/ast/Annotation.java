package com.binghamton.jhelp.ast;

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.Token;

/**
 * A class representing the use of Java annotation
 */
public class Annotation extends Expression {
// must extend Expression for element-value pairs
    private Map<Token, Expression> nameValueMap = new HashMap<>();
    private Expression expr;

    /**
     * Construct an annotation
     * @param at the '@' Token
     * @param expr the type Token of the annotation
     */
    public Annotation(Token at, Expression expr) {
        super(at, expr.getLastToken());
        this.expr = expr;
    }

    /**
     * Construct a single element annotation
     * @param at the '@' Token
     * @param last the terminating ')' Token
     * @param expr the type name of the annotation
     * @param value the single element's value
     */
    public Annotation(Token at, Token last, Expression expr, Expression value) {
        super(at, last);
        this.expr = expr;
        nameValueMap.put(null, value);
    }

    /**
     * Determines if this annotation is a marker annotation
     * @return true iff this annotation is a marker annotation
     */
    public boolean isMarker() {
        return nameValueMap.size() == 0;
    }

    /**
     * Determines if this annotation is a single element annotation
     * @return true iff this annotation is a single element annotation
     */
    public boolean isSingleElement() {
        return nameValueMap.size() == 1 && nameValueMap.containsKey(null);
    }

    /**
     * Gets the expression this annotation's type name
     * @return the expression this annotation's type name
     */
    public Expression getTypeExpression() {
        return expr;
    }

    /**
     * Determines if this is normal annotation
     * @return true iff this is normal annotation
     */
    public boolean isNormal() {
        return !isMarker() && !isSingleElement();
    }

    /**
     * Gets the single value of this annotation
     * @return the single value of this annotation
     */
    public Expression getSingleValue() {
        if (isSingleElement()) {
            return nameValueMap.get(null);
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Gets the mapping from argument name to value
     * @return the mapping from argument name to value
     */
    public Map<Token, Expression> getArguments() {
        if (isNormal()) {
            return nameValueMap;
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Adds an named argument and value to the annotation
     * @param name the name of the argument
     * @param value the expression giving the argument value
     */
    public void addArgument(Token name, Expression value) {
        nameValueMap.put(name, value);
    }

    /**
     * Gets the value of the particular argument name
     * @param name the name of the argument
     * @return the value of the argument with name `name`
     */
    public Expression getValue(Token name) {
        if (isNormal()) {
            return nameValueMap.get(name);
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Annotation) {
            Annotation an = (Annotation)other;
            return super.equals(an) &&
                nameValueMap.equals(an.nameValueMap);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ nameValueMap.hashCode();
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
