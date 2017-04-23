package com.binghamton.jhelp.error;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * The base class for all JHelp errors
 */
public class JHelpError {

    private String msg;

    protected JHelpError() {
        super();
    }

    /**
     * Constructs a new JHelpError exception with a message
     * @param msg the message explaining the error
     */
    public JHelpError(String msg) {
        this.msg = msg;
    }

    /**
     * Constructs a new JHelpError exception with a formatted message
     * @param fmt the formatted message string
     * @param args any arguments to the formatted message string
     */
    public JHelpError(String fmt, Object... args) {
        this(String.format(fmt, args));
    }

    /**
     * Builds a formatted error string for a Token
     * @param token the Token where the error occured
     * @return the formatted error String for `token`
     */
    public static String getTokenErrorString(Token token) {
        return String.format("from %s on line %d, column %d",
                             token.getTokenSource().getSourceName(),
                             token.getLine(),
                             token.getCharPositionInLine());
    }

    /**
     * Utility method to determine if any fatal errors have occured
     * @param errors the JHelpErrors to examine for fatal status
     * @return true iff any JHelpErrors in errors are fatal
     */
    public static boolean hasFatalErrors(List<JHelpError> errors) {
        for (JHelpError error : errors) {
            if (error.isFatal()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the error message
     * @return the error message
     */
    public String getMessage() {
        return msg;
    }

    /**
     * Determines if this JHelpError is fatal
     * @return true; by default an error is always fatal
     */
    public boolean isFatal() {
        return true;
    }
}
