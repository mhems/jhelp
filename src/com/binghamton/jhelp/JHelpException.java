package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

/**
 * The base class for all JHelp Exceptions
 */
public class JHelpException extends RuntimeException {
    public static final long serialVersionUID = 0;

    public static String getTokenErrorString(Token token) {
        return String.format("from %s on line %d, column %d",
                             token.getTokenSource().getSourceName(),
                             token.getLine(),
                             token.getStartIndex());
    }
}
