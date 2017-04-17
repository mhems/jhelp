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
    public static enum Kind { TYPE, PACKAGE, EXPRESSION,
                              METHOD, AMBIGUOUS, PACKAGE_OR_TYPE };

    private NameExpression qualifier = null;
    private Annotation[] annotations = {};
    private Kind kind;
    private Token name;

    private Package pkg;

    public NameExpression(NameExpression qualifier, NameExpression expr) {
        super(qualifier.getFirstToken(), expr.getLastToken());
        if (expr.isQualified()) {
            throw new IllegalArgumentException("only lhs can be qualified");
        }
        this.qualifier = qualifier;
        this.annotations = expr.annotations;
        System.out.println("ctor 1 with " + expr.getKind());
        this.kind = expr.kind;
        this.name = expr.name;
    }

    public NameExpression(Token name, Kind kind) {
        super(name);
        this.kind = kind;
        System.out.println("ctor 2 with " + kind);
        this.name = name;
    }

    public NameExpression(Token name, Kind kind, List<Annotation> annotations) {
        super(name);
        this.kind = kind;
        System.out.println("ctor 3 with " + kind);
        this.name = name;
        this.annotations = annotations.toArray(new Annotation[annotations.size()]);
    }

    protected NameExpression(Token first, Token last) {
        super(first, last);
        System.out.println("ctor 4");
    }

    public static NameExpression createTypeName(Token token) {
        return new NameExpression(token, Kind.TYPE);
    }

    public static NameExpression createPackageName(Token token) {
        return new NameExpression(token, Kind.PACKAGE);
    }

    public static NameExpression createExpressionName(Token token) {
        return new NameExpression(token, Kind.EXPRESSION);
    }

    public static NameExpression createMethodName(Token token) {
        return new NameExpression(token, Kind.METHOD);
    }

    public static NameExpression createAmbiguousName(Token token) {
        return new NameExpression(token, Kind.AMBIGUOUS);
    }

    public static NameExpression createPackageOrTypeName(Token token) {
        return new NameExpression(token, Kind.PACKAGE_OR_TYPE);
    }

    public static NameExpression createTypeName(Token token,
                                                List<Annotation> annotations) {
        return new NameExpression(token, Kind.TYPE, annotations);
    }

    public static NameExpression createPackageName(Token token,
                                                   List<Annotation> annotations) {
        return new NameExpression(token, Kind.PACKAGE, annotations);
    }

    public static NameExpression createExpressionName(Token token,
                                                      List<Annotation> annotations) {
        return new NameExpression(token, Kind.EXPRESSION, annotations);
    }

    public static NameExpression createMethodName(Token token,
                                                     List<Annotation> annotations) {
        return new NameExpression(token, Kind.METHOD, annotations);
    }

    public static NameExpression createAmbiguousName(Token token,
                                                     List<Annotation> annotations) {
        return new NameExpression(token, Kind.AMBIGUOUS, annotations);
    }

    public static NameExpression createPackageOrTypeName(Token token,
                                                         List<Annotation> annotations) {
        return new NameExpression(token, Kind.PACKAGE_OR_TYPE, annotations);
    }

    public NameExpression getQualifyingName() {
        return qualifier;
    }

    public boolean isQualified() {
        return qualifier != null;
    }

    public void setQualifyingName(NameExpression name) {
        qualifier = name;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        System.out.println("setting kind to " + kind);
        this.kind = kind;
    }

    public Token getToken() {
        return name;
    }

    public String getName() {
        String ret = "";
        if (isQualified()) {
            ret += qualifier.getName();
        }
        ret += name.getText();
        return ret;
    }

    public List<Token> getTokens() {
        List<Token> ret = new ArrayList<>();
        if (isQualified()) {
            ret.addAll(qualifier.getTokens());
        }
        ret.add(name);
        return ret;
    }

    public Package getPackage() {
        return pkg;
    }

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
