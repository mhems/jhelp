package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java keyword expression
 */
public class KeywordExpression extends IdentifierExpression {

    /**
     * Construct a keyword expression
     * @param keyword the keyword token
     */
    public KeywordExpression(Token keyword) {
        super(keyword);
    }

    public KeywordExpression(Token keyword,
                             List<Annotation> annotations) {
        super(keyword, annotations);
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        // super.accept(v);
        v.visit(this);
    }
}
