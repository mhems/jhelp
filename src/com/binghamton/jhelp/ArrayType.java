package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * Class representing an array type
 */
public class ArrayType extends ReferenceType {
    private Type base;

    /**
     * Construct a named array type
     * @param base the base Type of the array
     */
    public ArrayType(Type base) {
        this.base = base;
    }

    public ArrayType(Type base, AnnotationSymbol[] annotations) {
        super(annotations);
        this.base = base;
    }

    public Type getBaseType() {
        return base;
    }

    public String getTypeName() {
        return base.getTypeName() + "[]";
    }

    public int rank() {
        return 1 + base.rank();
    }

    public boolean equals(Object other) {
        if (other instanceof ArrayType) {
            ArrayType type = (ArrayType)other;
            return Arrays.equals(annotations, type.annotations) &&
                base.equals(type);
        }
        return false;
    }

    public int hashCode() {
        return base.hashCode() ^ annotations.length;
    }

    public Type erase() {
        return base.erase();
    }

    @Override
    public ArrayType adapt(Type[] args) {
        return new ArrayType(base.adapt(args), annotations);
    }

    public ClassSymbol getClassSymbol() {
        return base.getClassSymbol();
    }

    public ClassSymbol getDeclaringClass() {
        return base.getDeclaringClass();
    }

    public boolean isReifiable() {
        return base.isReifiable();
    }

    @Override
    public boolean isRaw() {
        return base.isRaw();
    }

    @Override
    public boolean isValidClassLiteralType() {
        return base.isValidClassLiteralType();
    }

    @Override
    public boolean canCastTo(Type target) {
        if (target instanceof ClassSymbol) {
            ClassSymbol targetCls = (ClassSymbol)target;
            if (targetCls.isClassLike()) {
                return fetch("Object").equals(target);
            } else {
                return fetch("java.io.Serializable").equals(target) ||
                    fetch("Serializable").equals(target);
            }
        } else if (target instanceof TypeVariable) {
            return canCastTo(((TypeVariable)target).getUpperBound());
        } else if (target instanceof ArrayType) {
            Type targetBaseType = ((ArrayType)target).base;
            if (base instanceof PrimitiveType) {
                return base.equals(targetBaseType);
            }
            return base.canCastTo(targetBaseType);
        }
        return true;
    }
}
