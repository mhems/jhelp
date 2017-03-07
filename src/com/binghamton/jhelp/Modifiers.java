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
    private Set<Modifier> modifiers = new HashSet<>();
    private Annotations annotations = new Annotations();

    /**
     * Construct an empty set of Modifiers
     */
    public Modifiers() {
        super();
    }

    /**
     * Construct a collection of modifiers from a list
     * @param modifiers the list of modifiers to initialize with
     */
    public Modifiers(List<Modifier> modifiers) {
        super(modifiers);
        for (Modifier m : modifiers) {
            addOrPanic(m);
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
     * Utility method to convert a Modifier array into a Modifiers object
     * @param modifier the encoded integer of modifiers
     * @return a new Modifiers object with the modifiers encoded in `modifier`
     */
    public static Modifiers fromEncodedModifier(int modifier) {
        Modifiers modifiers = new Modifiers();
        for (String m : java.lang.reflect.Modifier.toString(modifier).split(" ")) {
            modifiers.addModifier(new Modifier(m));
        }
        return modifiers;
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
