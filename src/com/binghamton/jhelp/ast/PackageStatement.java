package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java package statement
 */
public class PackageStatement extends Statement {
    private Annotation[] annotations = {};
    private NameExpression name;

    /**
     * Construct a new package statement
     * @param name the name of this package
     * @param keyword the package keyword
     * @param last the terminating semi-colon Token
     * @param annotations list of package annotations, if any
     */
    public PackageStatement(NameExpression name,
                            Token keyword,
                            Token last,
                            List<Annotation> annotations) {
        super(ASTNode.getFirstToken(keyword, annotations), last);
        this.name = name;
        this.annotations = annotations.toArray(this.annotations);
    }

    /**
     * Gets the annotations, if any, of this package declaration
     * @return the annotations, if any, of this package declaration
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Gets the period-separated name of the declared package
     * @return the period-separated name of the declared package
     */
    public NameExpression getName() {
        return name;
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
