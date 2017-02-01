package com.binghamton.jhelp;

/**
 * Class composing a `StringBuffer` with the additional API of basic terminal
 * formatting and coloring via terminal codes.
 */
public class ColorStringBuffer {
    public static enum Format { NORMAL, BOLD, DIM, UNDERSCORE, INVERSE };
    public static enum Color { DEFAULT, BLACK, RED, GREEN, YELLOW, BLUE,
                               MAGENTA, CYAN, LIGHT_GRAY, DARK_GRAY, LIGHT_RED,
                               LIGHT_GREEN, LIGHT_YELLOW, LIGHT_BLUE,
                               LIGHT_MAGENTA, LIGHT_CYAN, WHITE };
    private final static char ESCAPE_CHAR = 27;
    private final static int[] FORMAT_CODES = {0, 1, 2, 4, 7};
    private final static int[] RESET_CODES = {0, 21, 22, 24, 27};
    private final static int[] FOREGROUND_COLOR_CODES = {39, 30, 31, 32, 33, 34,
                                                         35, 36, 37, 90, 91, 92,
                                                         93, 94, 95, 96, 97};
    private final static int[] BACKGROUND_COLOR_CODES = {49, 40, 41, 42, 43, 44,
                                                         45, 46, 47, 100, 101,
                                                         102, 103, 104, 105,
                                                         106, 107};

    private StringBuffer buffer;
    private boolean allow;

    /**
     * Construct a new ColorStringBuffer object
     */
    public ColorStringBuffer() {
        this(true);
    }

    /**
     * Construct a new ColorStringBuffer object
     * @param allow true iff formatting allowed, false iff formatting prevented
     */
    public ColorStringBuffer(boolean allow) {
        this.allow = allow;
        buffer = new StringBuffer();
    }

    /**
     * Internal subroutine to append formatting code to internal buffer, if
     * allowed
     * @param code the format code to append
     */
    private void appendCode(int code) {
        if (allow) {
            buffer.append(String.format("%c[%dm", ESCAPE_CHAR, code));
        }
    }

    /**
     * Set future text to have given format
     * @param fmt the format to establish
     */
    public void setFormat(Format fmt) {
        appendCode(FORMAT_CODES[fmt.ordinal()]);
    }

    /**
     * Rid future text of having given format
     * @param fmt the format to reset
     */
    public void resetFormat(Format fmt) {
        appendCode(RESET_CODES[fmt.ordinal()]);
    }

    /**
     * Clear future text of any formatting
     */
    public void clearFormats() {
        for (Format fmt : Format.values()) {
            resetFormat(fmt);
        }
    }

    /**
     * Set future text to have given foreground color
     * @param color the foreground color to establish
     */
    public void setForegroundColor(Color color) {
        appendCode(FOREGROUND_COLOR_CODES[color.ordinal()]);
    }

    /**
     * Rid future text of having given any foreground color
     */
    public void resetForegroundColor() {
        setForegroundColor(Color.DEFAULT);
    }

    /**
     * Set future text to have given background color
     * @param color the background color to establish
     */
    public void setBackgroundColor(Color color) {
        appendCode(BACKGROUND_COLOR_CODES[color.ordinal()]);
    }

    /**
     * Rid future text of having any background color
     */
    public void resetBackgroundColor() {
        setBackgroundColor(Color.DEFAULT);
    }

    /**
     * Clear future text of any formatting or coloring
     */
    public void clearAll() {
        clearFormats();
        resetForegroundColor();
        resetBackgroundColor();
    }

    /**
     * Return formatted buffer contents
     * @return the formatted buffer contents
     */
    @Override
    public String toString() {
        clearAll();
        return buffer.toString();
    }

    /**
     * Append text to the buffer
     * @param string the text to append
     */
    public void append(String string) {
        buffer.append(string);
    }
}
