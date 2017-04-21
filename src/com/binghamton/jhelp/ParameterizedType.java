package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.Map;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class representing the parameterization of a generic type with type
 * arguments.
 */
public class ParameterizedType extends ReferenceType {
    private ClassSymbol wrapped;
    private Type[] params;

    /**
     * Constructs a new ParameterizedType
     * @param wrapped the generic class this type parameterizes
     * @param parameters the type arguments to this Type
     */
    public ParameterizedType(ClassSymbol wrapped, Type... parameters) {
        if (wrapped == null) {
            throw new IllegalArgumentException("cannot wrap a null type");
        }
        this.wrapped = wrapped;
        this.params = parameters;
        // isWellFormed(); // TODO infinite recursion?
    }

    @Override
    public String getName() {
        System.out.println("wrapped: " + wrapped);
        StringBuilder sb = new StringBuilder(wrapped.getName());
        sb.append("<");
        if (params.length > 0) {
            sb.append(StringUtils.join(", ", params, t -> t.getName()));
        }
        sb.append(">");
        return sb.toString();
    }

    @Override
    public String getTypeName() {
        StringBuilder sb = new StringBuilder(wrapped.getTypeName());
        sb.append("<");
        if (params.length > 0) {
            sb.append(StringUtils.join(", ", params, t -> t.getTypeName()));
        }
        sb.append(">");
        return sb.toString();
    }

    @Override
    public ClassSymbol getClassSymbol() {
        System.out.println("getting class symbol for " + getName());
        return wrapped.substitute(params);
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        return wrapped.getDeclaringClass();
    }

    /**
     * Gets the generic type this Type parameterizes
     * @return the generic type this Type parameterizes
     */
    public Type getWrappedType() {
        return wrapped;
    }

    /**
     * Gets the type arguments to this Type
     * @return the type arguments to this Type
     */
    public Type[] getParameters() {
        return params;
    }

    /**
     * Gets a specific argument to this Type
     * @param i the index of the argument to get
     * @return the `i`th argument to this Type
     */
    public Type getParameter(int i) {
        return params[i];
    }

    @Override
    public ParameterizedType adapt(Map<TypeVariable, Type> map) {
        Type[] newParams = new Type[params.length];
        for (int i = 0; i < newParams.length; i++) {
            newParams[i] = params[i].adapt(map);
        }
        return new ParameterizedType(wrapped.adapt(map), newParams);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType)other;
            return wrapped.equals(type.wrapped) &&
                Arrays.equals(params, type.params);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return wrapped.hashCode() ^ params.length;
    }

    @Override
    public Type erase() {
        return wrapped.erase();
    }

    @Override
    public ParameterizedType captureConvert() {
        Type[] newArgs = new Type[params.length];
        for (int i = 0; i < newArgs.length; i++) {
            if (params[i] instanceof WildcardType) {
                // TODO
                newArgs[i] = new TypeVariable("Fresh");
            } else {
                newArgs[i] = params[i];
            }
        }
        return new ParameterizedType(wrapped, newArgs);
    }

    /**
     * Determines if this ParameterizedType is well-formed
     * @return true iff this ParameterizedType is well-formed
     */
    public boolean isWellFormed() {
        boolean ret = false;
        if (wrapped instanceof ClassSymbol) {
            if (wrapped.isGeneric()) {
                TypeVariable[] clsVars = wrapped.getTypeParameters();
                Type[] myArgs = captureConvert().getParameters();
                if (clsVars.length == params.length) {
                    ret = true;
                    for (int i = 0; i < clsVars.length; i++) {
                        for (Type bound : clsVars[i].getBounds()) {
                            if (!myArgs[i].isSubTypeOf(bound)) {
                                System.err.println("invalid arg, not a subtype");
                                ret = false;
                            }
                        }
                    }
                } else {
                    System.err.println("class number of parameters does not match with number of arguments given");
                }
            } else {
                System.err.println("can only parameterize a generic class");
            }
        } else {
            System.err.println("can only parameterize a class");
        }
        return ret;
    }

    @Override
    public boolean isReifiable() {
        for (Type param : params) {
            if (!(param instanceof WildcardType) ||
                ((WildcardType)param).isBounded()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValidClassLiteralType() {
        return false;
    }
}
