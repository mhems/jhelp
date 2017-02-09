package com.binghamton.jhelp;

import java.io.IOException;

import java.util.Arrays;

public class TestFileBuffer {
    private static FileBuffer fb;

    static {
        try {
            fb = new FileBuffer("input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test(1, 0, 0);
        test(3, 0, 0);
        test(35, 0, 0);
        test(36, 0, 0);

        test(1, 2, 0);
        test(3, 2, 0);
        test(35, 2, 0);
        test(36, 2, 0);

        test(1, 0, 2);
        test(3, 0, 2);
        test(35, 0, 2);
        test(36, 0, 2);
    }

    private static void test(int line, int before, int after) {
        System.out.println("Line " + line + " w/ " + before +
			   " before, " + after + " after: " +
                           Arrays.toString(fb.getLines(line,
						       before,
						       after)));
    }
}
