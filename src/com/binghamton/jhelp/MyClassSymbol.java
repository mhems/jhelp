package com.binghamton.jhelp;

import java.util.Map;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.BodyDeclaration;
import com.binghamton.jhelp.error.SemanticError;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A ClassSymbol to represent a user-created class
 */
public class MyClassSymbol extends ClassSymbol {

    private BodyDeclaration AST;
    private Token token;
    private int anonCount = 1;

    /**
     * Copy construct a new MyClassSymbol
     * @param cls the MyClassSymbol to construct from
     * @param _unused unused, used to distinguish from anonymous class
     */
    private MyClassSymbol(MyClassSymbol cls, boolean _unused) {
        super(cls);
        this.AST = cls.AST;
        this.token = cls.token;
        this.anonCount = cls.anonCount;
    }

    /**
     * Construct a new anonymous class
     * @param declarer the class this anonymous class is declared in
     */
    public MyClassSymbol(MyClassSymbol declarer) {
        super(declarer.nextAnonName());
        this.declarer = declarer;
        this.level = Level.ANONYMOUS;
        this.pkg = declarer.pkg;
        addModifier(Modifier.FINAL);
    }

    /**
     * Construct a new named class
     * @param token the Token holding this class's name
     */
    public MyClassSymbol(Token token) {
        this(token, new Modifiers());
    }

    /**
     * Construct a new named, modified class
     * @param token the Token holding this class's name
     * @param modifiers this class's declared Modifiers
     */
    public MyClassSymbol(Token token, Modifiers modifiers) {
        super(token.getText(), modifiers);
        this.token = token;
        pkg = MyPackage.DEFAULT_PACKAGE;
    }

    /**
     * Gets the Token holding this class's name
     * @return the Token holding this class's name
     */
    public Token getToken() {
        return token;
    }

    @Override
    public MyPackage getPackage() {
        return (MyPackage)pkg;
    }

    /**
     * Enters a new scope for the type variables a method declares
     * @param vars the type variables to place into the new scope
     */
    public void enterMethodScope(TypeVariable[] vars) {
        params.enterScope();
        params.putAll(vars);
    }

    /**
     * Exits scope for type variables
     */
    public void exitMethodScope() {
        params.exitScope();
    }

    /**
     * Adds an interface that this class implements
     * @param sym the interface this class implements
     * @return true iff the interface was successfully added
     */
    public boolean addInterface(Type sym) {
        if (!interfaces.put(sym)) {
            addError(token,
                     "This class cannot implement the same interface twice",
                     "Remove second duplicate interface");
            return false;
        }
        return true;
    }

    /**
     * Adds a method that this class declares
     * @param sym the method this class declares
     * @return true iff the method was successfully added
     */
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
                addError(((MyMethodSymbol)sym).getToken(),
                         "Cannot override a final method",
                         "Change the method signature to not override");
                good = false;
            } else if (parentMethod.isStatic() && !sym.isStatic()) {
                addError(((MyMethodSymbol)sym).getToken(),
                         "An instance method cannot override a static method",
                         "Change the method signature to not override");
                good = false;
            } else if (sym.isStatic() && !parentMethod.isStatic()) {
                addError(((MyMethodSymbol)sym).getToken(),
                         "A static method cannot hide an instance method",
                         "Change the method to not be 'static' or change the signature to not hide (override)");
                good = false;
            }
            if (sym.hasCheckedExceptions() && !parentMethod.hasExceptions()) {
                addError(((MyMethodSymbol)sym).getToken(),
                         "Cannot override a method with no exceptions with a method that throws a checked exception",
                         "Alter the method so it does not throw the checked exceptions");
                good = false;
            }
            if (sym.getAccessLevel().compareTo(parentMethod.getAccessLevel()) > 0) {
                addError(((MyMethodSymbol)sym).getToken(),
                         "Cannot override a method with a method that has more restrictive access than the method it is overriding",
                         "Alter this methods access to be at least as accessible as the parent method");
            }
        } else if (sym.hasOverrideAnnotation()){
            addError(((MyMethodSymbol)sym).getToken(),
                     "This method is not being overridden even if you think it is",
                     "Change the method signature to match the signature of the parent method you wish to override");
        }
        if (good) {
            if (!methods.put(sym)) {
                addError(token,
                         "A class cannot declare the same method twice",
                         "Change the method signature to name a unique method");
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Adds a constructor that this class declares
     * @param sym the constructor this class declares
     * @return true iff the constructor was successfully added
     */
    public boolean addConstructor(MethodSymbol sym) {
        if (!ctors.put(sym)) {
            addError(((MyMethodSymbol)sym).getToken(),
                     "A class cannot declare the same constructor twice",
                     "Change the constructor signature to name a unique constructor");
            return false;
        }
        return true;
    }

    /**
     * Adds a field that this class declares
     * @param sym the field this class declares
     * @return true iff the field was successfully added
     */
    public boolean addField(VariableSymbol sym) {
        if (!fields.put(sym)) {
            addError(((MyVariableSymbol)sym).getToken(),
                     "A class cannot declare the same field twice",
                     "Change the name of the field to be unique");
            return false;
        }
        return true;
    }

    /**
     * Adds a type parameter that this class declares
     * @param sym the type parameter this class declares
     * @return true iff the type parameter was successfully added
     */
    public boolean addTypeParameter(TypeVariable sym) {
        if (!params.put(sym)) {
            return false;
        }
        paramArr = params.toArray(new TypeVariable[params.size()]);
        return true;
    }

    /**
     * Adds an inner class that this class declares
     * @param sym the inner class this class declares
     * @return true iff the inner class was successfully added
     */
    public boolean addInnerClass(MyClassSymbol sym) {
        sym.level = Level.INNER;
        if (!innerClasses.put(sym)) {
            addError(sym.token,
                     "A class cannot declare the same inner class twice",
                     "Change the name of the inner class to be unique");
            return false;
        }
        sym.declarer = this;
        return true;
    }

    /**
     * Adds a member type that this class declares
     * @param sym the member type this class declares
     * @return true iff the member type was successfully added
     */
    public boolean addMemberType(MyClassSymbol sym) {
        sym.level = Level.MEMBER;
        if (!memberTypes.put(sym)) {
            addError(sym.token,
                     "A class cannot declare the same member class twice",
                     "Change the name of the member type to be unique");
            return false;
        }
        sym.declarer = this;
        return true;
    }

    /**
     * Establishes this class as a local class
     */
    public void setLocal() {
        this.level = Level.LOCAL;
    }

    /**
     * Sets the superclass of this class
     * @param cls the superclass this class extends
     */
    public void setSuperClass(Type cls) {
        superClass = cls;
    }

    /**
     * Sets the class this class is declared in
     * @param cls the enclosing class of this class
     */
    public void setDeclaringClass(ClassSymbol cls) {
        declarer = cls;
    }

    /**
     * Sets the superclass for a class declared as an enum
     */
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

    /**
     * Sets the superclass for a class declared as an annotation
     */
    public void setSuperClassForAnnotation() {
        superClass = fetch("java.lang.annotation.Annotation");
    }

    /**
     * Sets the superclass for a class declared as an class
     */
    public void setSuperClassForClass() {
        superClass = fetch("Object");
    }

    /**
     * Sets the superclass for an enum constant's body
     */
    public void setSuperClassForEnumConstant() {
        superClass = declarer;
    }

    /**
     * Sets the Package this class is declared in
     * @param pkg the Package that declares this class
     */
    public void setPackage(MyPackage pkg) {
        this.pkg = pkg;
    }

    /**
     * Sets the AST that declares this class
     * @param ast the AST that declares this class
     */
    public void setAST(BodyDeclaration ast) {
        this.AST = ast;
    }

    /**
     * Visits the AST that declares this class with a given visitor
     * @param visitor the visitor to visit the AST with
     */
    @Override
    public void visit(ASTVisitor visitor) {
        AST.accept(visitor);
    }

    /**
     * Determines the name of a new anonymous class
     * @return the name of a new anonymous class
     */
    private String nextAnonName() {
        return getName() + "$" + (anonCount++);
    }

    @Override
    protected MyClassSymbol adapt(Map<TypeVariable, Type> map, boolean first) {
        MyClassSymbol ret = new MyClassSymbol(this, false);
        adapt(ret, map, first);
        return ret;
    }

    /**
     * Adds a SemanticError to this Program
     * @param token the offending Token
     * @param msg the message explaining the error
     * @param suggestion a suggestion proposing a possible solution to the error
     */
    private void addError(Token token, String msg, String suggestion) {
        super.addError(new SemanticError(token, msg, suggestion));
    }
}
