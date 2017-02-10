package.com.binghamton.jhelp;

/**
 * A class representing the type of a Java method
 */
public class MethodType extends Type {
    private List<TypeParameter> typeParams;
    private Type returnType;
    private List<Type> paramTypes;
    private List<ClassInterfaceType> throwTypes; // TODO needed?

    /**
     * Construct a simple method type
     * @param returnType the return type of this method
     * @param paramTypes the types of the parameters of this method
     */
    public MethodType(Type returnType, List<Type> paramTypes) {
        this(returnType, paramTypes, null, null, 0);
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
        return !returnType.equals(VoidType);
    }

    /**
     * Gets the parameter types of this method
     * @return the parameter types of this method
     */
    public List<Type> parameterTypes() {
        return paramTypes;
    }

    /**
     * Determines if this method has parameter types
     * @return true iff this method has parameter types
     */
    public boolean hasParameterTypes() {
        return paramTypes != null && paramTypes.size() > 0;
    }

    /**
     * Gets the type parameters of this method
     * @return the type parameters of this method, if any
     */
    public List<TypeParamter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this method has type parameters
     * @return true iff this method has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams != null && typeParams.size() > 0;
    }
}
