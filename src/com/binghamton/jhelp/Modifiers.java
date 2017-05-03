package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A class abstracting a set of Java modifiers
 */
public class Modifiers {
    private static final List<Modifier> ORDERED_MODIFIERS = new ArrayList<>();
    private static final Comparator<Modifier> BY_STANDARD;
    private final Set<Modifier> modifiers = new HashSet<>();

    static {
        BY_STANDARD = (a, b) ->
            ORDERED_MODIFIERS.indexOf(a) - ORDERED_MODIFIERS.indexOf(b);

        ORDERED_MODIFIERS.add(Modifier.PUBLIC);
        ORDERED_MODIFIERS.add(Modifier.PROTECTED);
        ORDERED_MODIFIERS.add(Modifier.PRIVATE);
        ORDERED_MODIFIERS.add(Modifier.ABSTRACT);
        ORDERED_MODIFIERS.add(Modifier.DEFAULT);
        ORDERED_MODIFIERS.add(Modifier.STATIC);
        ORDERED_MODIFIERS.add(Modifier.FINAL);
        ORDERED_MODIFIERS.add(Modifier.TRANSIENT);
        ORDERED_MODIFIERS.add(Modifier.VOLATILE);
        ORDERED_MODIFIERS.add(Modifier.SYNCHRONIZED);
        ORDERED_MODIFIERS.add(Modifier.NATIVE);
        ORDERED_MODIFIERS.add(Modifier.STRICT_FP);
    }

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
     * Construct a collection of modifiers from a variable number of
     * Modifiers
     * @param modifiers a variable amount of Modifier instances
     */
    public Modifiers(Modifier... modifiers) {
        for (Modifier m : modifiers) {
            this.modifiers.add(m);
        }
    }

    /**
     * Gets the given Modifier among these Modifiers, if present
     * @param modifier the Modifier to get
     * @return the Modifier among these Modifiers, if it exists, otherwise null
     */
    public Modifier getModifier(Modifier modifier) {
        for (Modifier mod : modifiers) {
            if (mod.equals(modifier)) {
                return mod;
            }
        }
        return null;
    }

    /**
     * Gets the Set of underlying Modifiers in this instance
     * @return the Set of underlying Modifiers in this instance
     */
    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    /**
     * Determines if a Modifier is present
     * @param modifier to Modifier to inquire about
     * @return true iff this Modifiers contains `modifier`
     */
    public boolean contains(Modifier modifier) {
        return modifiers.contains(modifier);
    }

    /**
     * Builds a space separated String of each Modifier's text
     * @return a space separated String of each Modifier's text
     */
    public String getText() {
        return toString();
    }

    /**
     * Builds a space separated String of each Modifier's text
     * @return a space separated String of each Modifier's text
     */
    public String toString() {
        List<Modifier> mods = new ArrayList<>(modifiers);
        Collections.sort(mods, BY_STANDARD);
        return StringUtils.join(" ", mods);
    }

    /**
     * Adds a modifier to this Modifiers collection
     * @param modifier the Modifier to add
     * @return true iff `modifier` was not present prior to this call
     */
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
