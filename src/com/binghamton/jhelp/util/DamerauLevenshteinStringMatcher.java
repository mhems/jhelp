package com.binghamton.jhelp.util;

import java.util.HashMap;
import java.util.Map;

/**
 * A StringMatcher that uses the Damerau-Levenshtein edit distance to calculate
 * two Strings' similarity.
 */
public class DamerauLevenshteinStringMatcher extends StringMatcher {

    /**
     * Construct a case-(in)sensitive DamerauLevenshteinStringMatcher
     * @param caseSensitive true iff this matcher should be case sensitive
     */
    public DamerauLevenshteinStringMatcher(boolean caseSensitive) {
        super(caseSensitive);
    }

    /**
     * Compute the edit distance between two Strings, as given by the
     * Damerau-Levenshtein distance.
     * Adapted from https://en.wikipedia.org/wiki/Damerau%E2%80%93Levenshtein_distance
     * @param a a String
     * @param b another String
     * @return the Damerau-Levenshtein edit distance between two Strings
     */
    public int editDistance(String a, String b) {
        int A = a.length();
        int B = b.length();
        Map<Character, Integer> alphaMap = new HashMap<>();
        int[][] matrix = new int[A+2][B+2];
        int dist = A + B;
        matrix[0][0] = dist;
        for (int i = 0; i <= A; i++) {
            matrix[i+1][0] = dist;
            matrix[i+1][1] = i;
        }
        for (int j = 0; j <= B; j++) {
            matrix[0][j+1] = dist;
            matrix[1][j+1] = j;
        }

        int db, k, l, contrib;
        for (int i = 1; i <= A; i++) {
            db = 0;
            for (int j = 1; j <= B; j++) {
                k = alphaMap.getOrDefault(b.charAt(j-1), 0);
                l = db;
                contrib = 1;
                if (areEquivalent(a.charAt(i-1), b.charAt(j-1))) {
                    contrib = 0;
                    db = j;
                }
                matrix[i+1][j+1] = Math.min(Math.min(matrix[i][j] + contrib,
                                                     matrix[i+1][j] + 1),
                                            Math.min(matrix[i][j+1] + 1,
                                                     matrix[k][l] + i - k + j - l - 1));
            }
            alphaMap.put(a.charAt(i-1), i);
        }
        return matrix[A+1][B+1];
    }
}
