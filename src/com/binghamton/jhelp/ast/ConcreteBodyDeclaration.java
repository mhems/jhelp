package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * An abstract class representing a concrete body declaration.
 * This includes classes and enums.
 */
public abstract class ConcreteBodyDeclaration extends BodyDeclaration {
    private List<Block> instanceInitializers = new ArrayList<>();
    private List<Block> staticInitializers = new ArrayList<>();


    /**
     * Construct an anonymous declaration
     */
    public ConcreteBodyDeclaration() {
        super();
    }

    /**
     * Construct a new concrete body declaration
     * @param name the name of the declaration
     * @param modifiers the modifiers of the declaration
     * @param implementees the interfaces this declaration implements
     */
    public ConcreteBodyDeclaration(String name,
                                   List<Modifier> modifiers,
                                   List<ClassInterfaceType> implementees) {
        super(name, modifiers, implementees);
    }

    /**
     * Gets the instance initializers of this concrete declaration
     * @return the instance initializers of this concrete declaration
     */
    public List<Block> getInstanceInitializers() {
        return instanceInitializers;
    }

    /**
     * Adds an instance initializer to this declaration
     * @param init the initializer to add
     */
    public void addInstanceInitializer(Block init) {
        instanceInitializers.add(init);
    }

    /**
     * Gets the static initializers of this concrete declaration
     * @return the static initializers of this concrete declaration
     */
    public List<Block> getStaticInitializers() {
        return staticInitializers;
    }

    /**
     * Adds an static initializer to this declaration
     * @param init the initializer to add
     */
    public void addStaticInitializer(Block init) {
        staticInitializers.add(init);
    }
}
