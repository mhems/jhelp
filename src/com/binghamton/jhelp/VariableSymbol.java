package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

import com.binghamton.jhelp.ast.Expression;

/**
 * A class representing a Java variable at any scope
 */
public class VariableSymbol extends Symbol {
    private Type type;
    private Scope scope;
    private Expression value;

    /**
     * Constructs a new named, typed variable
     */
    public VariableSymbol(String id, Type type) {
        this(id, type, null, null);
    }

    /**
     * Constructs a new named, typed, scoped variable
     */
    public VariableSymbol(String id, Type type, Scope scope) {
        this(id, type, scope, null);
    }

    /**
     * Constructs a new named, typed, scoped variable with initial value
     */
    public VariableSymbol(String id, Type type, Scope scope, Expression value) {
        super(id);
        this.type = type;
        this.scope = scope;
        this.value = value;
    }

    /**
     * Gets the type of this variable
     * @return the type of this variable
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets the scope of this variable
     * @return the scope of this variable
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * Determines if this variable has been initialized
     * @return true iff this variable holds some value
     */
    public boolean isInitialized() {
        return value != null;
    }

    /**
     * Gets the value expression of this variable, if any
     * @return the value expression of this variable,
     *         null iff variable is uninitialized
     */
    public Expression getValue() {
        return value;
    }

    /**
     * Sets this variable's type
     * @param type this variable's type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Sets this variable's scope
     * @param scope this variable's scope
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * Sets this variable's value
     * @param value this variable's value
     */
    public void setValue(Expression value) {
        this.value = value;
    }

    /**
     * Determines if this variable is equivalent to another
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            if (other instanceof VariableSymbol) {
                VariableSymbol var = (VariableSymbol)other;
                return type.equals(var.type) &&
                    scope.equals(var.scope) &&
                    ((value == null && var.value == null) ||
                     (value != null && value.equals(var.value)));
            }
        }
        return false;
    }

    /**
     * Determines the hash code of this variable
     * @return the hash code of this variable
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ type.hashCode() ^
            scope.hashCode() ^ value.hashCode();
    }
}
