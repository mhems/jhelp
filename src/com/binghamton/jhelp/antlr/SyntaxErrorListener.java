package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;

import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.util.ColorStringBuilder;

public class SyntaxErrorListener extends ConsoleErrorListener {

    private Program program;

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
        String suggestion = null;
        if (ex instanceof MyRecognitionException) {
            suggestion = ((MyRecognitionException)ex).getSuggestion();
        } else if (ex == null) {
            suggestion = "Try removing the highlighted duplicate modifier";
        }
        // } else if (ex instanceof InputMismatchException) {
        //     suggestion = "provide an expected token, (e.g. one of ";
        //     suggestion += ex.getExpectedTokens();
        //     suggestion += ");"
        // } else if (ex instanceof NoViableAltException ||
        //            ex instanceof LexerNoViableAltException) {
        //     suggestion = "provide an unambiguous token";
        // }
        program.addError(new JHelpError(token, msg, suggestion));
    }
}
