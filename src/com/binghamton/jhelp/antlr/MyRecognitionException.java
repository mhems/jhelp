package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class MyRecognitionException extends RecognitionException {

    private static final long serialVersionUID = 1L;
    private String suggestion;

    protected MyRecognitionException(Recognizer<?, ?> recognizer,
                                     IntStream input,
                                     ParserRuleContext ctx,
                                     String suggestion) {
        super(recognizer, input, ctx);
        this.suggestion = suggestion;
    }

    public String getSuggestion() {
        return suggestion;
    }
}
