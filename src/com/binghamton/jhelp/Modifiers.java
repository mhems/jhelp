package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class abstracting a set of Java modifiers
 */
public class Modifiers extends ASTNode {
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

    private Set<Modifier> modifiers;
    private Annotations annotations;

    /**
     * Construct an empty set of modifiers
     */
    public Modifiers() {
        this(null);
    }

    /**
     * Construct a collection of modifiers from a list
     * @param modifiers the list of modifiers to initialize with
     */
    public Modifiers(List<Modifier> modifiers) {
        this.modifiers = new HashSet<>();
        annotations = new Annotations();
        if (modifiers != null) {
            for (Modifier m : modifiers) {
                addOrPanic(m);
            }
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
     * Gets the annotations of these modifiers
     * @return the annotations of these modifiers
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Attempts to add a modifier to this set
     * @param m the modifier to attempt to add
     * @return true iff the modifier was successfully added
     */
    public boolean addModifier(Modifier m) {
        boolean ret = true;
        if (m instanceof Annotation) {
            annotations.addAnnotation((Annotation)m);
        } else {
            ret = modifiers.add(m);
        }
        return ret;
    }

    /**
     * Attempts to add a modifier to this set.
     * If the modifier already exists, an exception is thrown
     * @param m the modifier to attempt to add
     * @throws Error if `m` is already contained in modifiers
     */
    public void addOrPanic(Modifier m) {
        if (!addModifier(m)) {
            // throw new RepeatModifierException(m); // TODO
        }
    }

    /**
     * Determine if a modifier is in this collection of modifiers
     * @param m the modifier to inquire about
     * @return true iff the modifier `m` is in this collection of modifiers
     */
    public boolean contains(Modifier m) {
        if (m instanceof Annotation) {
            return annotations.contains((Annotation)m);
        }
        return modifiers.contains(m);
    }

    /**
     * Determines if these modifiers contain the `private` Java modifier
     * @return true iff these modifiers contain the `private` Java modifier
     */
    public boolean isPrivate() {
        return modifiers.contains(Modifier.PRIVATE);
    }

    /**
     * Determines if these modifiers contain the `protected` Java modifier
     * @return true iff these modifiers contain the `protected` Java modifier
     */
    public boolean isProtected() {
        return modifiers.contains(Modifier.PROTECTED);
    }

    /**
     * Determines if these modifiers contain the `public` Java modifier
     * @return true iff these modifiers contain the `public` Java modifier
     */
    public boolean isPublic() {
        return modifiers.contains(Modifier.PUBLIC);
    }

    /**
     * Determines if these modifiers contain the `abstract` Java modifier
     * @return true iff these modifiers contain the `abstract` Java modifier
     */
    public boolean isAbstract() {
        return modifiers.contains(Modifier.ABSTRACT);
    }

    /**
     * Determines if these modifiers contain the `default` Java modifier
     * @return true iff these modifiers contain the `default` Java modifier
     */
    public boolean isDefault() {
        return modifiers.contains(Modifier.DEFAULT);
    }

    /**
     * Determines if these modifiers contain the `final` Java modifier
     * @return true iff these modifiers contain the `final` Java modifier
     */
    public boolean isFinal() {
        return modifiers.contains(Modifier.FINAL);
    }

    /**
     * Determines if these modifiers contain the `native` Java modifier
     * @return true iff these modifiers contain the `native` Java modifier
     */
    public boolean isNative() {
        return modifiers.contains(Modifier.NATIVE);
    }

    /**
     * Determines if these modifiers contain the `static` Java modifier
     * @return true iff these modifiers contain the `static` Java modifier
     */
    public boolean isStatic() {
        return modifiers.contains(Modifier.STATIC);
    }

    /**
     * Determines if these modifiers contain the `strictfp` Java modifier
     * @return true iff these modifiers contain the `strictfp` Java modifier
     */
    public boolean isStrictFp() {
        return modifiers.contains(Modifier.STRICT_FP);
    }

    /**
     * Determines if these modifiers contain the `synchronized` Java modifier
     * @return true iff these modifiers contain the `synchronized` Java modifier
     */
    public boolean isSynchronized() {
        return modifiers.contains(Modifier.SYNCHRONIZED);
    }

    /**
     * Determines if these modifiers contain the `transient` Java modifier
     * @return true iff these modifiers contain the `transient` Java modifier
     */
    public boolean isTransient() {
        return modifiers.contains(Modifier.TRANSIENT);
    }

    /**
     * Determines if these modifiers contain the `volatile` Java modifier
     * @return true iff these modifiers contain the `volatile` Java modifier
     */
    public boolean isVolatile() {
        return modifiers.contains(Modifier.VOLATILE);
    }

    /**
     * Utility method to convert a Modifier array into a Modifiers object
     * @param modifiers the array of enums to include
     * @return a new Modifiers object with the elements in `modifiers`
     */
    private static Modifiers fromModifierArray(Modifier[] modifiers) {
        return new Modifiers(new ArrayList<Modifier>(Arrays.asList(modifiers)));
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
