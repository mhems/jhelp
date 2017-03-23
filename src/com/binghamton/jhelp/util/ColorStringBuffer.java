package com.binghamton.jhelp.util;

/**
 * Class composing a `StringBuffer` with the additional API of basic terminal
 * formatting and coloring via terminal codes.
 */
public class ColorStringBuffer {
    public static enum Format {
        NORMAL(0), BOLD(1), DIM(2), UNDERSCORE(4), INVERSE(7);

        private final static int DELTA = 20;
        private final int code;
        private final int resetCode;

        private Format(int code) {
            this.code = code;
            this.resetCode = code + DELTA;
        }
    };
    public static enum Color {
        DEFAULT(39), BLACK(30), RED(31), GREEN(32), YELLOW(33), BLUE(34),
        MAGENTA(35), CYAN(36), LIGHT_GRAY(37), DARK_GRAY(90), LIGHT_RED(91),
        LIGHT_GREEN(92), LIGHT_YELLOW(93), LIGHT_BLUE(94), LIGHT_MAGENTA(95),
        LIGHT_CYAN(96), WHITE(97);

        private final static int DELTA = 10;
        private final int fgCode;
        private final int bgCode;

        private Color(int fgCode) {
            this.fgCode = fgCode;
            this.bgCode = fgCode + DELTA;
        }
    };

    private final static char ESCAPE_CHAR = 27;

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
        appendCode(fmt.code);
    }

    /**
     * Rid future text of having given format
     * @param fmt the format to reset
     */
    public void resetFormat(Format fmt) {
        appendCode(fmt.resetCode);
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
        appendCode(color.fgCode);
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
        appendCode(color.bgCode);
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

    /**
     * Appends formatted text to the buffer
     * @param string the String to format and append
     * @param format the format to format the String with.
     *               Ignored if null.
     */
    public void append(String string, Format format) {
        append(string, null, null, format);
    }

    /**
     * Appends colored text to the buffer
     * @param string the String to format and append
     * @param foregroundColor the color to make the foreground of the String.
     *                        Ignored if null.
     * @param backgroundColor the color to make the background of the String.
     *                        Ignored if null.
     */
    public void append(String string,
                       Color foregroundColor,
                       Color backgroundColor) {
        append(string, foregroundColor, backgroundColor, null);
    }

    /**
     * Appends colored and/or formatted text to the buffer
     * @param string the String to format and append
     * @param foregroundColor the color to make the foreground of the String.
     *                        Ignored if null.
     * @param backgroundColor the color to make the background of the String.
     *                        Ignored if null.
     * @param format the format to format the String with.
     *                        Ignored if null.
     */
    public void append(String string,
                       Color foregroundColor,
                       Color backgroundColor,
                       Format format) {
        if (foregroundColor != null) {
            setForegroundColor(foregroundColor);
        }
        if (backgroundColor != null) {
            setBackgroundColor(backgroundColor);
        }
        if (format != null) {
            setFormat(format);
        }
        append(string);
        if (foregroundColor != null) {
            resetForegroundColor();
        }
        if (backgroundColor != null) {
            resetBackgroundColor();
        }
        if (format != null) {
            resetFormat(format);
        }
    }
}
