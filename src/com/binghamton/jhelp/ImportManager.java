package com.binghamton.jhelp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A class to manage imports in Java source programs.
 * Lazily populates cache associating symbol names to Class reflection Objects.
 * If a class is not found in the cache or by the ClassLoader, it is searched
 * for in the on demand packages, of which java.lang is contained in.
 */
public class ImportManager {
    private static final Set<String> autoImportPackages = new HashSet<>();
    private static final Set<String> autoImportSymbols = new HashSet<>();

    static {
        autoImportPackages.add("java.lang");
        autoImportSymbols.add("Object");
        autoImportSymbols.add("String");
    }

    private final Map<String, Class<?>> cache = new HashMap<>();
    private final Set<String> onDemandPackages = new HashSet<>(autoImportPackages);

    {
        for (String pkg : autoImportSymbols) {
            try {
                importSymbol(pkg);
            } catch(ClassNotFoundException e) {
                throw new RuntimeException("class " + pkg + " not found"); // TODO
            }
        }
    }

    /**
     * Attempt to add a package to the set of on demand packages
     * @param pkg the name of the package whose imports are to be on demand
     * @return true iff this package was not previously on demand,
     *         false otherwise
     */
    public boolean addOnDemandPackage(String pkg) {
        return onDemandPackages.add(pkg);
    }

    /**
     * Determines if a package name has been imported on demand
     * @param pkg the name of the package to query
     * @return true iff the package name has been imported on demand,
     *         false otherwise
     */
    public boolean isOnDemand(String pkg) {
        return onDemandPackages.contains(pkg);
    }

    /**
     * Determines if a symbol has been explicity imported
     * @param name the name of the symbol to query
     * @return true iff the symbol has been explicity imported,
     *         false otherwise
     */
    public boolean isImported(String name) {
        return cache.containsKey(name);
    }

    /**
     * Attempts to import the corresponding named symbol.  If the symbol is not
     * cached, attempts to import the symbol, first explicitly, then in any on
     * demand packages.
     * @param name the name of the symbol to import
     * @return the Class Object reflecting the symbol found
     * @throws ClassNotFoundException iff no such symbol can be found
     */
    public Class<?> importSymbol(String name) throws ClassNotFoundException {
        Class<?> cls = null;
        try {
            cls = getOrImport(name);
        } catch(ClassNotFoundException e) {
            for (String pkg : onDemandPackages) {
                try {
                    cache.put(name, getOrImport(pkg + '.' + name));
                    break;
                } catch(ClassNotFoundException _e) {
                    // squelched, parent exception re-raised below
                }
                if (cls == null) {
                    // since prefixing did not work, re-raise original exception
                    throw e;
                }
            }
        }
        return cls;
    }

    private Class<?> getOrImport(String name) throws ClassNotFoundException {
        if (!isImported(name)) {
            cache.put(name, Class.forName(name));
        }
        return cache.get(name);
    }
}
