package com.binghamton.jhelp;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

import com.binghamton.jhelp.error.SemanticError;

/**
 * A class encapsulating a symbol table over a Java compilation unit
 */
public abstract class SymbolTable<K, V extends Symbol> implements Iterable<V> {

    protected SymbolTable<K, V> parent;
    protected ArrayDeque<Map<K, V>> table = new ArrayDeque<>();
    protected Function<V, K> valueToKey;

    /**
     * A singleton dummy class to represent an empty SymbolTable
     */
    private final class EmptyTable<S extends Symbol> extends SymbolTable<K, S> {
        /**
         * Constructs a new EmptyTable
         */
        private EmptyTable() {
            super(true);
        }

        /**
         * Gets the Symbol mapped by a key
         * @param key the key to index the Symbol
         * @return the Symbol associated with the given key
         */
        @Override
        public S get(K key) {
            return null;
        }

        /**
         * Gets the number of Symbols in this SymbolTable
         * @return the number of Symbols in this SymbolTable
         */
        @Override
        public int totalSize() {
            return 0;
        }

        /**
         * Adapts the contents of this SymbolTable
         * @param map the Map mapping TypeVariables to their substituted Types
         * @return the adapted SymbolTable
         * @throws UnsupportedOperationException always
         */
        public SymbolTable<K, S> adapt(Map<TypeVariable, Type> map) {
            throw new UnsupportedOperationException("cannot adapt the empty table");
        }
    }

        {
            // ensure table is non-empty
            enterScope();
        }

    /**
     * Constructs an empty SymbolTable without a parent
     * @param noParent unused used to distinguish from default constructor
     */
    private SymbolTable(boolean noParent) {
        parent = null;
    }

    /**
     * Constructs a SymbolTable with mapping function
     * @param valueToKey to function that maps Symbols to keys
     */
    protected SymbolTable(Function<V, K> valueToKey) {
        this.valueToKey = valueToKey;
        parent = new EmptyTable<V>();
    }

    /**
     * Constructs a SymbolTable with a parent SymbolTable
     * @param parent the parent SymbolTable
     */
    public SymbolTable(SymbolTable<K, V> parent) {
        this.valueToKey = parent.valueToKey;
        this.parent = parent;
    }

    /**
     * Looks for a Symbol by key in this SymbolTable, or its parent.
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

    /**
     * Looks for a Symbol by key in this SymbolTable only.
     * @param key the key to use to retrieve the Symbol
     * @return the Symbol represented by the key, if one exists,
     *         otherwise null
     */
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

    /**
     * Looks for a Symbol by key in this SymbolTable's current scope.
     * @param key the key to use to retrieve the Symbol
     * @return the Symbol represented by the key, if one exists,
     *         otherwise null
     */
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
            symbol.addError(new SemanticError("table put failed (class " + symbol.getDeclaringClass().getName() + ") - " + symbol.getName() + " already exists in current scope"));
            return false;
        }
        table.peekFirst().put(key, symbol);
        return true;
    }

    /**
     * Attempts to place Symbols in current scope. A Symbol will not be placed
     * if an similarly-named entry already exists in current scope.
     * @param symbols the Symbols to attempt to place
     * @return true iff all Symbols were placed in current scope, false otherwise
     */
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

    /**
     * Determines if a Symbol exists in this table
     * @param key the key of the Symbol to search for
     * @return true iff this table has the Symbol
     */
    public boolean hasInTable(K key) {
        for (Map<K, V> scope : table) {
            if (scope.containsKey(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if this key shadows a Symbol in an enclosing scope
     * @param key the key of the Symbol to search for
     * @return true iff the Symbol shadows a Symbol in this table
     */
    public boolean shadows(K key) {
        return !hasInCurrentScope(key) && parent.has(key);
    }

    /**
     * Gets the number of Symbols in this SymbolTable
     * @return the number of Symbols in this SymbolTable
     */
    public int size() {
        int ret = 0;
        for (Map<K, V> scope : table) {
            ret += scope.size();
        }
        return ret;
    }

    /**
     * Gets the number of Symbols in this SymbolTable and its parent
     * @return the number of Symbols in this SymbolTable and its parent
     */
    public int totalSize() {
        return size() + parent.size();
    }

    /**
     * Gathers the Symbols in this table into an array
     * @param dest the array to place the Symbols in
     * @return an array with all the Symbols in this table
     */
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
     * Sets the parent table of this table
     * @param parent the parent table
     */
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

    /**
     * Builds a String representation of this SymbolTable
     * @return the String representation of this SymbolTable
     */
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

    /**
     * Helper class that serves as an Iterator over a table's elements.
     */
    private class SymbolTableIterator implements Iterator<V> {
        private final Iterator<Map<K, V>> tableItr;
        private Iterator<V> scopeItr;

        /**
         * Constructs a new Iterator from a table's contents
         * @param table the table's contents
         */
        public SymbolTableIterator(ArrayDeque<Map<K, V>> table) {
            tableItr = table.iterator();
        }

        /**
         * Determines if there is another Symbol to iterate over
         * @return true iff there is another Symbol to iterate over
         */
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

        /**
         * Gets the next Symbol to iterate over
         * @return the next Symbol to iterate over
         */
        @Override
        public V next() {
            return scopeItr.next();
        }
    }

    /**
     * Creates a new Iterator over this table's symbols
     * @return a new Iterator over this table's symbols
     */
    @Override
    public Iterator<V> iterator() {
        return new SymbolTableIterator(table);
    }

    /**
     * Imports static members into this SymbolTable
     * @param memberName the name of the member to import
     * @param members the members to import
     * @return true iff members were imported successfully
     */
    public boolean importStaticMember(String memberName, V[] members) {
        boolean added = false;
        for (V member : members) {
            if (member.isStatic() &&
                member.getName().equals(memberName)) {
                added = true;
                if (!put(member)) {
                    member.addError(new SemanticError("cannot import two members with same name"));
                    return false;
                }
            }
        }
        return added;
    }

    /**
     * Imports static members on-demand into this SymbolTable
     * @param members the members to import-on-demand
     * @return true iff members were imported on-demand successfully
     */
    public boolean importStaticMemberOnDemand(V[] members) {
        for (V member : members) {
            if (member.isStatic() && !put(member)) {
                member.addError(new SemanticError("cannot import two members with same name"));
                return false;
            }
        }
        return true;
    }
}
