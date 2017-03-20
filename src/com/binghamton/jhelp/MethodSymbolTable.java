package com.binghamton.jhelp;

import java.util.function.Function;

public class MethodSymbolTable extends SymbolTable<MethodType, MethodSymbol> {
    private static final Function<MethodSymbol, MethodType> TO_TYPE = s -> s.getType();

    public MethodSymbolTable() {
        super(TO_TYPE);
    }

    public boolean put(MethodSymbol sym){
        return super.put(sym);
    }
}
