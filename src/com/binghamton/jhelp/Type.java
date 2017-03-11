package com.binghamton.jhelp;

/**
 * An interface representing a Java type
 */
public interface Type {

    AnnotationSymbol[] getAnnotations();
    void setAnnotations(AnnotationSymbol[] annotations);
    String getName();
    String getTypeName();

    default String repr() {
        return getTypeName();
    }

    default int rank() {
        return 0;
    }

    // For now, until type checking
    default boolean isEquivalentTo(Type other) { return true; }
    default boolean isAssignableTo(Type other) { return true; }
    default boolean isSubTypeOf(Type other) { return true; }
    default boolean isSuperTypeOf(Type other) { return true; }
}
