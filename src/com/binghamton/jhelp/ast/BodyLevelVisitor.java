package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyMethodSymbol;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyVariableSymbol;
import com.binghamton.jhelp.ParameterizedType;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;
import static com.binghamton.jhelp.ast.NameExpression.Kind;

/**
 * The body level Visitor for visiting the member declarations contained within
 * body declarations
 */
public class BodyLevelVisitor extends DeclarationLevelVisitor {

    private static final Modifier[] FORBIDDEN = {Modifier.PRIVATE,
                                                 Modifier.STATIC,
                                                 Modifier.FINAL,
                                                 Modifier.NATIVE,
                                                 Modifier.STRICT_FP,
                                                 Modifier.SYNCHRONIZED};
    private static MethodSymbol FINALIZE;
    static {
        FINALIZE = fetch("Object").getMethod("finalize");
    }

    public BodyLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        ClassSymbol objCls = fetch("Object");
        ClassSymbol annoCls = fetch("java.lang.annotation.Annotation");
        MethodSymbol refMethod;
        for (MethodSymbol method : currentClass.getMethods()) {
            refMethod = objCls.getMethod(method);
            if (refMethod == null) {
                refMethod = annoCls.getMethod(method);
            }
            if (refMethod != null && refMethod.getAccessLevel().compareTo(Symbol.AccessLevel.PROTECTED) <= 0) {
                System.err.println("an annotation cannot define a method that is override-equivalent to a method in Object or Annotation");
            }
            if (method.getReturnType().equals(currentClass)) {
                System.err.println("an annotation cannot have an element of its own type");
            }
        }
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = ast.getSymbol();
        pkg = currentClass.getPackage();

        // delay visiting non-enum anonymous classes as instantiation type
        // cannot be determined until code-level visitor
        if (!currentClass.isAnonymous() ||
            currentClass.getDeclaringClass().isEnum()) {
            for (VariableDeclaration v : ast.getFields()) {
                v.accept(this);
                currentClass.addField(v.getSymbol());
                if (currentClass.isInner()) {
                    if (v.getSymbol().isStatic() && !v.getSymbol().isConstant()) {
                        System.err.println("inner class cannot declare non-constant static variable");
                    }
                }
            }
            for (MethodDeclaration m : ast.getMethods()) {
                m.accept(this);
                currentClass.addMethod(m.getSymbol());
                if (currentClass.isInner() && m.getSymbol().isStatic()) {
                    System.err.println("inner class cannot declare static method");
                }
            }
        }
        MyClassSymbol tmp = currentClass;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = tmp;
            if (currentClass.isInner() && body.getSymbol().isStatic()) {
                System.err.println("inner class cannot declare static body");
            }
            System.out.println(body.getSymbol().repr());
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (Block sb : ast.getStaticInitializers())
            sb.accept(this);
        for (Block ib : ast.getInstanceInitializers())
            ib.accept(this);

        if (!currentClass.isAnonymous() ||
            currentClass.getDeclaringClass().isEnum()) {
            for (MethodDeclaration ctor : ast.getConstructors()) {
                ctor.accept(this);
                currentClass.addConstructor(ctor.getSymbol());
            }

            if (currentClass.getConstructors().length == 0) {
                MyMethodSymbol emptyCtor = new MyMethodSymbol(new MyToken(0,
                                                                          currentClass.getName()));
                Symbol.AccessLevel access = currentClass.getAccessLevel();
                if (currentClass.isAnonymous() &&
                    currentClass.getDeclaringClass().isEnum()) {
                    access = Symbol.AccessLevel.PRIVATE;
                }
                emptyCtor.setAccessLevel(access);
                emptyCtor.setConstructor(true);
                emptyCtor.setDeclaringClass(currentClass);
                emptyCtor.constructType();
                currentClass.addConstructor(emptyCtor);
            }
        }

        if (currentClass.isClassLike() && !currentClass.isAbstract()) {
            for (MethodSymbol m : currentClass.getUnimplementedMethods()) {
                System.err.println("cannot leave method " + m.getName() + " unimplemented");
            }
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {

    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        MyVariableSymbol var = new MyVariableSymbol(ast.getName(),
                                                    new Modifiers(Modifier.PUBLIC,
                                                                  Modifier.STATIC,
                                                                  Modifier.FINAL));
        var.setDeclaringClass(currentClass);
        var.setType(currentClass);
        ast.setSymbol(var);
        if (!ast.isEmpty()) {
            MyClassSymbol tmp = currentClass;
            ast.getBody().accept(this);
            currentClass = tmp;
            if (ast.getBody().getSymbol().hasAbstractMethod()) {
                System.err.println("an enum constant body cannot declare abstract methods");
            }
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        boolean allEmpty = true;

        for (EnumConstant c : ast.getConstants()) {
            c.accept(this);
            currentClass.addField(c.getSymbol());
            allEmpty &= c.isEmpty();
        }
        for (MethodSymbol ctor : currentClass.getConstructors()) {
            if (ctor.hasModifier(Modifier.PUBLIC) ||
                ctor.hasModifier(Modifier.PROTECTED)) {
                System.err.println("an enum cannot have a public or protected constructor");
            }
        }
        boolean hasAbstract = false;
        for (MethodSymbol method : currentClass.getMethods()) {
            if (method.isAbstract()) {
                hasAbstract = true;
                break;
            }
            if (method.getName().equals("finalize") && method.overrides(FINALIZE)) {
                System.err.println("enum cannot have a finalizer as it cannot be finalized");
            }
        }
        if (hasAbstract && (ast.getConstants().size() == 0 || !allEmpty)) {
            System.err.println("enum with implemented constants cannot have abstract methods");
        }

        for (EnumConstant c : ast.getConstants()) {
            if (!c.isEmpty()) {
                System.out.println(c.getBody().getSymbol().repr());
            }
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        ClassSymbol objCls = fetch("Object");
        MethodSymbol objMethod;
        for (MethodSymbol method : currentClass.getMethods()) {
            objMethod = objCls.getMethod(method);
            if (method.hasModifier(Modifier.DEFAULT) &&
                objMethod != null &&
                objMethod.getAccessLevel() != Symbol.AccessLevel.PRIVATE) {
                System.err.println("default method of interface cannot be override equivalent to non-private method of Object");
                if (!method.getReturnType().equals(objMethod.getReturnType())) {
                    System.err.println("interface cannot override public method of Object");
                }

            }
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        MyMethodSymbol method = new MyMethodSymbol(ast.getName(), ast.getModifiers());
        int pos;

        ast.setSymbol(method);
        method.setDeclaringClass(currentClass);
        method.setAnnotations(makeAnnotations(ast.getAnnotations()));

        if (currentClass.isClass()) {
            if (method.isAbstract()) {
                Modifiers mods = method.getModifiers();
                for (Modifier bad : FORBIDDEN) {
                    if (mods.contains(bad)) {
                        System.err.println("method cannot both be abstract and " + bad);
                    }
                }
                if (!ast.getBody().isNil()) {
                    System.err.println("an abstract method must have no body");
                }
                if (!currentClass.isAbstract()) {
                    System.err.println("a class with an abstract method must be declared abstract");
                }
            }
            if (method.hasModifier(Modifier.NATIVE)) {
                if (!ast.getBody().isNil()) {
                    System.err.println("a native method must have no body");
                }
                if (method.hasModifier(Modifier.STRICT_FP)) {
                    System.err.println("method cannot both be native and strictfp");
                }
            }
        }

        if (currentClass.isInterface()) {
            int count = 0;

            if (method.hasModifier(Modifier.DEFAULT)) {
                ++count;
            }
            if (method.isAbstract()) {
                ++count;
                if (method.hasModifier(Modifier.STRICT_FP)) {
                    System.err.println("an interface method cannot both be abstract and strictfp");
                }
            }
            if (method.isStatic()) {
                ++count;
            }
            if (!method.hasModifier(Modifier.DEFAULT) &&
                !method.isStatic()) {
                method.addModifier(Modifier.ABSTRACT);
            }

            if (ast.getBody().isNil() &&
                (method.hasModifier(Modifier.DEFAULT) || method.isStatic())) {
                    System.err.println("a default or static method in an interface must have a body");
            }

            if (method.isAbstract() && !ast.getBody().isNil()) {
                System.err.println("an interface method cannot have a body unless that method is default is static");
            }

            if (count > 1) {
                System.err.println("an interface method can only be one of abstract, default, and static");
            }
            // TODO 9.4.1.3
        }

        if (currentClass.isClassLike() &&
            ast.getBody().isNil() &&
            !method.isAbstract() &&
            !method.hasModifier(Modifier.NATIVE)) {
            System.err.println("a method with no body must be abstract or native");
        }

        if (ast.hasTypeParameters()) {
            TypeVariable[] typeParams = makeTypeParameters(ast.getTypeParameters());
            for (TypeVariable param : typeParams) {
                param.setDeclaringSymbol(method);
            }
            method.setTypeParameters(typeParams);
            currentClass.enterMethodScope(typeParams);
        }
        Type[] paramTypes = new Type[ast.getParameters().size()];
        pos = 0;
        Set<String> paramNames = new HashSet<>();
        for (VariableDeclaration v : ast.getParameters()) {
            if (!v.isReceiverParameter()) {
                if (!paramNames.add(v.getName().getText())) {
                    System.err.println("method cannot have two params with same name");
                }
                v.accept(this);
                paramTypes[pos] = v.getSymbol().getType();
                if (v.isVariadic()) {
                    method.setVariadic(true);
                    paramTypes[pos] = new ArrayType(paramTypes[pos]);
                }
                ++pos;
            }
        }
        method.setParameterTypes(paramTypes);

        Type[] excTypes = new Type[ast.getExceptions().size()];
        pos = 0;
        for (Expression ex : ast.getExceptions()) {
            ex.accept(this);
            excTypes[pos] = ex.getType();
            if (!excTypes[pos].isSubTypeOf(fetch("Throwable"))) {
                System.err.println("exceptions a method throws must be a subtype of java.lang.Throwable");
            }
            ++pos;
        }
        method.setExceptionTypes(excTypes);

        if (ast.isConstructor()) {
            if (!method.getName().equals(currentClass.getName())) {
                System.err.println("constructors must have same name as class they're declared in");
            }
            method.setConstructor(true);
            method.setReturnType(currentClass);
        } else {
            Expression ret = ast.getReturnTypeExpression();
            ret.accept(this);
            Type type = ret.getType();
            method.setReturnType(type);
            if (currentClass.isAnnotation() &&
                !validAnnotationReturnType(type) &&
                (type instanceof ArrayType &&
                 !validAnnotationReturnType(((ArrayType)type).getBaseType()))) {
                    System.err.println("invalid annotation method return type");
            }
        }

        method.constructType();

        if (method.isStatic()) {
            for (Type type : paramTypes) {
                if (type instanceof TypeVariable) {
                    if (!method.equals(((TypeVariable)type).getDeclaringSymbol())) {
                        System.err.println("static method cannot use instance type variables");
                    }
                }
            }
            if (currentClass.isInterfaceLike()) {
                for (Type intf : currentClass.getInterfaces()) {
                    for (MethodSymbol m : intf.getClassSymbol().getMethodsByName(method.getName())) {
                        if (!m.isStatic() && method.hasSameSubsignature(m)) {
                            System.err.println("static interface method cannot hide instance method of super interface");
                        }
                    }
                }
            }
        }

        ast.getBody().accept(this);
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        String name = ast.getName();
        String rName = ast.getToken().getText();
        AnnotationSymbol[] anns = makeAnnotations(ast.getAnnotations());
        Kind kind = ast.getKind();
        NameExpression qual = ast.getQualifyingName();
        Type type = null;
        if (kind == Kind.TYPE) {
            type = PrimitiveType.UNBOX_MAP.get(name);
        }
        if (type != null) {
            type.setAnnotations(anns);
            ast.setType(type);
        } else {
            super.visit(ast);
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {

    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        String name = ast.getName();
        TypeVariable type;
        if (ast.hasSuperTypes()) {
            Type[] bounds = new Type[ast.getSuperTypes().size()];
            int pos = 0;
            for (Expression rt : ast.getSuperTypes()) {
                rt.accept(this);
                bounds[pos] = rt.getType();
                ++pos;
            }
            type = new TypeVariable(name, bounds);
        } else {
            type = new TypeVariable(name);
        }
        type.setAnnotations(makeAnnotations(ast.getAnnotations()));
        ast.setType(type);
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        MyVariableSymbol var = new MyVariableSymbol(ast.getName(),
                                                    ast.getModifiers());
        ast.setSymbol(var);
        var.setDeclaringClass(currentClass);
        ast.getExpression().accept(this);
        var.setType(ast.getExpression().getType());

        if (var.isFinal() &&
            var.hasModifier(Modifier.VOLATILE)) {
            System.err.println("field cannot both be final and volatile");
        }

        if (currentClass.isInterfaceLike()) {
            var.addModifier(Modifier.PUBLIC);
            var.addModifier(Modifier.STATIC);
            var.addModifier(Modifier.FINAL);
            var.setAccessLevel(Symbol.AccessLevel.PUBLIC);
        }
        ast.getInitializer().accept(this);
    }

    public void visitInOrder() {
        program.topologicalSort();
        for (ClassSymbol cls : program.getAllClasses()) {
            if (cls.isTop()) {
                cls.visit(this);
            }
        }
    }

    private boolean validAnnotationReturnType(Type type) {
        if (type instanceof PrimitiveType ||
            type.equals(fetch("String")) ||
            type.equals(fetch("Class"))) {
            return true;
        } else if (type instanceof ParameterizedType) {
            return type.getClassSymbol().equals(fetch("Class"));
        } else if (type instanceof ClassSymbol) {
            ClassSymbol sym = (ClassSymbol)type;
            return sym.isEnum() || sym.isAnnotation();
        }
        return false;
    }
}
