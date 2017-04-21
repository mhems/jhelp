package com.binghamton.jhelp.util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    public static final SymbolFinder EMPTY_FINDER = new SymbolFinder() {
            public List<String> search(String name) {
                return EMPTY;
            }
        };
    private static final List<String> EMPTY = new ArrayList<>();
    private static final String EXT = "class";
    private final Map<String, List<String>> cache = new HashMap<>();

    /**
     * Construct a SymbolFinder with the name of a jar file
     * @param path the Path pointing to the jar file to search through
     * @throws IOException if an I/O exception occurs during processing
     */
    public SymbolFinder(Path path) throws IOException {
        JarFile rt_jar = new JarFile(path.toFile());
        if (rt_jar != null) {
            ArrayList<String> tokens = new ArrayList<>();
            String curname, cls, pkg, ext;
            int nDirs;
            Path tmpPath;
            String[] parts;
            for (Enumeration<JarEntry> e = rt_jar.entries();
                 e.hasMoreElements();)
            {
                tmpPath = Paths.get(e.nextElement().getName());
                nDirs = tmpPath.getNameCount();
                parts = tmpPath.getName(nDirs - 1).toString().split("\\.");
                if (parts.length == 2) {
                    cls = parts[0];
                    if (parts[1].equals(EXT)) {
                        pkg = "";
                        for (int i = 0; i < nDirs - 2; i++) {
                            pkg += tmpPath.getName(i).toString() + ".";
                        }
                        pkg += tmpPath.getName(nDirs - 2).toString();
                        if (!cache.containsKey(cls)) {
                            cache.put(cls, new ArrayList<>());
                        }
                        cache.get(cls).add(pkg);
                    }
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
        List<String> ret = cache.get(name);
        if (ret == null) {
            throw new IllegalArgumentException(name + " does not exist");
        }
        return ret;
    }

    /**
     * Default constructor
     */
    private SymbolFinder() {
        // prevent public instantiation
    }
}
