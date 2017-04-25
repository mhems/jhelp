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
    private final Program program;

    public JHelpRunner(String[] args) {
        program = new Program(args);
    }

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
        long start, stop;
        int i = 1;
        System.out.println("JHelp Version 0.3");
        for (Validator v : validators) {
            start = System.nanoTime();
            v.validate(program);
            stop = System.nanoTime();
            if (PROFILING) {
                System.out.printf("validator %d took '%f' ms\n", i, (stop - start)/1e6);
            }
            if (program.hasFatalErrors()) {
                int num = report();
                System.out.println(v.getExitExplanation() + ", exiting now");
                return num;
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
        if (program.hasErrors()) {
            for (JHelpError error : program.getErrors()) {
                sb = new ColorStringBuilder();
                sb.append(num + ".)", ColorStringBuilder.Color.WHITE, null);
                sb.append(" ");
                sb.append(error.getMessage());
                System.out.println(sb);
                System.out.println();
                ++num;
            }
        } else {
            sb.append("NO ERRORS DETECTED",
                      ColorStringBuilder.Color.GREEN,
                      null);
            System.out.println(sb);
        }
        return num - 1;
    }
}
