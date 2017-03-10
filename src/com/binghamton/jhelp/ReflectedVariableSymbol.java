package com.binghamton.jhelp;

import java.lang.reflect.Field;

public class ReflectedVariableSymbol extends VariableSymbol {
    private Field field = null;
    private Type type;

    public ReflectedVariableSymbol(Field field) {
        super(field.getName(), field.getModifiers());
        this.field = field;
        type = fromType(field.getAnnotatedType());
    }

    public Type getType() {
        return type;
    }
}
