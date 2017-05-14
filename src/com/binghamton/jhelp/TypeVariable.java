package com.binghamton.jhelp;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.Map;

import com.binghamton.jhelp.util.StringUtils;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends ReferenceType {
    private Type[] bounds = {};
    private Symbol declarer;
    private int index = -1;

    /**
     * Constructs a new named TypeVariable
     * @param var the pre-compiled TypeVariable to reflect
     */
    public TypeVariable(java.lang.reflect.TypeVariable<?> var) {
        this(var.getName());
        GenericDeclaration decl = var.getGenericDeclaration();
        Class<?> declCls = null;
        if (decl instanceof Class) {
            declCls = (Class)decl;
        } else if (decl instanceof Executable) {
            declCls = ((Executable)decl).getDeclaringClass();
        }
        declarer = ReflectedClassSymbol.get(declCls);
    }

    /**
     * Copy constructs a new TypeVariable
     * @param var the TypeVariable to copy from
     */
    public TypeVariable(TypeVariable var) {
        this(var.name, copyTypes(var.bounds));
    }

    @Override
    public TypeVariable copy() {
        return new TypeVariable(this);
    }

    /**
     * Constructs a new named TypeVariable
     * @param name the name of the TypeVariable
     */
    public TypeVariable(String name) {
        this(name, new Type[]{fetch("Object")});
    }

    /**
     * Construct a named type variable
     * @param name the name of this type
     * @param bounds the bounds of this type
     */
    public TypeVariable(String name, Type... bounds) {
        super(name);
        this.bounds = bounds;
    }

    /**
     * Gets this TypeVariable's index in the class that declared it
     * @return the index in the class that declared this TypeVariable
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the index of this TypeVariable in the class that declared it
     * @param i the index in the class that declared this TypeVariable
     */
    public void setIndex(int i) {
        index = i;
    }

    @Override
    public ClassSymbol getClassSymbol() {
        return Type.lub(bounds).getClassSymbol();
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        if (declarer instanceof ClassSymbol) {
            return (ClassSymbol)declarer;
        } else {
            return ((MethodSymbol)declarer).getDeclaringClass();
        }
    }

    /**
     * Sets the Symbol that declares this TypeVariable
     * @param declarer the Symbol that declares this TypeVariable
     */
    public void setDeclaringSymbol(Symbol declarer) {
        this.declarer = declarer;
    }

    /**
     * Gets the Symbol that declares this TypeVariable
     * @return the Symbol that declares this TypeVariable
     */
    public Symbol getDeclaringSymbol() {
        return declarer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTypeName() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" extends ");
        sb.append(StringUtils.join(" & ", bounds, t -> t.getTypeName()));
        return sb.toString();
    }

    /**
     * Gets the bounds of this TypeVariable
     * @return the bounds of this TypeVariable
     */
    public Type[] getBounds() {
        return bounds;
    }

    /**
     * Gets the upper bound of this TypeVariable
     * @return the upper bound of this TypeVariable
     */
    public Type getUpperBound() {
        return bounds[0];
    }

    @Override
    public ReferenceType adapt(Map<TypeVariable, Type> map) {
        // TODO will present problems with wildcard arguments
        ReferenceType ret = (ReferenceType)map.get(this);
        return ret == null ? this : ret;
    }

    /**
     * Sets the bounds of this TypeVariable
     * @param bounds the bounds of this TypeVariable
     */
    public void setBounds(Type[] bounds) {
        this.bounds = bounds;
    }

    /**
     * Determines if two TypeVariables have the same name
     * @param other the other TypeVariable in question
     * @return true iff this TypeVariable has the same name as `other`
     */
    public boolean nameEquivalent(TypeVariable other) {
        // System.out.println("tv: " + name + " vs " + other.name);
        return name.equals(other.name);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TypeVariable) {
            TypeVariable type = (TypeVariable)other;
            // System.out.println("tv decl: " + declarer.getName() + " vs " + type.declarer.getName());
            return nameEquivalent(type)
                // && declarer.equals(type.declarer)
                && Arrays.equals(bounds, type.bounds)
                ;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^ annotations.length ^ bounds.length;
    }

    @Override
    public Type erase() {
        return bounds[0].erase();
    }

    @Override
    public boolean isValidClassLiteralType() {
        return false;
    }

    @Override
    public boolean canCastTo(Type target) {
        return canCastTo(getUpperBound());
    }
}
