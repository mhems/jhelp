package com.binghamton.jhelp;

import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.util.Logger;

/**
 * A class to represent a pre-compiled Package
 */
public class ReflectedPackage extends Package {

    /**
     * Constructs a new ReflectedPackage
     * @param pkg the pre-compiled package to reflect
     */
    public ReflectedPackage(java.lang.Package pkg) {
        super(pkg.getName());
    }

    /**
     * Gets a class of this Package by name
     * @param name the name of the class to get
     * @return the class this Package declares with the given name
     */
    @Override
    public ClassSymbol getClass(String name) {
        ClassSymbol ret = null;
        try {
            ret = ImportManager.getOrImport(this.name + "." + name);
        } catch(ClassNotFoundException e) {
            Logger.log(e);
        }
        return ret;
    }
}
