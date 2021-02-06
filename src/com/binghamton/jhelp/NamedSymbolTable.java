package com.binghamton.jhelp;

import java.util.Map;
import java.util.function.Function;

import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.symbols.Symbol;
import com.binghamton.jhelp.symbols.VariableSymbol;
import com.binghamton.jhelp.types.Type;
import com.binghamton.jhelp.types.TypeVariable;

/**
 * A specialization of a SymbolTable that keys Symbols by their name
 * @param <T> the type of Symbol this SymbolTable holds
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
     * Copies the classes of the given table into a new table
     * @param symTab the SymbolTable holding the classes to copy
     * @return a new SymbolTable with a deep-copy of the given table's contents
     */
    public static NamedSymbolTable<ClassSymbol>
    copyClasses (NamedSymbolTable<ClassSymbol> symTab) {
        NamedSymbolTable<ClassSymbol> ret = new NamedSymbolTable<ClassSymbol>();
        copy(ret, symTab, c -> c.copy(), () -> new NamedSymbolTable<ClassSymbol>());
        return ret;
    }

    /**
     * Copies the variables of the given table into a new table
     * @param symTab the SymbolTable holding the variables to copy
     * @return a new SymbolTable with a deep-copy of the given table's contents
     */
    public static NamedSymbolTable<VariableSymbol>
    copyVariables (NamedSymbolTable<VariableSymbol> symTab) {
        NamedSymbolTable<VariableSymbol> ret = new NamedSymbolTable<VariableSymbol>();
        copy(ret, symTab, v -> v.copy(), () -> new NamedSymbolTable<VariableSymbol>());
        return ret;
    }

    /**
     * Copies the type variables of the given table into a new table
     * @param symTab the SymbolTable holding the type variables to copy
     * @return a new SymbolTable with a deep-copy of the given table's contents
     */
    public static NamedSymbolTable<TypeVariable>
    copyTypeVariables (NamedSymbolTable<TypeVariable> symTab) {
        NamedSymbolTable<TypeVariable> ret = new NamedSymbolTable<TypeVariable>();
        copy(ret, symTab, tv -> tv.copy(), () -> new NamedSymbolTable<TypeVariable>());
        return ret;
    }

    /**
     * Copies the types of the given table into a new table
     * @param symTab the SymbolTable holding the types to copy
     * @return a new SymbolTable with a deep-copy of the given table's contents
     */
    public static NamedSymbolTable<Type>
    copyTypes (NamedSymbolTable<Type> symTab) {
        NamedSymbolTable<Type> ret = new NamedSymbolTable<Type>();
        copy(ret, symTab, t -> t.copy(), () -> new NamedSymbolTable<Type>());
        return ret;
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
        for (SymbolTable<String, ClassSymbol> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptClasses(ancestor, map));
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
        for (SymbolTable<String, Type> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptTypes(ancestor, map));
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
        for (SymbolTable<String, VariableSymbol> ancestor : symTab.ancestors) {
            ret.addAncestor(adaptVariables(ancestor, map));
        }
        return ret;
    }
}
