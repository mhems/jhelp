package com.binghamton.jhelp.ast;

/**
 * A class representing a Java assert statement
 */
public class AssertStatement extends Statement {
    private Expression condition;
    private Expression message;
}
