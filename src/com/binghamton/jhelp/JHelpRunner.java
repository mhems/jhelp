package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.binghamton.jhelp.error.ExceptionError;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class responsible for validating input and tracking errors.
 */
public class JHelpRunner {
    private List<Validator> validators = new ArrayList<>();
    private List<JHelpError> errors = new ArrayList<>();

    /**
     * Add a Validator to the List of Validators to be run
     * @param validator the Validator to add
     */
    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    /**
     * Run this Runner Validators against file input
     * @param filenames the names of the files to validate
     * @return the number of errors produced
     */
    public int run(String[] filenames) {
        InputStream[] streams = new InputStream[filenames.length];
        List<JHelpError> errs;
        for (Validator v : validators) {
            try {
                for (int i = 0; i < filenames.length; i++) {
                    streams[i] = new BufferedInputStream(new FileInputStream(filenames[i]));
                }
            } catch(FileNotFoundException e) {
                errors.add(new ExceptionError(e));
                return report(); // fatal
            }
            errs = v.validate(streams);
            errors.addAll(errs);
            if (v.isFatal() && !errs.isEmpty()) {
                return report();
            }
        }
        return report();
    }

    /**
     * Report any errors to standard output
     * @return the number of errors reported
     */
    public int report() {
        int num = 1;
        for (JHelpError error : errors) {
            System.out.println(num + ".) " + error.getMessage());
        }
        return num - 1;
    }
}
