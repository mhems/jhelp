package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

public class NameExpression extends Expression {
    public static enum Kind { TYPE, PACKAGE, EXPRESSION,
                              METHOD, AMBIGUOUS, PACKAGE_OR_TYPE };

    private NameExpression qualifier = null;
    private Annotation[] annotations = {};
    private Kind kind;
    private Token name;

    public NameExpression(NameExpression qualifier, NameExpression expr) {
        super(qualifier.getFirstToken(), expr.getLastToken());
        if (expr.isQualified()) {
            throw new IllegalArgumentException("only lhs can be qualified");
        }
        this.qualifier = qualifier;
        this.annotations = expr.annotations;
        this.kind = expr.kind;
        this.name = expr.name;
    }

    public NameExpression(Token name, Kind kind) {
        super(name);
        this.kind = kind;
        this.name = name;
    }

    public NameExpression(Token name, Kind kind, List<Annotation> annotations) {
        super(name);
        this.kind = kind;
        this.name = name;
        this.annotations = annotations.toArray(new Annotation[annotations.size()]);
    }

    protected NameExpression(Token first, Token last) {
        super(first, last);
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
        this.kind = kind;
    }

    public Token getToken() {
        return name;
    }

    public String getName() {
        return name.getText();
    }

    public List<Token> getTokens() {
        List<Token> ret = new ArrayList<>();
        if (isQualified()) {
            ret.addAll(qualifier.getTokens());
        }
        ret.add(name);
        return ret;
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
