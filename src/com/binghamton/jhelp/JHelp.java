package com.binghamton.jhelp;

import com.binghamton.jhelp.util.Logger;
import com.binghamton.jhelp.validators.*;

/**
 * JHelp application entry point
 */
public class JHelp {

    public static final String VERSION = "1.0.1";

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
        runner.addValidator(new SyntaxValidator());
        runner.addValidator(new TopLevelValidator());
        MemberLevelValidator mV = new MemberLevelValidator();
        runner.addValidator(mV);
        runner.addValidator(new CodeLevelValidator(mV));
        int rc = runner.run();
        Logger.close();
        System.exit(rc);
    }
}
