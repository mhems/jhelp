package com.binghamton.jhelp;

import java.util.function.Function;

public class NamedSymbolTable<T extends Symbol> extends SymbolTable<String, T> {

    public NamedSymbolTable() {
        this(s -> s.getName());
    }

    protected NamedSymbolTable(Function<T, String> valueToKey) {
        super(valueToKey);
    }
}
