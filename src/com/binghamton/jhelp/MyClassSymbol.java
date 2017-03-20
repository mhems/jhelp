package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

public class MyClassSymbol extends ClassSymbol {
    private ClassKind classKind;
    private Type superClass = null;
    private ClassSymbol declarer;
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

    public void enterMethodScope(TypeVariable[] vars) {
        params.enterScope();
        params.putAll(vars);
    }

    public void exitMethodScope() {
        params.exitScope();
    }

    public boolean isEnum() { return classKind == ClassKind.ENUM; }

    public boolean isClass() { return classKind == ClassKind.CLASS; }

    public boolean isInterface() { return classKind == ClassKind.INTERFACE; }

    public boolean isAnnotation() { return classKind == ClassKind.ANNOTATION; }

    public boolean isAnonymous() { return anonymous; }

    public void setAnonymous(boolean anonymous) { this.anonymous = anonymous; }

    public boolean isInnerClass() { return inner; }

    public Type getType(String name) {
        Type ret = null;
        ret = params.get(name);
        if (ret == null) {
            ret = innerClasses.get(name);
            if (ret == null) {
                if (declarer != null) {
                    ret = ((MyClassSymbol)declarer).getType(name);
                }
                if (ret == null) {
                    ret = pkg.getClassTable().get(name);
                    if (ret == null) {
                        ret = importedTypes.get(name);
                    }
                }
            }
        }
        return ret;
    }

    public void setInnerClass(boolean inner) {
        this.inner = inner;
    }

    public boolean addInterface(Type sym) {
        if (!interfaces.put(sym)) {
            System.err.println("class cannot implement same interface twice");
            return false;
        }
        return true;
    }

    public boolean addMethod(MethodSymbol sym) {
        if (!methods.put(sym)) {
            System.err.println("class cannot declare same method twice");
            return false;
        }
        return true;
    }

    public boolean addConstructor(MethodSymbol sym) {
        if (!ctors.put(sym)) {
            System.err.println("class cannot declare same constructor twice");
            return false;
        }
        return true;
    }

    public boolean addField(VariableSymbol sym) {
        if (!fields.put(sym)) {
            System.err.println("class cannot declare same field twice");
            return false;
        }
        return true;
    }

    public boolean addTypeParameter(TypeVariable sym) {
        if (!params.put(sym)) {
            System.err.println("class cannot declare same type variable twice");
            return false;
        }
        return true;
    }

    public boolean addInnerClass(MyClassSymbol sym) {
        if (!innerClasses.put(sym)) {
            System.err.println("class cannot declare same inner class twice");
            return false;
        }
        return true;
    }

    public void setSuperClass(Type cls) {
        this.superClass = cls;
    }

    public void setDeclaringClass(ClassSymbol cls) {
        declarer = cls;
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
        sb.append(getQualifiedClassName());
        return sb.toString();
    }
}
