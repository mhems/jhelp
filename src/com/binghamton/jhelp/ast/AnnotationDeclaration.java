package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a Java annotation type declaration
 */
public class AnnotationDeclaration extends Declaration {
    private List<Declaration> decls = new ArrayList<>();

    /**
     * Construct a new annotation declaration
     * @param name the name of the annotation
     * @param modifiers the modifiers of the annotation
     */
    public AnnotationDeclaration(String name, Collection<Modifier> modifiers) {
        super(name, modifiers);
    }

    /**
     * Determines if this annotation has any member declarations
     * @return true iff this annotation has any member declarations
     */
    public boolean hasDeclarations() {
        return numDeclarations() > 0;
    }

    /**
     * Gets this annotations declarations
     * @return this annotations declarations
     */
    public List<Declaration> getDeclarations() {
        return decls;
    }

    /**
     * Adds a member declaration to this annotation
     * @param decl the declaration to add
     */
    public void addMember(Declaration decl) {
        decls.add(decl);
    }

    /**
     * Gets the number of member declarations of this annotation
     * @return the number of member declarations of this annotation
     */
    public int numDeclarations() {
        return decls.size();
    }
}
