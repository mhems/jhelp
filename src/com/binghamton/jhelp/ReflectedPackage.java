package com.binghamton.jhelp;

public class ReflectedPackage extends Package {

    /**
     * Constructs a new ReflectedPackage with name `name`
     * @param pkg the existing package to reflect
     */
    public ReflectedPackage(java.lang.Package pkg) {
        super(pkg.getName());
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
