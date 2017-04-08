package com.binghamton.jhelp;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class MethodSymbolTable extends SymbolTable<MethodType, MethodSymbol> {
    private static final Function<MethodSymbol, MethodType> TO_TYPE = s -> s.getType();

    public MethodSymbolTable() {
        super(TO_TYPE);
    }

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

    public boolean overrides(MethodSymbol sym) {
        return overrides(sym.getType());
    }

    public boolean overrides(MethodType key) {
        return !hasInTable(key) && parent.has(key);
    }
}
