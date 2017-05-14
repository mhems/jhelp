package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class RepeatModifierException extends MyRecognitionException {
    private final static long serialVersionUID = 1L;
    public final MyToken original;

    public RepeatModifierException(Recognizer<?, ?> recognizer,
                                   IntStream input,
                                   ParserRuleContext ctx,
                                   MyToken original) {
        super(recognizer, input, ctx, null);
        this.original = original;
    }
}
