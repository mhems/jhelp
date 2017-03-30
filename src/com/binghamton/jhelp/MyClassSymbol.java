package com.binghamton.jhelp;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.BodyDeclaration;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

public class MyClassSymbol extends ClassSymbol {

    private ClassSymbol declarer;
    private boolean anonymous = false;
    private boolean inner = false;
    private Package pkg = Package.DEFAULT_PACKAGE;
    private Token token;
    private BodyDeclaration AST;

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
        MethodSymbol parentMethod = null;
        if (superClass != null) {
            parentMethod = superClass.getClassSymbol().getMethod(sym);
        } else {
            for (Type type : interfaces) {
                parentMethod = type.getClassSymbol().getMethod(sym);
                if (parentMethod != null) {
                    break;
                }
            }
        }
        boolean good = true;
        if (parentMethod != null &&
            parentMethod.getAccessLevel() != AccessLevel.PRIVATE) {
            if (parentMethod.isFinal()) {
                System.err.println("cannot override a final method");
                good = false;
            } else if (parentMethod.isStatic() && !sym.isStatic()) {
                System.err.println("an instance method cannot override a static method");
                good = false;
            } else if (sym.isStatic() && !parentMethod.isStatic()) {
                System.err.println("a static method cannot hide an instance method");
                good = false;
            }
            if (sym.hasCheckedExceptions() && !parentMethod.hasExceptions()) {
                System.err.println("cannot override a method without any exceptions with a method that throws a checked exception");
                good = false;
            }
            if (sym.getAccessLevel().compareTo(parentMethod.getAccessLevel()) > 0) {
                System.err.println("cannot override a method with a method that has more restrictive access than the method it is overriding");
            }
        } else if (sym.hasOverrideAnnotation()){
            System.out.println("method is not being overridden!");
        }
        if (good) {
            if (!methods.put(sym)) {
                System.err.println("class cannot declare same method twice");
                return false;
            }
            return true;
        }
        return false;
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
        superClass = cls;
    }

    public void setDeclaringClass(ClassSymbol cls) {
        declarer = cls;
    }

    public void setSuperClassForEnum() {
        superClass = new ParameterizedType(fetch("Enum"), this);
        MyMethodSymbol values = new MyMethodSymbol(new MyToken(0, "values"),
                                                   new Modifiers(Modifier.PUBLIC,
                                                                 Modifier.STATIC));
        values.setReturnType(new ArrayType(this));
        values.constructType();
        addMethod(values);
        MyMethodSymbol valueOf = new MyMethodSymbol(new MyToken(0, "valueOf"),
                                                    new Modifiers(Modifier.PUBLIC,
                                                                  Modifier.STATIC));
        Type[] strings = {fetch("String")};
        valueOf.setReturnType(this);
        valueOf.setParameterTypes(strings);
        valueOf.constructType();
        addMethod(valueOf);
    }

    public void setSuperClassForAnnotation() {
        superClass = fetch("java.lang.annotation.Annotation");
    }

    public void setSuperClassForClass() {
        superClass = fetch("Object");
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

    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        if (!getPackage().isDefault()) {
            sb.append(getPackage().getQualifiedName());
            sb.append(".");
        }
        sb.append(getQualifiedClassName());
        return sb.toString();
    }

    public void setAST(BodyDeclaration ast) {
        this.AST = ast;
    }

    public void visit(ASTVisitor visitor) {
        AST.accept(visitor);
    }

    @Override
    public MyClassSymbol adapt(Type[] args) {
        // TODO
        return null;
    }
}
