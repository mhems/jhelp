package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Member;
import java.util.Map;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * A class to represent a pre-compiled class
 */
public final class ReflectedClassSymbol extends ClassSymbol {
    private final Class<? extends Object> cls;

    /**
     * Copy construct a new ReflectedClassSymbol
     * @param sym the class to copy
     */
    private ReflectedClassSymbol(ReflectedClassSymbol sym) {
        super(sym);
        this.cls = sym.cls;
    }

    /**
     * Construct a new ReflectedClassSymbol
     * @param cls the pre-compiled class to construct with
     */
    private ReflectedClassSymbol(Class<? extends Object> cls) {
        super(cls.getSimpleName(), cls.getModifiers());
        // System.out.println("reflecting class "+ cls.getSimpleName());
        this.cls = cls;
        boxed = cls.isPrimitive();
        pkg = new ReflectedPackage(cls.getPackage());

        if (cls.isEnum()) {
            classKind = ClassKind.ENUM;
        } else if (cls.isAnnotation()) {
            classKind = ClassKind.ANNOTATION;
        } else if (cls.isInterface()) {
            classKind = ClassKind.INTERFACE;
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

    /**
     * Makes a new ReflectedClassSymbol to reflect a pre-compiled class
     * @param cls the pre-compiled class to reflect
     * @return a new ReflectedClassSymbol reflecting the pre-compiled class
     */
    public static ReflectedClassSymbol make(Class<?> cls) {
         ReflectedClassSymbol ret = new ReflectedClassSymbol(cls);
         // ret.init();
         return ret;
    }

    /**
     * Gets the ClassSymbol reflecting a pre-compiled class
     * @param cls the pre-compiled class instance
     * @return the ClassSymbol reflecting the pre-compiled class
     */
    public static ReflectedClassSymbol get(Class<?> cls) {
        ReflectedClassSymbol ret = null;
        try {
            ret = ImportManager.getOrImport(cls.getName());
        } catch(ClassNotFoundException e) {
            // class will always be found as it was passed in
        }
        return ret;
    }

    /**
     * Initializes the attributes of this ClassSymbol. Must be called once per
     * instance before any other operations.
     */
    public void init() {
        paramArr = fromTypeParameters(cls.getTypeParameters());
        params.putAll(paramArr);
        // System.out.println("initializing " + getName());
        for (Class<?> cur : cls.getDeclaredClasses()) {
            if (visible(cur)) {
                // System.out.println("giving class " + getName() + " the inner class " + cur.getSimpleName());
                innerClasses.put(ReflectedClassSymbol.get(cur));
            }
        }
        for (Method cur : cls.getDeclaredMethods()) {
            if (visible(cur) && !cur.isSynthetic() && !cur.isBridge()) {
                methods.put(new MethodSymbol(cur));
            }
        }
        // System.out.println("initializing " + getName() + " to have " + methods.size() + " methods");
        for (Constructor<?> cur : cls.getDeclaredConstructors()) {
            if (visible(cur) && !cur.isSynthetic()) {
                ctors.put(new MethodSymbol(cur));
            }
        }
        for (Field cur : cls.getDeclaredFields()) {
            if (visible(cur) && !cur.isSynthetic()) {
                fields.put(new VariableSymbol(cur));
            }
        }

        if (cls.getDeclaringClass() != null) {
            declarer = get(cls.getDeclaringClass());
        }
        if (cls.getAnnotatedSuperclass() != null) {
            superClass = fromType(cls.getAnnotatedSuperclass());
        }
        interfaces.putAll(fromTypes(cls.getAnnotatedInterfaces()));
        // System.out.println("initializing " + getName() + " to have " + interfaces.size() + " interfaces");
        establishInheritanceHierarchy();
    }

    private static boolean visible(Class<?> cls) {
        return visible(cls.getModifiers());
    }

    private static boolean visible(Member member) {
        return visible(member.getModifiers());
    }

    private static boolean visible(int modifiers) {
        return Modifier.isPublic(modifiers) ||
            (!Modifier.isPrivate(modifiers) &&
             !Modifier.isProtected(modifiers));
    }

    // public ReflectedClassSymbol copy() {
    //     return new ReflectedClassSymbol(this);
    // }

    @Override
    public PrimitiveType unbox() {
        return PrimitiveType.fromBoxedName(cls.getSimpleName());
    }

    @Override
    protected ReflectedClassSymbol makeNew() {
        return ReflectedClassSymbol.get(this.cls);
    }
}
