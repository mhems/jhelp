package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import com.binghamton.jhelp.ast.ASTVisitor;

public final class ReflectedClassSymbol extends ClassSymbol {
    private final Class<? extends Object> cls;

    private ReflectedClassSymbol(ReflectedClassSymbol sym) {
        super(sym);
        this.cls = sym.cls;
    }

    private ReflectedClassSymbol(Class<? extends Object> cls) {
        super(cls.getSimpleName(), cls.getModifiers());
        this.cls = cls;
        boxed = cls.isPrimitive();
        pkg = new ReflectedPackage(cls.getPackage());
        if (cls.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else if (cls.isEnum()) {
            classKind = ClassKind.ENUM;
        } else if (cls.isAnnotation()) {
            classKind = ClassKind.ANNOTATION;
        } else {
            classKind = ClassKind.CLASS;
        }
        if (cls.isAnonymousClass()) {
            level = Level.ANONYMOUS;
        } else if (cls.isLocalClass()) {
            level = Level.LOCAL;
        } else if (cls.getEnclosingClass() == null) {
            level = Level.TOP;
        } else if (isStatic()) {
            level = Level.MEMBER;
        } else {
            level = Level.INNER;
        }
    }

    public static ReflectedClassSymbol get(Class<?> cls) {
        return new ReflectedClassSymbol(cls);
    }

    public static ReflectedClassSymbol get(String name) {
        ReflectedClassSymbol sym = null;
        Class<?> cls = null;
        try {
            cls = Class.forName(name);
        } catch (ClassNotFoundException e) {
            System.err.println("could not retrieve class " + name);
        }
        if (cls != null) {
            sym = get(cls);
        }
        return sym;
    }

    public void init() {

        if (cls.getDeclaringClass() != null) {
            declarer = get(cls.getDeclaringClass());
        }
        if (cls.getAnnotatedSuperclass() != null) {
            superClass = fromType(cls.getAnnotatedSuperclass());
        }
        interfaces.putAll(fromTypes(cls.getAnnotatedInterfaces()));
        paramArr = fromTypeParameters(cls.getTypeParameters());
        params.putAll(paramArr);
        for (Class<?> cur : cls.getDeclaredClasses()) {
            innerClasses.put(ReflectedClassSymbol.get(cur));
        }
        for (Method cur : cls.getDeclaredMethods()) {
            if (!cur.isSynthetic() && !cur.isBridge()) {
                methods.put(new MethodSymbol(cur));
            }
        }
        for (Constructor<?> cur : cls.getDeclaredConstructors()) {
            if (!cur.isSynthetic()) {
                ctors.put(new MethodSymbol(cur));
            }
        }
        for (Field cur : cls.getDeclaredFields()) {
            fields.put(new VariableSymbol(cur));
        }
    }

    @Override
    public PrimitiveType unbox() {
        if (isBoxed()) {
            return PrimitiveType.UNBOX_MAP.get(cls.getSimpleName());
        }
        return null;
    }

    @Override
    protected ReflectedClassSymbol adapt(Map<TypeVariable, Type> map,
                                      boolean first) {
        ReflectedClassSymbol ret = new ReflectedClassSymbol(this);
        adapt(ret, map, first);
        return ret;
    }
}
