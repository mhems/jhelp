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

    /**
     * An enum enumerating the kinds of variables that can occur
     */
    public enum VariableKind {FIELD, LOCAL};

    protected ClassSymbol declarer;
    protected VariableKind varKind = VariableKind.LOCAL;
    protected Type type;

    /**
     * Constructs a new named VariableSymbol
     * @param name the name of the VariableSymbol
     * @param modifiers the Modifiers of the VariableSymbol
     */
    public VariableSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    // public VariableSymbol copy() {
    //     return new VariableSymbol(this);
    // }

    /**
     * Constructs a new reflected VariableSymbol
     * @param field the pre-compiled Field to reflect
     */
    public VariableSymbol(Field field) {
        super(field.getName(), field.getModifiers());
        declarer = ReflectedClassSymbol.get(field.getDeclaringClass());
        varKind = VariableKind.FIELD;
        type = fromType(field.getAnnotatedType());
    }

    /**
     * Copy constructs a VariableSymbol
     * @param var the VariableSymbol to copy
     */
    protected VariableSymbol(VariableSymbol var) {
        super(var.name, var.modifiers);
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

    /**
     * Gets the kind of variable this VariableSymbol is
     * @return the kind of variable this VariableSymbol is
     */
    public VariableKind getVariableKind() {
        return varKind;
    }

    /**
     * Determines if this VariableSymbol is a field
     * @return true iff this VariableSymbol is a field
     */
    public boolean isField() {
        return varKind == VariableKind.FIELD;
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    /**
     * Determines if this variable is a constant variable
     * @return true iff this variable is a constant variable
     */
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

    /**
     * Helper method to adapt a variable
     * @param var the variable to adapt
     * @param map the substitution map
     */
    protected static void adapt(VariableSymbol var,
                                Map<TypeVariable, Type> map) {
        // System.out.println("adapting variable: " + var);
        var.type = var.type.adapt(map);
        // System.out.println("adapted variable: " + var);
    }

    @Override
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

    @Override
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

    @Override
    public int hashCode() {
        return getName().hashCode() ^
            getDeclaringClass().hashCode() ^
            getType().hashCode();
    }
}
