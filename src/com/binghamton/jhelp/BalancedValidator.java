package com.binghamton.jhelp;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.BalanceLexer;
import com.binghamton.jhelp.error.ExceptionError;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.UnbalancedBracesError;

/**
 * A class housing methods to check a source file has balanced punctuation.
 */
public class BalancedValidator implements Validator {

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

    /**
     * Validates the filenames' contents by checking for unbalanced braces
     * @param filenames the names of the files to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate(String[] filenames) {
        Lexer lexer;
        List<JHelpError> errors = Validator.buildErrors();
        try {
            for (String filename : filenames) {
                lexer = new BalanceLexer(new ANTLRFileStream(filename));
                errors.addAll(check(lexer.getAllTokens()));
            }
        } catch (IOException e) {
            errors.add(new ExceptionError(e));
        }
        return errors;
    }

    private static List<JHelpError> check(List<? extends Token> tokens) {
        Stack<Token> delims = new Stack<>();
        List<JHelpError> errors = Validator.buildErrors();

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
                    errors.add(new UnbalancedBracesError(null, token));
                } else {
                    Token top = delims.peek();
                    if (!PAIRS.get(top.getText()).equals(token.getText())) {
                        errors.add(new UnbalancedBracesError(top, token));
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
            // add errors in lexical order
            errors.add(index, new UnbalancedBracesError(delims.pop(), null));
        }
        return errors;
    }
}
