package com.binghamton.jhelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.binghamton.jhelp.util.StringUtils;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class representing a Java method
 */
public class MethodSymbol extends Symbol {

        {
            kind = SymbolKind.METHOD;
        }

    protected MethodType type;

    protected ClassSymbol declarer;
    protected Type[] paramTypes = {};
    protected TypeVariable[] typeVars = {};
    protected Type[] exceptions = {};
    protected boolean variadic = false;
    protected boolean constructor = false;
    protected Type returnType;

    protected MethodSymbol(MethodSymbol method) {
        this.type = method.type;
        this.declarer = method.declarer;
        this.paramTypes = method.paramTypes;
        this.typeVars = method.typeVars;
        this.exceptions = method.exceptions;
        this.variadic = method.variadic;
        this.constructor = method.constructor;
        this.returnType = method.returnType;
    }

    /**
     * Constructs a new named method symbol
     * @param name the name of the method
     */
    public MethodSymbol(String name) {
        super(name);
    }

    /**
     * Construct a new MethodSymbol with modifiers
     * @param name the name of this MethodSymbol
     * @param modifiers the modifiers of this MethodSymbol
     */
    public MethodSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public MethodSymbol(Method method) {
        super(method.getName(), method.getModifiers());
        constructor = false;
        returnType = fromType(method.getAnnotatedReturnType());
        commonInit(method);
        constructType();
    }

    public MethodSymbol(Constructor<?> ctor) {
        super(ctor.getName(), ctor.getModifiers());
        constructor = true;
        returnType = ReflectedClassSymbol.get(ctor.getDeclaringClass());
        commonInit(ctor);
        constructType();
    }

    public boolean isVariadic() {
        return variadic;
    }

    /**
     * Gets the formal parameters of this Method
     * @return the formal parameters of this Method
     */
    public Type[] getParameterTypes() {
        return paramTypes;
    }

    public Type[] getVariadicParameterTypesFor(int numArgs) {
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
        return paramTypes.length;
    }

    public int numParameters() {
        return paramTypes.length;
    }

    public Type[] getExceptionTypes() {
        return exceptions;
    }

    public boolean hasExceptions() {
        return exceptions.length > 0;
    }

    public boolean hasCheckedExceptions() {
        if (exceptions.length > 0)  {
            for (Type exc : exceptions) {
                if (exc.getClassSymbol().extendsClass(fetch("Throwable"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public TypeVariable[] getTypeParameters() {
        return typeVars;
    }

    public int numTypeParameters() {
        return typeVars.length;
    }

    public boolean isGeneric() {
        return typeVars.length > 0;
    }

    public boolean hasTypeParameters() {
        return typeVars.length > 0;
    }

    public ClassSymbol getDeclaringClass() {
        return declarer;
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

    protected static void adapt(MethodSymbol method,
                                Map<TypeVariable, Type> map){
        // allow method type parameters to shadow outer scopes'
        for (TypeVariable mParam : method.typeVars) {
            if (map.containsKey(mParam)) {
                map.remove(mParam);
            }
        }
        for (int i = 0; i < method.paramTypes.length; i++) {
            method.paramTypes[i] = method.paramTypes[i].adapt(map);
        }
        for (int i = 0; i < method.exceptions.length; i++) {
            method.exceptions[i] = method.exceptions[i].adapt(map);
        }
        method.returnType = method.returnType.adapt(map);
    }

    @Override
    public MethodSymbol adapt(Map<TypeVariable, Type> map) {
        MethodSymbol ret = new MethodSymbol(this);
        adapt(ret, map);
        return ret;
    }

    public boolean equals(Object other) {
        return other instanceof MethodSymbol &&
            type.equals(((MethodSymbol)other).type);
    }

    public int hashCode() {
        return type.hashCode();
    }

    public Type getReturnType() {
        return returnType;
    }
    public boolean isConstructor() {
        return constructor;
    }

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

    private void commonInit(Executable exe) {
        declarer = ReflectedClassSymbol.get(exe.getDeclaringClass());
        variadic = exe.isVarArgs();
        typeVars = fromTypeParameters(exe.getTypeParameters());
        paramTypes = fromTypes(exe.getAnnotatedParameterTypes());
        exceptions = fromTypes(exe.getAnnotatedExceptionTypes());
    }
}
