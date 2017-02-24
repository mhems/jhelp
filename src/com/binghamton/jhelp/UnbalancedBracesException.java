package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

/**
 * A class representing the class of syntax errors due to unbalanced tokens
 * This includes mismatched braces as well as missing or extra braces.
 */
public class UnbalancedBracesException extends JHelpException {
    public static final long serialVersionUID = 0;

    private Token left;
    private Token right;

    /**
     * Construct an UnbalancedBracesException with the offending Tokens
     * @param opening either the mismatching opening Token or null iff too many
     * closing braces
     * @param closing either the mismatching closing Token or null iff too many
     * opening braces
     */
    public UnbalancedBracesException(Token opening, Token closing) {
        left = opening;
        right = closing;
    }

    /**
     * Gets this Exception's error message
     * @return this Exception's error message
     */
    @Override
    public String getMessage() {
        String leftError, rightError;
        StringBuilder b = new StringBuilder();
        b.append("Unbalanced braces exception ");
        b.append(JHelpException.getTokenErrorString(left == null ? right : left));
        b.append(":\n");

        if (left == null || right == null) {
            b.append("there is an extra ");
            String first = (left == null ? right : left).getText();
            b.append(String.format("'%s' ", first));
            b.append(left == null ? "closing" : "opening");
            b.append(" brace, either delete it or add a ");
            b.append(String.format("'%s' ", BalanceChecker.PAIRS.get(first)));
            b.append(left == null ? "opening" : "closing");
            b.append(" brace\n");
        } else {
            b.append(String.format("a '%s' opening brace is being closed by a '%s' closing brace\n",
                                   left.getText(),
                                   right.getText()));
        }
        return b.toString();
    }

}
