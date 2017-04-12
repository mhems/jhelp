package com.binghamton.jhelp;

import java.lang.reflect.Field;
import java.util.Map;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A class representing a Java variable at any scope
 */
public class VariableSymbol extends Symbol {

        {
            kind = SymbolKind.VARIABLE;
        }

    public enum VariableKind {FIELD, LOCAL, PARAMETER};

    protected ClassSymbol declarer;
    protected VariableKind varKind;
    protected Type type;

    public VariableSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public VariableSymbol(Field field) {
        super(field.getName(), field.getModifiers());
        declarer = ReflectedClassSymbol.get(field.getDeclaringClass());
        varKind = VariableKind.FIELD;
        type = fromType(field.getAnnotatedType());
    }

    protected VariableSymbol(VariableSymbol var) {
        this(var.name, var.modifiers);
        this.declarer = var.declarer;
        this.varKind = var.varKind;
        this.type = var.type;
    }

    /**
     * Gets the type of this variable
     * @return the type of this variable
     */
    public Type getType() {
        return type;
    }

    public VariableKind getVariableKind() {
        return varKind;
    }

    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    public boolean isConstant() {
        return isFinal() && (
            (type instanceof PrimitiveType) ||
            type.equals(fetch("String")));
    }

    @Override
    public VariableSymbol adapt(Map<TypeVariable, Type> map) {
        VariableSymbol ret = new VariableSymbol(this);
        adapt(ret, map);
        return ret;
    }

    protected static void adapt(VariableSymbol var,
                                Map<TypeVariable, Type> map) {
        var.type = var.type.adapt(map);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hasModifiers()) {
            sb.append(getModifiers().toString());
            sb.append(" ");
        }
        sb.append(getType().getName());
        sb.append(" ");
        sb.append(getName());
        return sb.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof VariableSymbol) {
            VariableSymbol sym = (VariableSymbol)other;
            return getName().equals(sym.getName()) &&
                varKind == sym.varKind &&
                getDeclaringClass().equals(sym.getDeclaringClass()) &&
                getType().equals(sym.getType());
        }
        return false;
    }

    public int hashCode() {
        return getName().hashCode() ^
            getDeclaringClass().hashCode() ^
            getType().hashCode();
    }
}
