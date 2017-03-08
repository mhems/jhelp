package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

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

    /**
     * Gets the return type of this method
     * @return the return type of this method
     */
    public abstract Type getReturnType();

    /**
     * Gets the formal parameters of this method
     * @return the formal parameters of this method
     */
    public abstract Type[] getParameterTypes();

    public abstract ClassSymbol[] getExceptionClasses();

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
        sb.append(" -> ");
        sb.append(getReturnType().getTypeName());
        return sb.toString();
    }
}
