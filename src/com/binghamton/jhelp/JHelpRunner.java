package com.binghamton.jhelp;

import java.io.File;
import java.io.FileFilter;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.JHelpError;

/**
 * A class responsible for validating input and tracking errors.
 */
public class JHelpRunner {
    public static final FileFilter JAVA_FILTER = pathname -> pathname.getName().endsWith(".java");
    private final String[] args;
    private final boolean profiling = true;
    private final List<Validator> validators = new ArrayList<>();
    private final List<JHelpError> errors = new ArrayList<>();
    private File[] files;

    /**
     * Construct a JHelpRunner from CLI input
     * @param args the application arguments
     */
    public JHelpRunner(String[] args) {
        this.args = args;
        files = new File[args.length];
        for (int i = 0; i < files.length; i++) {
            files[i] = new File(args[i]);
        }
        files = expandFiles(files).toArray(new File[0]);
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
        List<JHelpError> errs;
        long start, stop;
        int i = 1;
        for (Validator v : validators) {
            start = System.nanoTime();
            errs = v.validate(files);
            stop = System.nanoTime();
            if (profiling) {
                System.out.printf("validator %d took '%f' ms\n", i, (stop - start)/1e6);
            }
            errors.addAll(errs);
            if (v.isFatal() && !errs.isEmpty()) {
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
            System.out.println(num + ".) " + error.getMessage());
            ++num;
        }
        return num - 1;
    }

    /**
     * Expands all directory files to include all of its contained
     * files.
     * @param files the list of Files to expand
     * @return a list of all Files contained within the Files in
     *         `files`
     */
    private static List<File> expandFiles(File[] files) {
        List<File> ret = new ArrayList<>();
        for (File file : files) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    ret.addAll(expandFiles(file.listFiles()));
                } else if (file.getName().endsWith(".java")) {
                    ret.add(file);
                }
            }
        }
        return ret;
    }
}
