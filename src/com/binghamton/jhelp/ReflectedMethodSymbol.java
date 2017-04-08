package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

public class ReflectedMethodSymbol extends MethodSymbol {
    private final Executable exe;
    private final boolean constructor;
    private final Type returnType;
    private final TypeVariable[] params;
    private final Type[] argTypes;
    private final Type[] exceptions;

    public ReflectedMethodSymbol(Method method) {
        super(method.getName(), method.getModifiers());
        exe = method;
        constructor = false;
        returnType = fromType(method.getAnnotatedReturnType());
        params = fromTypeParameters(method.getTypeParameters());
        argTypes = fromTypes(method.getAnnotatedParameterTypes());
        exceptions = fromTypes(method.getAnnotatedExceptionTypes());
        constructType();
    }

    public ReflectedMethodSymbol(Constructor<?> ctor) {
        super(ctor.getName(), ctor.getModifiers());
        exe = ctor;
        constructor = true;
        returnType = ReflectedClassSymbol.get(ctor.getDeclaringClass());
        params = fromTypeParameters(ctor.getTypeParameters());
        argTypes = fromTypes(ctor.getAnnotatedParameterTypes());
        exceptions = fromTypes(ctor.getAnnotatedExceptionTypes());
        constructType();
    }

    public Type getReturnType() {
        return returnType;
    }

    /**
     * Gets the formal parameters of this method
     * @return the formal parameters of this method
     */
    public Type[] getParameterTypes() {
        return argTypes;
    }

    public Type[] getExceptionTypes() {
        return exceptions;
    }

    public TypeVariable[] getTypeParameters() {
        return params;
    }

    public ClassSymbol getDeclaringClass() {
        return ReflectedClassSymbol.get(exe.getDeclaringClass());
    }

    public boolean isVariadic() {
        return exe.isVarArgs();
    }

    public boolean isConstructor() {
        return constructor;
    }

    @Override
    public ReflectedMethodSymbol adapt(Type[] args) {
        // TODO
        return null;
    }
}
