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

    public static String makeMultiTokenMessage(MyToken first,
                                               MyToken second,
                                               String message,
                                               String suggestion) {
        StringBuilder b = new StringBuilder();
        b.append(first.getLocationString());
        b.append(": ");
        b.append(message);
        b.append("\n");
        b.append("\n");
        if (second == null) {
            b.append(first.getHighlightedLine());
        }
        else if (first.onSameLine(second)) {
            b.append(MyToken.getHighlightedLine(first, second));
        } else {
            b.append("\n");
            b.append("\n");
            b.append(second.getLocationString());
            b.append(":");
            b.append("\n");
            b.append(second.getHighlightedLine());
        }
        b.append("\n");
        b.append("\n");
        b.append(suggestion);
        return b.toString();
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
