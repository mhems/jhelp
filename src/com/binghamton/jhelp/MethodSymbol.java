package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class representing a Java method
 */
public abstract class MethodSymbol extends Symbol {

        {
            kind = SymbolKind.METHOD;
        }

    private MethodType type;

    /**
     * Constructs a new named method symbol
     * @param id the name of the method
     */
    public MethodSymbol(String id) {
        super(id);
    }

    /**
     * Construct a new MethodSymbol with modifiers
     * @param name the name of this MethodSymbol
     * @param modifiers the modifiers of this MethodSymbol
     */
    public MethodSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public MethodSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    public abstract boolean isVariadic();

    /**
     * Gets the formal parameters of this Method
     * @return the formal parameters of this Method
     */
    public abstract Type[] getParameterTypes();

    public int numParameters() {
        return getParameterTypes().length;
    }

    public abstract Type[] getExceptionTypes();

    public boolean hasExceptions() {
        return getExceptionTypes().length > 0;
    }

    public abstract TypeVariable[] getTypeParameters();

    public boolean hasTypeParameters() {
        return getTypeParameters().length > 0;
    }

    public boolean equals(Object other) {
        return other instanceof MethodSymbol &&
            type.equals(((MethodSymbol)other).type);
    }

    public int hashCode() {
        return type.hashCode();
    }

    public abstract Type getReturnType();
    public abstract boolean isConstructor();

    public String toString() {
        StringBuilder sb = new StringBuilder(getModifiers().toString());
        sb.append(" ");

        if (!isConstructor()) {
            sb.append(getReturnType().getTypeName());
            sb.append(" ");
        }
        sb.append(type.toString());
        if (getExceptionTypes().length > 0) {
            sb.append(" throws ");
            sb.append(StringUtils.join(", ",
                                       getExceptionTypes(),
                                       t -> t.getTypeName()));
        }
        return sb.toString();
    }

    public void constructType() {
        type = MethodType.fromMethod(this);
    }

    public MethodType getType() {
        return type;
    }

    public boolean returnTypeSubstitutable(MethodSymbol other) {
        Type retType = getReturnType();
        Type otherRetType = other.getReturnType();
        if (retType.equals(otherRetType)) {
            return true;
        }
        // TODO incomplete
        return false;
    }

    public boolean isOverrider() {
        // TODO
        // if shadows -> true
        return false;
    }

    public boolean isImplementer() {
        // TODO
        return false;
    }

    public boolean isOverloaded() {
        // TODO
        return false;
    }
}
