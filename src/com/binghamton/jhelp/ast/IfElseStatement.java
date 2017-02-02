package com.binghamton.jhelp.ast;

/**
 * A class representing a Java if/else statement
 */
public class IfElseStatement extends Statement {
    private Expression condition;
    private Block thenBody;
    private Block elseBody;
}
