package com.binghamton.jhelp;

import java.io.InputStream;
import java.util.List;

import com.binghamton.jhelp.error.InvalidUseError;
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
     * @param streams unused
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validateOrThrow(InputStream[] streams) {
        List<JHelpError> errors = Validator.buildErrors();

        String version = System.getProperty("java.specification.version");
        String[] versionNums = version.split("\\.");
        int major = Integer.parseInt(versionNums[0]);
        int minor = Integer.parseInt(versionNums[1]);

        System.out.println("Hello, " + System.getProperty("user.name"));

        if (minor < 8) {
            errors.add(new InvalidUseError(){
                    public String getMessage() {
                        return "Java 1.8 or higher must be used.";
                    }
                });
        }

        System.out.print("OS: " + System.getProperty("os.name"));
        System.out.println(", version: " + System.getProperty("os.version"));

        return errors;
    }
}
