package com.binghamton.jhelp;

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
     * Validates the InputStream by checking for unbalanced braces
     * @param streams the InputStreams to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     * @throws IOException if any I/O errors occur during validation
     */
    public List<JHelpError> validateOrThrow(InputStream[] streams) throws IOException {
        Lexer lexer;
        List<JHelpError> errs = Validator.buildErrors();
        for (InputStream stream : streams) {
            lexer = new BalanceLexer(new ANTLRInputStream(stream));
            errs.addAll(check(lexer.getAllTokens()));
        }
        return errs;
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
