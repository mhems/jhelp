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
    private static final Set<String> autoImportPackageNames = new HashSet<>();
    private static final Map<String, ReflectedClassSymbol> cache = new HashMap<>();

    static {
        autoImportPackageNames.add("java.lang");
        try {
            getOrImport("java.lang.Object");
            getOrImport("java.lang.String");
            getOrImport("java.lang.Enum");
            getOrImport("java.lang.annotation.Annotation");
        } catch (ClassNotFoundException e) {
            System.err.println("FATAL ERROR");
            e.printStackTrace();
        }
    }

    private final Set<String> onDemandPackages = new HashSet<>(autoImportPackageNames);
    private final Map<String, String> staticMap = new HashMap<>();
    private final Set<String> onDemandStaticPackages = new HashSet<>();

    /**
     * Determines if a symbol has been explicity imported
     * @param name the name of the symbol to query
     * @return true iff the symbol has been explicity imported,
     *         false otherwise
     */
    public static boolean isImported(String name) {
        return cache.containsKey(name);
    }

    public static ReflectedClassSymbol get(String name) {
        if (!isImported(name)) {
            throw new IllegalArgumentException("can only retrieve symbols that have already been imported");
        }
        return cache.get(name);
    }

    public static ReflectedClassSymbol getOrImport(String name)
        throws ClassNotFoundException {
        if (!isImported(name)) {
            cache.put(name, new ReflectedClassSymbol(Class.forName(name)));
            cache.get(name).init();
        }
        return cache.get(name);
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

    public boolean addOnDemandStaticPackage(String pkg) {
        return onDemandStaticPackages.add(pkg);
    }

    public void addStaticImport(String typename, String identifier) {
        staticMap.put(typename, identifier);
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
     * Attempts to import the corresponding named symbol.  If the symbol is not
     * cached, attempts to import the symbol, first explicitly, then in any on
     * demand packages.
     * @param name the name of the symbol to import
     * @return the Class Object reflecting the symbol found
     * @throws ClassNotFoundException iff no such symbol can be found
     */
    public ReflectedClassSymbol importSymbol(String name) throws ClassNotFoundException {
        ReflectedClassSymbol cls = null;
        try {
            cls = getOrImport(name);
        } catch(ClassNotFoundException e) {
            for (String pkg : onDemandPackages) {
                try {
                    cls = getOrImport(pkg + "." + name);
                    cache.put(name, cls);
                    break;
                } catch(ClassNotFoundException _e) {
                    // squelched, parent exception re-raised below
                }
            }
            if (cls == null) {
                // since prefixing did not work, re-raise original exception
                throw e;
            }
        }
        return cls;
    }
}
