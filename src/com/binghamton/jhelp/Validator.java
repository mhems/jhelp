package com.binghamton.jhelp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.ExceptionError;
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
     * Validates the InputStreams on some criterion or throws an IOException
     * @param streams the InputStreams to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     * @throws IOException if any I/O errors occur during validation
     */
    List<JHelpError> validateOrThrow(InputStream[] streams) throws IOException;


    /**
     * Validates the InputStreams on some criterion
     * @param streams the InputStreams to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    default List<JHelpError> validate(InputStream[] streams) {
        try {
            return validateOrThrow(streams);
        } catch (IOException e) {
            return buildErrors(new ExceptionError(e));
        }
    }

    /**
     * Signifies if any errors this Validator produces are fatal
     * @return true iff any errors this Validator produces are fatal and should
     * halt execution
     */
    default boolean isFatal() {
        return true;
    }
}
