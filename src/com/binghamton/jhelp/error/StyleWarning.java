package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class representing warnings on a program's style
 */
public class StyleWarning extends JHelpWarning {

    /**
     * Constructs a new StyleWarning with a message
     * @param msg the message explaining the warning
     */
    public StyleWarning(String msg) {
        super(msg);
    }

    /**
     * Constructs a new StyleWarning with a formatted message
     * @param fmt the format String message explaining the warning
     * @param args any arguments to the format String
     */
    public StyleWarning(String fmt, Object... args) {
        super(fmt, args);
    }

    /**
     * Constructs a new StyleWarning on a specific Token
     * @param token the Token the warning is issued on
     * @param msg the message explaining the error
     * @param suggestion a suggestion to fix the warning
     */
    public StyleWarning(Token token, String msg, String suggestion) {
        super(token, msg, suggestion);
    }

    /**
     * Constructs a StyleWarning on an AST
     * @param ast the offending AST
     * @param msg the message explaining the warning
     * @param suggestion the suggestion suggesting a fix to the warning
     */
    public StyleWarning(ASTNode ast, String msg, String suggestion) {
        super(ast, msg, suggestion);
    }

    /**
     * Constructs a StyleWarning on a Token
     * @param token the Token the warning is issued on
     * @param msg the message explaining the warning
     */
    public StyleWarning(Token token, String msg) {
        this(token, msg, null);
    }
}
