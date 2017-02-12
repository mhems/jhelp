package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;

/**
 * A class representing enum declarations
 */
public class EnumDeclaration extends ConcreteBodyDeclaration {
    private List<EnumConstant> constants = new ArrayList<>();
    private List<ConcreteBodyDeclaration> bodies = new ArrayList<>();

    /**
     * Construct a new enum declaration
     * @param name the name of the declaration
     * @param modifiers the modifiers of the declaration
     * @param implementees the interfaces this declaration implements
     */
    public EnumDeclaration(String name,
                           List<Modifier> modifiers,
                           List<ClassInterfaceType> implementees) {
        super(name, modifiers, implementees);
    }

    /**
     * Gets the enum constants in this declaration
     * @return the enum constants in this declaration
     */
    public List<EnumConstant> getConstants() {
        return constants;
    }

    /**
     * Add an enum constant to this declaration
     * @param c the enum constant to add
     */
    public void addConstant(EnumConstant c) {
        constants.add(c);
    }

    /**
     * Gets the bodies of this declaration
     * @return the bodies of this declaration
     */
    public List<ConcreteBodyDeclaration> getBodies() {
        return bodies;
    }

    /**
     * Add a body declaration to this declaration
     * @param d the declaration to add to this declaration
     */
    public void addBody(ConcreteBodyDeclaration d) {
        bodies.add(d);
    }
}
