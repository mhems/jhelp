package com.binghamton.jhelp;

import java.util.EnumSet;
import java.util.Collection;

/**
 * A class abstracting a set of Java modifiers
 */
public class Modifiers {
    private EnumSet<Modifier> modifiers;

    /**
     * Construct a set of modifiers from a collection
     * @param modifiers the collection of modifiers to initialize with
     */
    public Modifiers(Collection<Modifier> modifiers) {
        this.modifiers = EnumSet.copyOf(modifiers);
    }

    /**
     * Gets the set of modifiers
     * @return the set of modifiers
     */
    public Set<Modifier> getModifiers() {
        return modifiers;
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
     * Determines if these modifiers contain the `strict_fp` Java modifier
     * @return true iff these modifiers contain the `strict_fp` Java modifier
     */
    public boolean isStrict_fp() {
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
}
