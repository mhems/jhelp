package com.binghamton.jhelp.error;

/**
 * An error class wrapping exceptions.
 */
public class ExceptionError extends JHelpError {

    /**
     * Constructs a new Error with an Exception
     * @param ex the Exception to wrap
     */
    public ExceptionError(Exception ex) {
        super(ex.getClass().getSimpleName() + ": " + ex.getMessage());
    }
}
