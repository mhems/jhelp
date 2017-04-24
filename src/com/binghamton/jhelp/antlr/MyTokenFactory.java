package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

import com.binghamton.jhelp.util.FileBuffer;

/**
 * A TokenFactory that produces MyTokens
 */
public class MyTokenFactory implements TokenFactory<MyToken> {
    private final CommonTokenStream stream;
    private final FileBuffer buffer;

    /**
     * Constructs a new factory for a given TokenStream
     * @param stream the TokenStream that produces these Tokens
     * @param buffer the FileBuffer that these Tokens originated from
     */
    public MyTokenFactory(CommonTokenStream stream, FileBuffer buffer) {
        this.stream = stream;
        this.buffer = buffer;
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
        token.setFileBuffer(buffer);
        token.setTokenStream(stream);
        return token;
    }
}
