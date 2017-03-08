package com.binghamton.jhelp;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

public class MyClassSymbol extends ClassSymbol {
    enum CLASS_KIND {CLASS, INTERFACE, ENUM, ANNOTATION};

    private CLASS_KIND classKind;
    private ClassSymbol superClass = null; // TODO Object class
    private List<ClassSymbol> implementees = new ArrayList<>();
    private List<VariableSymbol> fields = new ArrayList<>();
    private List<MethodSymbol> methods = new ArrayList<>();
    private List<MethodSymbol> ctors = new ArrayList<>();
    private ImportManager importer;
    private boolean anonymous = false;
    private boolean inner = false;
    private Package pkg;
    private Token token;

    public MyClassSymbol(Token token) {
        super(token.getText());
        this.token = token;
    }

    public MyClassSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
    }

    public Token getToken() {
        return token;
    }

    public ClassSymbol[] getInterfaces() {
        return implementees.toArray(CLASS_ARRAY);
    }

    public MethodSymbol[] getMethods() {
        return methods.toArray(METHOD_ARRAY);
    }
    public MethodSymbol[] getConstructors() {
        return ctors.toArray(METHOD_ARRAY);
    }

    public VariableSymbol[] getFields() {
        return fields.toArray(VARIABLE_ARRAY);
    }

    public void setClassKind(CLASS_KIND kind) {
        classKind = kind;
    }

    public ImportManager getImportManager() {
        return importer;
    }

    public void setImportManager(ImportManager importer) {
        this.importer = importer;
    }

    public boolean isEnum() { return classKind == CLASS_KIND.ENUM; }
    public boolean isClass() { return classKind == CLASS_KIND.CLASS; }
    public boolean isInterface() { return classKind == CLASS_KIND.INTERFACE; }
    public boolean isAnnotation() { return classKind == CLASS_KIND.ANNOTATION; }
    public ClassSymbol getSuperClass() { return superClass; }
    public TypeVariable[] getTypeParameters() { return null; /* TODO */ }
    public boolean isAnonymous() { return anonymous; }
    public void setAnonymous(boolean anonymous) { this.anonymous = anonymous; }
    public boolean isInnerClass() { return inner; }
    public void setInnerClass(boolean inner) { this.inner = inner; }

    public void setSuperClassForEnum() {
        // superClass = new ParameterizedType(java.lang.Enum, this);
    }

    public void setSuperClass(ClassSymbol sym) {
        superClass = sym;
    }

    public void setSuperClassForAnnotation() {
        // superClass = java.lang.annotation.Annotation;
    }

    public void setSuperClassForClass() {
        // superClass = Object;
    }

    public String getPackageName() {
        return pkg.getQualifiedName();
    }

    public Package getPackage() {
        return pkg;
    }

    public void setPackage(Package pkg) {
        this.pkg = pkg;
    }

    public void addInterface(ClassSymbol sym) {
        implementees.add(sym);
    }

    public void addMethod(MethodSymbol sym) {
        methods.add(sym);
    }

    public void addConstructor(MethodSymbol sym) {
        ctors.add(sym);
    }

    public void addField(VariableSymbol sym) {
        fields.add(sym);
    }

    public boolean isBoxed() {
        return false;
    }

    public PrimitiveType unbox() {
        return null;
    }
}
