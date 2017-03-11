package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class representing a Java type variable
 */
public class TypeVariable implements Type {
    private AnnotationSymbol[] annotations = {};
    private String name;
    private Type[] bounds = {};

    public TypeVariable(String name) {
        this.name = name;
        // TODO correct?
        this.bounds = new Type[]{ImportManager.get("java.lang.Object")};
    }

    /**
     * Construct a named type variable
     * @param name the name of this type
     * @param bounds the bounds of this type
     */
    public TypeVariable(String name, Type[] bounds) {
        this.name = name;
        this.bounds = bounds;
    }

    public String getName() {
        return name;
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
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
}
