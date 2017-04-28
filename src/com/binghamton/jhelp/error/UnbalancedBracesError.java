package com.binghamton.jhelp.error;

import com.binghamton.jhelp.BalancedValidator;
import com.binghamton.jhelp.antlr.MyToken;

/**
 * A class representing the class of syntax errors due to unbalanced tokens
 * This includes mismatched braces as well as missing or extra braces.
 */
public class UnbalancedBracesError extends JHelpError {
    private final MyToken primary, secondary;
    private final MyToken left;
    private final MyToken right;
    private final String msg;
    private final String suggestion;

    /**
     * Construct an UnbalancedBracesError with the offending Tokens
     * @param opening either the mismatching opening Token or null iff too many
     * closing braces
     * @param closing either the mismatching closing Token or null iff too many
     * opening braces
     */
    public UnbalancedBracesError(MyToken opening, MyToken closing) {
        left = opening;
        right = closing;
        if (left != null && right != null) {
            primary = left;
            secondary = right;
            msg = String.format("a '%s' brace is closing a '%s' brace",
                                closing.getText(),
                                opening.getText());
            suggestion = "Correct the typo or add/delete a brace between the two";
        } else {
            primary = (left == null ? right : left);
            secondary = null;
            msg = String.format("there is an extra '%s'",
                                primary.getText());
            suggestion = String.format("Delete the extra brace or add the missing '%s' brace",
                                       BalancedValidator.PAIRS.get(primary.getText()));
        }
    }

    /**
     * Gets this Exception's error message
     * @return this Exception's error message
     */
    @Override
    public String getMessage() {
        return makeMultiTokenMessage(primary, secondary, msg, suggestion);
    }
}
