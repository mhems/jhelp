package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

import com.binghamton.jhelp.ast.NilBlock;
import com.binghamton.jhelp.ast.Block;

/**
 * A class representing a Java class and its members
 */
public class ClassSymbol extends Symbol {
    private ClassSymbol superClass; // TODO Object class
    private Set<InterfaceSymbol> implementees = new TreeSet<>();
    private Set<VariableSymbol> fields = new TreeSet<>();
    private Set<MethodSymbol> methods = new TreeSet<>();
    private Block staticInit = new NilBlock();
    private Package pkg = Package.DEFAULT_PACKAGE;

    /**
     * Construct a new ClassSymbol
     * @param id the name of this class symbol
     */
    public ClassSymbol(String id) {
        super(id);
    }

    /**
     * Gets this class's super class
     * @return this class's super class
     */
    public ClassSymbol getSuperClass() {
        return superClass;
    }

    /**
     * Gets the interfaces this class implements
     * @return the interfaces this class implements
     */
    public Set<InterfaceSymbol> getInterfaces() {
        return implementees;
    }

    /**
     * Gets this class's fields
     * @return this class's fields
     */
    public Set<VariableSymbol> getFields() {
        return fields;
    }

    /**
     * Gets this class's methods
     * @return this class's methods
     */
    public Set<MethodSymbol> getMethods() {
        return methods;
    }

    /**
     * Gets this class's static initializer block
     * @return this class's static initializer block
     */
    public Block getStaticInitializer() {
        return staticInit;
    }

    /**
     * Gets the package this class resides in
     * @return the package this class resides in
     */
    public Package getPackage() {
        return pkg;
    }

    /**
     * Sets the superclass of this class
     * @param cls the class that is the superclass of this class
     */
    public void setSuperClass(ClassSymbol cls) {
        superClass = cls;
    }

    /**
     * Attempts to add an interface that this class implements
     * @param intrf the interface this class implements
     * @return true iff intrf was successfully added
     */
    public boolean addInterface(InterfaceSymbol intrf) {
        return implementees.add(intrf);
    }

    /**
     * Attempts to add a field within this class
     * @param field the field within this class
     * @return true iff field was successfully added
     */
    public boolean addField(VariableSymbol field) {
        return fields.add(field);
    }

    /**
     * Attempts to add a method within this class
     * @param method the method within this class implements
     * @return true iff method was successfully added
     */
    public boolean addMethod(MethodSymbol method) {
        return methods.add(method);
    }

    /**
     * Sets the static initializer block of this class
     * @param block the block of this class's static initializer
     */
    public void setStaticInitializer(Block block) {
        staticInit = block;
    }

    /**
     * Sets the package this class resides in
     * @param pkg the package this class resides in
     */
    public void setPackage(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Gets the number of interfaces this class implements
     * @return the number of interfaces this class implements
     */
    public int numInterfaces() {
        return implementees.size();
    }

    /**
     * Gets the number of fields this class has
     * @return the number of fields this class has
     */
    public int numFields() {
        return fields.size();
    }

    /**
     * Gets the number of methods this class has
     * @return the number of methods this class has
     */
    public int numMethods() {
        return methods.size();
    }

    /**
     * Determines if this class is equivalent to another
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            if (other instanceof ClassSymbol) {
                ClassSymbol cls = (ClassSymbol)other;
                return superClass.equals(cls.superClass) &&
                    implementees.equals(cls.implementees) &&
                    fields.equals(cls.fields) &&
                    methods.equals(cls.methods) &&
                    staticInit.equals(cls.staticInit) &&
                    pkg.equals(cls.pkg);
            }
        }
        return false;
    }

    /**
     * Determines the hash code of this class
     * @return the hash code of this class
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ implementees.hashCode() ^ fields.hashCode() ^
            methods.hashCode() ^ pkg.hashCode();
    }
}
