package com.binghamton.jhelp;

import java.io.FileFilter;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.error.ApplicationError;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.util.ColorStringBuilder;
import com.binghamton.jhelp.util.Compiler;
import com.binghamton.jhelp.validators.Validator;

/**
 * A class responsible for validating input and tracking errors.
 */
public class JHelpRunner {
    public static final FileFilter JAVA_FILTER = pathname -> pathname.getName().endsWith(".java");
    private final List<Validator> validators = new ArrayList<>();
    private final Program program;

    /**
     * Constructs a new JHelpRunner with a command-line invocation
     * @param args the command-line arguments given to JHelp
     */
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
        int i = 1;
        System.out.println("JHelp Version " + JHelp.VERSION);
        for (Validator v : validators) {
            System.out.println("validating with " + v.getClass().getSimpleName());
            try {
                v.validate(program);
            } catch(Exception e) {
                program.addError(new ApplicationError(e));
            }
            if (program.hasFatalErrors()) {
                int num = report();
                System.out.println("----------------------------------------");
                ColorStringBuilder sb = new ColorStringBuilder();
                sb.append(v.getExitExplanation());
                sb.append(", ");
                sb.append("exiting now",
                      ColorStringBuilder.Color.RED,
                      null);
                System.out.println(sb.toString());
                return num;
            }
            ++i;
        }
        int numErrs = report();
        if (numErrs == 0 && Program.config.INVOKE_JAVAC) {
            System.out.println("invoking `javac`");
            int res = Compiler.run(program.getFiles());
            if (res == 0) {
                System.out.println("`javac` completed successfully");
            }
        }
        return numErrs;
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
                if (error.isFatal()) {
                    sb.append(num + ".)", ColorStringBuilder.Color.RED, null);
                } else {
                    sb.append(num + ".)", ColorStringBuilder.Color.YELLOW, null);
                }
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
