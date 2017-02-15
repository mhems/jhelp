package com.binghamton.jhelp.ast;

/**
 * A class representing a Java unary expression
 */
public class UnaryExpression extends Expression {
    private Expression expr;
    private UnaryOperator op;


    /**
     * Construct a new unary expression
     * @param identifier the name of the variable being operated on
     * @param op the operation being performed upon expression
     */
    public UnaryExpression(String identifier, UnaryOperator op) {
        this(new IdentifierExpression(identifier), op);
    }

    /**
     * Construct a new unary expression
     * @param expr the sole expression
     * @param op the operation being performed upon expression
     */
    public UnaryExpression(Expression expr, UnaryOperator op) {
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
}
