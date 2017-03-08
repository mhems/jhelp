package com.binghamton.jhelp;

public class ReflectedClassSymbol extends ClassSymbol {
    private Class<? extends Object> cls;


    public ReflectedClassSymbol(Class<? extends Object> cls) {
        super(cls.getName(), cls.getModifiers());
        this.cls = cls;
    }

    @Override
    public ClassSymbol getSuperClass() {
        return new ReflectedClassSymbol(cls.getSuperclass());
    }

    public ClassSymbol[] getInterfaces() {
        return fromClasses(cls.getInterfaces());
    }

    public MethodSymbol[] getMethods() {
        return fromMethods(cls.getMethods());
    }

    public MethodSymbol[] getConstructors() {
        return fromMethods(cls.getConstructors());
    }

    public VariableSymbol[] getFields() {
        return fromFields(cls.getFields());
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

    public TypeVariable[] getTypeParameters() {
        return null; // TODO
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
}
