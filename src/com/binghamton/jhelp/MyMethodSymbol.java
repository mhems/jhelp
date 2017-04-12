package com.binghamton.jhelp;

import java.util.Map;

import org.antlr.v4.runtime.Token;

public class MyMethodSymbol extends MethodSymbol {
    private final Token token;

    private MyMethodSymbol(MyMethodSymbol method) {
        super(method);
        this.token = method.token;
    }

    public MyMethodSymbol(Token token) {
        super(token.getText());
        this.token = token;
    }

    public MyMethodSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

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

    public void setParameterTypes(Type[] types) {
        paramTypes = types;
    }

    public void setExceptionTypes(Type[] types) {
        exceptions = types;
    }

    public void setTypeParameters(TypeVariable[] vars) {
        typeVars = vars;
    }

    public void setDeclaringClass(ClassSymbol sym) {
        this.declarer = sym;
    }

    public void setVariadic(boolean variadic) {
        this.variadic = variadic;
        if (this.variadic) {
            int last = paramTypes.length - 1;
            paramTypes[last] = new ArrayType(paramTypes[last]);
        }
    }

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
