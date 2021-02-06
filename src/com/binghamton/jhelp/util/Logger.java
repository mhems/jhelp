package com.binghamton.jhelp.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * A utility class providing static method for logging to file
 */
public class Logger {
    private static String logName = "log.txt";
    private static PrintWriter writer;

    static {
        try {
            writer = new PrintWriter(new File(logName));
        } catch(FileNotFoundException e) {
            System.err.println("could not initialize log file, exiting...");
            e.printStackTrace();
        }
    }

    /**
     * Logs a message to the log file
     * @param msg the message to log
     */
    public static void log(String msg) {
        writer.write(msg);
    }

    /**
     * Logs a message and a newline to the log file
     * @param msg the message to log
     */
    public static void logln(String msg) {
        writer.write(msg);
        writer.write("\n");
    }

    /**
     * Logs an Exception's stack trace to the log file
     * @param e the Exception to log
     */
    public static void log(Exception e) {
        e.printStackTrace(writer);
    }

    /**
     * Closes the log file
     */
    public static void close() {
        writer.flush();
        writer.close();
    }
}
