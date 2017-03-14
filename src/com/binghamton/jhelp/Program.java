package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;;

public class Program {
    private List<Package> packages = new ArrayList<>();

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
        Package pkg = null;
        List<Package> pkgs = packages;
        for (String part : name.split("\\.")) {
            for (Package p : pkgs) {
                if (p.getName().equals(part)) {
                    pkg = p;
                    if (p.hasSubPackages()) {
                        pkgs = pkg.getSubPackages();
                    }
                    break;
                }
            }
        }
        return pkg;
    }

    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    public List<Package> getPackages() {
        return packages;
    }
}
