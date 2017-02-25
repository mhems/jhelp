package com.binghamton.jhelp;

import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


/**
 * JHelp application entry point
 */
public class JHelp {
    public static final FileFilter JAVA_FILTER = pathname -> pathname.getName().endsWith(".java");

    /**
     * Main method to invoke jhelp CLI
     * @param args user-provided command-line arguments
     */
    public static void main(String[] args) {
        JHelpRunner runner = new JHelpRunner();
        runner.addValidator(new EnvironmentValidator());
        runner.addValidator(new BalancedValidator());
        runner.addValidator(new JavaValidator());
        System.exit(runner.run(expandFiles(args)));
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
