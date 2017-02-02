package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;

/**
 * A class representing a Java enum
 */
public class EnumSymbol extends Symbol {
    private Set<String> members = new TreeSet<>();

    /**
     * Constructs a new named enum symbol
     * @param id the name of the enum
     */
    public EnumSymbol(String id) {
        super(id);
    }

    /**
     * Gets the members of this enum
     * @return the members of this enum
     */
    public Set<String> getMembers() {
        return members;
    }

    /**
     * Attempts to add a member to this enum
     * @param member the member to attempt to add
     * @return true iff member successfully added
     */
    public boolean addMember(String member) {
        return members.add(member);
    }

    /**
     * Gets the number of members in this enum
     * @return the number of members in this enum
     */
    public int numMembers() {
        return members.size();
    }

    /**
     * Determines if this enum is equivalent to another
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            if (other instanceof EnumSymbol) {
                EnumSymbol sym = (EnumSymbol)other;
                return members.equals(sym.members);
            }
        }
        return false;
    }

    /**
     * Determines the hash code of this symbol
     * @return the hash code of this symbol
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ members.hashCode();
    }
}
