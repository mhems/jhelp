package com.binghamton.jhelp.error;

/**
 * A base error class representing invalid use of the JHelp application
 */
public class InvalidUsageError extends JHelpError {

    /**
     * Constructs a new InvalidUsageError with a message
     * @param msg the message explaining the error
     */
    public InvalidUsageError(String msg) {
        super(msg);
    }

    /**
     * Constructs a new InvalidUsageError with a formatted message
     * @param fmt the format String explaining the error
     * @param args any arguments to the format String
     */
    public InvalidUsageError(String fmt, Object... args) {
        super(fmt, args);
    }
}
