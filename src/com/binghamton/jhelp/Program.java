package com.binghamton.jhelp;

import java.util.Set;
import java.util.HashSet;

public class Program {
    private Set<Package> packages = new HashSet<>();

        {
            packages.add(Package.DEFAULT_PACKAGE);
        }

    public boolean hasPackage(String name) {
        for (Package pkg : packages) {
            if (pkg.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Package getPackage(String name) {
        for (Package pkg : packages) {
            if (pkg.getName().equals(name)) {
                return pkg;
            }
        }
        return null;
    }

    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    public Set<Package> getPackages() {
        return packages;
    }
}
