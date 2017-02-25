package com.binghamton.jhelp;

import java.io.InputStream;

/**
 * JHelp application entry point
 */
public class JHelp {

    /**
     * Main method to invoke jhelp CLI
     * @param args user-provided command-line arguments
     */
    public static void main(String[] args) {
        JHelpRunner runner = new JHelpRunner();
        runner.addValidator(new EnvironmentValidator());
        runner.addValidator(new BalancedValidator());
        runner.addValidator(new JavaValidator());
        int rc;
        if (args.length > 0) {
            rc = runner.run(args);
        } else {
            System.out.println("accepting from standard input");
            rc = runner.run(new InputStream[]{System.in});
        }
        System.exit(rc);
    }
}
