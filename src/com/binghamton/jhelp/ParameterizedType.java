package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

public class ParameterizedType implements Type {
    private AnnotationSymbol[] annotations = {};
    private Type wrapped;
    private Type[] params;

    public ParameterizedType(Type wrapped, Type parameter) {
        if (wrapped == null) throw new IllegalArgumentException();
        this.wrapped = wrapped;
        this.params = new Type[]{parameter};
    }

    public ParameterizedType(Type wrapped, Type[] parameters) {
        if (wrapped == null) throw new IllegalArgumentException();
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

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
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

    public Type getWrappedType() {
        return wrapped;
    }

    public Type[] getParameters() {
        return params;
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
