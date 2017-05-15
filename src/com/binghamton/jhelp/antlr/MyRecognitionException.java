package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * A base class for recognition exceptions hard-coded into the grammar for
 * common mistakes.
 */
public class MyRecognitionException extends RecognitionException {

    private static final long serialVersionUID = 1L;
    private String suggestion;

    /**
     * Constructs a MyRecognitionException
     * @param recognizer the Recognizer this exception originated from
     * @param input the IntStream this exception originated from
     * @param ctx the context the Recognizer was in when the exception occured
     * @param suggestion the suggestion recommending how to fix the error
     */
    public MyRecognitionException(Recognizer<?, ?> recognizer,
                                  IntStream input,
                                  ParserRuleContext ctx,
                                  String suggestion) {
        super(recognizer, input, ctx);
        this.suggestion = suggestion;
    }

    /**
     * Gets the suggestion on how to fix this exception
     * @return the suggestion on how to fix this exception
     */
    public String getSuggestion() {
        return suggestion;
    }
}
