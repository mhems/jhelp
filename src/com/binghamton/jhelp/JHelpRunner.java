package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        String cur = null;
        try {
            for (int i = 0; i < streams.length; i++) {
                cur = filenames[i];
                streams[i] = new BufferedInputStream(new FileInputStream(cur));
            }
        } catch(FileNotFoundException e) {
            errors.add(new ExceptionError(e));
            return report();
        }
        return run(streams);
    }

    /**
     * Run this Runner Validators against input streams
     * @param streams the input streams to validate
     * @return the number of errors produced
     */
    public int run(InputStream[] streams) {
        List<JHelpError> errs;
        for (Validator v : validators) {
            errs = v.validate(streams);
            errors.addAll(errs);
            if (v.isFatal() && !errs.isEmpty()) {
                return report();
            }
        }
        return errors.size();
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
