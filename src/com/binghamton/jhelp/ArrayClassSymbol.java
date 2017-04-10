package com.binghamton.jhelp;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ast.ASTVisitor;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

public final class ArrayClassSymbol extends ClassSymbol {

    private static final MyVariableSymbol lengthField;
    private Type baseType;

    static {
        lengthField = new MyVariableSymbol(new MyToken(0, "length"),
                                           new Modifiers(Modifier.PUBLIC,
                                                         Modifier.FINAL));
        lengthField.setType(PrimitiveType.INT);
    }

    private ArrayClassSymbol(Type baseType) {
        super("[" + baseType.getName());
        this.baseType = baseType;
        superClass = fetch("Object");
        interfaces.put(fetch("java.io.Serializable"));
        interfaces.put(fetch("Cloneable"));
        fields.put(lengthField);
        MyMethodSymbol cloneMethod = new MyMethodSymbol(new MyToken(0, "clone"),
                                                        new Modifiers(Modifier.PUBLIC));
        cloneMethod.setReturnType(new ArrayType(baseType));
        methods.put(cloneMethod);
    }

    public static ArrayClassSymbol makeArrayClass(Type baseType) {
        return new ArrayClassSymbol(baseType);
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException("an synthetic array class has no declaring class");
    }

    public boolean isEnum() {
        return false;
    }

    public boolean isClass() {
        return false;
    }

    public boolean isInterface() {
        return false;
    }

    public boolean isAnnotation() {
        return false;
    }

    public boolean isBoxed() {
        return false;
    }

    public String getPackageName() {
        return "";
    }

    public Package getPackage() {
        return null;
    }

    public String getQualifiedName() {
        return getName();
    }

    public String getTypeName() {
        return getName();
    }

    @Override
    public ArrayClassSymbol adapt(Type[] args) {
        return this;
    }

    public void visit(ASTVisitor visitor) {
        // wont be visited
    }
}
