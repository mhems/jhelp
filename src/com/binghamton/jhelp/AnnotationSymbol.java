package com.binghamton.jhelp;

public class AnnotationSymbol {
    private ClassSymbol type;

    public AnnotationSymbol(ClassSymbol type) {
        this.type = type;
    }

    public ClassSymbol getType() {
        return type;
    }

    public String getName() {
        return "@" + type.getName();
    }
}
