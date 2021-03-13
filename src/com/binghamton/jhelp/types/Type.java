package com.binghamton.jhelp.types;

import java.util.Map;

import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.symbols.AnnotationSymbol;
import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.symbols.Symbol;

/**
 * A base class representing a Java type
 */
public abstract class Type extends Symbol {

    {
        kind = SymbolKind.TYPE;
    }

    /**
     * Gets the type name of this ArrayType
     * @return the type name of this ArrayType
     */
    public abstract String getTypeName();

    /**
     * Gets the ClassSymbol reflecting this type
     * @return the ClassSymbol reflecting this type
     */
    public abstract ClassSymbol getClassSymbol();

    /**
     * Adapts this type with the substitutions specified
     * @param map the substition map that associates type variables
     * with the types to substitute in their place
     * @return the adaptation of this type
     */
    @Override
    public abstract Type adapt(Map<TypeVariable, Type> map);

    /**
     * Constructs an empty Type
     */
    protected Type() {

    }

    /**
     * Copies this Type into a new Type with equivalent contents
     * @return a new Type with equivalent contents of this Type
     */
    public abstract Type copy();

    /**
     * Performs copies of each Type in an array of Types
     * @param types the array of Types to copy
     * @return a new array holding the copied contents of the given array
     */
    protected static Type[] copyTypes(Type[] types) {
        Type[] ret = new Type[types.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = types[i].copy();
        }
        return ret;
    }

    /**
     * Constructs a named Type
     * @param name the name of this Type
     */
    protected Type(String name) {
        super(name);
    }

    /**
     * Constructs a named, annotated Type
     * @param name the name of this Type
     * @param annotations the annotations of this Type
     */
    protected Type(String name, AnnotationSymbol[] annotations) {
        super(name, annotations);
    }

    /**
     * Constructs an annotated Type
     * @param annotations the annotations of this Type
     */
    protected Type(AnnotationSymbol[] annotations) {
        super(annotations);
    }

    /**
     * Constructs an named, modified Type
     * @param name the name of this Type
     * @param modifiers a bit-mask of this Type's modifiers
     */
    protected Type(String name, int modifiers) {
        super(name, modifiers);
    }

    /**
     * Constructs an named, modified Type
     * @param name the name of this Type
     * @param modifiers the Modifiers of this Type
     */
    protected Type(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    /**
     * Computes the type erasure of this ArrayType
     * @return a new Type which is this type's erasure
     */
    public Type erase() {
        return this;
    }

    /**
     * Boxes this Type into its corresponding class, if applicable
     * @return the boxed class if a boxing conversion could be applied,
     * otherwise null
     */
    public ClassSymbol box() {
        return null;
    }

    /**
     * Unboxes this Type into its corresponding primitive type, if applicable
     * @return the unboxed primitive type if an unboxing conversion could be
     * applied, otherwise null
     */
    public PrimitiveType unbox() {
        return null;
    }

    /**
     * Computes the capture conversion of this Type
     * @return the capture conversion of this Type
     */
    public Type captureConvert() {
        return this;
    }

    /**
     * Determines if a widening conversion to another Type can be performed.
     * @param type the attempted target Type
     * @return true iff a widening conversion to another Type can be performed
     */
    public boolean canWidenTo(Type type) {
        return false;
    }

    /**
     * Determines if this type can be cast to another Type
     * @param target the Type attempting to be cast to
     * @return true iff this Type can be cast to `target`
     */
    public boolean canCastTo(Type target) {
        return false;
    }

    /**
     * Determines if a narrowing conversion to another Type can be performed.
     * @param type the attempted target Type
     * @return true iff a narrowing conversion to another Type can be performed
     */
    public boolean canNarrowTo(Type type) {
        return false;
    }

    /**
     * Builds a String representation of this Type
     * @return the String representation of this Type
     */
    public String repr() {
        return getTypeName();
    }

    /**
     * Gets the number of dimensions of this Type
     * @return the number of dimensions of this Type
     */
    public int rank() {
        return 0;
    }

    /**
     * Gets the name of this Type
     * @return the name of this Type
     */
    public abstract String getName();

    @Override
    public String toString() {
        return getTypeName();
    }

    /**
     * Determines if this Type is a subtype of another Type
     * @param other the potential supertype of this Type
     * @return true iff this Type is a subtype of another Type
     */
    public boolean isSubTypeOf(Type other) {
        return other.isSuperTypeOf(this);
    }

    /**
     * Determines if this Type is a supertype of another Type
     * @param other the potential subtype of this Type
     * @return true iff this Type is a supertype of another Type
     */
    public /*abstract*/ boolean isSuperTypeOf(Type other) { return true; }

    /**
     * Determines if this type is reifiable
     * @return true iff this type is reifiable
     */
    public boolean isReifiable() {
        return false;
    }

    /**
     * Determines if this type is raw
     * @return true iff this type is raw
     */
    public boolean isRaw() {
        return false;
    }

    /**
     * Determines if this Type is a reference type
     * @return true iff this Type is a reference type
     */
    public boolean isReference() {
        return false;
    }

    /**
     * Determines if this type can be used as a class literal type
     * @return true iff this type can be used as a class literal type
     */
    public boolean isValidClassLiteralType() {
        return true;
    }

    /**
     * Computes the least upper bound of the given Types as a new Type
     * @param types the types to compute the least upper bound of
     * @return a new Type which is the least upper bound of all the given Types
     */
    public static Type lub(Type... types) {
        if (types.length == 1) {
            return types[0];
        }
        return types[0]; // TODO
    }
}
