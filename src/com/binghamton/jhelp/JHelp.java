package com.binghamton.jhelp;

/**
 * JHelp application entry point
 */
public class JHelp {

    /**
     * Construct a new JHelp instance
     */
    private JHelp() {
	// prevent public instantiation
    }

    /**
     * Main method to invoke jhelp application
     * @param args user-provided command-line arguments
     */
    public static void main(String[] args) {
        JHelpRunner runner = new JHelpRunner(args);
        runner.addValidator(new EnvironmentValidator());
        runner.addValidator(new UsageValidator());
        runner.addValidator(new BalancedValidator());
        runner.addValidator(new JavaValidator());
        System.exit(runner.run());
    }
}
