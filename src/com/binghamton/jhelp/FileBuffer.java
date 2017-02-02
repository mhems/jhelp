package com.binghamton.jhelp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class stores a file's contents in a buffer. Lines from the file are
 * available with optional preceding or trailing context lines
 */
public class FileBuffer {
    private String filename;
    private String[] lines;

    /**
     * Bring the contents of the file `filename` into buffer
     * @param filename the name of the file whose contents are to be read
     * @throws IOException if any IO exception occurs doing reading
     */
    public FileBuffer(String filename) throws IOException {
        this.filename = filename;
        lines = Files.readAllLines(Paths.get(filename)).toArray(new String[0]);
    }

    /**
     * Retrieves the line `line` from file
     * @param line the 1-indexed line number of the line to retrieve
     * @return a one-element array containing the `line`th line
     */
    public String[] getLines(int line) {
        return new String[]{lines[line-1]};
    }

    /**
     * Retrieves the line `line` from file with `width` amount of preceding
     * lines and `width` amount of trailing lines, if possible
     * @param line the 1-indexed line number of the line to retrieve
     * @param width the number of preceding and trailing lines to include,
     * non-cumulatively
     * @return an array containing the `line`th line with at most 2*`width`
     * context lines
     */
    public String[] getLines(int line, int width) {
        return getLines(line, width, width);
    }

    /**
     * Retrieves the line `line` from file with `before` amount of preceding
     * lines and `after` amount of trailing lines, if possible
     * @param line the 1-indexed line number of the line to retrieve
     * @param before the number of preceding lines to include
     * @param after the number of trailing lines to include
     * @return an array containing the `line`th line with at most (`before` +
     * `after`) context lines
     */
    public String[] getLines(int line, int before, int after) {
        int min = Math.max(0, line - 1 - before);
        int max = Math.min(lines.length, line + after);
        String[] tmp = new String[max-min];
        for (int i = min; i < max; i++) {
            tmp[i-min] = lines[i];
        }
        return tmp;
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof FileBuffer) {
            FileBuffer b = (FileBuffer)other;
            return filename.equals(b.filename) &&
                lines.equals(b.lines);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return filename.hashCode() ^ lines.hashCode();
    }
}
