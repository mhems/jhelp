package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java package statement
 */
public class PackageStatement extends Statement {
    private Annotation[] annotations = {};
    private List<Token> ids;

    /**
     * Construct a new package statement
     * @param ids a list of package identifiers
     * @param keyword the package keyword
     * @param last the terminating semi-colon Token
     * @param annotations list of package annotations, if any
     */
    public PackageStatement(List<Token> ids,
                            Token keyword,
                            Token last,
                            List<Annotation> annotations) {
        super(ASTNode.getFirstToken(keyword, annotations), last);
        this.ids = ids;
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
     * Gets the elements that comprise this package declaration
     * @return the elements that comprise this package declaration
     */
    public List<Token> getIdentifiers() {
        return ids;
    }

    /**
     * Gets the period-separated name of the declared package
     * @return the period-separated name of the declared package
     */
    public String getName() {
        String[] names = ids.stream().map(t -> t.getText()).toArray(i -> new String[i]);
        return String.join(".", names);
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
