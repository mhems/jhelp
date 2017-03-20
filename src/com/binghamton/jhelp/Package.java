package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a Java package
 */
public class Package {
    public static final Package DEFAULT_PACKAGE = new Package("<DEFAULT>") {
            public boolean isDefault() {
                return true;
            }
        };

    private String name;
    private NamedSymbolTable<ClassSymbol> classes = new NamedSymbolTable<>();
    private Package parent;
    private List<Package> children = new ArrayList<>();
    private AnnotationSymbol[] annotations = {};

    /**
     * Constructs a new Package with name `name`
     * @param name the name of the package
     */
    public Package(String name) {
        this.name = name;
    }

    public Package makeChildPackage(String childName) {
        Package child = new Package(childName);
        child.parent = this;
        addSubPackage(child);
        return child;
    }

    /**
     * Gets the name of this package
     * @return the name of this package
     */
    public String getName() {
        return name;
    }

    public void setParent(Package pkg) {
        parent = pkg;
    }

    public boolean hasParent() {
        return parent != null;
    }

    public String getQualifiedName() {
        String qname = getName();
        if (hasParent()) {
            qname = parent.getQualifiedName() + "." + qname;
        }
        return qname;
    }

    public boolean addClass(ClassSymbol cls) {
        return classes.put(cls);
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    public NamedSymbolTable<ClassSymbol> getClassTable() {
        return classes;
    }

    /**
     * Gets the packages within this package
     * @return the packages within this package
     */
    public List<Package> getSubPackages() {
        return children;
    }

    public boolean hasSubPackages() {
        return children.size() > 0;
    }

    public Package getSubPackage(String name) {
        for (Package p : children) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Determines if this package is the default package
     * @return true iff this package is the default package
     */
    public boolean isDefault() {
        return false;
    }

    /**
     * Attempts to add a subpackage to the package
     * @param subPkg the package to attempt to add
     */
    public void addSubPackage(Package subPkg) {
        children.add(subPkg);
    }

    /**
     * Computes the hash code of this package
     * @return the hash code of this package
     */
    @Override
    public int hashCode() {
        return getQualifiedName().hashCode();
    }

    /**
     * Determines if this package is equivalent to another package
     * @param other the other Object to compare against
     * @return true iff this package is equivalent to `other`
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Package) {
            Package pkg = (Package)other;
            return getQualifiedName().equals(pkg.getQualifiedName());
        }
        return false;
    }

    public String repr() {
        StringBuilder sb = new StringBuilder("package ");
        sb.append(name);
        sb.append("\n");
        sb.append("declares:\n");
        sb.append(classes.repr());
        if (hasSubPackages()) {
            sb.append("\nhas children: \n");
            for (Package cp : children) {
                sb.append(cp.repr());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
