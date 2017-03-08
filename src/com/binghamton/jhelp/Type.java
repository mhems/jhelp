package com.binghamton.jhelp;

/**
 * An interface representing a Java type
 */
public interface Type {

    AnnotationSymbol[] getAnnotations();
    String getName();
    String getTypeName();

    // ArrayType augment(int n);

    default int rank() {
        return 0;
    }

    default boolean isEquivalentTo(Type other) { return true; }
    default boolean isAssignableTo(Type other) { return true; }
    default boolean isSubTypeOf(Type other) { return true; }
    default boolean isSuperTypeOf(Type other) { return true; }
}
