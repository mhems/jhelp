package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java unary expression
 */
public class UnaryExpression extends Expression {
    private Expression expr;
    private UnaryOperator op;

    /**
     * Construct a new unary expression
     * @param token the operator token
     * @param identifier the name of the variable being operated on
     * @param op the operation being performed upon expression
     */
    public UnaryExpression(Token token,
                           Token identifier,
                           UnaryOperator op) {
        this(token, new IdentifierExpression(identifier), op);
    }

    /**
     * Construct a new unary expression
     * @param token the operator token
     * @param expr the sole expression
     * @param op the operation being performed upon expression
     */
    public UnaryExpression(Token token,
                           Expression expr,
                           UnaryOperator op) {
        super( (isPrefix(op) ? token : expr.getFirstToken()),
               (isPrefix(op) ? expr.getLastToken() : token) );
        this.expr = expr;
        this.op = op;
    }

    /**
     * Gets the expression being operated upon
     * @return the expression being operated upon
     */
    public Expression getExpression() {
        return expr;
    }

    /**
     * Gets the operation being executed
     * @return the operation being executed
     */
    public UnaryOperator getOperator() {
        return op;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }

    private static boolean isPrefix(UnaryOperator op) {
        return op == UnaryOperator.PRE_DECREMENT ||
            op == UnaryOperator.PRE_INCREMENT;
    }
}
