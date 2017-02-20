package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.ast.ASTVisitor;

/**
 * A class representing the type of a Java method
 */
public class MethodType extends Type {
    private List<TypeParameter> typeParams;
    private Type returnType;
    private List<Type> paramTypes;

    /**
     * Construct a simple method type
     * @param returnType the return type of this method
     * @param paramTypes the types of the parameters of this method
     */
    public MethodType(Type returnType, List<Type> paramTypes) {
        this(returnType, paramTypes, new ArrayList<>());
    }

    /**
     * Construct a parameterized method type
     * @param returnType the return type of this method
     * @param paramTypes the types of the parameters of this method
     * @param typeParams the type parameters of this method
     */
    public MethodType(Type returnType,
                      List<Type> paramTypes,
                      List<TypeParameter> typeParams) {
        this.returnType = returnType;
        this.paramTypes = paramTypes;
        this.typeParams = typeParams;
    }

    /**
     * Gets the return type of this method type
     * @return the return type of this method type
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Determines if this method returns a non-void type
     * @return true iff this method returns a non-void type
     */
    public boolean returns() {
        return ! returnType.getName().equals("void");
    }

    /**
     * Gets the parameter types of this method
     * @return the parameter types of this method
     */
    public List<Type> getParameterTypes() {
        return paramTypes;
    }

    /**
     * Determines if this method has parameter types
     * @return true iff this method has parameter types
     */
    public boolean hasParameterTypes() {
        return paramTypes.size() > 0;
    }

    /**
     * Gets the type parameters of this method
     * @return the type parameters of this method, if any
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this method has type parameters
     * @return true iff this method has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams.size() > 0;
    }

    /**
     * Double dispatch super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
