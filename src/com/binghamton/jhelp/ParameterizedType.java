package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

public class ParameterizedType extends Type {
    private Type wrapped;
    private Type[] params;

    public ParameterizedType(Type wrapped, Type parameter) {
        this.wrapped = wrapped;
        this.params = new Type[]{parameter};
    }

    public ParameterizedType(Type wrapped, Type[] parameters) {
        this.wrapped = wrapped;
        this.params = parameters;
    }

    public String getName() {
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
        return wrapped.getClassSymbol();
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

    @Override
    public ParameterizedType adapt(Type[] args) {
        throw new UnsupportedOperationException("cannot adapt a parameterized type");
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
}
