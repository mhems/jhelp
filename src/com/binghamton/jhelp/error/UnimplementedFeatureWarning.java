package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.JHelp;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class to represent warnings on features this application has not yet
 * implemented.
 */
public class UnimplementedFeatureWarning extends JHelpWarning {

    /**
     * Constructs a new UnimplementedFeatureWarning on a specific Token
     * @param token the Token the warning is issued on
     * @param msg the message explaining the error
     */
    public UnimplementedFeatureWarning(Token token, String msg) {
        super(token,
              msg + " are not yet implemented in JHelp version " + JHelp.VERSION,
              "This program will not check its usage");
    }

    /**
     * Constructs a new UnimplementedFeatureWarning on a specific Token
     * @param ast the offending AST
     * @param msg the message explaining the error
     */
    public UnimplementedFeatureWarning(ASTNode ast, String msg) {
        super(ast,
              msg + " are not yet implemented in JHelp version " + JHelp.VERSION,
              "This program will not check its usage");
    }
}
