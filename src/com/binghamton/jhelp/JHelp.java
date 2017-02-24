package com.binghamton.jhelp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.NonNullVisitor;

/**
 * JHelp application entry point
 */
public class JHelp {

    // probably should be moved somewhere else, like a Checker implementer
    private static void detectEnvironment() {
        String version = System.getProperty("java.specification.version");
        String[] versionNums = version.split("\\.");
        int major = Integer.parseInt(versionNums[0]);
        int minor = Integer.parseInt(versionNums[1]);
        System.out.println(String.format("Java %d.%d detected.", major, minor));
        System.out.print("OS: " + System.getProperty("os.name"));
        System.out.println(", version: " + System.getProperty("os.version"));

        // also of interest:
        //     java.home, java.class.path, java.library.path
        //     user.home, user.name, user.dir
    }

    /**
     * Main method to invoke jhelp CLI
     * @param args user-provided command-line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    process(arg);
                } catch(FileNotFoundException e) {
                    System.err.println("file " + arg + " not found");
                } catch(IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        } else {
            try {
                System.out.println("accepting input from stdin:");
                process(System.in);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void process(InputStream istream) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(istream);
        Lexer lexer = new Java8Lexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokenStream);

        CompilationUnit cu = parser.compilationUnit().ret;
        NonNullVisitor nnV = new NonNullVisitor();
        cu.accept(nnV);
        System.out.println(nnV.getCount() + " objects verified.");
    }

    private static void process(String filename)
        throws FileNotFoundException, IOException {
        process(new FileInputStream(filename));
    }
}
