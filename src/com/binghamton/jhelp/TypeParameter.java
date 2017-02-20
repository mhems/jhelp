package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.ASTNode;

/**
 * A class representing a Java type parameter
 */
public class TypeParameter extends ASTNode {
    private TypeVariable type;
    private List<ReferenceType> superTypes = new ArrayList<>();

    /**
     * Construct a named type parameter
     * @param name the Token holding the name of the type parameter
     */
    public TypeParameter(Token name) {
        this(name, new ArrayList<>());
    }

    /**
     * Construct a named, annotated type parameter
     * @param name the Token holding the name of the type parameter
     * @param annotations the annotations of the type parameter
     */
    public TypeParameter(Token name, List<Annotation> annotations) {
        this(name, annotations, new ArrayList<>());
    }

    /**
     * Construct a named, annotated type parameter
     * @param name the Token holding the name of the type parameter
     * @param annotations the annotations of the type parameter
     * @param superTypes the super types (bounds) of the type parameter
     */
    public TypeParameter(Token name,
                         List<Annotation> annotations,
                         List<ReferenceType> superTypes) {
        super(ASTNode.getFirstToken(name, annotations),
              ASTNode.getLastToken(name, superTypes));
        type = new TypeVariable(name, annotations);
        this.superTypes = superTypes;
    }

    /**
     * Gets the underlying type variable of this parameter
     * @return the underlying type variable of this parameter
     */
    public TypeVariable getType() {
        return type;
    }

    /**
     * Gets the super types of this parameter, if any
     * @return the super types of this parameter, if any
     */
    public List<ReferenceType> getSuperTypes() {
        return superTypes;
    }

    /**
     * Determines if this parameters has any super types
     * @return true iff this parameters has any super types
     */
    public boolean hasSuperType() {
        return numSuperTypes() > 0;
    }

    /**
     * Gets the number of super types of this parameter
     * @return the number of super types of this parameter
     */
    public int numSuperTypes() {
        return superTypes.size();
    }

    /**
     * Adds a super type to this type parameter
     * @param superType the super type of this type parameter
     */
    public void addSuperType(ReferenceType superType) {
        superTypes.add(superType);
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
