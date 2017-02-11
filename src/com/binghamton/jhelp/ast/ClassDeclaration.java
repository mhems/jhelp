package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java class declaration
 */
public class ClassDeclaration extends ConcreteBodyDeclaration {
    private List<TypeParameter> typeParams;
    private ClassInterfaceType superClass;

    /**
     * Construct a new ClassDeclaration
     * @param modifiers the class modifiers, if any
     * @param name the name of the class
     * @param typeParams type parameters of the class, if any
     * @param superClass the name of the super class, if any
     * @param superInterfaces the list of implemented interfaces, if any
     */
    public ClassDeclaration(String name,
                            List<Modifier> modifiers,
                            List<ClassInterfaceType> superInterfaces,
                            List<String> typeParams,
                            ClassInterfaceType superClass) {
        super(name, modifiers, superInterfaces);
        this.typeParams = typeParams;
        this.superClass = superClass;
    }

    /**
     * Gets the list of type parameters of this class
     * @return the list of type parameters of this class
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this class has type parameters
     * @return true iff this class has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams != null && typeParams.size() > 0;
    }

    /**
     * Gets this class's super class
     * @return this class's super class
     */
    public ClassInterfaceType getSuperClass() {
        return superClass;
    }
}
