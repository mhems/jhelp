package com.binghamton.jhelp.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.misc.Interval;

import com.binghamton.jhelp.util.FileBuffer;
import com.binghamton.jhelp.util.ColorStringBuilder;

/**
 * A class wrapping ANTLR's CommonToken with a reference to the FileBuffer it
 * originated from.
 */
public class MyToken extends CommonToken {
    private static final long serialVersionUID = 1L;
    private FileBuffer buffer;
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

    public FileBuffer getFileBuffer() {
        return buffer;
    }

    public void setFileBuffer(FileBuffer buffer) {
        this.buffer = buffer;
    }

    public String getLineText() {
        return buffer.getLine(line);
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

    /**
     * Builds a format string of this Token
     * @return a formatted string of this Token
     */
    public String getLocationString() {
        return String.format("%s, line %d, col %d",
                             buffer.getName(),
                             line,
                             charPositionInLine);
    }

    public String getHighlightedLine() {
        ColorStringBuilder sb = new ColorStringBuilder();
        String line = getLineText();
        sb.append(line.substring(0, charPositionInLine));
        int stop = charPositionInLine + getText().length();
        sb.append(line.substring(charPositionInLine, stop),
                  ColorStringBuilder.Color.RED,
                  null);
        sb.append(line.substring(stop));
        return sb.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof MyToken) {
            MyToken oT = (MyToken)other;
            return type == oT.type &&
                channel == oT.channel &&
                start == oT.start &&
                stop == oT.stop &&
                stream.equals(oT.stream);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(type) ^
            Integer.hashCode(channel) ^
            Integer.hashCode(start) ^
            Integer.hashCode(stop);
    }
}
