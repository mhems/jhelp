package com.binghamton.jhelp;

public class ReflectedPackage extends Package {
    /**
     * Constructs a new ReflectedPackage with name `name`
     * @param name the name of the package
     */
    public ReflectedPackage(String name) {
        super(name);
    }

    public ClassSymbol getClass(String name) {
        ClassSymbol ret = null;
        try {
            ret = ImportManager.getOrImport(this.name + "." + name);
        } catch(ClassNotFoundException e) {
            // squelched
        }
        return ret;
    }
}
