package com.binghamton.jhelp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import com.binghamton.jhelp.symbols.MethodSymbol;
import com.binghamton.jhelp.types.MethodType;
import com.binghamton.jhelp.types.Type;
import com.binghamton.jhelp.types.TypeVariable;

/**
 * A SymbolTable specifically for holding methods, where methods are
 * keyed by their override signature.
 */
public class MethodSymbolTable extends SymbolTable<MethodType, MethodSymbol> {
    private static final Function<MethodSymbol, MethodType> TO_TYPE = s -> s.getType();
    private static final boolean RECURSE = true;
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
        for (SymbolTable<MethodType, MethodSymbol> ancestor : ancestors) {
            for (MethodSymbol sym : ancestor) {
                if (sym.getName().equals(name) && types.add(sym.getType())) {
                    ret.add(sym);
                }
            }
        }
        return ret;
    }

    /**
     * Determines if a symbol overrides an existing one
     * @param sym the MethodSymbol this method may be overriding
     * @return true iff the method overrides an existing one
     */
    public boolean overrides(MethodSymbol sym) {
        return overrides(sym.getType());
    }

    /**
     * Determines if a symbol overrides an existing one
     * @param key the MethodType of the method possibly being
     * overridden.
     * @return true iff the method overrides an existing one
     */
    public boolean overrides(MethodType key) {
        for (SymbolTable<MethodType, MethodSymbol> ancestor : ancestors) {
            if (ancestor.has(key)) {
                return !hasInTable(key);
            }
        }
        return false;
    }

    /**
     * Adapts a SymbolTable of MethodSymbols
     * @param src the SymbolTable whose contents are to be adapted
     * @param map the Map mapping type variables to the types they are to
     *        substituted with
     * @return a new SymbolTable with adapted contents
     */
    public static MethodSymbolTable
    adaptMethods(SymbolTable<MethodType, MethodSymbol> src,
                 Map<TypeVariable, Type> map) {
        MethodSymbolTable ret = new MethodSymbolTable();
        for (MethodSymbol sym : src) {
            ret.put(sym.adapt(map));
        }
        if (RECURSE) {
            for (SymbolTable<MethodType, MethodSymbol> ancestor : src.ancestors) {
                ret.addAncestor(adaptMethods(ancestor, map));
            }
        }
        return ret;
    }

    /**
     * Performs a deep-copy of this table into a new table
     * @return a new SymbolTable holding a deep-copy of this table's contents
     */
    public MethodSymbolTable copy() {
        MethodSymbolTable ret = new MethodSymbolTable();
        copy(ret, this, m -> m.copy(), () -> new MethodSymbolTable());
        return ret;
    }
}
