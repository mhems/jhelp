package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import com.binghamton.jhelp.Program;
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
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine,
                          msg, ex);
        System.err.println("error detected!");
        System.err.println("offender: " + offendingSymbol);
        System.err.println("line: " + line);
        System.err.println("column: " + charPositionInLine);
        System.err.println("msg: " + msg);
        System.err.println("exception: " + ex);
        if (offendingSymbol instanceof MyToken) {
            MyToken token = (MyToken)offendingSymbol;
            String lineText = token.getLineText();
            ColorStringBuilder sb = new ColorStringBuilder();
            sb.append(lineText.substring(0, charPositionInLine));
            int stop = charPositionInLine + token.getText().length();
            sb.append(lineText.substring(charPositionInLine, stop),
                      ColorStringBuilder.Color.RED,
                      null);
            sb.append(lineText.substring(stop));
            System.err.println(sb);
        }
    }
}
