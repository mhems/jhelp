package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.util.DiGraph;
import com.binghamton.jhelp.util.StringUtils;

public class Program {
    private final List<MyPackage> packages = new ArrayList<>();
    private final List<CompilationUnit> units = new ArrayList<>();
    private List<ClassSymbol> classes;

        {
            packages.add(MyPackage.DEFAULT_PACKAGE);
        }

    public void addCompilationUnit(CompilationUnit unit) {
        units.add(unit);
    }

    public List<CompilationUnit> getCompilationUnits() {
        return units;
    }

    public boolean hasPackage(String name) {
        return getPackage(name) != null;
    }

    public Package getPackage(String name) {
        java.lang.Package existingPkg = java.lang.Package.getPackage(name);
        if (existingPkg != null) {
            return new ReflectedPackage(existingPkg);
        }
        MyPackage pkg = null;
        List<MyPackage> pkgs = packages;
        for (String part : name.split("\\.")) {
            for (MyPackage p : pkgs) {
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

    public void addPackage(MyPackage pkg) {
        packages.add(pkg);
    }

    public List<MyPackage> getPackages() {
        return packages;
    }

    public String repr() {
        return StringUtils.join("\n", packages, p -> p.repr());
    }

    public List<ClassSymbol> getAllClasses() {
        if (classes == null) {
            gatherClasses();
        }
        return classes;
    }

    public void gatherClasses() {
        classes = new ArrayList<>();
        for (MyPackage pkg: packages) {
            gatherClasses(pkg);
        }
    }

    private void gatherClasses(MyPackage pkg) {
        for (ClassSymbol cls : pkg.getClassTable()) {
            classes.add(cls);
        }
        for (MyPackage subPkg : pkg.getSubPackages()) {
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

    public void topologicalSort() {
        DiGraph<ClassSymbol> graph = new DiGraph<>();
        constructGraph(graph);
        List<ClassSymbol> ret = graph.topologicalSort();
        if (ret == null) {
            System.err.println("cyclic inheritance hierarchy");
        } else {
            Collections.reverse(ret);
            classes = ret;
        }
    }
}
