package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a Java variable declaration
 */
public class VariableDeclaration extends Declaration {
    private Expression expr;
    private Token name;
    private Expression initializer;
    private boolean receiver = false;
    private Token ellipsis;
    private Annotation[] ellipsisAnnotations = {};

    /**
     * Construct a new variable declaration
     * @param name the Token holding the name of the variable being declared
     */
    public VariableDeclaration(Token name) {
        this(name, new ArrayList<Modifier>(), new ArrayList<Annotation>());
    }

    /**
     * Construct a new named, untyped, modified variable declaration
     * @param name the Token holding the name of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     */
    public VariableDeclaration(Token name,
                               List<Modifier> modifiers,
                               List<Annotation> annotations) {
        this(name, new NilExpression(), modifiers, annotations);
    }

    /**
     * Construct a new typed variable declaration
     * @param name the Token holding the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     */
    public VariableDeclaration(Token name,
                               Expression expr,
                               List<Modifier> modifiers,
                               List<Annotation> annotations) {
        this(name, expr, modifiers, annotations, new NilExpression());
    }

    /**
     * Construct a new typed variable declaration
     * @param name the Token holding the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     * @param isEllipsis true iff this is a variadic parameter variable
     */
    public VariableDeclaration(Token name,
                               Expression expr,
                               List<Modifier> modifiers,
                               List<Annotation> annotations,
                               Token ellipsis,
                               List<Annotation> ellipsisAnnotations) {
        this(name, expr, modifiers, annotations, new NilExpression());
        this.ellipsis = ellipsis;
        this.ellipsisAnnotations = ellipsisAnnotations.toArray(this.ellipsisAnnotations);
    }

    /**
     * Construct a new typed variable declaration with initial value
     * @param name the Token holding the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     * @param initializer the expression yielding the variable's inital value
     * @param isEllipsis true iff this variable is variadic
     */
    public VariableDeclaration(Token name,
                               Expression expr,
                               List<Modifier> modifiers,
                               List<Annotation> annotations,
                               Expression initializer) {
        super(name, expr.getFirstToken(), modifiers, annotations);
        this.name = name;
        this.expr = expr;
        this.initializer = initializer;
    }

    /**
     * Gets the type of this variable, if any
     * @return the type of this variable, if any
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Determines if this variable is explicitly typed
     * @return true iff this variable is explicitly typed
     */
    // public boolean isTyped() {
    //     return !type.isNil();
    // }

    /**
     * Gets the initial value of the variable, if any
     * @return the initial value of the variable, if any
     */
    public Expression getInitializer() {
        return initializer;
    }

    /**
     * Sets the initial value of the variable, if any
     * @param initializer the expression yielding the inital value
     */
    public void setInitializer(Expression initializer) {
        this.initializer = initializer;
    }

    /**
     * Determines if this variable has an initial value
     * @return true iff this variable has an initial value
     */
    public boolean isInitialized() {
        return !initializer.isNil();
    }

    /**
     * Establishes whether this variable is a receiver parameter
     * @param b true iff this variable should be a receiver parameter
     *          false otherwise
     */
    public void setReceiverParameter(boolean b) {
        this.receiver = b;
    }

    /**
     * Determines if this variable is a receiver parameter
     * @return true iff this variable is a receiver parameter
     */
    public boolean isReceiverParameter() {
        return receiver;
    }

    public boolean isVariadic() {
        return ellipsis != null;
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
