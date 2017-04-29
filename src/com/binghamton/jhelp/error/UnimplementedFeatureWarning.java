package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.JHelp;
import com.binghamton.jhelp.ast.ASTNode;

public class UnimplementedFeatureWarning extends JHelpWarning {

    public UnimplementedFeatureWarning(Token token, String msg) {
        super(token,
              msg + " are not yet implemented in JHelp version " + JHelp.VERSION,
              "This program will not check its usage");
    }

    public UnimplementedFeatureWarning(ASTNode ast, String msg) {
        super(ast,
              msg + " are not yet implemented in JHelp version " + JHelp.VERSION,
              "This program will not check its usage");
    }
}
