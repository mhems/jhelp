package com.binghamton.jhelp.error;

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.Token;

/**
 * A class to represent syntactic errors
 */
public class SyntacticError extends JHelpError {

    public static final String MSG_0 = "Class cannot contain top-level statements";
    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put(MSG_0, "Put top-level statements inside a method or initializer block");
    }

    public SyntacticError(Token token, String msg) {
        super(token, msg, map.get(msg));
    }

    public SyntacticError(Token token, String msg, String suggestion) {
        super(token, msg, suggestion);
    }
}
