package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTNode;

public class StyleWarning extends JHelpWarning {

    public StyleWarning(String msg) {
        super(msg);
    }

    public StyleWarning(String fmt, Object... args) {
        super(fmt, args);
    }

    public StyleWarning(Token token, String msg, String suggestion) {
        super(token, msg, suggestion);
    }

    public StyleWarning(ASTNode ast, String msg, String suggestion) {
        super(ast, msg, suggestion);
    }

    public StyleWarning(Token token, String msg) {
        this(token, msg, null);
    }
}
