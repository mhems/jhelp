package com.binghamton.jhelp;

import java.util.Map;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a user-created variable
 */
public class MyVariableSymbol extends VariableSymbol {
    private final Token token;

    /**
     * Construct a new named, modified variable
     * @param token the Token holding the name of the variable
     * @param modifiers the Modifiers the variable is declared with
     */
    public MyVariableSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

    /**
     * Copy constructs a variable
     * @param var the variable to copy from
     */
    private MyVariableSymbol(MyVariableSymbol var) {
        super(var);
        this.token = var.token;
    }

    /**
     * Sets this variable's type
     * @param type this variable's type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Sets this variable's kind
     * @param kind the kind of this variable
     */
    public void setKind(VariableKind kind) {
        varKind = kind;
    }

    /**
     * Sets the class that declares this variable
     * @param sym the class that declares this variable
     */
    public void setDeclaringClass(ClassSymbol sym) {
        this.declarer = sym;
    }

    @Override
    public MyVariableSymbol adapt(Map<TypeVariable, Type> map) {
        MyVariableSymbol ret = new MyVariableSymbol(this);
        adapt(ret, map);
        return ret;
    }
}
