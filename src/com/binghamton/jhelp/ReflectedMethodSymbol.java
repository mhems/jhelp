package com.binghamton.jhelp;

import java.lang.reflect.Executable;

public class ReflectedMethodSymbol extends MethodSymbol {
    private Executable method;

    public ReflectedMethodSymbol(Executable method) {
        super(method.getName(), method.getModifiers());
        this.method = method;
    }

    public Type getReturnType() {
        return null; // TODO
    }

    /**
     * Gets the formal parameters of this method
     * @return the formal parameters of this method
     */
    public Type[] getParameterTypes() {
        return null; // TODO
    }

    public ClassSymbol[] getExceptionClasses() {
        return fromClasses(method.getExceptionTypes());
    }

    public TypeVariable[] getTypeParameters() {
        return null;
    }
}
