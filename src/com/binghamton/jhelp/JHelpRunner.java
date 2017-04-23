package com.binghamton.jhelp;

import java.io.File;
import java.io.FileFilter;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.util.ColorStringBuffer;

/**
 * A class responsible for validating input and tracking errors.
 */
public class JHelpRunner {
    public static final FileFilter JAVA_FILTER = pathname -> pathname.getName().endsWith(".java");
    private final boolean PROFILING = false;
    private final List<Validator> validators = new ArrayList<>();
    private final List<JHelpError> errors = new ArrayList<>();

    /**
     * Add a Validator to the List of Validators to be run
     * @param validator the Validator to add
     */
    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    /**
     * Run this Runner Validators against file input
     * @return the number of errors produced
     */
    public int run() {
        List<JHelpError> errs;
        long start, stop;
        int i = 1;
        for (Validator v : validators) {
            start = System.nanoTime();
            errs = v.validate();
            stop = System.nanoTime();
            if (PROFILING) {
                System.out.printf("validator %d took '%f' ms\n", i, (stop - start)/1e6);
            }
            errors.addAll(errs);
            if (JHelpError.hasFatalErrors(errs)) {
                return report();
            }
            ++i;
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
            ColorStringBuffer sb = new ColorStringBuffer();
            sb.append(num + ".)", ColorStringBuffer.Color.WHITE, null);
            sb.append(" ");
            sb.append(error.getClass().getSimpleName(), ColorStringBuffer.Color.GREEN, null);
            sb.append(": ");
            sb.append(error.getMessage(), ColorStringBuffer.Color.RED, null);
            System.out.println(sb);
            ++num;
        }
        return num - 1;
    }
}
