package com.binghamton.jhelp;

/**
 * A class representing a Java method
 */
public abstract class MethodSymbol extends CallableSymbol {

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

    public abstract Type getReturnType();

    public String getTypeName() {
        return super.getTypeName() + " -> " +  getReturnType().getTypeName();
    }
}
