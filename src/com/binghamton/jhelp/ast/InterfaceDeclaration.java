package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.TypeParameter;

/**
 * A class representing the declaration of a Java interface
 */
public class InterfaceDeclaration extends AbstractBodyDeclaration {
    private List<ClassInterfaceType> implementees;
    private List<MethodDeclaration> methods = new ArrayList<>();
    private List<TypeParameter> typeParams;

    /**
     * Construct a new InterfaceDeclaration
     * @param name the name of this declaration
     * @param modifiers the modifiers of this declaration
     * @param implementees the interfaces this declaration implements
     */
    public InterfaceDeclaration(String name,
                                List<Modifier> modifiers,
                                List<ClassInterfaceType> implementees) {
        this(name, modifiers, implementees, null);
    }

    /**
     * Construct a new InterfaceDeclaration
     * @param name the name of this declaration
     * @param modifiers the modifiers of this declaration
     * @param implementees the interfaces this declaration implements
     * @param typeParams the type parameters of this declaration
     */
    public InterfaceDeclaration(String name,
                                List<Modifier> modifiers,
                                List<ClassInterfaceType> implementees,
                                List<TypeParameter> typeParams) {
        super(name, modifiers);
        this.implementees = implementees;
        this.typeParams = typeParams;
    }

    /**
     * Gets the list of type parameters of this interface
     * @return the list of type parameters of this interface
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this interface has type parameters
     * @return true iff this interface has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams != null && typeParams.size() > 0;
    }

    /**
     * Determines if this declaration implements any interfaces
     * @return true iff this declaration implements any interfaces
     */
    public boolean hasSuperInterfaces() {
        return implementees != null && implementees.size() > 0;
    }

    /**
     * Gets the implemented interfaces of this declaration
     * @return the implemented interfaces of this declaration
     */
    public List<ClassInterfaceType> getSuperInterfaces() {
        return implementees;
    }

    /**
     * Gets the methods of this declaration
     * @return the methods of this declaration
     */
    public List<MethodDeclaration> getMethods() {
        return methods;
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
}
