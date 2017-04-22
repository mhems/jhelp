package com.binghamton.jhelp;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import com.binghamton.jhelp.util.SymbolFinder;

/**
 * A SymbolTable where ClassSymbols that are not found are attempted to be
 * imported.
 */
public class ImportingSymbolTable extends NamedSymbolTable<ClassSymbol> {
    private static final ImportingSymbolTable ROOT = new ImportingSymbolTable(cls -> cls.getQualifiedName());
    private static SymbolFinder FINDER;

    static {
        ROOT.importTypesOnDemand("java.lang");
        String javaHome = System.getProperty("java.home");
        Path jarPath = Paths.get(javaHome, "lib", "rt.jar");
        try {
            FINDER = new SymbolFinder(jarPath);
        } catch(IOException e) {
            FINDER = SymbolFinder.EMPTY_FINDER;
        }
    }

    private final Set<String> onDemandPackages = new HashSet<>();

    /**
     * Constructs a new ImportingSymbolTable
     */
    public ImportingSymbolTable() {

    }


    /**
     * Constructs a new ImportingSymbolTable
     * @param valueToKey that function that maps a symbol to its key
     */
    private ImportingSymbolTable(Function<ClassSymbol, String> valueToKey) {
        super(valueToKey);
    }

    /**
     * Fetch a pre-compiled class's ClassSymbol
     * @param name the name of pre-compiled class. May be unqualified
     *        if the class is imported on-demand.
     * @return the ClassSymbol reflecting the pre-compiled class
     */
    public static ClassSymbol fetch(String name) {
        return ROOT.get(name);
    }

    @Override
    public ClassSymbol get(String name) {
        ClassSymbol ret = getFromTable(name);
        if (ret == null) {
            ClassSymbol cls = null;
            try {
                cls = ImportManager.getOrImport(name);
            } catch(ClassNotFoundException e) {
                // squelch, still other options to try
            }
            if (cls != null) {
                return cls;
            }
            for (String pkg : onDemandPackages) {
                cls = getFromTable(pkg + "." + name);
                if (cls != null) {
                    return cls;
                }
            }
            String qName;
            for (String pkg : onDemandPackages) {
                qName = pkg + "." + name;
                try {
                    cls = ImportManager.getOrImport(qName);
                } catch(ClassNotFoundException e) {
                    // squelch - on-demand is a non-error
                }
                if (cls != null) {
                    if (!hasInCurrentScope(qName)) {
                        put(cls);
                    }
                    return cls;
                }
            }
        }
        if (ret == null && this != ROOT) {
            ret = ROOT.get(name);
        }
        // TODO need way to distinguish between when we're classifying package
        // vs type name where failed lookup is non-error and failure is crucial
        // to classification and case where we're looking for an unqualified
        // type the user forgot to import

        // if (ret == null) {
        //     System.err.println("unknown symbol " + name + ", checking options...");
        //     List<String> results = FINDER.search(name);
        //     if (results.size() > 0) {
        //         System.err.println("looks like you forgot to import " + name);
        //         if (results.size() > 1) {
        //             System.err.println("you can import it from the following packages:");
        //             results.forEach(s -> System.err.println("  * " + s));
        //             System.err.println("not sure which one you mean, exiting");
        //         } else {
        //             String toImport = results.get(0) + "." + name;
        //             System.err.println("importing " + toImport);
        //             try {
        //                 ret = ImportManager.getOrImport(toImport);
        //             } catch (ClassNotFoundException e) {
        //                 System.err.println("could not import " + toImport);
        //             }
        //         }
        //     }
        // }
        return ret;
    }

    /**
     * Determines if a package name has been imported on demand
     * @param pkg the name of the package to query
     * @return true iff the package name has been imported on demand,
     *         false otherwise
     */
    public boolean hasOnDemand(String pkg) {
        return onDemandPackages.contains(pkg);
    }

    /**
     * Imports a class type into this table
     * @param classname the name of the class to try to import
     * @return true iff the import was successful
     */
    public boolean importType(String classname) {
        ReflectedClassSymbol cls = null;
        try {
            cls = ImportManager.getOrImport(classname);
        } catch(ClassNotFoundException e) {
            System.err.println("could not import " + classname);
        }
        if (cls != null &&
            !put(cls) &&
            !get(classname).equals(cls)) {
            System.err.println("cannot import two different classes with same name");
        }
        return cls != null;
    }

    /**
     * Imports a class type on demand.
     * @param classname the name of the class to import-on-demand
     * @return true; this operation always succeeds
     */
    public boolean importTypesOnDemand(String classname) {
        onDemandPackages.add(classname);
        return true;
    }
}
