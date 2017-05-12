package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.Map;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class reflecting a wildcard type argument
 */
public class WildcardType extends Type {
    private boolean upper;
    private ReferenceType bound;
    private boolean bounded; // non-trivially by Object

    /**
     * Constructs a new WildcardType
     */
    public WildcardType() {
        this(true, fetch("Object"));
    }

    public WildcardType(WildcardType type) {
        this(type.upper, type.bound.copy()) ;
    }

    /**
     * Constructs a new bounded WildcardType
     * @param upper true iff bound is an upper bound
     * @param bound the bound of this wildcard
     */
    public WildcardType(boolean upper, ReferenceType bound) {
        this.upper = upper;
        this.bound = bound;
        bounded = !bound.equals(fetch("Object"));
    }

    @Override
    public WildcardType copy() {
        return new WildcardType(this);
    }

    @Override
    public String getName() {
        String ret = "?";
        ret += " " + (upper ? "extends" : "super") + " ";
        ret += bound.getName();
        return ret;
    }

    @Override
    public ClassSymbol getClassSymbol() {
        return bound.getClassSymbol();
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getTypeName() {
        String ret = "?";
        ret += " " + (upper ? "extends" : "super") + " ";
        ret += bound.getTypeName();
        return ret;
    }

    /**
     * Determines if this Type is non-trivially bounded
     * @return true iff Type is non-trivially bounded
     */
    public boolean isBounded() {
        return bounded;
    }

    /**
     * Determines if this Type's bound is an upper bound
     * @return true iff this Type's bound is an upper bound
     */
    public boolean isUpperBounded() {
        return upper;
    }

    /**
     * Gets the bound of this Type
     * @return the bound of this Type
     */
    public ReferenceType getBound() {
        return bound;
    }

    @Override
    public WildcardType adapt(Map<TypeVariable, Type> map) {
        return new WildcardType(upper, bound.adapt(map));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof WildcardType) {
            WildcardType type = (WildcardType)other;
            return Arrays.equals(annotations, type.annotations) &&
                bound.equals(type.bound) &&
                upper == type.upper;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return bound.hashCode() ^ Boolean.hashCode(upper);
    }
}
