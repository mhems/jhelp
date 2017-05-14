package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;

import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.RepeatModifierError;
import com.binghamton.jhelp.error.SyntacticError;
import com.binghamton.jhelp.util.ColorStringBuilder;

/**
 * A wrapper around the basic error listener to report syntax errors in an
 * application consistent manner.
 */
public class SyntaxErrorListener extends ConsoleErrorListener {

    private Program program;

    /**
     * Constructs a new SyntaxErrorListener over a given Program
     * @param program the Program this listener is attached to
     */
    public SyntaxErrorListener(Program program) {
        this.program = program;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException ex) {
        MyToken token = (MyToken)offendingSymbol;
        JHelpError error = null;
        if (ex instanceof RepeatModifierException) {
            error = new RepeatModifierError(token,
                                            ((RepeatModifierException)ex).original);
        }
        else if (ex instanceof MyRecognitionException) {
            error = new JHelpError(token,
                                   msg,
                                   ((MyRecognitionException)ex).getSuggestion());
        } else {
            String suggestion = null;
            if (ex instanceof InputMismatchException) {
                suggestion = "Instead provide one of the expected tokens, e.g " +
                    ex.getExpectedTokens().toString(recognizer.getVocabulary());
            } else if (ex instanceof NoViableAltException ||
                       ex instanceof LexerNoViableAltException) {
                suggestion = "This is likely not where this code should go. Is any code missing or does this code need to go somewhere else?";
            }
            error = new SyntacticError(token, msg, suggestion);
        }
        program.addError(error);
    }
}
