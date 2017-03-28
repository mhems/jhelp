package com.binghamton.jhelp;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;

/**
 * A class representing the abstract notion of a Java symbol
 * Java symbols include classes, enums, interfaces, methods, and variables
 */
public abstract class Symbol {
    public static enum SymbolKind {CLASS, CONSTRUCTOR, METHOD, TYPE, VARIABLE};
    public static enum AccessLevel {PUBLIC, PROTECTED, PACKAGE_PRIVATE, PRIVATE};

    protected SymbolKind kind;
    protected String name;
    protected AnnotationSymbol[] annotations = {};
    private AccessLevel access;
    private Modifiers modifiers ;

    public Symbol() {
        modifiers = Modifiers.NO_MODIFIERS;
    }

    /**
     * Construct a named Symbol with default access and no modifiers
     * @param name the name of the symbol
     */
    public Symbol(String name) {
        this(name, Modifiers.NO_MODIFIERS);
    }

    public Symbol(String name, AnnotationSymbol[] annotations) {
        this.name = name;
        this.annotations = annotations;
        modifiers = Modifiers.NO_MODIFIERS;
    }

    public Symbol(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
        modifiers = Modifiers.NO_MODIFIERS;
    }

    public Symbol(String name, int modifiers) {
        this(name, Modifiers.fromEncodedModifier(modifiers));
    }

    /**
     * Construct a named Symbol with access level and modifiers
     * @param name the name of this Symbol
     * @param modifiers the modifiers of this Symbol
     */
    public Symbol(String name, Modifiers modifiers) {
        this.name = name;
        this.modifiers = modifiers;
        this.access = AccessLevel.PACKAGE_PRIVATE;
        for (Modifier modifier : this.modifiers.getModifiers()) {
            switch (modifier.getName()) {
            case "public":
                this.access = AccessLevel.PUBLIC;
                break;
            case "protected":
                this.access = AccessLevel.PROTECTED;
                break;
            case "private":
                this.access = AccessLevel.PRIVATE;
                break;
            }
        }
    }

    /**
     * Gets the name of this symbol
     * @return the name of this symbol
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the access level of this symbol
     * @return the access level of this symbol
     */
    public AccessLevel getAccessLevel() {
        return access;
    }

    /**
     * Gets the modifiers of this symbol
     * @return the modifiers of this symbol
     */
    public Modifiers getModifiers() {
        return modifiers;
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public abstract Symbol adapt(Type[] args);

    public boolean hasModifier(Modifier modifier) {
        return modifiers.contains(modifier);
    }

    public boolean hasModifiers() {
        return modifiers.getModifiers().size() > 0;
    }

    public boolean hasAnnotations() {
        return annotations.length > 0;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    /**
     * Sets the access level of this symbol
     * @param lvl the level of this symbol
     */
    public void setAccessLevel(AccessLevel lvl) {
        access = lvl;
    }

    /**
     * Determines the specific kind of Symbol of this instance
     * @return the specific kind of Symbol of this instance
     */
    public SymbolKind getKind() {
        return kind;
    }

    public abstract boolean equals(Object other);

    public abstract int hashCode();

    public abstract String toString();

    public String repr() {
        return toString();
    }

    /**
     * Attempts to add modifier to this symbol's modifiers
     * @param modifier the modifier to attempt to add
     * @return true iff modifier successfully added
     */
    public boolean addModifier(Modifier modifier) {
        return modifiers.addModifier(modifier);
    }

    /**
     * Gets the number of modifiers of this symbol
     * @return the number of modifiers of this symbol
     */
    public int numModifiers() {
        return modifiers.getModifiers().size();
    }

    public abstract ClassSymbol getDeclaringClass();

    protected static AnnotationSymbol[] fromAnnotations(Annotation[] annotations) {
        AnnotationSymbol[] syms = new AnnotationSymbol[annotations.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = new AnnotationSymbol(annotations[i]);
        }
        return syms;
    }

    protected static Type[] fromTypes(AnnotatedType[] types) {
        Type[] syms = new Type[types.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromType(types[i]);
        }
        return syms;
    }

    protected static Type[] fromTypes(java.lang.reflect.Type[] types) {
        Type[] syms = new Type[types.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromType(types[i]);
        }
        return syms;
    }

    protected static Type fromType(java.lang.reflect.AnnotatedType type) {
        Type ret = fromType(type.getType());
        ret.setAnnotations(fromAnnotations(type.getAnnotations()));
        return ret;
    }

    protected static Type fromType(java.lang.reflect.Type type) {
        Type ret = null;
        if (type instanceof GenericArrayType) {
            ret = fromType(((GenericArrayType)type).getGenericComponentType());
            ret = new ArrayType(ret);
        } else if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType ref = (java.lang.reflect.ParameterizedType)type;
            ret = new ParameterizedType(fromType(ref.getRawType()),
                                        fromTypes(ref.getActualTypeArguments()));
        } else if (type instanceof java.lang.reflect.TypeVariable<?>) {
            ret = fromTypeVariable((java.lang.reflect.TypeVariable<?>)type);
        } else if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType ref = (java.lang.reflect.WildcardType)type;
            java.lang.reflect.Type[] lb = ref.getLowerBounds();
            java.lang.reflect.Type[] ub = ref.getUpperBounds();
            if (lb.length == 0) {
                ret = new WildcardType(true, (ReferenceType)fromType(ub[0]));
            } else {
                ret = new WildcardType(false, (ReferenceType)fromType(lb[0]));
            }
        } else if (type instanceof Class<?>) {
            Class<?> cls = (Class<?>)type;
            if (cls.isPrimitive()) {
                ret = PrimitiveType.UNBOX_MAP.get(cls.getName());
            } else if (cls.isArray()) {
                ret = new ArrayType(fromType(cls.getComponentType()));
            } else {
                ret = ReflectedClassSymbol.get((Class<?>)type);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return ret;
    }

    protected static
    TypeVariable fromTypeVariable(java.lang.reflect.TypeVariable<?> type) {
            // TODO fix cyclic recursion
        // creation of type variable must not create bounds ???
        return new TypeVariable(type.getName());
                                // fromTypes(type.getAnnotatedBounds()));
    }

    protected static
    TypeVariable[] fromTypeParameters(java.lang.reflect.TypeVariable<?>[] params) {
        TypeVariable[] syms = new TypeVariable[params.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromTypeVariable(params[i]);
        }
        return syms;
    }
}
