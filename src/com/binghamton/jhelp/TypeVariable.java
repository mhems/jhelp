package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends ReferenceType {
    private Type[] bounds = {};
    private Symbol declarer;

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

    public ClassSymbol getClassSymbol() {
        return Type.lub(bounds).getClassSymbol();
    }

    public ClassSymbol getDeclaringClass() {
        if (declarer instanceof ClassSymbol) {
            return (ClassSymbol)declarer;
        } else {
            return ((MethodSymbol)declarer).getDeclaringClass();
        }
    }

    public void setDeclaringSymbol(Symbol declarer) {
        this.declarer = declarer;
    }

    public Symbol getDeclaringSymbol() {
        return declarer;
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" extends ");
        sb.append(StringUtils.join(" & ", bounds, t -> t.getTypeName()));
        return sb.toString();
    }

    public Type[] getBounds() {
        return bounds;
    }

    public Type getUpperBound() {
        return bounds[0];
    }

    @Override
    public TypeVariable adapt(Type[] args) {
        throw new UnsupportedOperationException("a type variable cannot be adapted");
    }

    public void setBounds(Type[] bounds) {
        this.bounds = bounds;
    }

    public boolean equals(Object other) {
        if (other instanceof TypeVariable) {
            TypeVariable type = (TypeVariable)other;
            return name.equals(type.name) &&
                Arrays.equals(annotations, type.annotations) &&
                Arrays.equals(bounds, type.bounds);
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode() ^ annotations.length ^ bounds.length;
    }

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
