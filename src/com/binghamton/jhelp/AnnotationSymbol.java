package com.binghamton.jhelp;

import java.lang.annotation.Annotation;

public class AnnotationSymbol {
    private ClassSymbol type;

    public AnnotationSymbol(ClassSymbol type) {
        this.type = type;
    }

    public AnnotationSymbol(Annotation annotation) {
        this.type = ReflectedClassSymbol.get(annotation.annotationType());
    }

    public ClassSymbol getType() {
        return type;
    }

    public String getName() {
        return type.getName();
    }
}
