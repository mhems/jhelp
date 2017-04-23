package com.binghamton.jhelp;

import java.util.HashMap;
import java.util.Map;

/**
 * A class to manage imports in Java source programs.
 * Lazily populates cache associating symbol names to Class reflection Objects.
 */
public class ImportManager {
    private static final Map<String, ReflectedClassSymbol> cache = new HashMap<>();

    private ImportManager() {
	// prevent public instantiation
    }

    /**
     * Determines if a symbol has been explicity imported
     * @param name the name of the symbol to query
     * @return true iff the symbol has been explicity imported,
     *         false otherwise
     */
    public static boolean isImported(String name) {
        return cache.containsKey(name);
    }

    /**
     * Retrieve the already imported class with a given qualified name
     * @param name the qualified name of the class to retrieve
     * @return the ReflectedClassSymbol reflecting the existing class
     * @throws IllegalArgumentException if the class has not been
     * imported yet.
     */
    public static ReflectedClassSymbol get(String name) {
        if (!isImported(name)) {
            throw new IllegalArgumentException(name + " is not in the cache");
        }
        return cache.get(name);
    }

    /**
     * Retrieve or import the class with a given qualified name.
     * @param name the qualified name of the class to retrieve or import
     * @return the ReflectedClassSymbol reflecting the existing class
     * @throws ClassNotFoundException if the class could not be imported
     */
    public static ReflectedClassSymbol getOrImport(String name) throws ClassNotFoundException {
        if (!isImported(name)) {
            cache.put(name, ReflectedClassSymbol.make(Class.forName(name)));
            cache.get(name).init();
        }
        return cache.get(name);
    }
}
