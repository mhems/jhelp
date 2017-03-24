package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.util.DiGraph;
import com.binghamton.jhelp.util.StringUtils;

public class Program {
    private List<Package> packages = new ArrayList<>();
    private List<CompilationUnit> units = new ArrayList<>();
    private List<ClassSymbol> classes;

        {
            packages.add(Package.DEFAULT_PACKAGE);
        }

    public void addCompilationUnit(CompilationUnit unit) {
        units.add(unit);
    }

    public List<CompilationUnit> getCompilationUnits() {
        return units;
    }

    public boolean isAcyclicHierarchy() {
        DiGraph<ClassSymbol> graph = new DiGraph<>();
        constructGraph(graph);
        return graph.isAcyclic();
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

    public String repr() {
        return StringUtils.join("\n", packages, p -> p.repr());
    }

    public List<ClassSymbol> getAllClasses() {
        return classes;
    }

    public void gatherClasses() {
        classes = new ArrayList<>();
        for (Package pkg: packages) {
            gatherClasses(pkg);
        }
    }

    private void gatherClasses(Package pkg) {
        for (ClassSymbol cls : pkg.getClassTable()) {
            classes.add(cls);
            for (ClassSymbol inner : cls.getInnerClasses()) {
                if (!inner.isAnonymous()) {
                    classes.add(inner);
                }
            }
        }
        for (Package subPkg : pkg.getSubPackages()) {
            gatherClasses(subPkg);
        }
    }

    private void constructGraph(DiGraph<ClassSymbol> graph) {
        if (classes == null) {
            gatherClasses();
        }
        for (ClassSymbol cls : classes) {
            if (cls.hasSuperClass()) {
                graph.addEdge(cls, cls.getSuperClass().getClassSymbol());
            }
            for (Type type : cls.getInterfaces()) {
                graph.addEdge(cls, type.getClassSymbol());
            }
        }
    }
}
