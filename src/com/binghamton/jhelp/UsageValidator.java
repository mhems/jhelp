package com.binghamton.jhelp;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.InvalidUsageError;

/**
 * Validates CLI usage
 *
 * USAGE: jhelp [(FILE|DIR)...]
 */
public class UsageValidator implements Validator {

    public final Pattern WHITESPACE = Pattern.compile("\\s");

    /**
     * Validates CLI input
     * @param files the files to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate(File[] files) {
        List<JHelpError> errors = Validator.buildErrors();
        for (File file : files) {
            final String filename = file.getAbsolutePath();
            final Matcher matcher = WHITESPACE.matcher(filename);
            if (matcher.find()) {
                errors.add(new InvalidUsageError(){
                       @Override
                       public String getMessage() {
                           return String.format("The filename '%s' must not contain whitespace (characters %d to %d)",
                                                filename,
                                                matcher.start(),
                                                matcher.end() - 1);
                       }
                    });
            }
            if (!file.exists() || !file.isFile()) {
                errors.add(new InvalidUsageError(){
                       @Override
                       public String getMessage() {
                           return String.format("The filename '%s' must name an existing file",
                                                filename);
                       }
                    });
            }
            if (!filename.endsWith(".java")) {
                errors.add(new InvalidUsageError(){
                       @Override
                       public String getMessage() {
                           return String.format("The filename '%s' must end with '.java'",
                                                filename);
                       }
                    });
            }
        }
        return errors;
    }
}
