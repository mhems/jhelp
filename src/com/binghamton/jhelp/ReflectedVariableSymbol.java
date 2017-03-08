package com.binghamton.jhelp;

import java.lang.reflect.Field;

public class ReflectedVariableSymbol extends VariableSymbol {
    private Field field = null;

    public ReflectedVariableSymbol(Field field) {
        super(field.getName(), field.getModifiers());
        this.field = field;
    }

    public Type getType() {
        return null; // TODO
    }
}
