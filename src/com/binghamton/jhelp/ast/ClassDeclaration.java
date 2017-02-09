package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java class declaration
 */
public class ClassDeclaration extends ConcreteBodyDeclaration {
    private List<String> parameters;
    private String superClass;

    /**
     * Construct a new ClassDeclaration
     * @param modifiers the class modifiers, if any
     * @param name the name of the class
     * @param parameters type parameters of the class, if any
     * @param superClass the name of the super class, if any
     * @param superInterfaces the list of implemented interfaces, if any
     */
    public ClassDeclaration(String name,
                            List<Modifier> modifiers,
                            List<String> superInterfaces,
                            List<String> parameters,
                            String superClass) {
        super(name, modifiers, superInterfaces);
        this.parameters = parameters;
        this.superClass = superClass;
    }

    /**
     * Gets the list of parameters of this class
     * @return the list of parameters of this class
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * Gets the name of this class's super class
     * @return the name of this class's super class
     */
    public String getSuperClassName() {
        return superClass;
    }
}
