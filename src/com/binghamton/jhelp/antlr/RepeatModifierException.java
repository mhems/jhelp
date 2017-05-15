package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * A class to represent the syntax error of repeating declaration modifiers
 */
public class RepeatModifierException extends MyRecognitionException {
    private final static long serialVersionUID = 1L;
    public final MyToken original;

    /**
     * Constructs a new RepeatModifierException.
     * @param recognizer the Recognizer this exception originated from
     * @param input the IntStream this exception originated from
     * @param ctx the context the Recognizer was in when the exception occured
     * @param original the Token that holds the first modifier
     */
    public RepeatModifierException(Recognizer<?, ?> recognizer,
                                   IntStream input,
                                   ParserRuleContext ctx,
                                   MyToken original) {
        super(recognizer, input, ctx, null);
        this.original = original;
    }
}
