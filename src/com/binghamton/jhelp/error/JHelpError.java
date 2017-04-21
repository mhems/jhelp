package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

/**
 * The base class for all JHelp errors
 */
public abstract class JHelpError {

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
     * Gets the error message
     * @return the error message
     */
    public abstract String getMessage();
}
