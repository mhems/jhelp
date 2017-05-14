package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class to represent semantic errors
 */
public class SemanticError extends JHelpError {

    /**
     * Constructs a SemanticError on an AST
     * @param ast the offending AST
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     */
    public SemanticError(ASTNode ast, String msg, String suggestion) {
        super(ast, msg, suggestion);
    }

    /**
     * Constructs a SemanticError on a Token
     * @param token the offending Token
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     */
    public SemanticError(Token token, String msg, String suggestion) {
        super(token, msg, suggestion);
    }

    /**
     * Constructs a SemanticError on a Token
     * @param token the offending Token
     * @param msg the message explaining the error
     */
    public SemanticError(Token token, String msg) {
        super(token, msg);
    }

    /**
     * Constructs a SemanticError on a Token
     * @param msg the message explaining the error
     */
    public SemanticError(String msg) {
        super(msg);
    }

    /**
     * Constructs a SemanticError with a formatted message
     * @param fmt the format String explaining the error
     * @param args any arguments to the format String
     */
    public SemanticError(String fmt, Object... args) {
        super(fmt, args);
    }
}
