package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.Map;

import com.binghamton.jhelp.util.StringUtils;

public class ParameterizedType extends ReferenceType {
    private ClassSymbol wrapped;
    private Type[] params;

    public ParameterizedType(ClassSymbol wrapped, Type parameter) {
        this(wrapped, new Type[]{parameter});
    }

    public ParameterizedType(ClassSymbol wrapped, Type[] parameters) {
        if (wrapped == null)  throw new IllegalArgumentException("cannot wrap a null type");
        this.wrapped = wrapped;
        this.params = parameters;
        // isWellFormed(); // TODO infinite recursion?
    }

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

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(wrapped.getTypeName());
        sb.append("<");
        if (params.length > 0) {
            sb.append(StringUtils.join(", ", params, t -> t.getTypeName()));
        }
        sb.append(">");
        return sb.toString();
    }

    public ClassSymbol getClassSymbol() {
        System.out.println("getting class symbol for " + getName());
        return wrapped.substitute(params);
    }

    public ClassSymbol getDeclaringClass() {
        return wrapped.getDeclaringClass();
    }

    public Type getWrappedType() {
        return wrapped;
    }

    public Type[] getParameters() {
        return params;
    }

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

    public boolean equals(Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType)other;
            return wrapped.equals(type.wrapped) &&
                Arrays.equals(params, type.params);
        }
        return false;
    }

    public int hashCode() {
        return wrapped.hashCode() ^ params.length;
    }

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
