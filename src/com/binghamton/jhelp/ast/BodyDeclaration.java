package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;

/**
 * An abstract class representing a structure declaration.
 * This includes interfaces, classes, and enums.
 */
public abstract class BodyDeclaration extends Declaration {
    protected List<ClassInterfaceType> implementees;
    protected List<VariableDeclaration> fields = new ArrayList<>();
    protected List<MethodDeclaration> methods = new ArrayList<>();
    protected List<MethodDeclaration> ctors = new ArrayList<>();
    protected List<ConcreteBodyDeclaration> innerBodies = new ArrayList<>();
    protected List<InterfaceDeclaration> innerInterfaces = new ArrayList<>();

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
     * @param implementees the interfaces this declaration implements
     */
    public BodyDeclaration(String name,
                           List<Modifier> modifiers,
                           List<ClassInterfaceType> implementees) {
        super(name, modifiers);
        this.implementees = implementees;
    }

    /**
     * Gets the implemented interfaces of this declaration
     * @return the implemented interfaces of this declaration
     */
    public List<ClassInterfaceType> getSuperInterfaces() {
        return implementees;
    }

    /**
     * Gets the fields of this declaration
     * @return the fields of this declaration
     */
    public List<VariableDeclaration> getFields() {
        return fields;
    }

    /**
     * Gets the methods of this declaration
     * @return the methods of this declaration
     */
    public List<MethodDeclaration> getMethods() {
        return methods;
    }

    /**
     * Gets the inner bodies of this declaration
     * @return the inner bodies of this declaration
     */
    public List<ConcreteBodyDeclaration> getInnerBodies() {
        return innerBodies;
    }

    /**
     * Gets the methods of this declaration
     * @return the methods of this declaration
     */
    public List<InterfaceDeclaration> getInnerInterfaces() {
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
     * Adds a method declaration to this body
     * @param decl the declaration to add
     */
    public void addMethod(MethodDeclaration decl) {
        methods.add(decl);
    }

    /**
     * Gets the number of methods declared in this body
     * @return the number of methods declared in this body
     */
    public int numMethods() {
        return methods.size();
    }

    /**
     * Adds a constructor declaration to this body
     * @param decl the declaration to add
     */
    public void addConstructor(MethodDeclaration decl) {
        ctors.add(decl);
    }

    /**
     * Gets the number of constructors in this body
     * @return the number of constructors in this body
     */
    public int numConstructors() {
        return ctors.size();
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
     * Adds a inner interface declaration to this body
     * @param decl the declaration to add
     */
    public void addInnerInterface(InterfaceDeclaration decl) {
        innerInterfaces.add(decl);
    }

    /**
     * Gets the number of inner interfaces declared in this body
     * @return the number of inner interfaces declared in this body
     */
    public int numInnerInterfaces() {
        return innerInterfaces.size();
    }
}
