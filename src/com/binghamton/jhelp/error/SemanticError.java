package com.binghamton.jhelp.error;

/**
 * A class to represent semantic errors
 */
public class SemanticError extends JHelpError {

    public SemanticError(String msg) {
        super(msg);
    }

    public SemanticError(String fmt, Object... args) {
        super(fmt, args);
    }
}
