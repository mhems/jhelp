package com.binghamton.jhelp;

import java.util.Map;
import java.util.function.Function;

public class NamedSymbolTable<T extends Symbol> extends SymbolTable<String, T> {

    public NamedSymbolTable() {
        this(s -> s.getName());
    }

    protected NamedSymbolTable(Function<T, String> valueToKey) {
        super(valueToKey);
    }

    private NamedSymbolTable(NamedSymbolTable<T> table) {
        this();
        this.parent = table.parent;
    }

    public static NamedSymbolTable<ClassSymbol>
    adaptClasses(NamedSymbolTable<ClassSymbol> symTab,
                 Map<TypeVariable, Type> map) {
        NamedSymbolTable<ClassSymbol> ret = new NamedSymbolTable<>(symTab);
        for (ClassSymbol sym : symTab.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
        }
        return ret;
    }

    public static NamedSymbolTable<Type>
    adaptTypes(NamedSymbolTable<Type> symTab,
               Map<TypeVariable, Type> map) {
        NamedSymbolTable<Type> ret = new NamedSymbolTable<>(symTab);
        for (Type sym : symTab.table.peekFirst().values()) {
            ret.put(sym.adapt(map));
        }
        return ret;
    }

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
