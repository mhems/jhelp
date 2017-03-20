package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectedClassSymbol extends ClassSymbol {
    private Class<? extends Object> cls;

    public static ReflectedClassSymbol get(Class<?> cls) {
        ReflectedClassSymbol sym = null;
        try {
            sym = ImportManager.getOrImport(cls.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("could not retrieve existing class " + cls.getName());
        }
        return sym;
    }

    public ReflectedClassSymbol(Class<? extends Object> cls) {
        super(cls.getSimpleName(), cls.getModifiers());
        this.cls = cls;
    }

    public void init() {
        if (cls.getDeclaringClass() != null) {
            declarer = get(cls.getDeclaringClass());
        }
        if (cls.getAnnotatedSuperclass() != null) {
            superClass = fromType(cls.getAnnotatedSuperclass());
        }
        interfaces.putAll(fromTypes(cls.getAnnotatedInterfaces()));
        params.putAll(fromTypeParameters(cls.getTypeParameters()));
        for (Class<?> cur : cls.getDeclaredClasses()) {
            innerClasses.put(ReflectedClassSymbol.get(cur));
        }
        for (Method cur : cls.getMethods()) {
            methods.put(new ReflectedMethodSymbol(cur));
        }
        for (Constructor<?> cur : cls.getConstructors()) {
            ctors.put(new ReflectedMethodSymbol(cur));
        }
        for (Field cur : cls.getFields()) {
            fields.put(new ReflectedVariableSymbol(cur));
        }
    }

    public boolean isEnum() {
        return cls.isEnum();
    }
    public boolean isClass() {
        return !isEnum() && !isInterface() && !isAnnotation();
    }

    public boolean isInterface() {
        return cls.isInterface();
    }

    public boolean isAnnotation() {
        return cls.isAnnotation();
    }

    public boolean isAnonymous() {
        return cls.isAnonymousClass();
    }

    public boolean isInnerClass() {
        return cls.isMemberClass();
    }

    public String getPackageName() {
        return cls.getPackage().getName();
    }

    public Package getPackage() {
        return null;
    }

    public boolean isBoxed() {
        return cls.isPrimitive();
    }

    public PrimitiveType unbox() {
        if (isBoxed()) {
            return PrimitiveType.UNBOX_MAP.get(cls.getSimpleName());
        }
        return null;
    }

    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        String pkgName = getPackageName();
        if (pkgName.length() > 0) {
            sb.append(pkgName);
            sb.append(".");
        }
        sb.append(getQualifiedClassName());
        return sb.toString();
    }
}
