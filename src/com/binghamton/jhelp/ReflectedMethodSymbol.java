package com.binghamton.jhelp;

import java.lang.reflect.Method;

public class ReflectedMethodSymbol extends MethodSymbol {
    private Method method;
    private Type returnType;
    private TypeVariable[] params;
    private Type[] argTypes;
    private Type[] exceptions;

    public ReflectedMethodSymbol(Method method) {
        super(method.getName(), method.getModifiers());
        this.method = method;
        returnType = fromType(method.getAnnotatedReturnType());
        params = fromTypeParameters(method.getTypeParameters());
        argTypes = fromTypes(method.getAnnotatedParameterTypes());
        exceptions = fromTypes(method.getAnnotatedExceptionTypes());
    }

    public Type getReturnType() {
        return returnType;
    }

    /**
     * Gets the formal parameters of this method
     * @return the formal parameters of this method
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
        return ReflectedClassSymbol.get(method.getDeclaringClass());
    }
}
