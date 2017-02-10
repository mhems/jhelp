package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java type parameter
 */
public class TypeParameter {
    private TypeVariable type;
    private List<ReferenceType> superTypes = new ArrayList<>();

    /**
     * Construct a named type parameter
     * @param name the name of the type parameter
     */
    public TypeParameter(String name) {
        type = new TypeVariable(name);
    }

    /**
     * Construct a named, annotated type parameter
     * @param name the name of the type parameter
     * @param annotations the annotations of the type parameter
     */
    public TypeParameter(String name, Annotations annotations) {
        type = new TypeVariable(name, annotations);
    }

    /**
     * Gets the underlying type variable of this parameter
     * @return the underlying type variable of this parameter
     */
    public TypeVariable getType() {
        return type;
    }

    /**
     * Gets the super types of this parameter, if any
     * @return the super types of this parameter, if any
     */
    public List<ReferenceType> getSuperTypes() {
        return superTypes;
    }

    /**
     * Determines if this parameters has any super types
     * @return true iff this parameters has any super types
     */
    public boolean hasSuperType() {
        return numSuperTypes() > 0;
    }

    /**
     * Gets the number of super types of this parameter
     * @return the number of super types of this parameter
     */
    public int numSuperTypes() {
        return superTypes.size();
    }

    /**
     * Adds a super type to this type parameter
     * @param superType the super type of this type parameter
     */
    public void addSuperType(ReferenceType superType) {
        superTypes.add(superType);
    }
}
