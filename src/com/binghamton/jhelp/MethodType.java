package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.Map;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class capturing the type information of a method signature.
 */
public final class MethodType extends Type {
    private ClassSymbol declarer;
    private TypeVariable[] typeParams = {};
    private Type[] paramTypes = {};

    /**
     * Construct a MethodType with just a name
     * @param name the name of the MethodType
     */
    private MethodType(String name) {
        super(name);
    }

    /**
     * Construct a MethodType from its declaring method
     * @param method the MethodSymbol to construct from
     */
    private MethodType(MethodSymbol method) {
        super(method.getName());
        declarer = method.getDeclaringClass();
        typeParams = Arrays.copyOf(method.getTypeParameters(), method.getTypeParameters().length);
        paramTypes = Arrays.copyOf(method.getParameterTypes(), method.getParameterTypes().length);
    }

    @Override
    public MethodType copy() {
        return fromParameters(getName(), paramTypes);
    }


    /**
     * Build a MethodType from its name and parameter types
     * @param name the name of the method to build
     * @param paramTypes the types of the variable number of
     *        parameters the method accepts.
     * @return a MethodType with the corresponding data
     */
    public static MethodType fromParameters(String name, Type... paramTypes) {
        MethodType type = new MethodType(name);
        type.paramTypes = Arrays.copyOf(paramTypes, paramTypes.length);
        return type;
    }

    /**
     * Build a MethodType from an existing MethodSymbol
     * @param method the existing MethodSymbol
     * @return a MethodType with the corresponding data
     */
    public static MethodType fromMethod(MethodSymbol method) {
        return new MethodType(method);
    }

    @Override
    public ClassSymbol getClassSymbol() {
        throw new UnsupportedOperationException("a method cannot be interpreted as a class");
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    @Override
    public String getTypeName() {
        StringBuilder sb = new StringBuilder(name);
        if (typeParams.length > 0) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       typeParams,
                                       t -> t.getName()));
            sb.append(">");
        }
        sb.append("(");
        sb.append(StringUtils.join(", ",
                                   paramTypes,
                                   t -> t.getName()));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public MethodType erase() {
        MethodType erased = new MethodType(name);
        erased.declarer = declarer;
        erased.typeParams = new TypeVariable[0];
        erased.paramTypes = new Type[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            erased.paramTypes[i] = paramTypes[i].erase();
        }
        return erased;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isReference() {
        return false;
    }

    @Override
    public MethodType adapt(Map<TypeVariable, Type> map) {
        MethodType ret = new MethodType(name);
        ret.declarer = declarer;
        ret.paramTypes = new Type[paramTypes.length];
        for (int i = 0; i < ret.paramTypes.length; i++) {
            ret.paramTypes[i] = paramTypes[i].adapt(map);
        }
        return ret;
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^
            typeParams.length ^
            paramTypes.length;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof MethodType) {
            MethodType otherT = (MethodType)other;
            return this.isEquivalentTo(otherT);
        }
        return false;
    }

    /**
     * Determines if this MethodType is equivalent to another Type
     * @param other the other Type in question
     * @return true iff `other` is a MethodType with the same
     *         signature as this MethodType.
     */
    public boolean isEquivalentTo(Type other) {
        if (other instanceof MethodType) {
            return sameSignature((MethodType)other);
        }
        return false;
    }

    /**
     * Determines if this MethodType has the same signature as another
     * @param other the other MethodType in question
     * @return true iff this MethodType has the same signature as
     *         `other`
     */
    public boolean sameSignature(MethodType other) {
        return name.equals(name) &&
            Arrays.equals(typeParams, other.typeParams) &&
            Arrays.equals(paramTypes, other.paramTypes);
    }

    /**
     * Determines if this MethodType has the same sub-signature as
     * another
     * @param other the other MethodType in question
     * @return true iff this MethodType has the same sub-signature as
     *         `other`
     */
    public boolean sameSubsignature(MethodType other) {
        return sameSignature(other) || sameSignature(other.erase());
    }

    /**
     * Determines if this MethodType is override equivalent with
     * another
     * @param other the other MethodType in question
     * @return true iff this MethodType is override-equivalent to
     *         `other`.
     */
    public boolean overrideEquivalent(MethodType other) {
        return this.sameSubsignature(other) || other.sameSubsignature(this);
    }
}
