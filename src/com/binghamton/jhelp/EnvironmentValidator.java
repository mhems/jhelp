package com.binghamton.jhelp;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.binghamton.jhelp.error.InvalidUsageError;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class to validate the user's system environment
 */
public class EnvironmentValidator implements Validator {

        // also of interest:
        //     java.home, java.class.path, java.library.path
        //     user.home, user.name, user.dir

    /**
     * Validates the user's environment
     * @param files unused
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate(File[] files) {
        List<JHelpError> errors = Validator.buildErrors();

        String version = System.getProperty("java.specification.version");
        String[] versionNums = version.split("\\.");
        final int major = Integer.parseInt(versionNums[0]);
        final int minor = Integer.parseInt(versionNums[1]);

        if (minor < 8) {
            errors.add(new InvalidUsageError(){
                    @Override
                    public String getMessage() {
                        return String.format("Java 1.8 or higher must be used, Java %d.%d was detected",
                                             major,
                                             minor);
                    }
                });
        }

        System.out.println("Detected Java " + System.getProperty("java.version"));
        System.out.print("Detected OS is " +
                         System.getProperty("os.name") +
                         " " +
                         System.getProperty("os.version") +
                         "\n");
        // TODO
        // System.out.println("Detected Java Home is " + System.getProperty("java.home"));
        // rt.jar is at $JAVA_HOME/lib/rt.jar
        return errors;
    }
}
