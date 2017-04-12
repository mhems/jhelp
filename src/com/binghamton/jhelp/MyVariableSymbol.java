package com.binghamton.jhelp;

import java.util.Map;

import org.antlr.v4.runtime.Token;

public class MyVariableSymbol extends VariableSymbol {
    private final Token token;

    public MyVariableSymbol(Token name, Modifiers modifiers) {
        super(name.getText(), modifiers);
        this.token = name;
    }

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
