package com.binghamton.jhelp.antlr;

import java.util.stream.IntStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

/**
 * A class wrapping ANTLR's CommonToken with a reference to the TokenStream it
 * originated from.
 */
public class MyToken extends CommonToken {
    private static final long serialVersionUID = 1L;
    private CommonTokenStream stream;

    /**
     * Construct a new MyToken
     * @param type the type of this Token
     * @param text the text of this Token
     */
    public MyToken(int type, String text) {
        super(type, text);
    }

    /**
     * Construct a new MyToken
     * @param source the TokenSource and CharStream this Token is from
     * @param type the type of this Token
     * @param channel the channel this Token is from
     * @param start the index of this Token's starting character
     * @param stop the index of this Token's final character
     */
    public MyToken(Pair<TokenSource, CharStream> source,
                   int type,
                   int channel,
                   int start,
                   int stop) {
        super(source, type, channel, start, stop);
    }

    /**
     * Gets the CommonTokenStream this Object is from
     * @return the CommonTokenStream this Object is from
     */
    public CommonTokenStream getTokenStream() {
        return stream;
    }

    /**
     * Sets the CommonTokenStream this Object is from
     * @param stream the CommonTokenStream this Object is from
     */
    public void setTokenStream(CommonTokenStream stream) {
        this.stream = stream;
    }

    /**
     * Returns the name of this Object's source file
     * @return the name of this Object's source file
     */
    public String getSourceName() {
        return getTokenSource().getSourceName();
    }

    /**
     * Gets all the text from this Object to `stop`, inclusive
     * @param stop the last MyToken to include in the text
     * @return the text from this Object to `stop`, inclusive
     */
    public String getTextUpTo(MyToken stop) {
        return stream.getText(this, stop);
    }
}