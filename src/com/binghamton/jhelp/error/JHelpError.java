package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

/**
 * The base class for all JHelp errors
 */
public abstract class JHelpError {

    public static String getTokenErrorString(Token token) {
        return String.format("from %s on line %d, column %d",
                             token.getTokenSource().getSourceName(),
                             token.getLine(),
                             token.getCharPositionInLine());
    }

    public abstract String getMessage();
}
