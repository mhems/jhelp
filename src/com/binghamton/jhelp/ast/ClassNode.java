package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java class
 */
public class ClassNode extends ASTNode {
    private List<Modifier> modifiers;
    private String name;
    private List<String> parameters;
    private String superClass;
    private List<String> superInterfaces;
    private Block body;

    /**
     * Construct a new ClassNode
     * @param modifiers the class modifiers, if any
     * @param name the name of the class
     * @param parameters type parameters of the class, if any
     * @param superClass the name of the super class, if any
     * @param superInterfaces the list of implemented interfaces, if any
     * @param body the body of the class
     */
    public ClassNode(List<Modifier> modifiers,
                     String name,
                     List<String> parameters,
                     String superClass,
                     List<String> superInterfaces,
                     Block body) {
        this.modifiers = modifiers;
        this.name = name;
        this.parameters = parameters;
        this.superClass = superClass;
        this.superInterfaces = superInterfaces;
        this.body = body;
    }

    /**
     * Gets the list of modifiers of this class
     * @return the list of modifiers of this class
     */
    public List<Modifier> getModifiers() {
        return modifiers;
    }

    /**
     * Gets the name of this class
     * @return the name of this class
     */
    public String getName() {
        return name;
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

    /**
     * Gets the names of any interfaces this class implements
     * @return the names of any interfaces this class implements
     */
    public List<String> getSuperInterfaceNames() {
        return superInterfaces;
    }

    /**
     * Gets the number of interfaces this class implements
     * @return the number of interfaces this class implements
     */
    public int getNumSuperInterfaces() {
        return superInterfaces.size();
    }
}
