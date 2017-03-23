package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class representing a Java type variable
 */
public class TypeVariable extends Type {
    private Type[] bounds = {};

    public TypeVariable(String name) {
        this(name, new Type[]{ImportManager.get("java.lang.Object")});
    }

    /**
     * Construct a named type variable
     * @param name the name of this type
     * @param bounds the bounds of this type
     */
    public TypeVariable(String name, Type[] bounds) {
        super(name);
        this.bounds = bounds;
    }

    public ClassSymbol getClassSymbol() {
        return bounds[0].getClassSymbol(); // TODO lub
    }

    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(name);
        if (isBounded()) {
            sb.append(" extends ");
            sb.append(StringUtils.join(" & ", bounds, t -> t.getTypeName()));
        }
        return sb.toString();
    }

    public boolean isBounded() {
        return bounds.length > 0;
    }

    public Type[] getBounds() {
        return bounds;
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
}
