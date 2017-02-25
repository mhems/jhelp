package com.binghamton.jhelp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.BalanceLexer;
import com.binghamton.jhelp.error.UnbalancedBracesException;

/**
 * A class housing methods to check a source file has balanced punctuation.
 */
public class BalanceChecker {

    // maps given -> expected
    public static Map<String, String> PAIRS = new HashMap<>();

    static {
        PAIRS.put("(", ")");
        PAIRS.put("{", "}");
        PAIRS.put("[", "]");

        PAIRS.put(")", "(");
        PAIRS.put("}", "{");
        PAIRS.put("]", "[");
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    process(arg);
                } catch(FileNotFoundException e) {
                    System.err.println("File " + arg + " not found");
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

    /**
     * Processes a file by checking for unbalanced braces
     * @param filename the name of the file to examine
     * @throws FileNotFoundException if no file under that name is found
     * @throws IOException if any I/O errors occur during processing
     */
    public static void process(String filename)
        throws FileNotFoundException, IOException {
        process(new FileInputStream(filename));
    }

    /**
     * Processes an InputStream by checking for unbalanced braces
     * @param istream the input stream
     * @throws IOException if any I/O errors occur during processing
     */
    public static void process(InputStream istream) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(istream);
        Lexer lexer = new BalanceLexer(inputStream);

        for (UnbalancedBracesException ex : check(lexer.getAllTokens())) {
            System.out.println(ex.getMessage());
        }
    }

    private static List<UnbalancedBracesException> check(List<? extends Token> tokens) {
        Stack<Token> delims = new Stack<>();
        List<UnbalancedBracesException> errors = new ArrayList<>();

        for (Token token : tokens) {
            switch(token.getText()) {
            case "(":
            case "{":
            case "[":
                delims.push(token);
                break;
            case ")":
            case "}":
            case "]":
                if (delims.empty()) {
                    errors.add(new UnbalancedBracesException(null, token));
                } else {
                    Token top = delims.peek();
                    if (!PAIRS.get(top.getText()).equals(token.getText())) {
                        errors.add(new UnbalancedBracesException(top, token));
                        // TODO make configurable
                        if (true) { // to avoid cascading errors
                            delims.pop();
                        }
                    } else {
                        delims.pop();
                    }
                }
                break;
            }
        }
        int index = errors.size();
        while (!delims.empty()) {
            errors.add(index, // reverse so errors reported in lexical order
                       new UnbalancedBracesException(delims.pop(), null));
        }
        return errors;
    }
}
