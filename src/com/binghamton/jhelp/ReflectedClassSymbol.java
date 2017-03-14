package com.binghamton.jhelp;

public class ReflectedClassSymbol extends ClassSymbol {
    private Class<? extends Object> cls;
    private ClassSymbol declarer;
    private Type superClass;
    private Type[] interfaces;
    private MethodSymbol[] methods;
    private ConstructorSymbol[] ctors;
    private VariableSymbol[] fields;
    private TypeVariable[] params;

    public static ReflectedClassSymbol get(Class<?> cls) {
        ReflectedClassSymbol ret = null;
        try {
            ret = ImportManager.getOrImport(cls.getName());
        } catch(ClassNotFoundException e) {
            System.err.println("FATAL ERROR - could not import " + cls.getName());
        }
        return ret;
    }

    public ReflectedClassSymbol(Class<? extends Object> cls) {
        super(cls.getName(), cls.getModifiers());
        this.cls = cls;
    }

    public void init() {
        if (cls.getDeclaringClass() != null) {
            declarer = get(cls.getDeclaringClass());
        }
        if (cls.getAnnotatedSuperclass() != null) {

            superClass = fromType(cls.getAnnotatedSuperclass());
        }
        interfaces = fromTypes(cls.getAnnotatedInterfaces());
        methods = fromMethods(cls.getMethods());
        ctors = fromConstructors(cls.getConstructors());
        fields = fromFields(cls.getFields());
        params = fromTypeParameters(cls.getTypeParameters());
    }

    @Override
    public Type getSuperClass() {
        return superClass;
    }

    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    public Type[] getInterfaces() {
        return interfaces;
    }

    public MethodSymbol[] getMethods() {
        return methods;
    }

    public ConstructorSymbol[] getConstructors() {
        return ctors;
    }

    public VariableSymbol[] getFields() {
        return fields;
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
        return params;
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
        if (getPackage() != null) {
            sb.append(getPackage().getName());
            sb.append(".");
        }
        sb.append(super.getQualifiedName());
        return sb.toString();
    }
}
