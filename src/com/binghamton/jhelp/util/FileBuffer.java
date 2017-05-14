package com.binghamton.jhelp.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * A class holding a File's contents in a buffer
 */
public class FileBuffer {
    private File file;
    private String[] lines;

    /**
     * Constructs a FileBuffer backing a given File
     * @param file the File whose contents are to be brought into memory
     * @throws IOException if file operations trigger an IOException
     */
    public FileBuffer(File file) throws IOException {
        this.file = file;
        lines = Files.readAllLines(Paths.get(file.getAbsolutePath())).toArray(new String[0]);
    }

    /**
     * Gets the name of the File contents this buffer holds
     * @return the name of the File contents this buffer holds
     */
    public String getName() {
        return file.getName();
    }

    /**
     * Gets a specific line of this File
     * @param line the 1-indexed line to get
     * @return the corresponding line of this FileBuffer
     */
    public String getLine(int line) {
        return lines[line-1];
    }

    /**
     * Gets a specific line of this File
     * @param line the 1-indexed line to get
     * @return a single-element array holding the corresponding line
     */
    public String[] getLines(int line) {
        return new String[]{lines[line-1]};
    }

    /**
     * Gets a line of this File with surrounding lines
     * @param line the 1-indexed line to get
     * @param width the amount of preceding and trailing lines to also get
     * @return an array of lines containing the requesting line and any
     * surrounding lines
     */
    public String[] getLines(int line, int width) {
        return getLines(line, width, width);
    }

    /**
     * Gets a line of this File with surrounding lines
     * @param line the 1-indexed line to get
     * @param before the amount of preceding lines to also get
     * @param after the amount of trailing lines to also get
     * @return an array of lines containing the requesting line and any
     * surrounding lines
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

    @Override
    public boolean equals(Object other) {
        if (other instanceof FileBuffer) {
            return file.equals(((FileBuffer)other).file);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return file.hashCode();
    }
}
