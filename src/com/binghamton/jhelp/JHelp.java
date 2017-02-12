package com.binghamton.jhelp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;

/**
 * JHelp application entry point
 */
public class JHelp {

    /**
     * Main method to invoke jhelp cli
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
                }
            }
        } else {
            try {
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

        // ParserRuleContext root = parser.compilationUnit();
        // System.out.println(root.toStringTree(parser));
        System.out.println("----------------------------------------");

        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        // MyListener listener = new MyListener();
        // walker.walk(listener, tree);
    }

    private static void process(String filename)
        throws FileNotFoundException, IOException {
        process(new FileInputStream(filename));
    }
}
