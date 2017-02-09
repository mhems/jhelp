package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing the declaration of a Java interface
 */
public class InterfaceDeclaration extends BodyDeclaration {
    private List<String> parameters;

    /**
     * Construct a new InterfaceDeclaration
     * @param name the name of this declaration
     * @param modifiers the modifiers of this declaration
     * @param implementees the interfaces this declaration implements
     */
    public InterfaceDeclaration(String name,
                                List<Modifier> modifiers,
                                List<String> implementees) {
        super(name, modifiers, implementees);
    }

}
