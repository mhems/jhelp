package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

/**
 * A class representing the abstract notion of a Java symbol
 * Java symbols include classes, enums, interfaces, methods, and variables
 */
public abstract class Symbol {
    private String id;
    private AccessLevel access;
    private Set<Modifier> modifiers = new TreeSet<>();

    /**
     * Construct a named Symbol
     * @param id the name of the symbol
     */
    public Symbol(String id) {
        this.id = id;
    }

    /**
     * Construct a named Symbol with access `access`
     * @param id the name of the symbol
     * @param access the access level of the symbol
     */
    public Symbol(String id, AccessLevel access) {
        this.id = id;
        this.access = access;
    }

    /**
     * Gets the name of this symbol
     * @return the name of this symbol
     */
    public String getName() {
        return id;
    }

    /**
     * Gets the access level of this symbol
     * @return the access level of this symbol
     */
    public AccessLevel getAccessLevel() {
        return access;
    }

    /**
     * Gets the modifiers of this symbol
     * @return the modifiers of this symbol
     */
    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    /**
     * Sets the access level of this symbol
     * @param lvl the level of this symbol
     */
    public void setAccessLevel(AccessLevel lvl) {
        access = lvl;
    }

    /**
     * Attempts to add modifier to this symbol's modifiers
     * @param modifier the modifier to attempt to add
     * @return true iff modifier successfully added
     */
    public boolean addModifier(Modifier modifier) {
        return modifiers.add(modifier);
    }

    /**
     * Gets the number of modifiers of this symbol
     * @return the number of modifiers of this symbol
     */
    public int numModifiers() {
        return modifiers.size();
    }

    /**
     * Determines if this symbol is equivalent to another symbol
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Symbol) {
            Symbol sym = (Symbol)other;
            return id.equals(sym.id) &&
                access == sym.access &&
                modifiers.equals(sym.modifiers);
        }
        return false;
    }

    /**
     * Determines the hash code of this symbol
     * @return the hash code of this symbol
     */
    @Override
    public int hashCode() {
        return id.hashCode() ^ access.hashCode() ^ modifiers.hashCode();
    }
}
