package com.binghamton.jhelp;

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
        return name.equals(other.name);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TypeVariable) {
            TypeVariable type = (TypeVariable)other;
            return name.equals(type.name) &&
                Arrays.equals(bounds, type.bounds);
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
