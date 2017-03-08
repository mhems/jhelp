package com.binghamton.jhelp;

import java.lang.reflect.Field;
import java.lang.reflect.Executable;

/**
 * A class representing the abstract notion of a Java symbol
 * Java symbols include classes, enums, interfaces, methods, and variables
 */
public abstract class Symbol {
    public static enum SymbolKind {CLASS, METHOD, VARIABLE};
    public static enum AccessLevel {PUBLIC, PROTECTED, PACKAGE_PRIVATE, PRIVATE};

    protected static final ClassSymbol[] CLASS_ARRAY = null;
    protected static final MethodSymbol[] METHOD_ARRAY = null;
    protected static final VariableSymbol[] VARIABLE_ARRAY = null;

    protected SymbolKind kind;
    private String name;
    private AccessLevel access;
    private Modifiers modifiers;
    private AnnotationSymbol[] annotations;

    /**
     * Construct a named Symbol with default access and no modifiers
     * @param name the name of the symbol
     */
    public Symbol(String name) {
        this(name, new Modifiers());
    }

    public Symbol(String name, int modifiers) {
        this(name, Modifiers.fromEncodedModifier(modifiers));
    }

    /**
     * Construct a named Symbol with access level and modifiers
     * @param name the name of this Symbol
     * @param modifiers the modifiers of this Symbol
     */
    public Symbol(String name, Modifiers modifiers) {
        this.name = name;
        this.modifiers = modifiers;
        this.access = AccessLevel.PACKAGE_PRIVATE;
        for (Modifier modifier : modifiers.getModifiers()) {
            switch (modifier.getName()) {
            case "public":
                this.access = AccessLevel.PUBLIC;
                break;
            case "protected":
                this.access = AccessLevel.PROTECTED;
                break;
            case "private":
                this.access = AccessLevel.PRIVATE;
                break;
            }
        }
    }

    /**
     * Gets the name of this symbol
     * @return the name of this symbol
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the access level of this symbol
     * @return the access level of this symbol
     */
    public AccessLevel getAccessLevel() {
        return access;
    }

    /**
     * Gets the modifiers of this symbol
     * @return the modifiers of this symbol
     */
    public Modifiers getModifiers() {
        return modifiers;
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    /**
     * Sets the access level of this symbol
     * @param lvl the level of this symbol
     */
    public void setAccessLevel(AccessLevel lvl) {
        access = lvl;
    }

    /**
     * Determines the specific kind of Symbol of this instance
     * @return the specific kind of Symbol of this instance
     */
    public SymbolKind getKind() {
        return kind;
    }

    /**
     * Attempts to add modifier to this symbol's modifiers
     * @param modifier the modifier to attempt to add
     * @return true iff modifier successfully added
     */
    public boolean addModifier(Modifier modifier) {
        return modifiers.addModifier(modifier);
    }

    /**
     * Gets the number of modifiers of this symbol
     * @return the number of modifiers of this symbol
     */
    public int numModifiers() {
        return modifiers.getModifiers().size();
    }

    /**
     * Determines if this symbol is equivalent to another symbol
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent to `other`
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Symbol) {
            Symbol sym = (Symbol)other;
            return name.equals(sym.name) &&
                kind == sym.kind;
        }
        return false;
    }

    /**
     * Determines the hash code of this symbol
     * @return the hash code of this symbol
     */
    @Override
    public int hashCode() {
        return name.hashCode() ^ access.hashCode() ^ modifiers.hashCode();
    }

    public String repr() {
        return name;
    }

    protected static ClassSymbol[] fromClasses(Class<?>[] classes) {
        ClassSymbol[] syms = new ClassSymbol[classes.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = new ReflectedClassSymbol(classes[i]);
        }
        return syms;
    }

    protected static MethodSymbol[] fromMethods(Executable[] methods) {
        MethodSymbol[] syms = new MethodSymbol[methods.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = new ReflectedMethodSymbol(methods[i]);
        }
        return syms;
    }

    protected static VariableSymbol[] fromFields(Field[] fields) {
        VariableSymbol[] syms = new VariableSymbol[fields.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = new ReflectedVariableSymbol(fields[i]);
        }
        return syms;
    }
}
