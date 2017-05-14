package com.binghamton.jhelp.error;

import com.binghamton.jhelp.antlr.MyToken;

/**
 * A class representing the syntax error of repeating modifiers
 */
public class RepeatModifierError extends JHelpError {

    private final MyToken offender, original;

    /**
     * Constructs a RepeatModifierError
     * @param offender the duplicate modifier
     * @param original the first modifier
     */
    public RepeatModifierError(MyToken offender, MyToken original) {
        this.offender = offender;
        this.original = original;
    }

    @Override
    public String getMessage() {
        StringBuilder b = new StringBuilder();
        b.append(offender.getLocationString());
        b.append(": Repeated modifier detected\n\n");
        if (offender.onSameLine(original)) {
            b.append(MyToken.getHighlightedLine(original, offender));
        } else {
            b.append("\n\n");
            b.append(original.getLocationString());
            b.append(":\n");
            b.append(original.getHighlightedLine());
        }
        b.append("\n\nRemove the repetitive modifier");
        return b.toString();
    }
}
