package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class representing a callable symbol.
 * This includes methods and constructors.
 */
public abstract class CallableSymbol extends Symbol {

    /**
     * Constructs a new named method symbol
     * @param id the name of the method
     */
    public CallableSymbol(String id) {
        super(id);
    }

    /**
     * Construct a new CallableSymbol with modifiers
     * @param name the name of this CallableSymbol
     * @param modifiers the modifiers of this CallableSymbol
     */
    public CallableSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public CallableSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    public abstract ClassSymbol getDeclaringClass();

    /**
     * Gets the formal parameters of this Callable
     * @return the formal parameters of this Callable
     */
    public abstract Type[] getParameterTypes();

    public abstract Type[] getExceptionTypes();

    public abstract TypeVariable[] getTypeParameters();

    public boolean hasTypeParameters() {
        return getTypeParameters().length > 0;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        if (hasTypeParameters()) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       getTypeParameters(),
                                       t -> t.getTypeName()));
            sb.append(">");
        }
        sb.append("(");
        sb.append(StringUtils.join(", ",
                                   getParameterTypes(),
                                   t -> t.getTypeName()));
        sb.append(")");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getModifiers().toString());
        sb.append(" ");
        sb.append(toSubString());
        return sb.toString();
    }

    protected String toSubString() {
        StringBuilder sb = new StringBuilder(getName());
        sb.append(getTypeName());
        if (getExceptionTypes().length > 0) {
            sb.append(" throws ");
            sb.append(StringUtils.join(", ",
                                       getExceptionTypes(),
                                       t -> t.getTypeName()));
        }
        return sb.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof CallableSymbol) {
            CallableSymbol sym = (CallableSymbol)other;
            return getName().equals(sym.getName()) &&
                getDeclaringClass().equals(sym.getDeclaringClass()) &&
                Arrays.equals(getParameterTypes(),
                              sym.getParameterTypes());
        }
        return false;
    }

    public int hashCode() {
        return getName().hashCode() ^
            getDeclaringClass().hashCode() ^
            getParameterTypes().length;
    }
}
