package com.binghamton.jhelp.util;

import java.util.Comparator;

/**
 * An abstract base class for fuzzy string matchers to extend with their own
 * algorithm for computing edit distance.
 */
public abstract class StringMatcher {

    public interface CharEquater {
        /**
         * Determines if two Characters are equivalent
         * @param c1 a Character
         * @param c2 another Character
         * @return true iff this CharEquater deems the Characters equivalent
         *         false otherwise
         */
        boolean areEquivalent(Character c1, Character c2);
    }

    public static final StringMatcher.CharEquater CASE_SENSITIVE_COMPARATOR;
    public static final StringMatcher.CharEquater CASE_INSENSITIVE_COMPARATOR;
    private StringMatcher.CharEquater charCmp;

    static {
        CASE_SENSITIVE_COMPARATOR = (c1, c2) -> c1 == c2;
        CASE_INSENSITIVE_COMPARATOR = (c1, c2) -> Character.toLowerCase(c1) ==
                                                  Character.toLowerCase(c2);
      }

    /**
     * Construct a case-(in)sensitive StringMatcher
     * @param caseSensitive true iff this matcher should be case sensitive
     */
    public StringMatcher(boolean caseSensitive) {
        if (caseSensitive) {
            charCmp = CASE_SENSITIVE_COMPARATOR;
        } else {
            charCmp = CASE_INSENSITIVE_COMPARATOR;
        }
    }

    /**
     * Construct a StringMatcher with given CharEquater
     * @param charComparator the Comparator to use when comparing characters
     * among Strings
     */
    public StringMatcher(StringMatcher.CharEquater charEquater) {
        this.charCmp = charEquater;
    }

    /**
     * Gets the CharEquater used to compare Characters
     * @return the CharEquater used to compare Characters
     */
    public StringMatcher.CharEquater getCharComparator() {
        return charCmp;
    }

    /**
     * Compute the edit distance between two Strings
     * @param a a String
     * @param b another String
     * @return the edit distance between two Strings
     */
    public abstract int editDistance(String a, String b);

    /**
     * Determines if two Characters are equivalent
     * @param c1 a Character
     * @param c2 another Character
     * @return true iff this CharEquater deems the Characters equivalent
     *         false otherwise
     */
    protected boolean areEquivalent(Character c1, Character c2) {
        return charCmp.areEquivalent(c1, c2);
    }
}
