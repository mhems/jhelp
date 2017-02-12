package com.binghamton.jhelp;

/**
 * Utility class representing immutable generic pair
 */
public class MyPair<A, B> {
    public final A first;
    public final B second;

    /**
     * Construct a pair
     * @param a the first element of the tuple
     * @param b the second element of the tuple
     */
    public MyPair(A a, B b) {
        first = a;
        second = b;
    }

    /**
     * Get string representation of this object
     * @return string representation of this object
     */
    @Override
    public String toString() {
        return "<" + first + ", " + second + ">";
    }

    /**
     * Determines if two Pairs are equivalent
     * @param other the Pair to compare against
     * @return true iff the Pairs are element-wise equivalent
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof MyPair<?, ?>) {
            MyPair<?, ?> p = (MyPair<?, ?>)other;
            return first.equals(p.first) && second.equals(p.second);
        }
        return false;
    }

    /**
     * Compute hash code of this Pair
     * @return hash code of this Pair
     */
    @Override
    public int hashCode() {
        return first.hashCode() ^ second.hashCode();
    }
}
