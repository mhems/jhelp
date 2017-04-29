package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class to represent semantic errors
 */
public class SemanticError extends JHelpError {

    public SemanticError(ASTNode ast, String msg, String suggestion) {
        super(ast, msg, suggestion);
    }

    public SemanticError(Token token, String msg, String suggestion) {
        super(token, msg, suggestion);
    }

    public SemanticError(Token token, String msg) {
        super(token, msg);
    }

    public SemanticError(String msg) {
        super(msg);
    }

    public SemanticError(String fmt, Object... args) {
        super(fmt, args);
    }
}
