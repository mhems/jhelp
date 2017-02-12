package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/**
 * A class abstracting a set of Java modifiers
 */
public class Modifiers {
    public static final Modifiers CLASS_MODIFIERS;
    public static final Modifiers FIELD_MODIFIERS;
    public static final Modifiers VARIABLE_MODIFIERS;
    public static final Modifiers METHOD_MODIFIERS;
    public static final Modifiers CONSTRUCTOR_MODIFIERS;
    public static final Modifiers INTERFACE_MODIFIERS;
    public static final Modifiers INTERFACE_CONSTANT_MODIFIERS;
    public static final Modifiers INTERFACE_METHOD_MODIFIERS;

    static {
        CLASS_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.PROTECTED,
                Modifier.PRIVATE,
                Modifier.ABSTRACT,
                Modifier.STATIC,
                Modifier.FINAL,
                Modifier.STRICT_FP});

        FIELD_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.PROTECTED,
                Modifier.PRIVATE,
                Modifier.STATIC,
                Modifier.FINAL,
                Modifier.TRANSIENT,
                Modifier.VOLATILE});

        VARIABLE_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.FINAL});

        METHOD_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.PROTECTED,
                Modifier.PRIVATE,
                Modifier.ABSTRACT,
                Modifier.STATIC,
                Modifier.SYNCHRONIZED,
                Modifier.NATIVE,
                Modifier.STRICT_FP,
                Modifier.FINAL});

        CONSTRUCTOR_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.PROTECTED,
                Modifier.PRIVATE});

        INTERFACE_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.PROTECTED,
                Modifier.PRIVATE,
                Modifier.ABSTRACT,
                Modifier.STATIC,
                Modifier.STRICT_FP});

        INTERFACE_CONSTANT_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.STATIC,
                Modifier.FINAL});

        INTERFACE_METHOD_MODIFIERS = fromModifierArray(new Modifier[]{
                Modifier.PUBLIC,
                Modifier.ABSTRACT,
                Modifier.DEFAULT,
                Modifier.STATIC,
                Modifier.STRICT_FP});
    }

    private EnumSet<Modifier> modifiers;

    /**
     * Construct an empty set of modifiers
     */
    public Modifiers() {
        this.modifiers = EnumSet.noneOf(Modifier.class);
    }

    /**
     * Construct a set of modifiers from a collection
     * @param modifiers the collection of modifiers to initialize with
     */
    public Modifiers(Collection<Modifier> modifiers) {
        this.modifiers = EnumSet.noneOf(Modifier.class);
        for (Modifier modifier : modifiers) {
            addOrPanic(modifier);
        }
    }

    /**
     * Gets the set of modifiers
     * @return the set of modifiers
     */
    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    /**
     * Attempts to add a distinct modifier to this set
     * @param m the modifier to attempt to add
     * @return true iff the modifier was successfully added
     */
    public boolean add(Modifier m) {
        return modifiers.add(m);
    }

    /**
     * Attempts to add a distinct modifier to this set.
     * If the modifier already exists, an exception is thrown
     * @param m the modifier to attempt to add
     * @throws Error if `m` is already contained in modifiers
     */
    public void addOrPanic(Modifier m) {
        if (!add(m)) {
            // throw new RepeatModifierException(m); // TODO
        }
    }

    /**
     * Determine if a modifier is in this set of modifiers
     * @param m the modifier to inquire about
     * @return true iff the modifier `m` is in this set of modifiers
     */
    public boolean contains(Modifier m) {
        return modifiers.contains(m);
    }

    /**
     * Determines if these modifiers contain the `private` Java modifier
     * @return true iff these modifiers contain the `private` Java modifier
     */
    public boolean isPrivate() {
        return contains(Modifier.PRIVATE);
    }

    /**
     * Determines if these modifiers contain the `protected` Java modifier
     * @return true iff these modifiers contain the `protected` Java modifier
     */
    public boolean isProtected() {
        return contains(Modifier.PROTECTED);
    }

    /**
     * Determines if these modifiers contain the `public` Java modifier
     * @return true iff these modifiers contain the `public` Java modifier
     */
    public boolean isPublic() {
        return contains(Modifier.PUBLIC);
    }

    /**
     * Determines if these modifiers contain the `abstract` Java modifier
     * @return true iff these modifiers contain the `abstract` Java modifier
     */
    public boolean isAbstract() {
        return contains(Modifier.ABSTRACT);
    }

    /**
     * Determines if these modifiers contain the `default` Java modifier
     * @return true iff these modifiers contain the `default` Java modifier
     */
    public boolean isDefault() {
        return contains(Modifier.DEFAULT);
    }

    /**
     * Determines if these modifiers contain the `final` Java modifier
     * @return true iff these modifiers contain the `final` Java modifier
     */
    public boolean isFinal() {
        return contains(Modifier.FINAL);
    }

    /**
     * Determines if these modifiers contain the `native` Java modifier
     * @return true iff these modifiers contain the `native` Java modifier
     */
    public boolean isNative() {
        return contains(Modifier.NATIVE);
    }

    /**
     * Determines if these modifiers contain the `static` Java modifier
     * @return true iff these modifiers contain the `static` Java modifier
     */
    public boolean isStatic() {
        return contains(Modifier.STATIC);
    }

    /**
     * Determines if these modifiers contain the `strictfp` Java modifier
     * @return true iff these modifiers contain the `strictfp` Java modifier
     */
    public boolean isStrictFp() {
        return contains(Modifier.STRICT_FP);
    }

    /**
     * Determines if these modifiers contain the `synchronized` Java modifier
     * @return true iff these modifiers contain the `synchronized` Java modifier
     */
    public boolean isSynchronized() {
        return contains(Modifier.SYNCHRONIZED);
    }

    /**
     * Determines if these modifiers contain the `transient` Java modifier
     * @return true iff these modifiers contain the `transient` Java modifier
     */
    public boolean isTransient() {
        return contains(Modifier.TRANSIENT);
    }

    /**
     * Determines if these modifiers contain the `volatile` Java modifier
     * @return true iff these modifiers contain the `volatile` Java modifier
     */
    public boolean isVolatile() {
        return contains(Modifier.VOLATILE);
    }

    /**
     * Utility method to convert a Modifier array into a Modifiers object
     * @param modifiers the array of enums to include
     * @return a new Modifiers object with the elements in `modifiers`
     */
    private static Modifiers fromModifierArray(Modifier[] modifiers) {
        return new Modifiers(new ArrayList<Modifier>(Arrays.asList(modifiers)));
    }
}
