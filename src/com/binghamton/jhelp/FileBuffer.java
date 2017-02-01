package com.binghamton.jhelp;

import java.io.IOException;
import java.nio.Files;
import java.nio.Paths;

public class FileBuffer {
    String filename;
    String[] lines;

    public FileBuffer(String filename) throws IOException {
        this.filename = filename;
        lines = Files.readAllLines(Paths.get(filename)).toArray(new String[0]);
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
}
