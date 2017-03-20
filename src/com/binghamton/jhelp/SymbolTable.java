package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/**
 * A class encapsulating a symbol table over a Java compilation unit
 */
public class SymbolTable<T extends Symbol> implements Iterable<T> {

    class EmptyTable<S extends Symbol> extends SymbolTable<S> {
        private EmptyTable() {
            super(null);
        }
        public S get(String name) { return null; }
        public int totalSize() { return 0; }
    }

    protected SymbolTable<T> parent;
    protected ArrayDeque<Map<String, T>> table = new ArrayDeque<>();

        {
            // ensure table is non-empty
            enterScope();
        }

    public SymbolTable() {
        parent = new EmptyTable<T>();
    }

    public SymbolTable(SymbolTable<T> parent) {
        setParent(parent);
    }

    /**
     * Looks for the Symbol with name `name` in this SymbolTable.
     * @param name the name of the Symbol to retrieve
     * @return the Symbol whose name is `name` if one exists,
     *         otherwise null
     */
    public T get(String name) {
        T sym = getCurrentScope(name);
        if (sym == null && parent != null) {
            sym = parent.get(name);
        }
        return sym;
    }

    protected T getCurrentScope(String name) {
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
        if (isDeclaredInCurrentScope(symbol.getName())) {
            if (!(symbol instanceof MethodSymbol)) {
                // TODO eventually remove - up to caller to decide if this is an error
                System.err.println("table put failed - " + symbol.getName() + " already exists in current scope");
            }
            return false;
        }
        table.peekFirst().put(symbol.getName(), symbol);
        return true;
    }

    public boolean putAll(T[] symbols) {
        boolean ret = true;
        for (T sym : symbols) {
            ret &= put(sym);
        }
        return ret;
    }

    /**
     * Determines if a Symbol exists anywhere in this SymbolTable.
     * @param name the name of the Symbol to search for
     * @return true iff the Symbol exists at any scope in this SymbolTable,
     *         false otherwise
     */
    public boolean has(String name) {
        return get(name) != null;
    }

    /**
     * Determines if a Symbol exists in current scope in this SymbolTable.
     * @param name the name of the Symbol to search for
     * @return true iff the Symbol exists in current scope in this SymbolTable,
     *         false otherwise
     */
    public boolean isDeclaredInCurrentScope(String name) {
        return table.peekFirst().containsKey(name);
    }

    public boolean shadows(String name) {
        return !isDeclaredInCurrentScope(name) && has(name);
    }

    public int size() {
        int ret = 0;
        for (Map<String, T> scope : table) {
            ret += scope.size();
        }
        return ret;
    }

    public int totalSize() {
        return size() + parent.size();
    }

    public T[] toArray(T[] dest) {
        if (dest.length != size()) {
            throw new IllegalArgumentException("provided array must have length equal to the size of this table");
        }

        int pos = 0;
        for (T sym : this) {
            dest[pos] = sym;
            ++pos;
        }
        return dest;
    }

    public void setParent(SymbolTable<T> parent) {
        this.parent = parent;
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

    private class SymbolTableIterator implements Iterator<T> {
        private Iterator<Map<String, T>> tableItr;
        private Iterator<T> scopeItr;
        private ArrayDeque<Map<String, T>> table;

        public SymbolTableIterator(ArrayDeque<Map<String, T>> table) {
            this.table = table;
            tableItr = table.iterator();
        }

        @Override
        public boolean hasNext() {
            if (scopeItr != null && scopeItr.hasNext()) {
                return true;
            }
            if (tableItr.hasNext()) {
                scopeItr = tableItr.next().values().iterator();
                return scopeItr.hasNext();
            }
            return false;
        }

        @Override
        public T next() {
            return scopeItr.next();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SymbolTableIterator(table);
    }

    public boolean importStaticMember(String memberName, T[] members) {
        boolean added = false;
        for (T member : members) {
            if (member.getModifiers().contains(Modifier.STATIC) &&
                member.getName().equals(memberName)) {
                added = true;
                if (!put(member)) {
                    System.err.println("cannot import two members with same name");
                    return false;
                }
            }
        }
        return added;
    }

    public boolean importStaticMemberOnDemand(T[] members) {
        for (T member : members) {
            if (member.getModifiers().contains(Modifier.STATIC)) {
                if (!put(member)) {
                    System.err.println("cannot import two members with same name");
                    return false;
                }
            }
        }
        return true;
    }
}
