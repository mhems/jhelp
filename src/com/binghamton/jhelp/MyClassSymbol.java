package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyClassSymbol extends ClassSymbol {
    public enum ClassKind {CLASS, INTERFACE, ENUM, ANNOTATION};

    private ClassKind classKind;
    private Type superClass = null;
    private Type[] implementees = {};
    private ClassSymbol declarer;
    private VariableSymbol[] fields = {};
    private MethodSymbol[] methods = {};
    private ConstructorSymbol[] ctors = {};
    private TypeVariable[] params = {};
    private ImportManager importer;
    private boolean anonymous = false;
    private boolean inner = false;
    private Package pkg = Package.DEFAULT_PACKAGE;
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

    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    public void setDeclaringClass(ClassSymbol cls) {
        declarer = cls;
    }

    public Type[] getInterfaces() {
        return implementees;
    }

    public MethodSymbol[] getMethods() {
        return methods;
    }
    public ConstructorSymbol[] getConstructors() {
        return ctors;
    }

    public VariableSymbol[] getFields() {
        return fields;
    }

    public void setInterfaces(Type[] interfaces) {
        implementees = interfaces;
    }

    public void setMethods(MethodSymbol[] syms) {
        methods = syms;
    }
    public void setConstructors(ConstructorSymbol[] syms) {
        ctors = syms;
    }

    public void setFields(VariableSymbol[] syms) {
        fields = syms;
    }

    public ClassKind getClassKind() {
        return classKind;
    }

    public void setClassKind(ClassKind kind) {
        classKind = kind;
    }

    public ImportManager getImportManager() {
        return importer;
    }

    public void setImportManager(ImportManager importer) {
        this.importer = importer;
    }

    public void setTypeParameters(TypeVariable[] params) {
        this.params = params;
    }

    public boolean isEnum() { return classKind == ClassKind.ENUM; }
    public boolean isClass() { return classKind == ClassKind.CLASS; }
    public boolean isInterface() { return classKind == ClassKind.INTERFACE; }
    public boolean isAnnotation() { return classKind == ClassKind.ANNOTATION; }
    public Type getSuperClass() { return superClass; }
    public TypeVariable[] getTypeParameters() { return params; }
    public boolean isAnonymous() { return anonymous; }
    public void setAnonymous(boolean anonymous) { this.anonymous = anonymous; }
    public boolean isInnerClass() { return inner; }
    public void setInnerClass(boolean inner) { this.inner = inner; }

    public void setSuperClass(Type type) {
        superClass = type;
    }

    public void setSuperClassForEnum() {
        superClass = new ParameterizedType(ImportManager.get("java.lang.Enum"),
                                           this);
    }

    public void setSuperClassForAnnotation() {
        superClass = ImportManager.get("java.lang.annotation.Annotation");
    }

    public void setSuperClassForClass() {
        superClass = ImportManager.get("java.lang.Object");
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

    public boolean isBoxed() {
        return false;
    }

    public PrimitiveType unbox() {
        return null;
    }

    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        if (!getPackage().isDefault()) {
            sb.append(getPackage().getQualifiedName());
            sb.append(".");
        }
        sb.append(super.getQualifiedName());
        return sb.toString();
    }
}
