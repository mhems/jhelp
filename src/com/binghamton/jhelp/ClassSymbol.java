package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.util.StringUtils;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * A base class representing a Java class and its members
 */
public abstract class ClassSymbol extends ReferenceType {

    /**
     * An enum enumerating the kinds of classes
     */
    public enum ClassKind {CLASS, INTERFACE, ENUM, ANNOTATION};

    /**
     * An enum enumerating the declaration levels a class can occur
     */
    public enum Level {TOP, MEMBER, INNER, ANONYMOUS, LOCAL};

        {
            kind = SymbolKind.CLASS;
        }

    protected ClassKind classKind;
    protected Level level = Level.TOP;
    protected Type superClass = null;
    protected ClassSymbol declarer;
    protected boolean boxed;
    protected Package pkg;

    protected ImportingSymbolTable importedTypes = new ImportingSymbolTable();
    protected NamedSymbolTable<Type> interfaces = new NamedSymbolTable<>();
    protected NamedSymbolTable<ClassSymbol> innerClasses = new NamedSymbolTable<>();
    protected NamedSymbolTable<ClassSymbol> memberTypes = new NamedSymbolTable<>();
    protected NamedSymbolTable<VariableSymbol> fields = new NamedSymbolTable<>();
    protected MethodSymbolTable methods = new MethodSymbolTable();
    protected MethodSymbolTable ctors = new MethodSymbolTable();
    protected NamedSymbolTable<TypeVariable> params = new NamedSymbolTable<>();
    protected TypeVariable[] paramArr = {};
    protected Map<List<Type>, ClassSymbol> adaptationCache = new HashMap<>();

    /**
     * Construct a new Classsymbol from an existing instance
     * @param cls the existing ClassSymbol to copy construct from
     */
    protected ClassSymbol(ClassSymbol cls) {
        super(cls.name, cls.modifiers);
        classKind = cls.classKind;
        level = cls.level;
        superClass = cls.superClass;
        declarer = cls.declarer;
        boxed = cls.boxed;
        pkg = cls.pkg;
        importedTypes = cls.importedTypes;
        interfaces = cls.interfaces;
        innerClasses = cls.innerClasses;
        memberTypes = cls.memberTypes;
        fields = cls.fields;
        methods = cls.methods;
        ctors = cls.ctors;
        params = cls.params;
        paramArr = cls.paramArr;
    }

    /**
     * Construct a new ClassSymbol
     * @param name the name of this class symbol
     */
    public ClassSymbol(String name) {
        super(name);
    }

    /**
     * Construct a new ClassSymbol with modifiers
     * @param name the name of this ClassSymbol
     * @param modifiers a bit mask of the reflected modifiers
     */
    public ClassSymbol(String name, int modifiers) {
        super(name, modifiers);
    }

    /**
     * Construct a new ClassSymbol with modifiers
     * @param name the name of this ClassSymbol
     * @param modifiers the Modifiers of this ClassSymbol
     */
    public ClassSymbol(String name, Modifiers modifiers) {
        super(name, modifiers);
    }

    /**
     * Gets the super class of this ClassSymbol
     * @return the super class of this ClassSymbol
     */
    public Type getSuperClass() {
        return superClass;
    }

    @Override
    public ClassSymbol getDeclaringClass() {
        return declarer;
    }

    /**
     * Gets the interfaces this ClassSymbol implements
     * @return the interfaces this ClassSymbol implements
     */
    public Type[] getInterfaces() {
        return interfaces.toArray(new Type[interfaces.size()]);
    }

    /**
     * Gets the methods this ClassSymbol directly declares
     * @return the methods this ClassSymbol directly declares
     */
    public MethodSymbol[] getMethods() {
        return methods.toArray(new MethodSymbol[methods.size()]);
    }

    /**
     * Gets the constructors of this ClassSymbol
     * @return the constructors of this ClassSymbol
     */
    public MethodSymbol[] getConstructors() {
        return ctors.toArray(new MethodSymbol[ctors.size()]);
    }

    /**
     * Gets the fields this ClassSymbol directly declares
     * @return the fields this ClassSymbol directly declares
     */
    public VariableSymbol[] getFields() {
        return fields.toArray(new VariableSymbol[fields.size()]);
    }

    /**
     * Gets the SymbolTable holding this instance's fields
     * @return the SymbolTable holding this instance's fields
     */
    public NamedSymbolTable<VariableSymbol> getFieldTable() {
        return fields;
    }

    /**
     * Gets the TypeVariables this ClassSymbol directly declares
     * @return the TypeVariables this ClassSymbol directly declares
     */
    public TypeVariable[] getTypeParameters() {
        return paramArr;
    }

    /**
     * Gets the inner classes this ClassSymbol declares
     * @return the inner classes this ClassSymbol declares
     */
    public ClassSymbol[] getInnerClasses() {
        return innerClasses.toArray(new ClassSymbol[innerClasses.size()]);
    }

    /**
     * Gets the member types this ClassSymbol declares
     * @return the member types this ClassSymbol declares
     */
    public ClassSymbol[] getMemberTypes() {
        return memberTypes.toArray(new ClassSymbol[memberTypes.size()]);
    }

    /**
     * Gets the kind of declaration this ClassSymbol represents
     * @return the ClassKind indicating the kind of declaration this
     *         ClassSymbol represents
     */
    public ClassKind getClassKind() {
        return classKind;
    }

    /**
     * Searches this ClassSymbol by name for a Type
     * @param name the name of the Type to search for
     * @return the Type corresponding to the given name, if it exists
     *         in this ClassSymbols's scope, otherwise null
     */
    public Type getType(String name) {
        Type ret = null;
        ret = params.get(name);
        if (ret == null) {
            ret = innerClasses.get(name);
            if (ret == null) {
                ret = memberTypes.get(name);
                if (ret == null) {
                    if (declarer != null) {
                        ret = declarer.getType(name);
                    }
                    if (ret == null) {
                        Package pkg = getPackage();
                        if (pkg != null) {
                            ret = pkg.getClass(name);
                            if (ret == null) {
                                ret = importedTypes.get(name);
                            }
                        }
                    }
                }
            }
        }
        return ret;
    }

    /**
     * Sets the kind of this ClassSymbol
     * @param kind the ClassKind indicating this ClassSymbol's kind
     */
    public void setClassKind(ClassKind kind) {
        classKind = kind;
    }

    /**
     * Sets the Types this ClassSymbol imports
     * @param table the ImportingSymbolTable holding the imported Types
     */
    public void setImportedTypes(ImportingSymbolTable table) {
        importedTypes = table;
    }

    /**
     * Gets an interface by name
     * @param name the name of the interface to get
     * @return the interface Type corresponding to the given name if
     *         this ClassSymbol implements such a Type, otherwise null
     */
    public Type getInterface(String name) {
        return interfaces.get(name);
    }

    /**
     * Gets an inner class by name
     * @param name the name of the inner class to get
     * @return the inner class corresponding to the given name if
     *         this ClassSymbol declares such a class, otherwise null
     */
    public ClassSymbol getInnerClass(String name) {
        return innerClasses.get(name);
    }

    /**
     * Gets a member type by name
     * @param name the name of the member type to get
     * @return the member Type corresponding to the given name if
     *         this ClassSymbol declares such a class, otherwise null
     */
    public ClassSymbol getMemberType(String name) {
        return memberTypes.get(name);
    }

    /**
     * Gets a field by name
     * @param name the name of the field to get
     * @return the field corresponding to the given name if
     *         this ClassSymbol declares such a field, otherwise null
     */
    public VariableSymbol getField(String name) {
        return fields.get(name);
    }

    /**
     * Gets all methods with a given name
     * @param name the name of the method(s) to get
     * @return the methods corresponding to the given name if
     *         this ClassSymbol declares such methods,
     *         otherwise the empty array
     */
    public MethodSymbol[] getMethodsByName(String name) {
        Set<MethodSymbol> tmp = methods.getAll(name);
        return tmp.toArray(new MethodSymbol[tmp.size()]);
    }

    /**
     * Gets a method by exact signature.
     * No conversions are applied to the given Types
     * @param name the name of the method to get
     * @param paramTypes the Types of the parameters of the method
     * @return the method corresponding to the given signature if
     *         this ClassSymbol declares such a method, otherwise null
     */
    public MethodSymbol getMethod(String name, Type... paramTypes) {
        return methods.get(MethodType.fromParameters(name, paramTypes));
    }

    /**
     * Gets a method by the signature of a given method
     * @param sym the MethodSymbol with the signature of the method to get
     * @return the method corresponding to the given symbol if
     *         this ClassSymbol declares such a method, otherwise null
     */
    public MethodSymbol getMethod(MethodSymbol sym) {
        return methods.get(sym.getType());
    }

    /**
     * Gets a constructor by exact signature.
     * No conversions are applied to the given Types.
     * @param paramTypes the Types of the parameters of the constructor
     * @return the method corresponding to the given signature if
     *         this ClassSymbol declares such a constructor, otherwise null
     */
    public MethodSymbol getConstructor(Type... paramTypes) {
        return ctors.get(MethodType.fromParameters(getName(), paramTypes));
    }

    /**
     * Gets a constructor by the signature of a given constructor
     * @param sym the MethodSymbol with the signature of the constructor to get
     * @return the constructor corresponding to the given symbol if
     *         this ClassSymbol declares such a constructor, otherwise null
     */
    public MethodSymbol getConstructor(MethodSymbol sym) {
	if (!sym.isConstructor()) {
	    throw new IllegalArgumentException("must give a constructor method");
	}
        return ctors.get(sym.getType());
    }

    /**
     * Gets a type parameter by name
     * @param name the name of the type parameter to get
     * @return the type parameter corresponding to the given name if
     *         this ClassSymbol declares such a type parameter, otherwise null
     */
    public TypeVariable getTypeParameter(String name) {
        return params.get(name);
    }

    /**
     * Gets a type parameter by declaration order
     * @param index the index of the type parameter to get
     * @return the `index`th type parameter this ClassSymbol declares,
     *         otherwise null
     */
    public TypeVariable getTypeParameter(int index) {
        return paramArr[index];
    }

    /**
     * Determines if this ClassSymbol declares a member with the given
     * name.
     * @param name the name of the member to search for
     * @return true iff this ClassSymbol declares a member with the
     *         given name.
     */
    public boolean hasMember(String name) {
        return fields.has(name) || methods.getAll(name).size() > 0;
    }

    /**
     * Determines if this ClassSymbol declares a member type with the
     * given name.
     * @param name the name of the member type to search for
     * @return true iff this ClassSymbol declares a member type with
     *         the given name.
     */
    public boolean hasMemberType(String name) {
        return memberTypes.has(name);
    }

    /**
     * Determines if this ClassSymbol is a top-level class
     * @return true iff this ClassSymbol is a top-level class
     */
    public boolean isTop() {
        return level == Level.TOP;
    }

    /**
     * Determines if this ClassSymbol is a static inner class
     * @return true iff this ClassSymbol is a static inner class
     */
    public boolean isMember() {
        return level == Level.MEMBER;
    }

    /**
     * Determines if this ClassSymbol is a non-static inner class,
     * local class, or anonymous class.
     * @return true iff this ClassSymbol is a non-static inner class,
     *         local class, or anonymous class.
     */
    public boolean isInner() {
        return level != Level.TOP && level != Level.MEMBER;
    }

    /**
     * Determines if this ClassSymbol is an anonymous class.
     * @return true iff this ClassSymbol is an anonymous class.
     */
    public boolean isAnonymous() {
        return level == Level.ANONYMOUS;
    }

    /**
     * Determines if this ClassSymbol is a local class.
     * @return true iff this ClassSymbol is a local class.
     */
    public boolean isLocal() {
        return level == Level.LOCAL;
    }


    /**
     * Determines if this ClassSymbol is a class or enum.
     * @return true iff this ClassSymbol is a class or enum.
     */
    public boolean isClassLike() {
	return isEnum() || isClass();
    }

    /**
     * Determines if this ClassSymbol is an enum.
     * @return true iff this ClassSymbol is an enum.
     */
    public boolean isEnum() {
	return classKind == ClassKind.ENUM;
    }

    /**
     * Determines if this ClassSymbol is a class.
     * @return true iff this ClassSymbol is a class.
     */
    public boolean isClass() {
	return classKind == ClassKind.CLASS;
    }

    /**
     * Determines if this ClassSymbol is an interface or annotation.
     * @return true iff this ClassSymbol is an interface or annotation.
     */
    public boolean isInterfaceLike() {
	return isInterface() || isAnnotation();
    }

    /**
     * Determines if this ClassSymbol is an interface.
     * @return true iff this ClassSymbol is an interface.
     */
    public boolean isInterface() {
	return classKind == ClassKind.INTERFACE;
    }

    /**
     * Determines if this ClassSymbol is an annotation.
     * @return true iff this ClassSymbol is an annotation.
     */
    public boolean isAnnotation() {
	return classKind == ClassKind.ANNOTATION;
    }

    /**
     * Determines if this ClassSymbol is boxed.
     * @return true iff this ClassSymbol is boxed
     */
    public boolean isBoxed() {
	return boxed;
    }

    /**
     * Gets the Package this ClassSymbol is declared in
     * @return the Package this ClassSymbol is declared in
     */
    public Package getPackage() {
	return pkg;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof ClassSymbol) {
            ClassSymbol sym = (ClassSymbol)other;
            return getQualifiedName().equals(sym.getQualifiedName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getQualifiedName().hashCode();
    }

    /**
     * Determines if this class declares any type parameters
     * @return true iff this class declares any type parameters
     */
    public boolean hasTypeParameters() {
        return paramArr.length > 0;
    }

    /**
     * Determines if this class is generic
     * @return true iff this class is generic
     */
    public boolean isGeneric() {
        return hasTypeParameters();
    }

    @Override
    public boolean isRaw() {
        return isGeneric();
    }

    /**
     * Determines if this class extends another class, either directly
     * or indirectly.
     * @param cls the class this ClassSymbol might extend
     * @return true iff this ClassSymbol extends `cls`
     */
    public boolean extendsClass(ClassSymbol cls) {
        return superClass.getClassSymbol().equals(cls) ||
            superClass.getClassSymbol().extendsClass(cls);
    }

    /**
     * Determines if this class implements an interface, either
     * directly or indirectly.
     * @param intf the interface this ClassSymbol might implement
     * @return true iff this ClassSymbol implements `intf`
     */
    public boolean implementsInterface(ClassSymbol intf) {
        for (Type type : interfaces) {
            if (type.getClassSymbol().equals(intf)) {
                return true;
            }
        }
        return superClass.getClassSymbol().implementsInterface(intf);
    }

    /**
     * Determines if this class has a superclass.
     * This will hold true for all classes except Object.
     * @return true iff this class has a superclass
     */
    public boolean hasSuperClass() {
        return getSuperClass() != null;
    }

    /**
     * Determines if this class directly implements any interfaces
     * @return true iff this class directly implements any interfaces
     */
    public boolean hasInterfaces() {
        return interfaces.size() > 0;
    }

    /**
     * Determines if this class declares any abstract methods
     * @return true iff this class declares any abstract methods
     */
    public boolean hasAbstractMethod() {
        for (MethodSymbol m : getMethods()) {
            if (m.isAbstract()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets all abstract methods this class has not implemented.
     * @return a List of all abstract methods this class has not
     *         implemented
     */
    public List<MethodSymbol> getUnimplementedMethods() {
        // TODO still have to hook up tables,
        // this wont work if superclass's superclass has abstract methods that
        // superclass left unimplemented
        List<MethodSymbol> abstractMethods = new ArrayList<>();
        List<MethodSymbol> ret = new ArrayList<>();
        for (MethodSymbol method : superClass.getClassSymbol().getMethods()) {
            if (method.hasModifier(Modifier.ABSTRACT)) {
                abstractMethods.add(method);
            }
        }
        for (Type intf : interfaces) {
            for (MethodSymbol method: intf.getClassSymbol().getMethods()) {
                if (method.hasModifier(Modifier.ABSTRACT)) {
                    abstractMethods.add(method);
                }
            }
        }

        for (MethodSymbol method : abstractMethods) {
            if (getMethod(method) == null) {
                ret.add(method);
            }
        }
        return ret;
    }

    /**
     * Gets the fully qualified name of this ClassSymbol
     * @return the fully qualified name of this ClassSymbol
     */
    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        if (!pkg.isDefault()) {
            sb.append(pkg.getQualifiedName());
            sb.append(".");
        }
        sb.append(getQualifiedClassName());
        return sb.toString();
    }

    /**
     * Helper function to build qualified class name
     * @return the qualified class name of this ClassSymbol
     */
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

    @Override
    public String getName() {
        return name;
    }

    /**
     * Substitutes type arguments for type parameters in this
     * ClassSymbol's members.
     * @param args the Types to substitute with
     * @return a ClassSymbol where the type parameters have been
     *         substituted with the given Type arguments
     */
    public ClassSymbol substitute(Type[] args) {
        List<Type> argList = Collections.unmodifiableList(Arrays.asList(args));
        ClassSymbol adapted = adaptationCache.get(argList);
        if (adapted == null) {
            Map<TypeVariable, Type> subMap = new HashMap<>();
            for (int i = 0; i < paramArr.length; i++) {
                subMap.put(paramArr[i], args[i]);
            }
            adapted = this.adapt(subMap, true);
            adaptationCache.put(argList, adapted);
        }
        return adapted;
    }

    /**
     * Helper function to substitute/adapt
     * @param cls the ClassSymbol being adapted
     * @param map the substitution map
     * @param first true iff this substitution is top-level
     */
    protected static void adapt(ClassSymbol cls,
				Map<TypeVariable, Type> map,
				boolean first) {
        if (!first) {
            // allow type parameters to shadow outer scopes'
            for (TypeVariable param : cls.paramArr) {
                if (map.containsKey(param)) {
                    map.remove(param);
                }
            }
        }
        if (cls.superClass != null){
            cls.superClass = cls.superClass.adapt(map);
        }
        cls.interfaces = NamedSymbolTable.adaptTypes(cls.interfaces, map);
        cls.innerClasses = NamedSymbolTable.adaptClasses(cls.innerClasses, map);
        cls.memberTypes = NamedSymbolTable.adaptClasses(cls.memberTypes, map);
        cls.fields = NamedSymbolTable.adaptVariables(cls.fields, map);
        cls.methods = cls.methods.adapt(map);
        cls.ctors = cls.ctors.adapt(map);
    }

    /**
     * Helper hook function to adapt
     * @param map the substitution map
     * @param first true iff this substitution is top-level
     * @return the adapted ClassSymbol
     */
    protected abstract ClassSymbol adapt(Map<TypeVariable, Type> map,
                                         boolean first);

    @Override
    public ClassSymbol adapt(Map<TypeVariable, Type> map) {
        return adapt(map, false);
    }

    @Override
    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
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
        sb.append(getName());
        if (hasTypeParameters()) {
            sb.append("<");
            sb.append(StringUtils.join(", ",
                                       params,
                                       tp -> tp.getName()));
            sb.append(">");
        }

        if (hasSuperClass()) {
            sb.append(" extends ");
            sb.append(superClass.getName());
        }

        if (hasInterfaces()) {
            if (isClass() || isEnum()) {
                sb.append(" implements ");
            } else {
                sb.append(" extends ");
            }
            sb.append(StringUtils.join(", ",
                                       interfaces,
                                       c -> c.getName()));
        }

        return sb.toString();
    }

    @Override
    public ClassSymbol getClassSymbol() {
        return this;
    }

    @Override
    public boolean canNarrowTo(Type type) {
        if (!super.canNarrowTo(type)) {
            if (type instanceof ClassSymbol) {
                ClassSymbol K = (ClassSymbol)type;
                if (!K.isGeneric()) {
                    if (K.isInterfaceLike() && !hasModifier(Modifier.FINAL) &&
                        !implementsInterface(K)) {
                        return true;
                    }
                    if (isInterfaceLike()) {
                        if (K.isClassLike() && !K.hasModifier(Modifier.FINAL)) {
                            return true;
                        }
                        if (K.isInterfaceLike() && !implementsInterface(K)) {
                            return true;
                        }
                    }
                }
            } else if (type instanceof ArrayType) {
                return this.equals(fetch("Cloneable")) ||
                    this.equals(fetch("java.io.Serializable"));
            }
            return false;
        }
        return true;
    }

    @Override
    public boolean canCastTo(Type target) {
        if (isClassLike()) {
            if (target instanceof ClassSymbol) {
                ClassSymbol targetCls = (ClassSymbol)target;
                if (targetCls.isClassLike()) {
                    return this.erase().isSubTypeOf(targetCls.erase()) ||
                        targetCls.erase().isSubTypeOf(this.erase());
                } else {
                    return !hasModifier(Modifier.FINAL) ||
                        this.implementsInterface(targetCls);
                }
            } else if (target instanceof TypeVariable) {
                return canCastTo(((TypeVariable)target).getUpperBound());
            } else if (target instanceof ArrayType) {
                return this.equals(fetch("Object"));
            }
        } else {
            if (target instanceof ArrayType) {
                return this.equals(fetch("java.io.Serializable")) ||
                    this.equals(fetch("Cloneable"));
            } else if (target instanceof ClassSymbol) {
                ClassSymbol targetCls = (ClassSymbol)target;
                if (targetCls.isClassLike() &&
                    targetCls.hasModifier(Modifier.FINAL)) {
                    return targetCls.implementsInterface(this);
                }
            } else if (target instanceof TypeVariable) {
                return canCastTo(((TypeVariable)target).getUpperBound());
            }
        }
        return true;
    }

    @Override
    public boolean isReifiable() {
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Builds a String representation of this ClassSymbol
     * @return the String representation of this ClassSymbol
     */
    public String repr() {
        StringBuilder sb = new StringBuilder("====> " + this.toString());
        sb.append("\n");

        if (level != Level.TOP) {
            sb.append("declared by: ");
            sb.append(declarer.getName());
            sb.append("\n");
        }
        for (ClassSymbol inner : getInnerClasses()) {
            sb.append("inner class: ");
            sb.append(inner.getName());
            sb.append("\n");
        }
        for (ClassSymbol mem : getMemberTypes()) {
            sb.append("member type: ");
            sb.append(mem.getName());
            sb.append("\n");
        }

        for (VariableSymbol field : getFields()) {
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
        sb.append("\n");
        return sb.toString();
    }

    /**
     * Visits this ClassSymbol with the given visitor
     * @param visitor the ASTVisitor to visit this ClassSymbol
     */
    public void visit(ASTVisitor visitor) {
	// reflected classes are not visited
    }
}
