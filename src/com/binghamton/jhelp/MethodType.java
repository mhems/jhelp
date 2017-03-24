package com.binghamton.jhelp;

import java.util.Arrays;

import com.binghamton.jhelp.util.StringUtils;

public class MethodType extends Type {
    private ClassSymbol declarer;
    private Type[] typeParams = {};
    private Type[] paramTypes = {};

    private MethodType(String name) {
        super(name);
    }

    private MethodType(MethodSymbol method) {
        super(method.getName());
        declarer = method.getDeclaringClass();
        typeParams = method.getTypeParameters();
        paramTypes = method.getParameterTypes();
    }

    public static MethodType fromParameters(String name, Type[] paramTypes) {
        MethodType type = new MethodType(name);
        type.paramTypes = paramTypes;
        return type;
    }

    public static MethodType fromMethod(MethodSymbol method) {
        return new MethodType(method);
    }

    public ClassSymbol getClassSymbol() {
        throw new UnsupportedOperationException("a method cannot be interpreted as a class");
    }

    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(name);
        if (typeParams.length > 0) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       typeParams,
                                       t -> t.getTypeName()));
            sb.append(">");
        }
        sb.append("(");
        sb.append(StringUtils.join(", ",
                                   paramTypes,
                                   t -> t.getTypeName()));
        sb.append(")");
        return sb.toString();
    }

    public MethodType erase() {
        MethodType erased = new MethodType(name);
        erased.declarer = declarer;
        erased.typeParams = new Type[0];
        erased.paramTypes = new Type[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            erased.paramTypes[i] = paramTypes[i].erase();
        }
        return erased;
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        return name.hashCode() ^
            typeParams.length ^
            paramTypes.length;
    }

    public boolean equals(Object other) {
        if (other instanceof MethodType) {
            MethodType otherT = (MethodType)other;
            return //declarer.equals(otherT.getDeclaringClass()) &&
                this.isEquivalentTo(otherT);
        }
        return false;
    }

    public boolean isEquivalentTo(Type other) {
        if (other instanceof MethodType) {
            return sameSignature((MethodType)other);
        }
        return false;
    }

    public boolean sameSignature(MethodType other) {
        return name.equals(name) &&
            Arrays.equals(typeParams, other.typeParams) &&
            Arrays.equals(paramTypes, other.paramTypes);
    }

    public boolean sameSubsignature(MethodType other) {
        return sameSignature(other) || sameSignature(other.erase());
    }

    public boolean overrideEquivalent(MethodType other) {
        return this.sameSubsignature(other) || other.sameSubsignature(this);
    }
}