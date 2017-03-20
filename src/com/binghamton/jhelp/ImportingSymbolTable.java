package com.binghamton.jhelp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImportingSymbolTable extends SymbolTable<ClassSymbol> {
    private static final ImportingSymbolTable ROOT = new ImportingSymbolTable();

    static {
        ROOT.importTypesOnDemand("java.lang");
    }

    private final Set<String> onDemandPackages = new HashSet<>();

    @Override
    public ClassSymbol get(String name) {
        ClassSymbol ret = getCurrentScope(name);
        if (ret == null) {
            ClassSymbol cls = null;
            for (String pkg : onDemandPackages) {
                try {
                    cls = ImportManager.getOrImport(pkg + "." + name);
                } catch(ClassNotFoundException e) {
                    // squelch - on-demand is a non-error
                }
                if (cls != null) {
                    put(cls);
                    ret = cls;
                }
            }
        }
        if (ret == null && this != ROOT) {
            ret = ROOT.get(name);
        }
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

    public boolean importType(String classname) {
        ReflectedClassSymbol cls = null;
        try {
            cls = ImportManager.getOrImport(classname);
        } catch(ClassNotFoundException e) {
            System.err.println("could not import " + classname);
        }
        if (cls != null) {
            if (!put(cls)) {
                if (!get(classname).equals(cls)) {
                    System.err.println("cannot import two different classes with same name");
                }
            }
        }
        return cls != null;
    }

    public boolean importTypesOnDemand(String classname) {
        onDemandPackages.add(classname);
        return true;
    }
}
