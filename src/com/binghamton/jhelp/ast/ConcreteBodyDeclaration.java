package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * An abstract class representing a concrete body declaration.
 * This includes classes and enums.
 */
public abstract class ConcreteBodyDeclaration extends BodyDeclaration {
    protected List<Expression> implementees = new ArrayList<>();
    protected List<MethodDeclaration> methods = new ArrayList<>();
    protected List<MethodDeclaration> ctors = new ArrayList<>();
    protected List<Block> instanceInitializers = new ArrayList<>();
    protected List<Block> staticInitializers = new ArrayList<>();

    /**
     * Construct an anonymous declaration
     */
    public ConcreteBodyDeclaration() {
        super();
    }

    /**
     * Construct a new concrete body declaration
     * @param name the name of the declaration
     * @param keyword the keyword of the declaration
     * @param modifiers the modifiers of the declaration
     * @param annotations the annotations of this declaration
     * @param implementees the interfaces this declaration implements
     */
    public ConcreteBodyDeclaration(Token name,
                                   Token keyword,
                                   List<Modifier> modifiers,
                                   List<Annotation> annotations,
                                   List<Expression> implementees) {
        super(name, keyword, modifiers, annotations);
        this.implementees = implementees;
    }

    /**
     * Determines if this declaration implements any interfaces
     * @return true iff this declaration implements any interfaces
     */
    public boolean hasSuperInterfaces() {
        return implementees.size() > 0;
    }

    /**
     * Gets the implemented interfaces of this declaration
     * @return the implemented interfaces of this declaration
     */
    public List<Expression> getSuperInterfaces() {
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

    /**
     * Gets the constructors of this declaration
     * @return the constructors of this declaration
     */
    public List<MethodDeclaration> getConstructors() {
        return ctors;
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

    public boolean isEmpty() {
        return getFields().isEmpty() &&
            getInnerBodies().isEmpty() &&
            getInnerInterfaces().isEmpty() &&
            getStaticInitializers().isEmpty() &&
            getInstanceInitializers().isEmpty() &&
            getMethods().isEmpty() &&
            getConstructors().isEmpty();
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
