package com.binghamton.jhelp;

import com.binghamton.jhelp.util.StringUtils;

public class ParameterizedType implements Type {
    private Type wrapped;
    private Type[] params;

    public ParameterizedType(Type wrapped, Type... parameters) {
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
        return wrapped.getAnnotations(); // TODO correct?
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

    public Type getWrappedType() {
        return wrapped;
    }

    public Type[] getParameters() {
        return params;
    }
}