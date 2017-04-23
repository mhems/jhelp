package com.binghamton.jhelp.error;

/**
 * A class to represent syntactic errors
 */
public class SyntacticError extends JHelpError {

    public SyntacticError(String msg) {
        super(msg);
    }

    public SyntacticError(String fmt, Object... args) {
        super(fmt, args);
    }
}
