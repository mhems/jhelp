package com.binghamton.jhelp;

import java.util.Map;
import java.util.function.Function;

/**
 * A specialization of a SymbolTable that keys Symbols by their name
 */
public class NamedSymbolTable<T extends Symbol> extends SymbolTable<String, T> {

    /**
     * Default construct a NamedSymbolTable
     */
    public NamedSymbolTable() {
        this(s -> s.getName());
    }

    /**
     * Constructs a new NamedSymbolTable
     * @param valueToKey that function that maps a symbol to its name
     */
    protected NamedSymbolTable(Function<T, String> valueToKey) {
        super(valueToKey);
    }

    /**
     * Constructs a new NamedSymbolTable with a parent table
     * @param table the parent table
     */
    private NamedSymbolTable(NamedSymbolTable<T> table) {
        this();
        this.parent = table.parent;
    }

    /**
     * Adapts a SymbolTable of ClassSymbols
     * @param symTab the SymbolTable whose contents are to be adapted
     * @param map the Map mapping type variables to the types they are to
     *        substituted with
     * @return a new SymbolTable with adapted contents
     */
    public static NamedSymbolTable<ClassSymbol>
    adaptClasses(NamedSymbolTable<ClassSymbol> symTab,
                 Map<TypeVariable, Type> map) {
        NamedSymbolTable<ClassSymbol> ret = new NamedSymbolTable<>(symTab);
        for (ClassSymbol sym : symTab.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
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
    adaptTypes(NamedSymbolTable<Type> symTab,
               Map<TypeVariable, Type> map) {
        NamedSymbolTable<Type> ret = new NamedSymbolTable<>(symTab);
        for (Type sym : symTab.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
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
    adaptVariables(NamedSymbolTable<VariableSymbol> symTab,
                   Map<TypeVariable, Type> map) {
        NamedSymbolTable<VariableSymbol> ret = new NamedSymbolTable<>(symTab);
        for (VariableSymbol sym : symTab.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
        }
        return ret;
    }
}
