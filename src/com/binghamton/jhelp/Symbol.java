package com.binghamton.jhelp;

import java.util.Map;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericArrayType;

import com.binghamton.jhelp.error.JHelpError;

/**
 * A class representing the abstract notion of a Java symbol
 * Java symbols include classes, enums, interfaces, methods, and variables
 */
public abstract class Symbol {

    /**
     * An enum enumerating the kinds of Symbols
     */
    public static enum SymbolKind {CLASS, CONSTRUCTOR, METHOD, TYPE, VARIABLE};

    /**
     * An enum enumerating the access levels of a Symbol
     */
    public static enum AccessLevel {PUBLIC, PROTECTED, PACKAGE_PRIVATE, PRIVATE};

    protected Program program;
    protected SymbolKind kind;
    protected String name;
    protected AnnotationSymbol[] annotations = {};
    protected AccessLevel access;
    protected Modifiers modifiers ;

    /**
     * Constructs an empty Symbol
     */
    protected Symbol() {
        modifiers = new Modifiers();
    }

    /**
     * Constructs a named Symbol
     * @param name the name of the symbol
     */
    protected Symbol(String name) {
        this(name, new Modifiers());
    }

    /**
     * Constructs a annotated, named Symbol
     * @param name the name of the symbol
     * @param annotations the annotations of the symbol
     */
    protected Symbol(String name, AnnotationSymbol[] annotations) {
        this.name = name;
        this.annotations = annotations;
        modifiers = new Modifiers();
    }

    /**
     * Constructs a annotated Symbol
     * @param annotations the annotations of the symbol
     */
    protected Symbol(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
        modifiers = new Modifiers();
    }

    /**
     * Constructs a modified, named Symbol
     * @param name the name of this Symbol
     * @param modifiers a bit-mask holding the modifiers of this Symbol
     */
    protected Symbol(String name, int modifiers) {
        this(name, Modifiers.fromEncodedModifier(modifiers));
    }

    /**
     * Constructs a modified, named Symbol
     * @param name the name of this Symbol
     * @param modifiers the Modifiers of this Symbol
     */
    protected Symbol(String name, Modifiers modifiers) {
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

    /**
     * Gets the annotations of this Symbol
     * @return the annotations of this Symbol
     */
    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    /**
     * Adapts this Symbol by substituting type parameters
     * @param map the Map mapping type variables to the types that replace them
     * @return the adapted Symbol
     */
    public abstract Symbol adapt(Map<TypeVariable, Type> map);

    /**
     * Determines if this Symbol has a Modifier
     * @param modifier the Modifier to search for
     * @return true iff this Symbol has the given Modifier
     */
    public boolean hasModifier(Modifier modifier) {
        return modifiers.contains(modifier);
    }

    /**
     * Determines if this Symbol has any Modifiers
     * @return true iff this Symbol has any Modifiers
     */
    public boolean hasModifiers() {
        return modifiers.getModifiers().size() > 0;
    }

    /**
     * Determines if this Symbol has the abstract Modifier
     * @return true iff this Symbol has the abstract Modifier
     */
    public boolean isAbstract() {
        return hasModifier(Modifier.ABSTRACT);
    }

    /**
     * Determines if this Symbol has the final Modifier
     * @return true iff this Symbol has the final Modifier
     */
    public boolean isFinal() {
        return hasModifier(Modifier.FINAL);
    }

    /**
     * Determines if this Symbol has the static Modifier
     * @return true iff this Symbol has the static Modifier
     */
    public boolean isStatic() {
        return hasModifier(Modifier.STATIC);
    }

    /**
     * Determines if this Symbol has any annotations
     * @return true iff this Symbol has any annotations
     */
    public boolean hasAnnotations() {
        return annotations.length > 0;
    }

    /**
     * Sets the annotations of this Symbol
     * @param annotations the annotations of this Symbol
     */
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

    @Override
    public abstract boolean equals(Object other);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

    /**
     * Builds a String representation of this Symbol
     * @return the String representation of this Symbol
     */
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

    /**
     * Gets the class that declares this Symbol
     * @return the ClassSymbol that declares this Symbol
     */
    public abstract ClassSymbol getDeclaringClass();

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void addError(JHelpError error) {
        program.addError(error);
    }

    /**
     * Transforms reflected annotations into AnnotationSymbols
     * @param annotations the reflected annotations
     * @return the AnnotationSymbols corresponding to the reflected annotations
     */
    protected static AnnotationSymbol[] fromAnnotations(Annotation[] annotations) {
        AnnotationSymbol[] syms = new AnnotationSymbol[annotations.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = new AnnotationSymbol(annotations[i]);
        }
        return syms;
    }

    /**
     * Transforms reflected annotated types into Types
     * @param types the reflected annotated types
     * @return the Types corresponding to the reflected annotated types
     */
    protected static Type[] fromTypes(AnnotatedType[] types) {
        Type[] syms = new Type[types.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromType(types[i]);
        }
        return syms;
    }

    /**
     * Transforms reflected types into Types
     * @param types the reflected Types
     * @return the Types corresponding to the reflected types
     */
    protected static Type[] fromTypes(java.lang.reflect.Type[] types) {
        Type[] syms = new Type[types.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromType(types[i]);
        }
        return syms;
    }

    /**
     * Transforms a reflected annotated type into a Type
     * @param type the reflected annotated type
     * @return the Type corresponding to the reflected annotated type
     */
    protected static Type fromType(java.lang.reflect.AnnotatedType type) {
        Type ret = fromType(type.getType());
        ret.setAnnotations(fromAnnotations(type.getAnnotations()));
        return ret;
    }

    /**
     * Transforms a reflected type into a Type
     * @param type the reflected type
     * @return the Type corresponding to the reflected type
     */
    protected static Type fromType(java.lang.reflect.Type type) {
        Type ret = null;
        if (type instanceof GenericArrayType) {
            ret = fromType(((GenericArrayType)type).getGenericComponentType());
            ret = new ArrayType(ret);
        } else if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType ref = (java.lang.reflect.ParameterizedType)type;
            ret = new ParameterizedType((ClassSymbol)fromType(ref.getRawType()),
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
                ret = ReflectedClassSymbol.get(cls);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return ret;
    }

    /**
     * Transforms a reflected type variable into a TypeVariable
     * @param type the reflected type variable
     * @return the TypeVariable corresponding to the reflected type variable
     */
    protected static
        TypeVariable fromTypeVariable(java.lang.reflect.TypeVariable<?> type) {
        // TODO fix cyclic recursion
        // creation of type variable must not create bounds ???
        return new TypeVariable(type.getName());
        // fromTypes(type.getAnnotatedBounds()));
    }

    /**
     * Transforms reflected type variables into TypeVariables
     * @param params the reflected type variables
     * @return the TypeVariables corresponding to the reflected type variables
     */
    protected static
        TypeVariable[] fromTypeParameters(java.lang.reflect.TypeVariable<?>[] params) {
        TypeVariable[] syms = new TypeVariable[params.length];
        for (int i = 0; i < syms.length; i++) {
            syms[i] = fromTypeVariable(params[i]);
        }
        return syms;
    }
}
