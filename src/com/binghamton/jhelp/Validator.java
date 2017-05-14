package com.binghamton.jhelp;

/**
 * An interface capturing the ability to validate a set of input according to
 * some constraints.
 */
public interface Validator {

    /**
     * Validates a Program on some criterion.
     * @param program the Program to validate
     */
    void validate(Program program);

    /**
     * Gets an explanation of why the validator is exiting
     * @return a String explaining of why the validator is exiting
     */
    String getExitExplanation();

}
