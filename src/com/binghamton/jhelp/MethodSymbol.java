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

    public abstract Type[] getExceptionTypes();

    public abstract TypeVariable[] getTypeParameters();

    public boolean hasTypeParameters() {
        return getTypeParameters().length > 0;
    }

    public boolean equals(Object other) {
        if (other instanceof MethodSymbol) {
            MethodSymbol sym = (MethodSymbol)other;
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

    public abstract Type getReturnType();
    public abstract boolean isConstructor();

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
        sb.append(" -> ");
        sb.append(getReturnType().getTypeName());
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getModifiers().toString());
        sb.append(" ");

        if (!isConstructor()) {
            sb.append(getReturnType().getTypeName());
            sb.append(" ");
        }
        if (hasTypeParameters()) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       getTypeParameters(),
                                       t -> t.getTypeName()));
            sb.append(">");
        }
        sb.append(getName());
        sb.append("(");
        sb.append(StringUtils.join(", ",
                                   getParameterTypes(),
                                   t -> t.getTypeName()));
        sb.append(")");
        if (getExceptionTypes().length > 0) {
            sb.append(" throws ");
            sb.append(StringUtils.join(", ",
                                       getExceptionTypes(),
                                       t -> t.getTypeName()));
        }
        return sb.toString();
    }
}
