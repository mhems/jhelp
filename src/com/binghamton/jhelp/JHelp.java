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
        JHelpRunner runner = new JHelpRunner();
        runner.addValidator(new EnvironmentValidator());
        UsageValidator uV = new UsageValidator(args);
        runner.addValidator(uV);
        runner.addValidator(new BalancedValidator(uV.getFiles()));
        runner.addValidator(new JavaValidator(uV.getFiles()));
        System.out.println("JHelp Version 0.3");
        System.exit(runner.run());
    }
}
