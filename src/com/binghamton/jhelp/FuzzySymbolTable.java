package com.binghamton.jhelp;

import java.util.Map;
import java.util.List;
import java.util.function.Function;

import com.binghamton.jhelp.util.StringMatcher;

public class FuzzySymbolTable<K, V extends Symbol> extends SymbolTable<K, V> {
    private final StringMatcher matcher;
    private final int threshold;

    /**
     * Construct a new FuzzySymbolTable with StringMatcher and threshold
     * @param valueToKey the function mapping value Objects into key Objects
     * @param matcher the StringMatcher that will be used to determine the edit
     *        distance between two Strings.
     * @param threshold the maximum edit distance where two Strings should be
     *        considered equivalent
     */
    public FuzzySymbolTable(Function<V, K> valueToKey,
                            StringMatcher matcher,
                            int threshold) {
        super(valueToKey);
        this.matcher = matcher;
        this.threshold = threshold;
    }

    @Override
    public V get(K key) {
        V sym = null;
        sym = super.get(key);
        if (sym == null) {
            for (Map<K, V> scope : table) {
                for (K curKey : scope.keySet()) {
                    if (matcher.editDistance(curKey.toString(),
                                             key.toString()) <= threshold) {
                        System.err.println("found a near match for " + key +
                                           "( " + curKey + "), using that");
                        sym = scope.get(curKey);
                        break;
                    }
                }
            }
        }
        return sym;
    }
}
