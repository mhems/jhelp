package com.binghamton.jhelp;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A base class representing a Java class and its members
 */
public abstract class ClassSymbol extends Symbol implements Type {

        {
            kind = SymbolKind.CLASS;
        }

    /**
     * Construct a new ClassSymbol
     * @param name the name of this class symbol
     */
    public ClassSymbol(String name) {
        super(name);
    }

    public ClassSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct a new ClassSymbol with modifiers
     * @param name the name of this ClassSymbol
     * @param modifiers the modifiers of this ClassSymbol
     */
    public ClassSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public abstract ClassSymbol[] getInterfaces();
    public abstract Type getSuperClass();
    public abstract MethodSymbol[] getMethods();
    public abstract ConstructorSymbol[] getConstructors();
    public abstract VariableSymbol[] getFields();
    public abstract boolean isEnum();
    public abstract boolean isClass();
    public abstract boolean isInterface();
    public abstract boolean isAnnotation();
    public abstract TypeVariable[] getTypeParameters();
    public abstract boolean isAnonymous();
    public abstract boolean isInnerClass();
    public abstract boolean isBoxed();
    public abstract PrimitiveType unbox();
    public abstract String getPackageName();
    public abstract Package getPackage();

    public boolean equals(Object other) {
        if (other instanceof ClassSymbol) {
            ClassSymbol sym = (ClassSymbol)other;
            return getQualifiedName().equals(sym.getQualifiedName());
        }
        return false;
    }

    public int hashCode() {
        return getQualifiedName().hashCode();
    }

    public boolean hasTypeParameters() {
        return getTypeParameters().length > 0;
    }

    public boolean hasSuperClass() {
        return getSuperClass() != null;
    }

    public boolean hasInterfaces() {
        return getInterfaces().length > 0;
    }

    public String getQualifiedName() {
        return getPackageName() + "." + getName();
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(getName());
        if (hasTypeParameters()) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       getTypeParameters(),
                                       tp -> tp.getTypeName()));
            sb.append(">");
        }
        if (isClass() && hasSuperClass()) {
            sb.append(" extends ");
            sb.append(getSuperClass().getTypeName());
        }
        if (hasInterfaces()) {
            if (isClass() || isEnum()) {
                sb.append(" implements ");
            } else {
                sb.append(" extends ");
            }
            sb.append(StringUtils.join(", ",
                                       getInterfaces(),
                                       c -> c.getTypeName()));
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getModifiers().toString());
        if (isEnum()) {
            sb.append("enum");
        } else if (isInterface()) {
            sb.append("interface");
        } else if (isAnnotation()) {
            sb.append("@interface");
        } else {
            sb.append("class");
        }
        sb.append(" ");
        sb.append(getPackageName());
        sb.append(getTypeName());
        return sb.toString();
    }
}
