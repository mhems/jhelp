package com.binghamton.jhelp.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * A utility class to search for Java classes within a jar file.
 */
public class SymbolFinder {
    private static final String EXT = ".class";
    private JarFile rt_jar;
    private Map<String, List<String>> cache = new HashMap<>();

    /**
     * Construct a SymbolFinder with the name of a jar file
     * @param filename the name of the jar file to search through
     */
    public SymbolFinder(String filename) {
        try {
            rt_jar = new JarFile(new File(filename));
        } catch(IOException e) {
            e.printStackTrace();
        }
        if (rt_jar != null) {
            ArrayList<String> tokens = new ArrayList<>();
            String curname, cls, pkg;
            for (Enumeration<JarEntry> e = rt_jar.entries();
                 e.hasMoreElements();)
            {
                curname = e.nextElement().getName();
                if (curname.endsWith(EXT)) {
                    curname = curname.substring(0,
                                                curname.length() - EXT.length());
                    tokens.clear();
                    tokens.addAll(Arrays.asList(curname.split("/")));
                    cls = tokens.get(tokens.size()-1);
                    tokens.remove(tokens.size()-1);
                    pkg = String.join(".", tokens);
                    if (!cache.containsKey(cls)) {
                        cache.put(cls, new ArrayList<>());
                    }
                    cache.get(cls).add(pkg);
                }
            }
        }
    }

    /**
     * Gets the packages that contain a class named `name`
     * @param name the name of the class to search for
     * @return a list of packages containing a `name` class
     *         null if no packages contain a `name` class
     */
    public List<String> search(String name) {
        return cache.get(name);
    }
}
