package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a constant in a Java enum
 */
public class EnumConstant extends ConcreteBodyDeclaration {
    private List<Expression> arguments;

    /**
     * Construct an enum constant
     * @param name the name of this constant
     * @param modifiers the modifiers of this constant
     * @param arguments the arguments to this constant
     */
    public EnumConstant(String name,
                        List<Modifier> modifiers,
                        List<Expression> arguments) {
        super(name, modifiers, null);
        this.arguments = arguments;
    }

    /**
     * Gets the arguments to this enum constant
     * @return the arguments to this enum constant
     */
    public List<Expression> getArguments() {
        return arguments;
    }

    /**
     * Gets the number of arguments to this enum constant
     * @return the number of arguments to this enum constant
     */
    public int numArguments() {
        return arguments.size();
    }
}
