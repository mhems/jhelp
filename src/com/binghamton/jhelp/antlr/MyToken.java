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

    /**
     * Gets the FileBuffer this Token originated from
     * @return the FileBuffer this Token originated from
     */
    public FileBuffer getFileBuffer() {
        return buffer;
    }

    /**
     * Sets the FileBuffer this Token originated from
     * @param buffer the FileBuffer this Token originates from
     */
    public void setFileBuffer(FileBuffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Gets the line of the file this Token originated from
     * @return the line of the file this Token originated from
     */
    public String getLineText() {
        return buffer.getLine(line);
    }

    /**
     * Gets the column offset this Token starts at within its line
     * @return the column offset this Token starts at within its line
     */
    public int getColStart() {
        return charPositionInLine;
    }

    /**
     * Gets the column offset this Token stops at within its line
     * @return the column offset this Token stops at within its line
     */
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
        ColorStringBuilder sb = new ColorStringBuilder();
        sb.append(buffer.getName(), ColorStringBuilder.Format.BOLD);
        sb.append(", line ");
        sb.append(line + "", ColorStringBuilder.Format.BOLD);
        sb.append(", col ");
        sb.append(charPositionInLine + "", ColorStringBuilder.Format.BOLD);
        return sb.toString();
    }

    /**
     * Constructs a colored String of the line this Token originated from, with
     * the token test highlighted.
     * @return the highlighted line this Token originated from
     */
    public String getHighlightedLine() {
        return highlight(getLineText(),
                         charPositionInLine,
                         charPositionInLine + getText().length());
    }

    /**
     * Determines if other Tokens originate from the line this Token occurs on.
     * @param tokens the other Tokens to examine
     * @return true iff all the given Tokens occur on the same line as this Token
     */
    public boolean onSameLine(MyToken... tokens) {
        for (MyToken tok : tokens) {
            if (tok.line != this.line) {
                return false;
            }
        }
        return true;
    }

    /**
     * Highlights multiple Tokens on the same line
     * @param first the first Token to highlight
     * @param tokens any other Tokens to highlight
     * @return the highlighted line the given Tokens occur on
     * @throws IllegalArgumentException iff the given Tokens do not all occur on
     * the same line or are not in order of lexical appearance
     */
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

    /**
     * Gets the highlighted line the given AST occurs on
     * @param ast the ASTNode to highlight in-line
     * @return a line with the given AST highlighted
     */
    public static String getHighlightedLine(ASTNode ast) {
        return highlight(ast.getFirstToken().getLineText(),
                         ast.getFirstToken().getColStart(),
                         ast.getLastToken().getColStop());
    }

    /**
     * Highlights a substring of a line of text
     * @param line the line of text to highlight
     * @param start the index within the String to start highlighting
     * @param stop the index within the String to stop highlighting
     * @return the given line with the substring highlighted
     */
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
