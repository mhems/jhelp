package com.binghamton.jhelp;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

/**
 * A class encapsulating a symbol table over a Java compilation unit
 */
public class SymbolTable<T extends Symbol> {
    private SymbolTable<T> parent;
    private ArrayDeque<Map<String, T>> table = new ArrayDeque<>();
    // private ErrorHandle handler;

        {
            // ensure table is non-empty
            enterScope();
        }

    // public SymbolTable(ErrorHandler handler) {
    //     this.handler = handler;
    // }

    /**
     * Looks for the Symbol with name `name` in this SymbolTable.
     * @param name the name of the Symbol to retrieve
     * @return the Symbol whose name is `name` if one exists,
     *         otherwise null
     */
    public T get(String name) {
        T sym = null;
        for (Map<String, T> scope : table) {
            sym = scope.get(name);
            if (sym != null) {
                break;
            }
        }
        return sym;
    }

    /**
     * Attempts to place a Symbol in current scope. Symbol will not be placed if
     * an similarly-named entry already exists in current scope.
     * @param symbol the Symbol to attempt to place
     * @return true iff Symbol was placed in current scope, false otherwise
     */
    public boolean put(T symbol) {
        if (inScope(symbol.getName())) {
            // TODO error notification? or up to caller?
            return false;
        }
        table.peekFirst().put(symbol.getName(), symbol);
        return true;
    }

    /**
     * Determines if a Symbol exists anywhere in this SymbolTable.
     * @param name the name of the Symbol to search for
     * @return true iff the Symbol exists at any scope in this SymbolTable,
     *         false otherwise
     */
    public boolean exists(String name) {
        return get(name) != null;
    }

    /**
     * Determines if a Symbol exists in current scope in this SymbolTable.
     * @param name the name of the Symbol to search for
     * @return true iff the Symbol exists in current scope in this SymbolTable,
     *         false otherwise
     */
    public boolean inScope(String name) {
        return table.peekFirst().containsKey(name);
    }

    public boolean shadows(String name) {
        return !inScope(name) && exists(name);
    }

    /**
     * Provides a mechanism to add a new scope to this SymbolTable when a new
     * block is encountered.
     */
    public void enterScope() {
        table.addFirst(new HashMap<>());
    }

    /**
     * Provides a mechanism to leave a scope in this SymbolTable when a block is
     * concluding.
     */
    public void exitScope() {
        table.removeFirst();
    }

    public String repr() {
        StringBuilder sb = new StringBuilder();
        for (Map<String, T> scope : table) {
            for (T symbol : scope.values()) {
                sb.append(symbol.repr());
                sb.append("\n");
            }
            sb.append("----------------------------------------\n");
        }
        return sb.toString();
    }
}
