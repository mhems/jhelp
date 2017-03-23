package com.binghamton.jhelp;

import java.lang.reflect.Field;

public class ReflectedVariableSymbol extends VariableSymbol {
    private Field field = null;
    private Type type;

        {
            setVariableKind(VariableKind.FIELD);
        }

    public ReflectedVariableSymbol(Field field) {
        super(field.getName(), field.getModifiers());
        this.field = field;
        type = fromType(field.getAnnotatedType());
    }

    public Type getType() {
        return type;
    }

    public ClassSymbol getDeclaringClass() {
        return ReflectedClassSymbol.get(field.getDeclaringClass());
    }
}
