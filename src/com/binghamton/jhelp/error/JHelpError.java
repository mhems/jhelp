package com.binghamton.jhelp.error;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.antlr.MyToken;

/**
 * The base class for all JHelp errors
 */
public class JHelpError {

    private MyToken token;
    private String msg;
    private String suggestion;

    protected JHelpError() {
        super();
    }

    public JHelpError(Token token, String msg, String suggestion) {
        if (token instanceof MyToken) {
            this.token = (MyToken)token;
        } else {
            throw new IllegalArgumentException("must use MyTokens");
        }
        this.msg = msg;
        this.suggestion = suggestion;
    }

    public JHelpError(Token token, String msg) {
        this(token, msg, null);
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
     * Gets the error message
     * @return the error message
     */
    public String getMessage() {
        if (token == null) {
            return msg;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(token.getLocationString());
        sb.append(": ");
        sb.append(msg);
        sb.append("\n");
        sb.append("\n");
        sb.append(token.getHighlightedLine());
        if (suggestion != null) {
            sb.append("\n");
            sb.append("\n");
            sb.append(suggestion);
        }
        return sb.toString();
    }

    /**
     * Determines if this JHelpError is fatal
     * @return true; by default an error is always fatal
     */
    public boolean isFatal() {
        return true;
    }
}
