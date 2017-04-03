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
    private static final Map<String, ReflectedClassSymbol> cache = new HashMap<>();

    // static {
    //     String[] names = {"java.lang.Object", "java.lang.String",
    //                       "java.lang.Enum", "java.lang.annotation.Annotation",
    //                       "java.lang.Throwable", "java.lang.Override"};
    //     for (String name : names) {
    //         try {
    //             getOrImport(name);
    //         } catch (ClassNotFoundException e) {
    //             System.err.println("error initializing established class: " + name);
    //         }
    //     }
    // }

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
            throw new IllegalArgumentException(name + " is not in the cache");
        }
        return cache.get(name);
    }

    public static ReflectedClassSymbol getOrImport(String name) throws ClassNotFoundException {
        if (!isImported(name)) {
            cache.put(name, new ReflectedClassSymbol(Class.forName(name)));

            cache.get(name).init();
        }
        return cache.get(name);
    }
}
