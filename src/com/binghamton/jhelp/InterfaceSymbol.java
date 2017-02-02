package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

/**
 * A class representing a Java interface and its members
 */
public class InterfaceSymbol extends Symbol {
    private Package pkg = Package.DEFAULT_PACKAGE;
    private Set<InterfaceSymbol> superInterfaces = new TreeSet<>();
    private Set<VariableSymbol> fields = new TreeSet<>();
    private Set<MethodSymbol> methods = new TreeSet<>();

    /**
     * Constructs a new named interface symbol
     * @param id the name of the interface
     */
    public InterfaceSymbol(String id) {
        super(id);
    }

    /**
     * Gets this interface's parent interfaces
     * @return this interface's parent interfaces
     */
    public Set<InterfaceSymbol> getSuperInterfaces() {
        return superInterfaces;
    }

    /**
     * Gets this interface's fields
     * @return this interface's fields
     */
    public Set<VariableSymbol> getFields() {
        return fields;
    }

    /**
     * Gets this interface's methods
     * @return this interface's methods
     */
    public Set<MethodSymbol> getMethods() {
        return methods;
    }

    /**
     * Gets the package this interface resides in
     * @return the package this interface resides in
     */
    public Package getPackage() {
        return pkg;
    }

    /**
     * Attempts to add an interface that this interface implements
     * @param intrf the interface this interface implements
     * @return true iff intrf was successfully added
     */
    public boolean addInterface(InterfaceSymbol intrf) {
        return superInterfaces.add(intrf);
    }

    /**
     * Attempts to add a field within this interface
     * @param field the field within this interface
     * @return true iff field was successfully added
     */
    public boolean addField(VariableSymbol field) {
        return fields.add(field);
    }

    /**
     * Attempts to add a method within this interface
     * @param method the method within this interface implements
     * @return true iff method was successfully added
     */
    public boolean addMethod(MethodSymbol method) {
        return methods.add(method);
    }

    /**
     * Sets the package this interface resides in
     * @param pkg the package this interface resides in
     */
    public void setPackage(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Gets the number of interfaces this interface extends
     * @return the number of interfaces this interface extends
     */
    public int numSuperInterfaces() {
        return superInterfaces.size();
    }

    /**
     * Gets the number of fields this interface has
     * @return the number of fields this interface has
     */
    public int numFields() {
        return fields.size();
    }

    /**
     * Gets the number of methods this interface has
     * @return the number of methods this interface has
     */
    public int numMethods() {
        return methods.size();
    }

    /**
     * Determines if this interface is equivalent to another
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            if (other instanceof InterfaceSymbol) {
                InterfaceSymbol intrf = (InterfaceSymbol)other;
                return superInterfaces.equals(intrf.superInterfaces) &&
                    fields.equals(intrf.fields) &&
                    methods.equals(intrf.methods) &&
                    pkg.equals(intrf.pkg);
            }
        }
        return false;
    }

    /**
     * Determines the hash code of this interface
     * @return the hash code of this interface
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ superInterfaces.hashCode() ^
            fields.hashCode() ^ methods.hashCode() ^ pkg.hashCode();
    }
}
