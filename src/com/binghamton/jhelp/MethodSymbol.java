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
 * A class representing a Java method or constructor
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

    /**
     * Copy construct a MethodSymbol from an existing one
     * @param method the existing method to copy from
     */
    public MethodSymbol(MethodSymbol method) {
        super(method.name, method.modifiers);
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
    protected MethodSymbol(String name) {
        super(name);
    }

    /**
     * Construct a new MethodSymbol with modifiers
     * @param name the name of this MethodSymbol
     * @param modifiers the modifiers of this MethodSymbol
     */
    protected MethodSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct a new MethodSymbol from a reflected Java method.
     * @param method the existing method to reflect
     */
    public MethodSymbol(Method method) {
        super(method.getName(), method.getModifiers());
        constructor = false;
        if (method.getDefaultValue() != null) {
            addModifier(Modifier.DEFAULT);
        }
        commonInit(method);
    }

    /**
     * Construct a new MethodSymbol from a reflected Java method.
     * @param ctor the existing constructor to reflect
     */
    public MethodSymbol(Constructor<?> ctor) {
        super(ctor.getName(), ctor.getModifiers());
        constructor = true;
        commonInit(ctor);
    }

    /**
     * Determines if this method accepts a variable amount of
     * arguments.
     * @return true iff this method has variable arity
     */
    public boolean isVariadic() {
        return variadic;
    }

    /**
     * Gets the Types of the formal parameters of this method
     * @return the Types of the formal parameters of this method
     */
    public Type[] getParameterTypes() {
        return paramTypes;
    }

    /**
     * Gets the variadic signature of this method for an invocation
     * with a given number of arguments. This operation duplicates the
     * last formal parameter as necessary such that the number of
     * parameters equals the number of arguments this method was
     * invoked with.
     * @param numArgs the number of arguments this variadic method was
     *        invoked with.
     * @return the Types of the variadic parameters of this method.
     */
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

    /**
     * Determines the most specific method among a List of methods
     * @param methods the List of methods to select from
     * @return the most specific method
     */
    public static MethodSymbol mostSpecificMethod(List<MethodSymbol> methods) {
        Collections.sort(methods, MethodSymbol::isMoreSpecificThan);
        return methods.get(0);
    }

    /**
     * Determines if one method is strictly more specific than
     * another.  This method is designed to satisfy the Comparator
     * functional interface.
     * @param a the method to compare with
     * @param b the method to compare against
     * @return < 0 if a is more specific than b
     *           0 if a is as specific as b
     *         > 0 if b is more specific than a
     */
    private static int isMoreSpecificThan(MethodSymbol a, MethodSymbol b) {
        Type[] thisTypes = a.getParameterTypes();
        Type[] otherTypes = b.getParameterTypes();
        for (int i = 0; i < thisTypes.length; i++) {
            if (!thisTypes[i].isSubTypeOf(otherTypes[i])) {
                return 1;
            }
        }
        for (int i = 0; i < thisTypes.length; i++) {
            if (!otherTypes[i].isSubTypeOf(thisTypes[i])) {
                return -1;
            }
        }
        return 0;
    }

    /**
     * Gets the number of arguments this method accepts
     * @return the number of arguments this method accepts
     */
    public int arity() {
        return paramTypes.length;
    }

    /**
     * Gets the number of arguments this method accepts
     * @return the number of arguments this method accepts
     */
    public int numParameters() {
        return paramTypes.length;
    }

    /**
     * Gets the Types of exceptions this method may throw
     * @return the Types of exceptions this method may throw
     */
    public Type[] getExceptionTypes() {
        return exceptions;
    }

    /**
     * Determines if this method throws any exceptions
     * @return true iff this method throws any exceptions
     */
    public boolean hasExceptions() {
        return exceptions.length > 0;
    }

    /**
     * Determines if this method throws any checked exceptions
     * @return true iff this method throws any checked exceptions
     */
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

    /**
     * Gets the type parameters this method declares
     * @return the type parameters this method declares
     */
    public TypeVariable[] getTypeParameters() {
        return typeVars;
    }

    /**
     * Gets the number of type parameters this method declares
     * @return the number of type parameters this method declares
     */
    public int numTypeParameters() {
        return typeVars.length;
    }

    /**
     * Determines if this method is generic.
     * @return true iff this method is generic.
     */
    public boolean isGeneric() {
        return typeVars.length > 0;
    }

    /**
     * Determines if this method has any type parameters
     * @return true iff this method has any type parameters
     */
    public boolean hasTypeParameters() {
        return typeVars.length > 0;
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    /**
     * Determines if the Override annotation is present on this method
     * @return true iff the Override annotation is present on this method
     */
    public boolean hasOverrideAnnotation() {
        for (AnnotationSymbol a : annotations) {
            if (a.getType().equals(fetch("Override"))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if this method overrides another
     * @param other the method this method may be overriding
     * @return true iff this method overrides another
     */
    public boolean overrides(MethodSymbol other) {
        return type.overrideEquivalent(other.type);
    }

    /**
     * Helper hook function to adapt a method with substitutions
     * @param method the method to adapt
     * @param map the Map mapping type variables to the types that
     *        should replace them
     */
    protected static void adapt(MethodSymbol method,
                                Map<TypeVariable, Type> map){
        // allow method type parameters to shadow outer scopes'
        // for (TypeVariable mParam : method.typeVars) {
        //     if (map.containsKey(mParam)) {
        //         // map.remove(mParam);
        //         // System.out.println("----> removing " + mParam);
        //     }
        // }
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

    @Override
    public boolean equals(Object other) {
        return other instanceof MethodSymbol &&
            type.equals(((MethodSymbol)other).type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    /**
     * Gets the return type of this method
     * @return the return type of this method
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Determines if this method is a constructor
     * @return true iff this method is a constructor
     */
    public boolean isConstructor() {
        return constructor;
    }

    @Override
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

    /**
     * An initialization method that must be called once all
     * attributes of the method are established.
     */
    public void constructType() {
        type = MethodType.fromMethod(this);
    }

    /**
     * Gets the MethodType that captures all Type information of this
     * method.
     * @return the MethodType corresponding to this method
     */
    public MethodType getType() {
        return type;
    }

    /**
     * Determines if this method has the same sub-signature as another
     * @param other the other method in question
     * @return true iff this method has the same sub-signature as
     *         `other`
     */
    public boolean hasSameSubsignature(MethodSymbol other) {
        return type.sameSubsignature(other.type);
    }

    /**
     * Determines if this method is return-type substitutable for another
     * @param other the other method in question
     * @return true iff this method is return-type substitutable for
     *         `other`
     */
    public boolean returnTypeSubstitutable(MethodSymbol other) {
        Type retType = getReturnType();
        Type otherRetType = other.getReturnType();
        if (retType.equals(otherRetType)) {
            return true;
        }
        // TODO incomplete
        return false;
    }

    /**
     * Common initialization of a pre-compiled method or constructor
     * @param exe the pre-compiled Executable to reflect
     */
    private void commonInit(Executable exe) {
        declarer = ReflectedClassSymbol.get(exe.getDeclaringClass());
        variadic = exe.isVarArgs();
        typeVars = fromTypeParameters(exe.getTypeParameters());
        paramTypes = fromTypes(exe.getAnnotatedParameterTypes());
        exceptions = fromTypes(exe.getAnnotatedExceptionTypes());
        if (constructor) {
            if (declarer.isGeneric()) {
                returnType = new ParameterizedType(declarer,
                                                   declarer.getTypeParameters());
            } else {
                returnType = declarer;
            }
        } else {
            returnType = fromType(exe.getAnnotatedReturnType());
        }
        constructType();
    }
}
