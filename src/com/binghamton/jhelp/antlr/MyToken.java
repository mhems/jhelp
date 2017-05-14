package com.binghamton.jhelp.antlr;

import java.util.Comparator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.misc.Interval;

import com.binghamton.jhelp.ast.ASTNode;
import com.binghamton.jhelp.util.FileBuffer;
import com.binghamton.jhelp.util.ColorStringBuilder;

/**
 * A class wrapping ANTLR's CommonToken with a reference to the FileBuffer it
 * originated from.
 */
public class MyToken extends CommonToken implements Comparable<MyToken> {
    private static final Comparator<MyToken> TOKEN_COMPARATOR =
        Comparator.<MyToken>comparingInt(t -> t.getLine())
        .thenComparingInt(t -> t.getCharPositionInLine())
        .thenComparingInt(t -> t.getStopIndex());
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

    public int getColStart() {
        return charPositionInLine;
    }

    public int getColStop() {
        return charPositionInLine + getText().length();
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
        return highlight(getLineText(),
                         charPositionInLine,
                         charPositionInLine + getText().length());
    }

    public boolean onSameLine(MyToken... tokens) {
        for (MyToken tok : tokens) {
            if (tok.line != this.line) {
                return false;
            }
        }
        return true;
    }

    public static String getHighlightedLine(MyToken first, MyToken... tokens) {
        int line = first.line;
        int start = first.getColStart();
        int stop = first.getColStop();
        String text = first.getLineText();
        ColorStringBuilder sb = new ColorStringBuilder();
        sb.append(text.substring(0, start));
        sb.append(text.substring(start, stop),
                  ColorStringBuilder.Color.RED,
                  null);
        for (int i = 0; i < tokens.length; i++) {
            if (line != tokens[i].line) {
                throw new IllegalArgumentException("cannot highlight tokens on different lines");
            }
            if (tokens[i].getColStart() < start ||
                tokens[i].getColStop() < stop) {
                throw new IllegalArgumentException("tokens must be in order");
            }
            start = tokens[i].getColStart();
            sb.append(text.substring(stop, start));
            stop = tokens[i].getColStop();
            sb.append(text.substring(start, stop),
                      ColorStringBuilder.Color.RED,
                      null);
        }
        sb.append(text.substring(stop));
        return sb.toString();
    }

    public static String getHighlightedLine(ASTNode ast) {
        return highlight(ast.getFirstToken().getLineText(),
                         ast.getFirstToken().getColStart(),
                         ast.getLastToken().getColStop());
    }

    private static String highlight(String line, int start, int stop) {
        ColorStringBuilder sb = new ColorStringBuilder();
        sb.append(line.substring(0, start));
        sb.append(line.substring(start, stop),
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

    @Override
    public int compareTo(MyToken other) {
        if (!buffer.equals(other.buffer)) {
            throw new IllegalArgumentException("only Tokens from the same file are Comparable");
        }
        return TOKEN_COMPARATOR.compare(this, other);
    }
}
