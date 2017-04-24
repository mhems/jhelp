package com.binghamton.jhelp;

import com.binghamton.jhelp.error.InvalidUsageError;

/**
 * A class to validate the user's system environment
 */
public class EnvironmentValidator implements Validator {

    // also of interest:
    //     java.home, java.class.path, java.library.path
    //     user.home, user.name, user.dir

    private static final boolean QUIET = true;

    /**
     * Validates the user's environment
     */
    @Override
    public void validate(Program program) {
        String version = System.getProperty("java.specification.version");
        String[] versionNums = version.split("\\.");
        final int major = Integer.parseInt(versionNums[0]);
        final int minor = Integer.parseInt(versionNums[1]);

        if (minor < 8) {
            program.addError(new InvalidUsageError("Java 1.8 or higher must be used, Java %d.%d was detected",
                                                   major,
                                                   minor));
        }

        if (!QUIET) {
            System.out.println("Detected Java " + System.getProperty("java.version"));
            System.out.print("Detected OS is " +
                             System.getProperty("os.name") +
                             " " +
                             System.getProperty("os.version") +
                             "\n");
        }
    }
}
