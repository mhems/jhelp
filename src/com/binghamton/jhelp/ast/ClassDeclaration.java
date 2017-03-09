package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;

/**
 * A class representing a Java class declaration
 */
public class ClassDeclaration extends ConcreteBodyDeclaration {
    private List<TypeParameter> typeParams = new ArrayList<>();
    private Expression superClass;

    /**
     * Construct an anonymous class declaration
     */
    public ClassDeclaration() {
        super();
    }

    /**
     * Construct a new ClassDeclaration
     * @param name the name of the class
     * @param keyword the class keyword of this declaration
     * @param modifiers the class modifiers, if any
     * @param annotations the annotations of this declaration
     * @param superInterfaces the list of implemented interfaces, if any
     * @param typeParams type parameters of the class, if any
     * @param superClass the name of the super class, if any
     */
    public ClassDeclaration(Token name,
                            Token keyword,
                            List<Modifier> modifiers,
                            List<Annotation> annotations,
                            List<Expression> superInterfaces,
                            List<TypeParameter> typeParams,
                            Expression superClass) {
        super(name, keyword, modifiers, annotations, superInterfaces);
        this.typeParams = typeParams;
        this.superClass = superClass;
    }

    /**
     * Gets the list of type parameters of this class
     * @return the list of type parameters of this class
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParams;
    }

    /**
     * Determines if this class has type parameters
     * @return true iff this class has type parameters
     */
    public boolean hasTypeParameters() {
        return typeParams.size() > 0;
    }

    /**
     * Gets this class's super class
     * @return this class's super class
     */
    public Expression getSuperClass() {
        return superClass;
    }

    /**
     * Determines if this class has a super class
     * @return true iff this class has a super class
     */
    public boolean hasSuperClass() {
        return superClass != null;
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
