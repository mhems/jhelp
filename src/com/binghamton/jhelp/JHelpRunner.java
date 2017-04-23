package com.binghamton.jhelp;

import java.io.File;
import java.io.FileFilter;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.util.ColorStringBuilder;

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
        ColorStringBuilder sb = new ColorStringBuilder();
        int num = 1;
        sb.append("*** ");
        if (errors.isEmpty()) {
            sb.append("NO ERRORS DETECTED",
                      ColorStringBuilder.Color.GREEN,
                      null);
        } else {
            sb.setForegroundColor(ColorStringBuilder.Color.RED);
            sb.append("" + errors.size(), ColorStringBuilder.Format.BOLD);
            sb.append(" ERRORS DETECTED");
            sb.resetForegroundColor();
        }
        sb.append(" ***");
        System.out.println(sb);
        for (JHelpError error : errors) {
            sb = new ColorStringBuilder();
            sb.append(num + ".)", ColorStringBuilder.Color.WHITE, null);
            sb.append(" ");
            sb.append(error.getClass().getSimpleName(),
                      ColorStringBuilder.Color.GREEN,
                      null);
            sb.append(": ");
            sb.append(error.getMessage(), ColorStringBuilder.Color.RED, null);
            System.out.println(sb);
            ++num;
        }
        return num - 1;
    }
}
