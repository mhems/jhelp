package com.binghamton.jhelp;

/**
 * A class representing a Java constructor
 */
public abstract class ConstructorSymbol extends CallableSymbol {

        {
            kind = SymbolKind.CONSTRUCTOR;
        }

    /**
     * Constructs a new named method symbol
     * @param id the name of the method
     */
    public ConstructorSymbol(String id) {
        super(id);
    }

    /**
     * Construct a new ConstructorSymbol with modifiers
     * @param name the name of this ConstructorSymbol
     * @param modifiers the modifiers of this ConstructorSymbol
     */
    public ConstructorSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public ConstructorSymbol(String name, int modifiers) {
        super(name, modifiers);
    }
}
