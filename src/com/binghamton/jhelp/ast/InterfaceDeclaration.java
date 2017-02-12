package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.TypeParameter;

/**
 * A class representing the declaration of a Java interface
 */
public class InterfaceDeclaration extends BodyDeclaration {
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
        super(name, modifiers, implementees);
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
        this(name, modifiers, implementees);
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
}
