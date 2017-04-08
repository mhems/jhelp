package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;


public class MyTokenFactory implements TokenFactory<MyToken> {
    private final CommonTokenStream stream;

    public MyTokenFactory(CharStream input, CommonTokenStream stream) {
        this.stream = stream;
    }

    @Override
    public MyToken create(int type, String text) {
        MyToken token = new MyToken(type, text);
        token.setTokenStream(stream);
        return token;
    }

    @Override
    public MyToken create(Pair<TokenSource, CharStream> source,
                          int type,
                          String text,
                          int channel,
                          int start,
                          int stop,
                          int line,
                          int charPositionInLine) {
        MyToken token = new MyToken(source, type, channel, start, stop);
        token.setLine(line);
        token.setCharPositionInLine(charPositionInLine);
        token.setTokenStream(stream);
        return token;
    }
}
