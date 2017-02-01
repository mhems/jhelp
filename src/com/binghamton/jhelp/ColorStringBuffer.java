package com.binghamton.jhelp;

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

    public ColorStringBuffer() {
        this(true);
    }

    public ColorStringBuffer(boolean allow) {
        this.allow = allow;
        buffer = new StringBuffer();
    }

    private void appendCode(int code) {
        if (allow) {
            buffer.append(String.format("%c[%dm", ESCAPE_CHAR, code));
        }
    }

    public void setFormat(Format fmt) {
        appendCode(FORMAT_CODES[fmt.ordinal()]);
    }

    public void resetFormat(Format fmt) {
        appendCode(RESET_CODES[fmt.ordinal()]);
    }

    public void clearFormats() {
        for (Format fmt : Format.values()) {
            resetFormat(fmt);
        }
    }

    public void setForegroundColor(Color color) {
        appendCode(FOREGROUND_COLOR_CODES[color.ordinal()]);
    }

    public void resetForegroundColor() {
        setForegroundColor(Color.DEFAULT);
    }

    public void setBackgroundColor(Color color) {
        appendCode(BACKGROUND_COLOR_CODES[color.ordinal()]);
    }

    public void resetBackgroundColor() {
        setBackgroundColor(Color.DEFAULT);
    }

    public void clearAll() {
        clearFormats();
        resetForegroundColor();
        resetBackgroundColor();
    }

    @Override
    public String toString() {
        clearAll();
        return buffer.toString();
    }

    public void append(String string) {
        buffer.append(string);
    }
}
