package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java lambda expression
 * e.g. {@code (int i) -> { ... }}
 */
public class LambdaExpression extends Expression {
    private final List<VariableDeclaration> params;
    private final Block body;

    /**
     * Construct a new lambda expression
     * @param first the first Token
     * @param params the parameters to the lambda expression
     * @param body the body of the lambda expression
     */
    public LambdaExpression(Token first,
                            List<VariableDeclaration> params,
                            Block body) {
        super(first, body.getLastToken());
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

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         for (VariableDeclaration vd : params)
         {
             vd.acceptRec(visitor, order);
         }
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
