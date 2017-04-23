package com.binghamton.jhelp;

import java.io.IOException;
import java.io.File;

import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.antlr.Balance;
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

    private File[] files;

    /**
     * Construct a new BalancedValidator over a set of Files
     * @param files the Files to validate for balanced punctuation
     */
    public BalancedValidator(File[] files) {
        this.files = files;
    }

    /**
     * Validates the files' contents by checking for unbalanced braces
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate() {
        Lexer lexer;
        CommonTokenStream stream;
        List<JHelpError> errors = Validator.buildErrors();
        try {
            for (File file : files) {
                lexer = new Balance(new ANTLRFileStream(file.getAbsolutePath()));
                lexer.removeErrorListeners();
                stream = new CommonTokenStream(lexer);
                errors.addAll(check(stream));
            }
        } catch (IOException e) {
            errors.add(new ExceptionError(e));
        }
        return errors;
    }

    /**
     * Checks a stream of Tokens for balanced punctuation
     * @param tokenStream the stream of Tokens to check
     * @return a possibly empty List of JHelpErrors present
     */
    private static List<JHelpError> check(CommonTokenStream tokenStream) {
        Stack<Token> delims = new Stack<>();
        List<JHelpError> errors = Validator.buildErrors();
        Token token;
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            token = tokenStream.get(i);
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
