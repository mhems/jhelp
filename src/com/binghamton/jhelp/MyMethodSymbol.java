package com.binghamton.jhelp;

import java.util.Map;

import org.antlr.v4.runtime.Token;

/**
 * A MethodSymbol to represent a user-created method
 */
public class MyMethodSymbol extends MethodSymbol {
    private final Token token;

    /**
     * Copy construct a new method
     * @param method the method to copy from
     */
    private MyMethodSymbol(MyMethodSymbol method) {
        super(method);
        this.token = method.token;
    }

    /**
     * Construct a new named method
     * @param token the Token holding the name of this method
     */
    public MyMethodSymbol(Token token) {
        super(token.getText());
        this.token = token;
    }

    /**
     * Construct a new named, modified method
     * @param token the Token holding the name of this method
     * @param modifiers the Modifiers of this method
     */
    public MyMethodSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

    /**
     * Construct a new synthesized method
     * @param name the name of this method
     */
    public MyMethodSymbol(String name) {
        super(name);
        this.token = null;
    }

    /**
     * Construct a new synthesized, modified method
     * @param name the name of this method
     * @param modifiers the Modifiers of this method
     */
    public MyMethodSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
        this.token = null;
    }

    /**
     * Gets the Token holding the name of this method
     * @return the Token holding the name of this method
     */
    public Token getToken() {
        return token;
    }

    /**
     * Sets the return type of this method
     * @param type the return type of this method
     */
    public void setReturnType(Type type) {
        returnType = type;
    }

    /**
     * Sets the parameter types of this method
     * @param types the types of the parameters of this method
     */
    public void setParameterTypes(Type... types) {
        paramTypes = types;
    }

    /**
     * Sets the types of the exceptions this method throws
     * @param types the types of the exceptions this method throws
     */
    public void setExceptionTypes(Type... types) {
        exceptions = types;
    }

    /**
     * Sets the type parameters of this method
     * @param vars the type parameters of this method
     */
    public void setTypeParameters(TypeVariable... vars) {
        typeVars = vars;
    }

    /**
     * Sets the class that declares this method
     * @param sym the class that declares this method
     */
    public void setDeclaringClass(ClassSymbol sym) {
        this.declarer = sym;
    }

    /**
     * Sets the variadic status of this method
     * @param variadic true iff this method is variadic
     */
    public void setVariadic(boolean variadic) {
        this.variadic = variadic;
        if (this.variadic) {
            int last = paramTypes.length - 1;
            paramTypes[last] = new ArrayType(paramTypes[last]);
        }
    }

    /**
     * Sets the constructor status of this method
     * @param constructor true iff this method is a constructor
     */
    public void setConstructor(boolean constructor) {
        this.constructor = constructor;
    }

    @Override
    public MyMethodSymbol adapt(Map<TypeVariable, Type> map) {
        MyMethodSymbol ret = new MyMethodSymbol(this);
        adapt(ret, map);
        return ret;
    }
}
