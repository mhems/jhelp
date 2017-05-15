package com.binghamton.jhelp.util;

import java.util.Arrays;

/**
 * A class housing simple utility functions on arrays
 */
public class ArrayUtils {

    /**
     * Creates a new array from an existing array with an additional element
     * @param <E> the type of array elements
     * @param array the array of elements to copy
     * @param arg the additional element to append
     * @return a new array containing the elements of array and arg
     */
    public static <E> E[] append(E[] array, E arg) {
        E[] ret = Arrays.copyOf(array, array.length + 1);
        ret[array.length] = arg;
        return ret;
    }

    /**
     * Trims any trailing null elements in a given array
     * @param <E> the type of array elements
     * @param src the array to be trimmed
     * @return the trimmed array
     */
    public static <E> E[] trim(E[] src) {
        int i = 0;
        while (i < src.length && src[i] != null) {
            ++i;
        }
        return Arrays.copyOf(src, i);
    }
}
