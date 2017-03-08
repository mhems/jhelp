package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a constant in a Java enum
 */
public class EnumConstant extends ConcreteBodyDeclaration {
    private List<Expression> arguments;

    /**
     * Construct an enum constant
     * @param name the token holding the name of this constant
     * @param modifiers the modifiers of this constant
     * @param arguments the arguments to this constant
     */
    public EnumConstant(Token name,
                        List<Annotation> annotations,
                        List<Expression> arguments) {
        super(name, name, new ArrayList<Modifier>(),
              annotations, new ArrayList<>());
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
