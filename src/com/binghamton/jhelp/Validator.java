package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.JHelpError;

/**
 * An interface capturing the ability to validate a set of input according to
 * some constraints.
 */
public interface Validator {

    /**
     * Utility method to build a List of JHelpErrors
     * @param errors the errors to make the List from
     * @return a List of JHelpErrors
     */
    static List<JHelpError> buildErrors(JHelpError... errors) {
        List<JHelpError> errs = new ArrayList<>();
        for (JHelpError error : errors) {
            errs.add(error);
        }
        return errs;
    }

    /**
     * Validates the filenames or their contents on some criterion
     * @param filenames the names of the files to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    List<JHelpError> validate(String[] filenames);

    /**
     * Signifies if any errors this Validator produces are fatal
     * @return true iff any errors this Validator produces are fatal and should
     * halt execution
     */
    default boolean isFatal() {
        return true;
    }
}