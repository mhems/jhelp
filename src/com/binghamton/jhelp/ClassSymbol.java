package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

import com.binghamton.jhelp.util.StringUtils;

/**
 * A base class representing a Java class and its members
 */
public abstract class ClassSymbol extends Type {
    public enum ClassKind {CLASS, INTERFACE, ENUM, ANNOTATION};

        {
            kind = SymbolKind.CLASS;
        }

    protected ClassKind classKind;
    protected Type superClass = null;
    protected ClassSymbol declarer;

    // this holds type variables, classes, imports, and links to
    // links to parent class' type symbol table
    // links to package symbols
    // eventually links to root importer representing java.lang.* and primitive types
    // protected SymbolTable<ClassSymbol> types = new SymbolTable<>();
    protected SymbolTable<ClassSymbol> importedTypes = new SymbolTable<>();
    protected SymbolTable<Type> interfaces = new SymbolTable<>();
    protected SymbolTable<ClassSymbol> innerClasses = new SymbolTable<>();
    protected SymbolTable<VariableSymbol> fields = new SymbolTable<>();
    protected SymbolTable<MethodSymbol> methods = new SymbolTable<>();
    protected SymbolTable<MethodSymbol> ctors = new SymbolTable<>();
    protected SymbolTable<TypeVariable> params = new SymbolTable<>();

    /**
     * Construct a new ClassSymbol
     * @param name the name of this class symbol
     */
    public ClassSymbol(String name) {
        super(name);
    }

    public ClassSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct a new ClassSymbol with modifiers
     * @param name the name of this ClassSymbol
     * @param modifiers the modifiers of this ClassSymbol
     */
    public ClassSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    public Type getSuperClass() {
        return superClass;
    }

    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    public Type[] getInterfaces() {
        return interfaces.toArray(new Type[interfaces.size()]);
    }

    public MethodSymbol[] getMethods() {
        return methods.toArray(new MethodSymbol[methods.size()]);
    }

    public MethodSymbol[] getConstructors() {
        return ctors.toArray(new MethodSymbol[ctors.size()]);
    }

    public VariableSymbol[] getFields() {
        return fields.toArray(new VariableSymbol[fields.size()]);
    }

    public TypeVariable[] getTypeParameters() {
        return params.toArray(new TypeVariable[params.size()]);
    }

    public ClassSymbol[] getInnerClasses() {
        return innerClasses.toArray(new ClassSymbol[innerClasses.size()]);
    }

    public ClassKind getClassKind() {
        return classKind;
    }

    public void setClassKind(ClassKind kind) {
        classKind = kind;
    }

    public void setImportedTypes(SymbolTable<ClassSymbol> table) {
        importedTypes = table;
    }

    public Type getInterface(String name) {
        return interfaces.get(name);
    }

    public ClassSymbol getInnerClass(String name) {
        return innerClasses.get(name);
    }

    public VariableSymbol getField(String name) {
        return fields.get(name);
    }

    public List<MethodSymbol> getMethods(String name) {
        return null; // TODO
    }

    public MethodSymbol getMethod(String name, Type... paramTypes) {
        return null; // TODO
    }

    public MethodSymbol getConstructor(Type... paramTypes) {
        return null; // TODO
    }

    public TypeVariable getTypeParameter(String name) {
        return params.get(name);
    }

    public boolean isClassLike() { return isEnum() || isClass(); }
    public abstract boolean isEnum();
    public abstract boolean isClass();
    public boolean isInterfaceLike() { return isInterface() || isAnnotation(); }
    public abstract boolean isInterface();
    public abstract boolean isAnnotation();
    public abstract boolean isAnonymous();
    public abstract boolean isInnerClass();
    public abstract boolean isBoxed();
    public abstract PrimitiveType unbox();
    public abstract String getPackageName();
    public abstract Package getPackage();

    public boolean equals(Object other) {
        if (other instanceof ClassSymbol) {
            ClassSymbol sym = (ClassSymbol)other;
            return getQualifiedName().equals(sym.getQualifiedName());
        }
        return false;
    }

    public int hashCode() {
        return getQualifiedName().hashCode();
    }

    public boolean hasTypeParameters() {
        return params.size() > 0;
    }

    public boolean isGeneric() {
        return hasTypeParameters();
    }

    public boolean hasSuperClass() {
        return getSuperClass() != null;
    }

    public boolean hasInterfaces() {
        return interfaces.size() > 0;
    }

    public abstract String getQualifiedName();

    protected String getQualifiedClassName() {
        StringBuilder sb = new StringBuilder();
        {
            List<String> names = new ArrayList<>();
            ClassSymbol cur = getDeclaringClass();
            while (cur != null) {
                names.add(cur.getName());
                cur = cur.getDeclaringClass();
            }
            for (int i = names.size() - 1; i >= 0; i--) {
                sb.append(names.get(i));
                sb.append(".");
            }
        }

        sb.append(getName());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder(getQualifiedName());
        if (hasTypeParameters()) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       getTypeParameters(),
                                       tp -> tp.getTypeName()));
            sb.append(">");
        }

        if (false) { // TODO only an issue for self-referential type parameters like Enum
            if (hasSuperClass()) {
                sb.append(" extends ");
                sb.append(getSuperClass().getTypeName());
            }

            if (hasInterfaces()) {
                if (isClass() || isEnum()) {
                    sb.append(" implements ");
                } else {
                    sb.append(" extends ");
                }
                sb.append(StringUtils.join(", ",
                                           getInterfaces(),
                                           c -> c.getTypeName()));
            }
        }

        return sb.toString();
    }

    public ClassSymbol getClassSymbol() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hasModifiers()) {
            sb.append(getModifiers().toString());
            sb.append(" ");
        }
        if (isEnum()) {
            sb.append("enum");
        } else if (isInterface()) {
            sb.append("interface");
        } else if (isAnnotation()) {
            sb.append("@interface");
        } else {
            sb.append("class");
        }
        sb.append(" ");
        sb.append(getTypeName());
        return sb.toString();
    }

    public String repr() {
        StringBuilder sb = new StringBuilder(this.toString());
        sb.append("\n");
        for (VariableSymbol field : getFields()) {
            sb.append("field: ");
            sb.append(field.repr());
            sb.append("\n");
        }
        for (MethodSymbol sym : getConstructors()) {
            sb.append(sym.repr());
            sb.append("\n");
        }
        for (MethodSymbol sym : getMethods()) {
            sb.append(sym.repr());
            sb.append("\n");
        }
        return sb.toString();
    }
}
