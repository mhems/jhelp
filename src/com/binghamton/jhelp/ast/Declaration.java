package com.binghamton.jhelp.ast;

import java.util.Collection;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;

/**
 * Abstract base class for all Java declarations
 */
public abstract class Declaration extends Statement {
    protected String name;
    protected Modifiers modifiers;

    /**
     * Construct an empty declaration
     */
    public Declaration() {
        super();
    }

    /**
     * Construct an unnamed modified declaration
     * @param modifiers the modifiers of this declaration
     */
    public Declaration(Collection<Modifier> modifiers) {
        this(null, modifiers);
    }

    /**
     * Construct a modified declaration
     * @param name the name of the declared entity
     * @param modifiers the modifiers of this declaration
     */
    public Declaration(String name, Collection<Modifier> modifiers) {
        this.name = name;
        this.modifiers = new Modifiers(modifiers);
    }

    /**
     * Gets the name of this declaration
     * @return the name of this declaration
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this declaration
     * @param name the new name of this declaration
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the modifiers of this declaration
     * @return the modifiers of this declaration
     */
    public Modifiers getModifiers() {
        return modifiers;
    }
}
