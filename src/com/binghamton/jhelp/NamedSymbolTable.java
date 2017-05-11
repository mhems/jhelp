package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/**
 * A specialization of a SymbolTable that keys Symbols by their name
 * @param <T> the type of Symbol this SymbolTable holds
 */
public class NamedSymbolTable<T extends Symbol> extends SymbolTable<String, T> {
    private static final boolean RECURSE = true;
    /**
     * Default construct a NamedSymbolTable
     */
    public NamedSymbolTable() {
        this(s -> s.getName());
    }

    // @Override
    // public NamedSymbolTable<T> copy() {
    //     NamedSymbolTable<T> ret = new NamedSymbolTable<>();
    //     copy(ret, this);
    //     return ret;
    // }

    /**
     * Constructs a new NamedSymbolTable
     * @param valueToKey that function that maps a symbol to its name
     */
    protected NamedSymbolTable(Function<T, String> valueToKey) {
        super(valueToKey);
    }

    /**
     * Adapts a SymbolTable of ClassSymbols
     * @param symTab the SymbolTable whose contents are to be adapted
     * @param map the Map mapping type variables to the types they are to
     *        substituted with
     * @return a new SymbolTable with adapted contents
     */
    public static NamedSymbolTable<ClassSymbol>
        adaptClasses(SymbolTable<String, ClassSymbol> symTab,
                     Map<TypeVariable, Type> map) {
        NamedSymbolTable<ClassSymbol> ret = new NamedSymbolTable<>();
        for (ClassSymbol sym : symTab) {
            ret.put(sym.adapt(map));
        }
        if (RECURSE) {
        for (SymbolTable<String, ClassSymbol> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptClasses(ancestor, map));
        }
        }
        return ret;
    }

    /**
     * Adapts a SymbolTable of Types
     * @param symTab the SymbolTable whose contents are to be adapted
     * @param map the Map mapping type variables to the types they are to
     *        substituted with
     * @return a new SymbolTable with adapted contents
     */
    public static NamedSymbolTable<Type>
        adaptTypes(SymbolTable<String, Type> symTab,
                   Map<TypeVariable, Type> map) {
        NamedSymbolTable<Type> ret = new NamedSymbolTable<>();
        for (Type sym : symTab) {
            ret.put(sym.adapt(map));
        }
        if (RECURSE) {
        for (SymbolTable<String, Type> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptTypes(ancestor, map));
        }
        }
        return ret;
    }

    /**
     * Adapts a SymbolTable of VariableSymbols
     * @param symTab the SymbolTable whose contents are to be adapted
     * @param map the Map mapping type variables to the types they are to
     *        substituted with
     * @return a new SymbolTable with adapted contents
     */
    public static NamedSymbolTable<VariableSymbol>
        adaptVariables(SymbolTable<String, VariableSymbol> symTab,
                       Map<TypeVariable, Type> map) {
        NamedSymbolTable<VariableSymbol> ret = new NamedSymbolTable<>();
        for (VariableSymbol sym : symTab) {
            ret.put(sym.adapt(map));
        }
        if (RECURSE) {
        for (SymbolTable<String, VariableSymbol> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptVariables(ancestor, map));
        }
            }
        return ret;
    }
}
