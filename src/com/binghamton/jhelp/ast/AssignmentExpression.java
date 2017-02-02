package com.binghamton.jhelp.ast;

/**
 * A class representing a Java assignment
 */
public class AssignmentExpression extends Expression {
    private Expression lhs;
    private Expression rhs;
    private AssignmentOperator op;
}
