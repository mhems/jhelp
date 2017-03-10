package com.binghamton.jhelp;

import java.util.Set;
import java.util.HashSet;

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
    private SymbolTable<ClassSymbol> classes = new SymbolTable<>();
    private Package parent;
    private Set<Package> children = new HashSet<>();

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

    public void addClass(ClassSymbol cls) {
        classes.put(cls);
    }

    public SymbolTable<ClassSymbol> getClassTable() {
        return classes;
    }

    /**
     * Gets the packages within this package
     * @return the packages within this package
     */
    public Set<Package> getSubPackages() {
        return children;
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
     * @return true iff the package was added, false otherwise
     */
    public boolean addSubPackage(Package subPkg) {
        return children.add(subPkg);
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
            return getQualifiedName().equals(((Package)other).getQualifiedName());
        }
        return false;
    }

    public String repr() {
        StringBuilder sb = new StringBuilder("package ");
        sb.append(name);
        sb.append("\n");
        sb.append("declares:\n");
        sb.append(classes.repr());
        sb.append("\n");
        sb.append("has children: ");
        for (Package cp : children) {
            sb.append("  ");
            sb.append(cp.repr());
            sb.append("\n");
        }
        return sb.toString();
    }
}
