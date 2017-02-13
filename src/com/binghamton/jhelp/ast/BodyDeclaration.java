package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;

/**
 * An abstract class representing a structure declaration.
 * This includes interfaces, annotations, classes, and enums.
 */
public abstract class BodyDeclaration extends Declaration {
    protected List<VariableDeclaration> fields = new ArrayList<>();
    protected List<ConcreteBodyDeclaration> innerBodies = new ArrayList<>();
    protected List<AbstractBodyDeclaration> innerInterfaces = new ArrayList<>();

    /**
     * Construct an empty body declaration
     */
    public BodyDeclaration() {
        super();
    }

    /**
     * Construct a new declaration of a body
     * @param name the name of this declaration
     * @param modifiers the modifiers of this declaration
     */
    public BodyDeclaration(String name,
                           List<Modifier> modifiers) {
        super(name, modifiers);
    }

    /**
     * Gets the fields of this declaration
     * @return the fields of this declaration
     */
    public List<VariableDeclaration> getFields() {
        return fields;
    }

    /**
     * Gets the inner bodies of this declaration
     * @return the inner bodies of this declaration
     */
    public List<ConcreteBodyDeclaration> getInnerBodies() {
        return innerBodies;
    }

    /**
     * Gets the inner abstract bodies of this declaration
     * @return the inner abstract bodies of this declaration
     */
    public List<AbstractBodyDeclaration> getInnerInterfaces() {
        return innerInterfaces;
    }

    /**
     * Adds a variable declaration to this body
     * @param decl the declaration to add
     */
    public void addField(VariableDeclaration decl) {
        fields.add(decl);
    }

    /**
     * Gets the number of fields declared in this body
     * @return the number of fields declared in this body
     */
    public int numFields() {
        return fields.size();
    }

    /**
     * Adds a inner body declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerBody(ConcreteBodyDeclaration decl) {
        innerBodies.add(decl);
    }

    /**
     * Gets the number of inner bodies declared in this body
     * @return the number of inner bodies declared in this body
     */
    public int numInnerBodies() {
        return innerBodies.size();
    }

    /**
     * Adds a inner abstract body declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerInterface(AbstractBodyDeclaration decl) {
        innerInterfaces.add(decl);
    }

    /**
     * Gets the number of inner abstract bodies declared in this body
     * @return the number of inner abstract bodies declared in this body
     */
    public int numInnerInterfaces() {
        return innerInterfaces.size();
    }
}
