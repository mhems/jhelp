package com.binghamton.jhelp.error;

/**
 * A base error class representing invalid use of the JHelp application
 */
public class InvalidUsageError extends JHelpError {

    public InvalidUsageError(String msg) {
        super(msg);
    }

    public InvalidUsageError(String fmt, Object... args) {
        super(fmt, args);
    }
}
