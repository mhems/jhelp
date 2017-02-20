package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java assignment expression
 */
public class AssignmentExpression extends Expression {
    private Expression lhs;
    private Expression rhs;
    private AssignmentOperator op;

    /**
     * Construct a new assignment expression
     * @param lhs the l-value (destination) of the assignment
     * @param op the assignment operation being performed
     * @param rhs the r-value (source) of the assignment
     */
    public AssignmentExpression(Expression lhs,
                                AssignmentOperator op,
                                Expression rhs) {
        super(lhs.getFirstToken(), rhs.getLastToken());
        this.lhs = lhs;
        this.op = op;
        this.rhs = rhs;
    }

    /**
     * Gets the left hand side of this expression
     * @return the left hand side of this expression
     */
    public Expression getLHS() {
        return lhs;
    }

    /**
     * Gets the operation being executed
     * @return the operation being executed
     */
    public AssignmentOperator getOperator() {
        return op;
    }

    /**
     * Gets the right hand side of this expression
     * @return the right hand side of this expression
     */
    public Expression getRHS() {
        return rhs;
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
