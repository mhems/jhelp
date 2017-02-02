package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

/**
 * A class representing a Java package
 */
public class Package {
    public static final Package DEFAULT_PACKAGE = new Package("");
    private String name;
    private Set<Symbol> symbols = new TreeSet<>();
    private Set<Package> subpackages = new TreeSet<>();

    /**
     * Constructs a new Package with name `name`
     * @param name the name of the package
     */
    public Package(String name) {
        this.name = name;
    }

    /**
     * Gets the name of this package
     * @return the name of this package
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the symbols within this package
     * @return the symbols within this package
     */
    public Set<Symbol> getSymbols() {
        return symbols;
    }

    /**
     * Gets the packages within this package
     * @return the packages within this package
     */
    public Set<Package> getSubPackages() {
        return subpackages;
    }

    /**
     * Determines if this package is the default package
     * @return true iff this package is the default package
     */
    public boolean isDefault() {
        return this.equals(DEFAULT_PACKAGE);
    }

    /**
     * Attempts to add a symbol to the package
     * @param sym the symbol to attempt to add
     * @return true iff the symbol was added, false otherwise
     */
    public boolean addSymbol(Symbol sym) {
        return symbols.add(sym);
    }

    /**
     * Attempts to add a subpackage to the package
     * @param subPkg the package to attempt to add
     * @return true iff the package was added, false otherwise
     */
    public boolean addSubPackage(Package subPkg) {
        return subpackages.add(subPkg);
    }

    /**
     * Gets the number of symbols within this package
     * @return the number of symbols within this package
     */
    public int numSymbols() {
        return symbols.size();
    }

    /**
     * Gets the number of packages within this package
     * @return the number of packages within this package
     */
    public int numSubPackages() {
        return subpackages.size();
    }

    /**
     * Computes the hash code of this package
     * @return the hash code of this package
     */
    @Override
    public int hashCode() {
        return name.hashCode() ^ symbols.hashCode() ^ subpackages.hashCode();
    }

    /**
     * Determines if this package is equivalent to another package
     * @param other the other Object to compare against
     * @return true iff this package is equivalent to `other`
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Package) {
            Package otherPkg = (Package)other;
            return name.equals(otherPkg.name) &&
                symbols.equals(otherPkg.symbols) &&
                subpackages.equals(otherPkg.subpackages);
        }
        return false;
    }
}
