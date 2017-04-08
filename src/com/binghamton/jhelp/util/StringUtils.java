package com.binghamton.jhelp.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.List;
import java.util.StringJoiner;

/**
 * A class holding utility methods for dealing with Strings
 */
public class StringUtils {

    private StringUtils() {

    }

    /**
     * A utility method allowing any Collection's elements to be represented by
     * their toString, interspersed with a delimiting String
     * @param <T> the type of the Collection's elements
     * @param delimiter the String to delimit the Collection's elements with
     * @param iterable the Collection of Objects to join
     * @return a String holding each element in `iterable`'s toString, delimited
     * by `delimiter`
     */
    public static <T> String join(String delimiter, Collection<T> iterable) {
        return join(delimiter, iterable, e -> e.toString());
    }

    public static <T> String join(String delimiter, T[] iterable) {
        return join(delimiter, iterable, e -> e.toString());
    }

    public static <T> String join(String delimiter,
                                  T[] iterable,
                                  Function<T, String> toString) {
        StringJoiner sj = new StringJoiner(delimiter);
        for (T e : iterable) {
            sj.add(toString.apply(e));
        }
        return sj.toString();
    }

    /**
     * A utility method allowing any Collection's elements to be mapped to
     * Strings and then interspersed with a delimiting String
     * @param <T> the type of the Collection's elements
     * @param delimiter the String to delimit the Collection's elements with
     * @param iterable the Collection of Objects to join
     * @param toString a Function taking a T and returning it as a String
     * @return a String holding each element in `iterable` as a String,
     * delimited by `delimiter`
     */
    public static <T> String join(String delimiter,
                                  Collection<T> iterable,
                                  Function<T, String> toString) {
        List<String> strings = new ArrayList<>();
        for (T e : iterable) {
            strings.add(toString.apply(e));
        }
        return String.join(delimiter, strings);
    }
}
