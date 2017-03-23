package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.BalancedValidator;

/**
 * A class representing the class of syntax errors due to unbalanced tokens
 * This includes mismatched braces as well as missing or extra braces.
 */
public class UnbalancedBracesError extends JHelpError {

    private Token left;
    private Token right;

    /**
     * Construct an UnbalancedBracesError with the offending Tokens
     * @param opening either the mismatching opening Token or null iff too many
     * closing braces
     * @param closing either the mismatching closing Token or null iff too many
     * opening braces
     */
    public UnbalancedBracesError(Token opening, Token closing) {
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
        b.append("Unbalanced braces error ");
        b.append(JHelpError.getTokenErrorString(left == null ? right : left));
        b.append(":\n");

        if (left == null || right == null) {
            b.append("there is an extra ");
            String first = (left == null ? right : left).getText();
            b.append(String.format("'%s' ", first));
            b.append(left == null ? "closing" : "opening");
            b.append(" brace, either delete it or add a ");
            b.append(String.format("'%s' ", BalancedValidator.PAIRS.get(first)));
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
