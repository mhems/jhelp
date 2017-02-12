package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * A class representing a Java variable declaration
 */
public class VariableDeclaration extends Declaration {
    private Type type;
    private Map<String, Expression> pairs = new HashMap<>();
    private boolean isEllipsis;

    /**
     * Construct a new variable declaration
     * @param name the name of the variable being declared
     */
    public VariableDeclaration(String name) {
        this(name, null, new ArrayList<Modifier>(), null, false);
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
        this(name, type, modifiers, null. isEllipsis);
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
        this(name, type, modifiers, null, false);
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
                               Expression initializer,
                               boolean isEllipsis) {
        // name could also have trailing [N] where N is trailing dimension quantity
        super(name, modifiers);
        pairs.put(name, initializer);
        this.type = type;
        this.isEllipsis = isEllipsis;
    }

    /**
     * Construct a new typed variable declaration of multiple name-initializer
     * pairs
     * @param pairs a list of name-initializer pairs
     * @param type the type of the variable being declared
     * @param modifiers any modifiers on the variable being declared
     */
    public VariableDeclaration(List<Pair<String, Expression>> pairs,
                               Type type,
                               List<Modifier> modifiers) {
        super(null, modifiers);
        for (Pair pair : pairs) {
            this.pairs.put(pair.first, pair.second);
        }
        this.type = type;
        this.isEllipsis = false;
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
     * Gets the names of this variable declaration
     * @return the names of this variable declaration
     */
    public List<String> getNames() {
        return pairs.keys();
    }

    /**
     * Determines if this declaration declares a certain variable
     * @param name the name of the variable to inquire about
     * @return true iff this declaration declares a variable with name `name`
     */
    public boolean hasName(String name) {
        return pairs.containsKey(name);
    }

    /**
     * Gets the initial value of the variable, if any
     * @name the name of the variable
     * @return the initial value of the variable, if any
     */
    public Expression getInitializer(String name) {
        return pairs.get(name);
    }

    /**
     * Determines if this variable has an initial value
     * @name the name of the variable
     * @return true iff this variable has an initial value
     */
    public boolean isInitialized(String name) {
        return getInitializer(name) != null;
    }

    /**
     * Determines if this variable is a variadic parameter
     * @return true iff this variable is a variadic parameter
     */
    public boolean isVariadic() {
        return isEllipsis;
    }
}
