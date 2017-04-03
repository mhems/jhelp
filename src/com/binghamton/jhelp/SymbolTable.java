package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

/**
 * A class encapsulating a symbol table over a Java compilation unit
 */
public abstract class SymbolTable<K, V extends Symbol> implements Iterable<V> {

    private final class EmptyTable<S extends Symbol> extends SymbolTable<K, S> {
        private EmptyTable() {
            super(true);
        }
        public S get(K key) { return null; }
        public int totalSize() { return 0; }
    }

    protected SymbolTable<K, V> parent;
    protected ArrayDeque<Map<K, V>> table = new ArrayDeque<>();
    protected Function<V, K> valueToKey;

        {
            // ensure table is non-empty
            enterScope();
        }

    private SymbolTable(boolean noParent) {
        parent = null;
    }

    protected SymbolTable(Function<V, K> valueToKey) {
        this.valueToKey = valueToKey;
        parent = new EmptyTable<V>();
    }

    public SymbolTable(SymbolTable<K, V> parent) {
        this.valueToKey = parent.valueToKey;
        setParent(parent);
    }

    /**
     * Looks for a Symbol by key in this SymbolTable.
     * @param key the key to use to retrieve the Symbol
     * @return the Symbol represented by the key, if one exists,
     *         otherwise null
     */
    public V get(K key) {
        V sym = getFromTable(key);
        if (sym == null && parent != null) {
            sym = parent.get(key);
        }
        return sym;
    }

    protected V getFromTable(K key) {
        V sym = null;
        for (Map<K, V> scope : table) {
            sym = scope.get(key);
            if (sym != null) {
                break;
            }
        }
        return sym;
    }

    protected V getFromCurrentScope(K key) {
        return table.peekFirst().get(key);
    }

    /**
     * Attempts to place a Symbol in current scope. Symbol will not be placed if
     * an similarly-named entry already exists in current scope.
     * @param symbol the Symbol to attempt to place
     * @return true iff Symbol was placed in current scope, false otherwise
     */
    public boolean put(V symbol) {
        K key = valueToKey.apply(symbol);
        if (hasInCurrentScope(key)) {
            System.err.println("table put failed (class " + symbol.getDeclaringClass().getName() + ") - " + symbol.getName() + " already exists in current scope");
            return false;
        }
        table.peekFirst().put(key, symbol);
        return true;
    }

    public boolean putAll(V[] symbols) {
        boolean ret = true;
        for (V sym : symbols) {
            ret &= put(sym);
        }
        return ret;
    }

    /**
     * Determines if a Symbol exists anywhere in this SymbolTable.
     * @param key the key of the Symbol to search for
     * @return true iff the Symbol exists at any scope in this SymbolTable,
     *         false otherwise
     */
    public boolean has(K key) {
        return get(key) != null;
    }

    /**
     * Determines if a Symbol exists in current scope in this SymbolTable.
     * @param key the key of the Symbol to search for
     * @return true iff the Symbol exists in current scope in this SymbolTable,
     *         false otherwise
     */
    public boolean hasInCurrentScope(K key) {
        return table.peekFirst().containsKey(key);
    }

    public boolean hasInTable(K key) {
        for (Map<K, V> scope : table) {
            if (scope.containsKey(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean shadows(K key) {
        return !hasInCurrentScope(key) && parent.has(key);
    }

    public int size() {
        int ret = 0;
        for (Map<K, V> scope : table) {
            ret += scope.size();
        }
        return ret;
    }

    public int totalSize() {
        return size() + parent.size();
    }

    public V[] toArray(V[] dest) {
        if (dest.length != size()) {
            throw new IllegalArgumentException("provided array must have length equal to the size of this table");
        }

        int pos = 0;
        for (V sym : this) {
            dest[pos] = sym;
            ++pos;
        }
        return dest;
    }

    public void setParent(SymbolTable<K, V> parent) {
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
        for (Map<K, V> scope : table) {
            for (V symbol : scope.values()) {
                sb.append(symbol.repr());
                sb.append("\n");
            }
            sb.append("end scope ----------------------------------------\n");
        }
        sb.append("end table ----------------------------------------\n");
        return sb.toString();
    }

    private class SymbolTableIterator implements Iterator<V> {
        private Iterator<Map<K, V>> tableItr;
        private Iterator<V> scopeItr;

        public SymbolTableIterator(ArrayDeque<Map<K, V>> table) {
            tableItr = table.iterator();
        }

        @Override
        public boolean hasNext() {
            if (scopeItr != null && scopeItr.hasNext()) {
                return true;
            }
            if (tableItr.hasNext()) {
                scopeItr = tableItr.next().values().iterator();
                if (scopeItr.hasNext()) {
                    return true;
                }
                if (tableItr.hasNext()) {
                    scopeItr = tableItr.next().values().iterator();
                    return hasNext();
                }
            }
            return false;
        }

        @Override
        public V next() {
            return scopeItr.next();
        }
    }

    @Override
    public Iterator<V> iterator() {
        return new SymbolTableIterator(table);
    }

    public boolean importStaticMember(String memberName, V[] members) {
        boolean added = false;
        for (V member : members) {
            if (member.isStatic() &&
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

    public boolean importStaticMemberOnDemand(V[] members) {
        for (V member : members) {
            if (member.isStatic()) {
                if (!put(member)) {
                    System.err.println("cannot import two members with same name");
                    return false;
                }
            }
        }
        return true;
    }
}
