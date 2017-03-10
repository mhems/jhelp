package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class abstracting a set of Java modifiers
 */
public class Modifiers {
    private Set<Modifier> modifiers = new HashSet<>();

    /**
     * Construct an empty set of Modifiers
     */
    public Modifiers() {
        super();
    }

    /**
     * Construct a collection of modifiers from a list
     * @param modifiers the List of modifiers to initialize with
     */
    public Modifiers(List<Modifier> modifiers) {
        this.modifiers.addAll(modifiers);
    }

    /**
     * Gets the Set of Modifiers
     * @return the Set of Modifiers
     */
    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    public boolean contains(Modifier modifier) {
        return modifiers.contains(modifier);
    }

    public String getText() {
        return toString();
    }

    public String toString() {
        return StringUtils.join(" ", modifiers);
    }

    public boolean addModifier(Modifier modifier) {
        return modifiers.add(modifier);
    }

    /**
     * Utility method to convert a Modifier array into a Modifiers object
     * @param modifiers the encoded integer of modifiers
     * @return a new Modifiers object with the modifiers encoded in `modifiers`
     */
    public static Modifiers fromEncodedModifier(int modifiers) {
        Modifiers mods = new Modifiers();
        for (String m : java.lang.reflect.Modifier.toString(modifiers).split(" ")) {
            mods.addModifier(new Modifier(m));
        }
        return mods;
    }
}
