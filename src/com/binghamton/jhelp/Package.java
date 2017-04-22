package com.binghamton.jhelp;

/**
 * A base class representing a Java package
 */
public abstract class Package {
    protected String name;

    /**
     * Constructs a new Package with name `name`
     * @param name the name of the package
     */
    public Package(String name) {
        this.name = name;
    }

    /**
     * Gets a class of this Package by name
     * @param name the name of the class to get
     * @return the class this Package declares with the given name
     */
    public abstract ClassSymbol getClass(String name);

    /**
     * Gets the name of this package
     * @return the name of this package
     */
    public String getName() {
        return name;
    }

    /**
     * Builds the qualified name of this Package
     * @return the qualified name of this Package
     */
    public String getQualifiedName() {
        return getName();
    }

    /**
     * Determines if this package is the default package
     * @return true iff this package is the default package
     */
    public boolean isDefault() {
        return false;
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

    /**
     * Builds the String representation of this Package
     * @return the String representation of this Package
     */
    public String repr() {
        return getName();
    }
}
