package com.binghamton.jhelp;

import java.lang.reflect.Constructor;


public class ReflectedConstructorSymbol extends ConstructorSymbol {
    private Constructor<?> ctor;
    private TypeVariable[] params;
    private Type[] argTypes;
    private Type[] exceptions;

    public ReflectedConstructorSymbol(Constructor<?> ctor) {
        super(ctor.getName(), ctor.getModifiers());
        this.ctor = ctor;
        params = fromTypeParameters(ctor.getTypeParameters());
        argTypes = fromTypes(ctor.getAnnotatedParameterTypes());
        exceptions = fromTypes(ctor.getAnnotatedExceptionTypes());
    }

    /**
     * Gets the formal parameters of this constructor
     * @return the formal parameters of this constructor
     */
    public Type[] getParameterTypes() {
        return params;
    }

    public Type[] getExceptionTypes() {
        return exceptions;
    }

    public TypeVariable[] getTypeParameters() {
        return params;
    }

    public ClassSymbol getDeclaringClass() {
        return ReflectedClassSymbol.get(ctor.getDeclaringClass());
    }
}
