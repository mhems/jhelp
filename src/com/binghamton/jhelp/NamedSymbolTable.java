package com.binghamton.jhelp;

public class NamedSymbolTable<T extends Symbol> extends SymbolTable<String, T> {

    public NamedSymbolTable() {
        super(s -> s.getName());
    }
}
