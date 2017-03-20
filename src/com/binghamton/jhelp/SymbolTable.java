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
public class SymbolTable<K, V extends Symbol> implements Iterable<V> {

    class EmptyTable<S extends Symbol> extends SymbolTable<String, S> {
        private EmptyTable() {
            super(null);
        }
        public S get(String name) { return null; }
        public int totalSize() { return 0; }
    }

    protected SymbolTable<K, V> parent;
    protected ArrayDeque<Map<K, V>> table = new ArrayDeque<>();
    protected Function<V, K> hasher;

        {
            // ensure table is non-empty
            enterScope();
        }

    public SymbolTable() {
        parent = new EmptyTable<V>();
    }

    public SymbolTable(SymbolTable<K, V> parent) {
        setParent(parent);
    }

    public SymbolTable(Function<V,K> valueToKey) {
        hasher = valueToKey;
    }

    public void setParent(SymbolTable<K, V> parent) {
        this.parent = parent;
    }

    /**
     * Looks for the Symbol with name `name` in this SymbolTable.
     * @param name the name of the Symbol to retrieve
     * @return the Symbol whose name is `name` if one exists,
     *         otherwise null
     */
    public V get(K key) {
        V sym = getCurrentScope(key);
        if (sym == null && parent != null) {
            sym = parent.get(key);
        }
        return sym;
    }

    protected V getCurrentScope(K key) {
        V sym = null;
        for (Map<K, V> scope : table) {
            sym = scope.get(key);
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
    public boolean put(V symbol) {
        if (isDeclaredInCurrentScope(symbol.getName())) {
            if (!(symbol instanceof MethodSymbol)) {
                // TODO eventually remove - up to caller to decide if this is an error
                System.err.println("table put failed - " + symbol.getName() + " already exists in current scope");
            }
            return false;
        }
        table.peekFirst().put(hasher(symbol), symbol);
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
    public boolean isDeclaredInCurrentScope(K key) {
        return table.peekFirst().containsKey(name);
    }

    public boolean shadows(K key) {
        return !isDeclaredInCurrentScope(key) && has(key);
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
            sb.append("----------------------------------------\n");
        }
        return sb.toString();
    }

    private class SymbolTableIterator implements Iterator<V> {
        private Iterator<Map<K, V>> tableItr;
        private Iterator<V> scopeItr;
        private ArrayDeque<Map<K, V>> table;

        public SymbolTableIterator(ArrayDeque<Map<K, V>> table) {
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

    public boolean importStaticMemberOnDemand(V[] members) {
        for (V member : members) {
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
