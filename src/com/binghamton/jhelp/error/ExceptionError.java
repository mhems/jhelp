package com.binghamton.jhelp.error;

/**
 * An error class wrapping exceptions.
 */
public class ExceptionError extends JHelpError {
    private final Exception ex;

    /**
     * Constructs a new Error with an Exception
     * @param ex the Exception to wrap
     */
    public ExceptionError(Exception ex) {
        this.ex = ex;
    }

    @Override
    public String getMessage() {
        return ex.toString();
    }
}
