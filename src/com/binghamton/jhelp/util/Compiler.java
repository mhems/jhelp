package com.binghamton.jhelp.util;

import java.io.File;
import java.io.OutputStream;
import javax.tools.ToolProvider;

/**
 * A utility class to programmatically invoke the `javac` compiler.
 */
public class Compiler  {

    /**
     * Invoke the javac compiler on the given files
     * @param out the OutputStream to redirect stdout to
     * @param err the OutputStream to redirect stderr to
     * @param files the Files to compile
     * @return 0 for success, nonzero otherwise
     */
    public static int run(OutputStream out,
                          OutputStream err,
                          File[] files) {
        String[] args = new String[2 + files.length];
        args[0] = "-d";
        args[1] = System.getProperty("user.dir");
        for (int i = 0; i < files.length; i++) {
            args[i + 2] = files[i].getAbsolutePath();
        }
        return ToolProvider.getSystemJavaCompiler().run(null, out, err, args);
    }

    /**
     * Invoke the javac compiler on the given files
     * @param files the Files to compile
     * @return 0 for success, nonzero otherwise
     */
    public static int run(File[] files) {
        return run(System.out, System.err, files);
    }
}
