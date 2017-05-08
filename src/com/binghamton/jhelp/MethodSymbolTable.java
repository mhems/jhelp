package com.binghamton.jhelp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 * A SymbolTable specifically for holding methods, where methods are
 * keyed by their override signature.
 */
public class MethodSymbolTable extends SymbolTable<MethodType, MethodSymbol> {
    private static final Function<MethodSymbol, MethodType> TO_TYPE = s -> s.getType();

    /**
     * Construct a new MethodSymbolTable
     */
    public MethodSymbolTable() {
        super(TO_TYPE);
    }

    /**
     * Gets all methods with a given name
     * @param name the name of the methods to fetch
     * @return the Set of all methods with name `name`
     */
    public Set<MethodSymbol> getAll(String name) {
        Set<MethodSymbol> ret = new HashSet<>();
        Set<MethodType> types = new HashSet<>();
        for (MethodSymbol sym : this) {
            if (sym.getName().equals(name) && types.add(sym.getType())) {
                ret.add(sym);
            }
        }
        return ret;
    }

    /**
     * Determines if this symbol is overriding an existing one
     * @param sym the MethodSymbol this method may be overriding
     * @return true iff this method is overriding an existing one
     */
    public boolean overrides(MethodSymbol sym) {
        return overrides(sym.getType());
    }

    /**
     * Determines if this symbol is overriding an existing one
     * @param key the MethodType of the method possibly being
     * overridden.
     * @return true iff this method is overriding an existing one
     */
    public boolean overrides(MethodType key) {
        return !hasInTable(key) && parent.has(key);
    }

    /**
     * Adapts the contents of this SymbolTable by substituting any
     * Type parameters with Type arguments.
     * @param map the Map mapping type variable to the type argument
     *        substitutions
     * @return a new SymbolTable with the adapted contents of this
     *         table.
     */
    public MethodSymbolTable adapt(Map<TypeVariable, Type> map) {
        MethodSymbolTable ret = new MethodSymbolTable();
        for (MethodSymbol sym : this.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
        }
        return ret;
    }
}
