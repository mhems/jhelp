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
    public enum ClassKind {CLASS, INTERFACE, ENUM, ANNOTATION};
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

    protected ClassSymbol(ClassSymbol cls) {
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

    public NamedSymbolTable<VariableSymbol> getFieldTable() {
        return fields;
    }

    public TypeVariable[] getTypeParameters() {
        return paramArr;
    }

    public ClassSymbol[] getInnerClasses() {
        return innerClasses.toArray(new ClassSymbol[innerClasses.size()]);
    }

    public ClassSymbol[] getMemberTypes() {
        return memberTypes.toArray(new ClassSymbol[memberTypes.size()]);
    }

    public ClassKind getClassKind() {
        return classKind;
    }

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

    public boolean hasConstructor() {
        return ctors.size() > 0;
    }

    public void setClassKind(ClassKind kind) {
        classKind = kind;
    }

    public void setImportedTypes(ImportingSymbolTable table) {
        importedTypes = table;
    }

    public Type getInterface(String name) {
        return interfaces.get(name);
    }

    public ClassSymbol getInnerClass(String name) {
        return innerClasses.get(name);
    }

    public ClassSymbol getMemberType(String name) {
        return memberTypes.get(name);
    }

    public VariableSymbol getField(String name) {
        return fields.get(name);
    }

    public MethodSymbol[] getMethodsByName(String name) {
        Set<MethodSymbol> tmp = methods.getAll(name);
        return tmp.toArray(new MethodSymbol[tmp.size()]);
    }

    // exact look-up
    public MethodSymbol getMethod(String name, Type... paramTypes) {
        return methods.get(MethodType.fromParameters(name, paramTypes));
    }

    public MethodSymbol getMethod(MethodSymbol sym) {
        return methods.get(sym.getType());
    }

    public MethodSymbol getConstructor(Type... paramTypes) {
        return ctors.get(MethodType.fromParameters(getName(), paramTypes));
    }

    public MethodSymbol getConstructor(MethodSymbol sym) {
        return ctors.get(sym.getType());
    }

    public TypeVariable getTypeParameter(String name) {
        return params.get(name);
    }

    public TypeVariable getTypeParameter(int index) {
        return paramArr[index];
    }

    public boolean hasMember(String name) {
        return fields.has(name) || methods.getAll(name).size() > 0;
    }

    public boolean hasMemberType(String name) {
        return memberTypes.has(name);
    }

    public boolean isTop() {
        return level == Level.TOP;
    }

    public boolean isMember() {
        return level == Level.MEMBER;
    }

    public boolean isInner() {
        return level != Level.TOP && level != Level.MEMBER;
    }

    public boolean isAnonymous() {
        return level == Level.ANONYMOUS;
    }

    public boolean isLocal() {
        return level == Level.LOCAL;
    }

    public boolean isClassLike() { return isEnum() || isClass(); }
    public boolean isEnum() { return classKind == ClassKind.ENUM; }
    public boolean isClass() { return classKind == ClassKind.CLASS; }
    public boolean isInterfaceLike() { return isInterface() || isAnnotation(); }
    public boolean isInterface() { return classKind == ClassKind.INTERFACE; }
    public boolean isAnnotation() { return classKind == ClassKind.ANNOTATION; }
    public boolean isBoxed() { return boxed; }
    public Package getPackage() { return pkg; }

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
        return paramArr.length > 0;
    }

    public boolean isGeneric() {
        return hasTypeParameters();
    }

    @Override
    public boolean isRaw() {
        return isGeneric();
    }

    public boolean extendsClass(ClassSymbol cls) {
        return superClass.getClassSymbol().equals(cls) ||
            superClass.getClassSymbol().extendsClass(cls);
    }

    public boolean implementsInterface(ClassSymbol intf) {
        for (Type type : interfaces) {
            if (type.getClassSymbol().equals(intf)) {
                return true;
            }
        }
        return superClass.getClassSymbol().implementsInterface(intf);
    }

    public boolean hasSuperClass() {
        return getSuperClass() != null;
    }

    public boolean hasInterfaces() {
        return interfaces.size() > 0;
    }

    public boolean hasAbstractMethod() {
        for (MethodSymbol m : getMethods()) {
            if (m.isAbstract()) {
                return true;
            }
        }
        return false;
    }

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

    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        if (!pkg.isDefault()) {
            sb.append(pkg.getQualifiedName());
            sb.append(".");
        }
        sb.append(getQualifiedClassName());
        return sb.toString();
    }

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

    protected static ClassSymbol adapt(ClassSymbol cls,
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
        return null;
    }

    protected abstract ClassSymbol adapt(Map<TypeVariable, Type> map,
                                         boolean first);

    @Override
    public ClassSymbol adapt(Map<TypeVariable, Type> map) {
        return adapt(map, false);
    }

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

    public boolean isReifiable() {
        return true;
    }

    public String toString() {
        return getName();
    }

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

    public void visit(ASTVisitor visitor) {

    }
}
