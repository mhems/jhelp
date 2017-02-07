package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.VariableSymbol;

import java.util.List;

/**
 * A class representing a Java lambda expression
 */
public class LambdaExpression extends Expression {
    private List<VariableDeclaration> params;
    private Block body;

    /**
     * Construct a new lambda expression
     * @param params the parameters to the lambda expression
     * @param body the body of the lambda expression
     */
    public LambdaExpression(List<VariableDeclaration> params, Block body) {
        this.params = params;
        this.body = body;
    }

    /**
     * Gets the parameters of this lambda expression
     * @return the parameters of this lambda expression
     */
    public List<VariableDeclaration> getParameters() {
        return params;
    }

    /**
     * Gets a particular parameter of this lambda expression
     * @param index the 0-indexed index of the parameter to retrieve
     * @return the parameter at index `index`
     */
    public VariableDeclaration getParameter(int index) {
        return params.get(index);
    }

    /**
     * Gets the number of parameters of this lambda expression
     * @return the number of parameters of this lambda expression
     */
    public int getNumParameters() {
        return params.size();
    }

    /**
     * Gets the body of this lambda expression
     * @return the body of this lambda expression
     */
    public Block getBody() {
        return body;
    }
}
