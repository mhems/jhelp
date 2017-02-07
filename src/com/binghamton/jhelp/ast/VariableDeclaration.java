package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java variable declaration
 */
public class VariableDeclaration extends Expression {
    private List<Modifier> modifiers;
    private Type type;
    private String name;
    private Expression initializer;
    private boolean isEllipsis;

    /**
     * Construct a new variable declaration
     * @param name the name of the variable being declared
     */
    public VariableDeclaration(String name) {
        this.name = name;
        this.modifiers = new ArrayList<Modifier>();
    }

    /**
     * Construct a new typed variable declaration
     * @param name the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     * @param isEllipsis true iff this is a variadic parameter variable
     */
    public VariableDeclaration(String name,
                               Type type,
                               List<Modifier> modifiers,
                               boolean isEllipsis) {
        this.name = name;
        this.type = type;
        this.modifiers = modifiers;
        this.isEllipsis = isEllipsis;
    }

    /**
     * Construct a new typed variable declaration
     * @param name the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     */
    public VariableDeclaration(String name,
                               Type type,
                               List<Modifier> modifiers) {
        this(name, type, modifiers, null);
    }

    /**
     * Construct a new typed variable declaration with initial value
     * @param name the name of the variable being declared
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     * @param initializer the expression yielding the variable's inital value
     */
    public VariableDeclaration(String name,
                               Type type,
                               List<Modifier> modifiers,
                               Expression initializer) {
        if (name.startsWith(".")) {
            this.name = name.substring(1);
        } else {
            this.name = name;
        }
        this.type = type;
        this.modifiers = modifiers;
        this.initializer = initializer;
    }

    /**
     * Get the modifiers of this declaration, if any
     * @return the modifiers of this declaration, if any
     */
    public List<Modifier> getModifiers() {
        return modifiers;
    }

    /**
     * Gets the type of this variable, if any
     * @return the type of this variable, if any
     */
    public Type getType() {
        return type;
    }

    /**
     * Determines if this variable is explicitly typed
     * @return true iff this variable is explicitly typed
     */
    public boolean isTyped() {
        return type != null;
    }

    /**
     * Gets the name of this variable
     * @return the name of this variable
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the initial value of the variable, if any
     * @return the initial value of the variable, if any
     */
    public Expression getInitializer() {
        return initializer;
    }

    /**
     * Determines if this variable has an initial value
     * @return true iff this variable has an initial value
     */
    public boolean isInitialized() {
        return initializer != null;
    }

    /**
     * Determines if this variable is a variadic parameter
     * @return true iff this variable is a variadic parameter
     */
    public boolean isVariadic() {
        return isEllipsis;
    }
}
