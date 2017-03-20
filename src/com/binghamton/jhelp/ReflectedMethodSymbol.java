package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectedMethodSymbol extends MethodSymbol {
    private Method method;
    private Constructor<?> ctor;
    private boolean constructor;
    private Type returnType;
    private TypeVariable[] params;
    private Type[] argTypes;
    private Type[] exceptions;

    public ReflectedMethodSymbol(Method method) {
        super(method.getName(), method.getModifiers());
        this.method = method;
        this.constructor = false;
        returnType = fromType(method.getAnnotatedReturnType());
        params = fromTypeParameters(method.getTypeParameters());
        argTypes = fromTypes(method.getAnnotatedParameterTypes());
        exceptions = fromTypes(method.getAnnotatedExceptionTypes());
    }

    public ReflectedMethodSymbol(Constructor<?> ctor) {
        super(ctor.getName(), ctor.getModifiers());
        this.ctor = ctor;
        this.constructor = true;
        returnType = ReflectedClassSymbol.get(ctor.getDeclaringClass());
        params = fromTypeParameters(ctor.getTypeParameters());
        argTypes = fromTypes(ctor.getAnnotatedParameterTypes());
        exceptions = fromTypes(ctor.getAnnotatedExceptionTypes());
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

    public boolean isVariadic() {
        return method.isVarArgs();
    }

    public boolean isConstructor() {
        return constructor;
    }
}
