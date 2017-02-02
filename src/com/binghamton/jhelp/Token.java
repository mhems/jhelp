package com.binghamton.jhelp;

/**
 * A class representing a lexer token from a File-like object.
 */
public class Token {
    public final FileBuffer fileBuffer;
    public final int line;
    public final int colStart;
    public final int colStop;
    public final String lexeme;

    /**
     * Construct Token object
     * @param lexeme the contents of this Token
     * @param fileBuffer the FileBuffer where this Token originated from
     * @param line the 1-indexed line number this Token originated from
     * @param col the 0-indexed column number this Token starts on
     */
    public Token(String lexeme, FileBuffer fileBuffer, int line, int col) {
        this.lexeme = lexeme;
        this.fileBuffer = fileBuffer;
        this.line = line;
        this.colStart = col;
        this.colStop = colStart + lexeme.length();
    }

    /**
     * Return the length of this Token's lexeme
     * @return the length of the lexeme
     */
    public int length() {
        return lexeme.length();
    }

    /**
     * Retrieves the line this Token comes from
     * @return a one-element array containing this Token's line
     */
    public String[] getLines() {
        return fileBuffer.getLines(line);
    }

    /**
     * Retrieves the line of this Token with `width` lines in both
     * directions
     * @param width the number of lines to include in either direction
     * @return an array containing this Token's line and at most (2*`width`)
     * lines of context
     */
    public String[] getLines(int width) {
        return fileBuffer.getLines(line, width, width);
    }

    /**
     * Retrieves the line of this Token with specified contextual lines
     * @param before the number of trailing lines to include
     * @param after the number of preceding lines to include
     * @return an array containing this Token's line and at most
     */
    public String[] getLines(int before, int after) {
        return fileBuffer.getLines(line, before, after);
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Token) {
            Token t = (Token)other;
            return fileBuffer.equals(t.fileBuffer) &&
                line == t.line &&
                colStart == t.colStart &&
                lexeme.equals(t.lexeme);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return fileBuffer.hashCode() ^ line ^ colStart ^ lexeme.hashCode();
    }
}
