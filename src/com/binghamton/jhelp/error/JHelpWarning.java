package com.binghamton.jhelp.error;

/**
 * A base class representing non-fatal JHelpErrors
 */
public abstract class JHelpWarning extends JHelpError {

    /**
     * Constructs a new JHelpWarning with a message
     * @param msg the message explaining the error
     */
    protected JHelpWarning(String msg) {
        super(msg);
    }

    /**
     * Constructs a new JHelpWarning with a formatted message
     * @param fmt the formatted message string
     * @param args any arguments to the formatted message string
     */
    protected JHelpWarning(String fmt, Object... args) {
        super(fmt, args);
    }

    /**
     * Determines if this JHelpError is fatal
     * @return false; a warning is always non-fatal
     */
    @Override
    public boolean isFatal() {
        return false;
    }
}
