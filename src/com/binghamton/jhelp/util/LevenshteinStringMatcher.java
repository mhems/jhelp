package com.binghamton.jhelp.util;

/**
 * A StringMatcher that uses the Levenshtein edit distance to calculate two
 * Strings' similarity.
 */
public class LevenshteinStringMatcher extends StringMatcher {

    /**
     * Construct a case-(in)sensitive LevenshteinStringMatcher
     * @param caseSensitive true iff this matcher should be case sensitive
     */
    public LevenshteinStringMatcher(boolean caseSensitive) {
        super(caseSensitive);
    }

    /**
     * Compute the edit distance between two Strings, as given by the
     * Levenshtein distance.
     * Adapted from https://en.wikipedia.org/wiki/Levenshtein_distance
     * @param a a String
     * @param b another String
     * @return the Levenshtein edit distance between two Strings
     */
    public int editDistance(String a, String b) {
        int A = a.length();
        int B = b.length();
        if (Math.min(A, B) == 0) {
            return Math.max(A, B);
        }
        int[] prev = new int[1 + B];
        int[] cur = new int[1 + B];
        int contrib;

        for (int i = 0; i < prev.length; i++) {
            prev[i] = i;
        }

        for (int i = 0; i < A; i++) {
            cur[0] = i + 1;
            for (int j = 0; j < B; j++) {
                contrib = areEquivalent(a.charAt(i), b.charAt(j)) ? 0 : 1;
                cur[j + 1] = Math.min(Math.min(cur[j] + 1,
                                               prev[j + 1] + 1),
                                      prev[j] + contrib);
            }
            for (int k = 0; k < prev.length; k++) {
                prev[k] = cur[k];
            }
        }

        return cur[B];
    }
}
