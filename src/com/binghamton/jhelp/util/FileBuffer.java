package com.binghamton.jhelp.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileBuffer {
    private File file;
    private String[] lines;

    public FileBuffer(File file) throws IOException {
        this.file = file;
        lines = Files.readAllLines(Paths.get(file.getAbsolutePath())).toArray(new String[0]);
    }

    public String getName() {
        return file.getName();
    }

    public String getLine(int line) {
        return lines[line-1];
    }

    // line is 1-indexed
    public String[] getLines(int line) {
        return new String[]{lines[line-1]};
    }

    // line is 1-indexed
    public String[] getLines(int line, int width) {
        return getLines(line, width, width);
    }

    // line is 1-indexed
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
