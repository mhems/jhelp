package com.binghamton.jhelp;

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
}
