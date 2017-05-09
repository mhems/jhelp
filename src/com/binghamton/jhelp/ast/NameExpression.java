package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Package;

/**
 * A class representing Java identifiers over several categories.
 * These identifiers may be qualified by another NameExpression,
 * yet each NameExpression represents a logically atomic name
 */
public class NameExpression extends Expression {

    /**
     * An enum enumerating the kinds of NameExpressions
     */
    public static enum Kind { TYPE, PACKAGE, EXPRESSION,
                              METHOD, AMBIGUOUS, PACKAGE_OR_TYPE };

    private NameExpression qualifier = null;
    private Annotation[] annotations = {};
    private Kind kind;
    private Token name;
    private Package pkg;

    /*
     * Constructs a qualified NameExpression from a NameExpression and
     * unqualified NameExpression.
     * @param qualifier the qualified NameExpression of this NameExpression
     * @param expr the unqualified NameExpression
     * @throws IllegalArgumentException if expr is qualified
     */
    public NameExpression(NameExpression qualifier, NameExpression expr) {
        super(qualifier.getFirstToken(), expr.getLastToken());
        if (expr.isQualified()) {
            throw new IllegalArgumentException("expr may not be qualified");
        }
        this.qualifier = qualifier;
        this.annotations = expr.annotations;
        this.kind = expr.kind;
        this.name = expr.name;
    }

    /**
     * Constructs an unqualified NameExpression
     * @param name the Token holding the identifier
     * @param kind the kind of this NameExpression
     */
    public NameExpression(Token name, Kind kind) {
        super(name);
        this.kind = kind;
        this.name = name;
    }

    /**
     * Constructs an unqualified, annotated NameExpression
     * @param name the Token holding the identifier
     * @param kind the kind of this NameExpression
     * @param annotations the List of Annotations on this Expression
     */
    public NameExpression(Token name, Kind kind, List<Annotation> annotations) {
        super(name);
        this.kind = kind;
        this.name = name;
        this.annotations = annotations.toArray(new Annotation[annotations.size()]);
    }

    /**
     * Create a type NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.TYPE
     */
    public static NameExpression createTypeName(Token token) {
        return new NameExpression(token, Kind.TYPE);
    }

    /**
     * Create a package NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.PACKAGE
     */
    public static NameExpression createPackageName(Token token) {
        return new NameExpression(token, Kind.PACKAGE);
    }

    /**
     * Create an expression NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.EXPRESSION
     */
    public static NameExpression createExpressionName(Token token) {
        return new NameExpression(token, Kind.EXPRESSION);
    }

    /**
     * Create a method NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.METHOD
     */
    public static NameExpression createMethodName(Token token) {
        return new NameExpression(token, Kind.METHOD);
    }

    /**
     * Create an ambiguous NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.AMBIGUOUS
     */
    public static NameExpression createAmbiguousName(Token token) {
        return new NameExpression(token, Kind.AMBIGUOUS);
    }

    /**
     * Create a package or type NameExpression
     * @param token the Token holding the name
     * @return the new NameExpression of kind Kind.PACKAGE_OR_TYPE
     */
    public static NameExpression createPackageOrTypeName(Token token) {
        return new NameExpression(token, Kind.PACKAGE_OR_TYPE);
    }

    /**
     * Create an annotated type NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.TYPE
     */
    public static NameExpression createTypeName(Token token,
                                                List<Annotation> annotations) {
        return new NameExpression(token, Kind.TYPE, annotations);
    }

    /**
     * Create an annotated package NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.PACKAGE
     */
    public static NameExpression createPackageName(Token token,
                                                   List<Annotation> annotations) {
        return new NameExpression(token, Kind.PACKAGE, annotations);
    }

    /**
     * Create an annotated expression NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.EXPRESSION
     */
    public static NameExpression createExpressionName(Token token,
                                                      List<Annotation> annotations) {
        return new NameExpression(token, Kind.EXPRESSION, annotations);
    }

    /**
     * Create an annotated method NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.METHOD
     */
    public static NameExpression createMethodName(Token token,
                                                  List<Annotation> annotations) {
        return new NameExpression(token, Kind.METHOD, annotations);
    }

    /**
     * Create an annotated ambiguous NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.AMBIGUOUS
     */
    public static NameExpression createAmbiguousName(Token token,
                                                     List<Annotation> annotations) {
        return new NameExpression(token, Kind.AMBIGUOUS, annotations);
    }

    /**
     * Create an annotated package or type NameExpression
     * @param token the Token holding the name
     * @param annotations the Annotations of this NameExpression
     * @return the new NameExpression of kind Kind.PACKAGE_OR_TYPE
     */
    public static NameExpression createPackageOrTypeName(Token token,
                                                         List<Annotation> annotations) {
        return new NameExpression(token, Kind.PACKAGE_OR_TYPE, annotations);
    }

    /**
     * Gets the qualifying NameExpression, if any
     * @return the qualifying NameExpression if this Expression is qualifed,
     *         otherwise null
     */
    public NameExpression getQualifyingName() {
        return qualifier;
    }

    /**
     * Determines if this NameExpression is qualified
     * @return true iff this NameExpression is qualified
     */
    public boolean isQualified() {
        return qualifier != null;
    }

    /**
     * Sets the qualifying NameExpression of this NameExpression
     * @param name the qualifying NameExpression
     */
    public void setQualifyingName(NameExpression name) {
        qualifier = name;
    }

    /**
     * Gets the annotations of this NameExpression
     * @return the annotations of this NameExpression
     */
    public Annotation[] getAnnotations() {
        return annotations;
    }

    /**
     * Gets the Kind of this NameExpression
     * @return the Kind of this NameExpression
     */
    public Kind getKind() {
        return kind;
    }

    /**
     * Sets the Kind of this NameExpression
     * @param kind the Kind of this NameExpression
     */
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Gets the Token holding the name of this NameExpression
     * @return the Token holding the name of this NameExpression
     */
    public Token getToken() {
        return name;
    }

    /**
     * Gets the fully qualified name of this NameExpression
     * @return the fully qualified name of this NameExpression
     */
    public String getName() {
        String ret = "";
        if (isQualified()) {
            ret += qualifier.getName();
            ret += ".";
        }
        ret += name.getText();
        return ret;
    }

    /**
     * Gets all the Tokens comprising the fully qualified name
     * @return the List of all the Tokens comprising the fully qualified name
     */
    public List<Token> getTokens() {
        List<Token> ret = new ArrayList<>();
        if (isQualified()) {
            ret.addAll(qualifier.getTokens());
        }
        ret.add(name);
        return ret;
    }

    /**
     * Gets the Package this NameExpression names, if any
     * @return the Package this NameExpression names, if it does, otherwise null
     */
    public Package getPackage() {
        return pkg;
    }

    /**
     * Sets the Package this NameExpression names
     * @param pkg the Package this NameExpression names
     */
    public void setPackage(Package pkg) {
        this.pkg = pkg;
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
