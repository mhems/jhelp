package com.binghamton.jhelp.ast;

/**
 * A class representing a Java do/while statement
 */
// TODO can this be the same as while?
public class DoWhileStatement extends Statement {
    private Expression condition;
    private Block block;
}
