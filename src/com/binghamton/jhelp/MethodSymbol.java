package com.binghamton.jhelp;

import java.util.Collections;
import java.util.List;

import com.binghamton.jhelp.util.StringUtils;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class representing a Java method
 */
public abstract class MethodSymbol extends Symbol {

        {
            kind = SymbolKind.METHOD;
        }

    private MethodType type;
    private int arity;
    private int typeArity;

    /**
     * Constructs a new named method symbol
     * @param id the name of the method
     */
    public MethodSymbol(String id) {
        super(id);
    }

    /**
     * Construct a new MethodSymbol with modifiers
     * @param name the name of this MethodSymbol
     * @param modifiers the modifiers of this MethodSymbol
     */
    public MethodSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public MethodSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    public abstract boolean isVariadic();

    /**
     * Gets the formal parameters of this Method
     * @return the formal parameters of this Method
     */
    public abstract Type[] getParameterTypes();

    public Type[] getVariadicParameterTypesFor(int numArgs) {
        Type[] paramTypes = getParameterTypes();
        Type[] ret = new Type[numArgs];
        int n = paramTypes.length - 1;
        for (int i = 0; i < n; i++) {
            ret[i] = paramTypes[i];
        }
        if (numArgs > n) {
            ArrayType last = (ArrayType)paramTypes[paramTypes.length - 1];
            for (int i = n; i < numArgs; i++) {
                ret[i] = last.getBaseType();
            }
        }
        return ret;
    }

    public static MethodSymbol mostSpecificMethod(List<MethodSymbol> methods) {
        Collections.sort(methods, MethodSymbol::isMoreSpecificThan);
        return methods.get(0);
    }

    private static int isMoreSpecificThan(MethodSymbol a, MethodSymbol b) {
        Type[] thisTypes = a.getParameterTypes();
        Type[] otherTypes = b.getParameterTypes();
        for (int i = 0; i < thisTypes.length; i++) {
            if (!thisTypes[i].isSubTypeOf(otherTypes[i])) {
                return 1;
            }
        }
        return -1;
    }

    public int arity() {
        return arity;
    }

    public int numParameters() {
        return getParameterTypes().length;
    }

    public abstract Type[] getExceptionTypes();

    public boolean hasExceptions() {
        return getExceptionTypes().length > 0;
    }

    public boolean hasCheckedExceptions() {
        Type[] excs = getExceptionTypes();
        if (excs.length > 0)  {
            for (Type exc : excs) {
                if (exc.getClassSymbol().extendsClass(fetch("Throwable"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract TypeVariable[] getTypeParameters();

    public int typeArity() {
        return typeArity;
    }

    public boolean isGeneric() {
        return typeArity > 0;
    }

    public boolean hasTypeParameters() {
        return getTypeParameters().length > 0;
    }

    public ClassSymbol getDeclaringClass() {
        return null;
    }

    public boolean hasOverrideAnnotation() {
        for (AnnotationSymbol a : annotations) {
            if (a.getType().equals(fetch("Override"))) {
                return true;
            }
        }
        return false;
    }

    public boolean overrides(MethodSymbol other) {
        return type.overrideEquivalent(other.type);
    }

    @Override
    public abstract MethodSymbol adapt(Type[] args);

    public boolean equals(Object other) {
        return other instanceof MethodSymbol &&
            type.equals(((MethodSymbol)other).type);
    }

    public int hashCode() {
        return type.hashCode();
    }

    public abstract Type getReturnType();
    public abstract boolean isConstructor();

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (hasModifiers()) {
            sb.append(getModifiers().toString());
            sb.append(" ");
        }

        if (!isConstructor()) {
            sb.append(getReturnType().getName());
            sb.append(" ");
        }
        sb.append(type.getTypeName());
        if (getExceptionTypes().length > 0) {
            sb.append(" throws ");
            sb.append(StringUtils.join(", ",
                                       getExceptionTypes(),
                                       t -> t.getTypeName()));
        }
        return sb.toString();
    }

    public void constructType() {
        type = MethodType.fromMethod(this);
        arity = getParameterTypes().length;
        typeArity = getTypeParameters().length;
    }

    public MethodType getType() {
        return type;
    }

    public boolean hasSameSubsignature(MethodSymbol other) {
        return type.sameSubsignature(other.type);
    }

    public boolean returnTypeSubstitutable(MethodSymbol other) {
        Type retType = getReturnType();
        Type otherRetType = other.getReturnType();
        if (retType.equals(otherRetType)) {
            return true;
        }
        // TODO incomplete
        return false;
    }
}
