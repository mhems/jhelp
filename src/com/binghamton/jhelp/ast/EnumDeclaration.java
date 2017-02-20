package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.Modifier;

/**
 * A class representing enum declarations
 */
public class EnumDeclaration extends ConcreteBodyDeclaration {
    private List<EnumConstant> constants = new ArrayList<>();

    /**
     * Construct a new enum declaration
     * @param name the name of the declaration
     * @param keyword the keyword Token of this declaration
     * @param modifiers the modifiers of the declaration
     * @param implementees the interfaces this declaration implements
     */
    public EnumDeclaration(Token name,
                           Token keyword,
                           List<Modifier> modifiers,
                           List<ClassInterfaceType> implementees) {
        super(name, keyword, modifiers, implementees);
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
