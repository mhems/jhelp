package com.binghamton.jhelp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.binghamton.jhelp.error.ExceptionError;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class responsible for validating input and tracking errors.
 */
public class JHelpRunner {
    public static final FileFilter JAVA_FILTER = pathname -> pathname.getName().endsWith(".java");
    private final String[] args;
    private final boolean profiling = true;
    private List<Validator> validators = new ArrayList<>();
    private List<JHelpError> errors = new ArrayList<>();

    /**
     * Construct a JHelpRunner from CLI input
     * @param args the application arguments
     */
    public JHelpRunner(String[] args) {
        this.args = expandFiles(args);
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
            errs = v.validate(args);
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

    private static String[] expandFiles(String[] filenames) {
        List<String> names = new ArrayList<>();
        for (String name : filenames) {
            names.addAll(Arrays.asList(getJavaFiles(new File(name))));
        }
        return names.toArray(new String[0]);
    }

    private static String[] getJavaFiles(File file) {
        if (file.isDirectory()) {
            List<String> filenames = new ArrayList<>();
            for (File f : file.listFiles(JAVA_FILTER)) {
                filenames.addAll(Arrays.asList(getJavaFiles(f)));
            }
            return filenames.toArray(new String[0]);
        } else {
            return new String[]{file.getAbsolutePath()};
        }
    }
}
