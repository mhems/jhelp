package com.binghamton.jhelp.ast;

import java.util.HashSet;
import java.util.Set;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
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

    /**
     * Constructs a BodyLevelVisitor for a given Program
     * @param program the Program to visit
     */
    public BodyLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        Expression arg;
        ClassSymbol ann;

        ast.getTypeExpression().accept(this);
        ann = ast.getTypeExpression().getType().getClassSymbol();
        if (!ann.isAnnotation()) {
            addError(ast,
                     "Can only annotate with an annotation type",
                     "Declare " + ann.getName() + " to be an annotation");
        }
        ast.setType(ann);
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        ClassSymbol objCls = fetch("Object");
        ClassSymbol annoCls = fetch("java.lang.annotation.Annotation");
        MethodSymbol refMethod;
        for (MethodSymbol method : currentClass.getDeclaredMethods()) {
            refMethod = objCls.getMethod(method);
            if (refMethod == null) {
                refMethod = annoCls.getMethod(method);
            }
            if (refMethod != null && refMethod.getAccessLevel().compareTo(Symbol.AccessLevel.PROTECTED) <= 0) {
                addError(((MyMethodSymbol)method).getToken(),
                         "An annotation cannot declare an element that is override-equivalent to a method in Object or Annotation",
                         "Change the method to not override");
            }
            if (method.getReturnType().equals(currentClass)) {
                addError(((MyMethodSymbol)method).getToken(),
                         "An annotation cannot declare an element of its own type",
                         "Remove the element or change its return type");
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

        visitMembers(ast, this);

        MyClassSymbol tmp = currentClass;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = tmp;
            if (currentClass.isInner() && body.getSymbol().isStatic()) {
                addError(body.getName(),
                         "Static bodies cannot be declared inside inner classes",
                         "Mark the class as not static or move it outside the inner class");
            }
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (MethodDeclaration ctor : ast.getConstructors()) {
            ctor.accept(this);
            currentClass.addConstructor(ctor.getSymbol());
        }

        if (currentClass.getConstructors().length == 0 &&
            !currentClass.isAnonymous()) {
            MyMethodSymbol emptyCtor = new MyMethodSymbol(currentClass.getName());
            emptyCtor.setProgram(program);
            if (currentClass.getAccessLevel() != Symbol.AccessLevel.PRIVATE &&
                currentClass.isMember()) {
                emptyCtor.setParameterTypes(currentClass.getDeclaringClass());
            }
            emptyCtor.setAccessLevel(currentClass.getAccessLevel());
            emptyCtor.setConstructor(true);
            emptyCtor.setDeclaringClass(currentClass);
            emptyCtor.setReturnType(currentClass);
            emptyCtor.constructType();
            currentClass.addConstructor(emptyCtor);
        }

        if (currentClass.isClassLike() && !currentClass.isAbstract()) {
            for (MethodSymbol m : currentClass.getUnimplementedMethods()) {
                addError(currentClass.getToken(),
                         "Cannot leave method " + m.getName() + " unimplemented",
                         "Implement the method " + m.getName());
            }
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        if (currentClass.isAnonymous()) {
            MyMethodSymbol emptyCtor = new MyMethodSymbol(currentClass.getName());
            emptyCtor.setProgram(program);
            Type[] paramTypes = ast.getAnonymousParameterTypes();
            ClassSymbol superCls = currentClass.getDeclaringClass();
            if (superCls.isInner() || superCls.isMember()) {
                Type[] newParamTypes = new Type[paramTypes.length + 1];
                newParamTypes[0] = superCls.getDeclaringClass();
                System.arraycopy(paramTypes, 0,
                                 newParamTypes, 1,
                                 paramTypes.length);
                paramTypes = newParamTypes;
            }
            emptyCtor.setAccessLevel(Symbol.AccessLevel.PRIVATE);
            emptyCtor.setConstructor(true);
            emptyCtor.setDeclaringClass(currentClass);
            emptyCtor.setReturnType(currentClass);
            emptyCtor.setParameterTypes(paramTypes);
            emptyCtor.constructType();
            currentClass.addConstructor(emptyCtor);
        }
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
        var.setProgram(program);
        var.setDeclaringClass(currentClass);
        var.setType(currentClass);
        ast.setSymbol(var);
        // delay visiting potential body until code-level, where we will
        // determine which constructor of superclass is being invoked
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
                addError(((MyMethodSymbol)ctor).getToken(),
                         "An enum cannot have a public or protected constructor",
                         "Remove the forbidden modifier");
            }
        }
        boolean hasAbstract = false;
        for (MethodSymbol method : currentClass.getDeclaredMethods()) {
            if (method.isAbstract()) {
                hasAbstract = true;
                break;
            }
            if (method.getName().equals("finalize") && method.overrides(FINALIZE)) {
                addError(((MyMethodSymbol)method).getToken(),
                         "An enum cannot have a finalizer as it cannot be finalized",
                         "Remove the 'finalize' method");
            }
        }
        if (hasAbstract && (ast.getConstants().size() == 0 || !allEmpty)) {
            addError(ast.getName(),
                     "An enum with constants with bodies cannot have abstract methods",
                     "Remove the 'abstract' modifier from all methods or do not declare any constants with bodies");
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        ClassSymbol objCls = fetch("Object");
        MethodSymbol objMethod;
        for (MethodSymbol method : currentClass.getDeclaredMethods()) {
            objMethod = objCls.getMethod(method);
            if (method.hasModifier(Modifier.DEFAULT) &&
                objMethod != null &&
                objMethod.getAccessLevel() != Symbol.AccessLevel.PRIVATE) {
                addError(((MyMethodSymbol)method).getToken(),
                         "The default method of an interface cannot be override-equivalent to non-private method of Object",
                         "Change the method signature or provide no implementation");
            }
        }


        MethodSymbol currentMethod;
        for (MethodSymbol method : objCls.getDeclaredMethods()) {
            currentMethod = currentClass.getDeclaredMethod(method);
            if (currentMethod != null) {
                if (method.getAccessLevel() == Symbol.AccessLevel.PUBLIC &&
                    !currentMethod.isAbstract()) {
                    addError(((MyMethodSymbol)currentMethod).getToken(),
                             "An interface cannot declare a method when that method is a final method of Object",
                             "Change the method signature to no longer override the method of Object");
                }
            } else if (method.getAccessLevel() == Symbol.AccessLevel.PUBLIC &&
                       !currentClass.hasInterfaces()) {
                currentMethod = new MethodSymbol(method);
                currentMethod.addModifier(Modifier.ABSTRACT);
                currentClass.addMethod(currentMethod);
            }
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        MyMethodSymbol method = new MyMethodSymbol(ast.getName(), ast.getModifiers());
        method.setProgram(program);
        int pos;

        ast.setSymbol(method);
        method.setDeclaringClass(currentClass);
        method.setAnnotations(makeAnnotations(ast.getAnnotations()));

        if (currentClass.isClass()) {
            if (method.isAbstract()) {
                Modifiers mods = method.getModifiers();
                for (Modifier bad : FORBIDDEN) {
                    if (mods.contains(bad)) {
                        addError(ast.getName(),
                                 "A method cannot both be abstract and " + bad,
                                 String.format("Remove either the 'abstract' or '%s' modifier",
                                               bad));
                    }
                }
                if (!ast.getBody().isNil()) {
                    addError(ast.getName(),
                             "An abstract method must have no body",
                             "Remove the body or the 'abstract' modifier");
                }
                if (!currentClass.isAbstract()) {
                    addError(ast.getName(),
                             "A class with an abstract method must be declared abstract",
                             "Add an 'abstract' modifier to the class or remove this abstract method");
                }
            }
            if (method.hasModifier(Modifier.NATIVE)) {
                if (!ast.getBody().isNil()) {
                    addError(ast.getName(),
                             "A native method must have no body",
                             "Remove the body or the 'native' modifier");
                }
                if (method.hasModifier(Modifier.STRICT_FP)) {
                    addError(ast.getName(),
                             "A method cannot both be native and strictfp",
                             "Remove the 'native' or 'strictfp' modifier");
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
                    addError(ast.getName(),
                             "An interface method cannot both be abstract and strictfp",
                             "Remove the 'abstract' or 'strictfp' modifiers");
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
                addError(ast.getName(),
                         "A default or static method in an interface must have a body",
                         "Specify a body or remove the 'default' or 'static' modifier");
            }

            if (method.isAbstract() && !ast.getBody().isNil()) {
                addError(ast.getName(),
                         "An interface method cannot have a body unless that method is default is static",
                         "Add a 'default' or 'static' modifier or specify no body");
            }

            if (count > 1) {
                addError(ast.getName(),
                         "An interface method can only have one of the 'abstract', 'default', and 'static' modifiers",
                    "Remove the extra modifiers so only one is present");
            }
            // TODO 9.4.1.3
        }

        if (currentClass.isClassLike() &&
            ast.getBody().isNil() &&
            !method.isAbstract() &&
            !method.hasModifier(Modifier.NATIVE)) {
            addError(ast.getName(),
                     "A method with no body must be abstract or native",
                     "Add a 'abstract' or 'native' modifier or specify a body");
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
                    addError(v.getName(),
                             "A parameter with that name already exists",
                             "Rename or remove one of the parameters");
                }
                v.getExpression().accept(this);
                paramTypes[pos] = v.getExpression().getType();
                ++pos;
            }
        }
        method.setParameterTypes(paramTypes);
        if (ast.isVariadic()) {
            method.setVariadic(true);
        }

        Type[] excTypes = new Type[ast.getExceptions().size()];
        pos = 0;
        for (Expression ex : ast.getExceptions()) {
            ex.accept(this);
            excTypes[pos] = ex.getType();
            if (!excTypes[pos].isSubTypeOf(fetch("Throwable"))) {
                addError(ex,
                         "A method can only throw classes that extend java.lang.Throwable",
                         "Make the class being thrown an exception or remove it from the throws clause");
            }
            ++pos;
        }
        method.setExceptionTypes(excTypes);

        if (ast.isConstructor()) {
            if (!method.getName().equals(currentClass.getName())) {
                addError(ast.getName(),
                         "Constructors must have the same name as the class they are declared in",
                         "Change the name to " + currentClass.getName() + " or specify a return type if you meant to declare a constructor");
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
                addError(ret,
                         "An annotation element cannot have type " + type,
                         "Change the element type to an acceptable type, such as a primitive or String");
            }
        }

        method.constructType();

        if (method.isStatic()) {
            int index = 0;
            for (Type type : paramTypes) {
                if (type instanceof TypeVariable &&
                    !method.equals(((TypeVariable)type).getDeclaringSymbol())) {
                    addError(ast.getTypeParameters().get(index),
                             "A static method cannot use any type variables except those it declares",
                             "Declare a method type variable named " + type.getName());
                }
                ++index;
            }
            if (currentClass.isInterfaceLike()) {
                for (Type intf : currentClass.getInterfaces()) {
                    for (MethodSymbol m : intf.getClassSymbol().getMethodsByName(method.getName())) {
                        if (!m.isStatic() && method.hasSameSubsignature(m)) {
                            addError(((MyMethodSymbol)m).getToken(),
                                     "A static method in an interface cannot hide an instance method of a super interface",
                                     "Change the method signature so that it no longer overrides");
                        }
                    }
                }
            }
        }
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        if (ast.getKind() == Kind.TYPE &&
            !ast.isQualified() &&
            PrimitiveType.isPrimitiveName(ast.getToken().getText())) {
            Type type = new PrimitiveType(ast.getToken());
            type.setAnnotations(makeAnnotations(ast.getAnnotations()));
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
        // override to do nothing
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
        type.setProgram(program);
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
        var.setProgram(program);
        var.setKind(VariableSymbol.VariableKind.FIELD);
        ast.setSymbol(var);
        var.setDeclaringClass(currentClass);
        ast.getExpression().accept(this);
        var.setType(ast.getExpression().getType());

        if (var.isFinal() &&
            var.hasModifier(Modifier.VOLATILE)) {
            addError(ast.getName(),
                     "A field cannot both be 'final' and 'volatile'",
                     "Remove the 'final' or 'volatile' modifier");
        }

        if (currentClass.isInterfaceLike()) {
            var.addModifier(Modifier.PUBLIC);
            var.addModifier(Modifier.STATIC);
            var.addModifier(Modifier.FINAL);
            var.setAccessLevel(Symbol.AccessLevel.PUBLIC);
        }
    }

    public void visitInOrder() {
        for (ClassSymbol cls : program.getAllClasses()) {
            if (cls.isTop()) {
                currentUnit = cls.getCompilationUnit();
                cls.visit(this);
            }
        }
    }

    protected void visitMembers(BodyDeclaration ast, ASTVisitor visitor) {
        for (VariableDeclaration v : ast.getFields()) {
            v.accept(visitor);
            currentClass.addField(v.getSymbol());
            if (currentClass.isInner() &&
                v.getSymbol().isStatic() &&
                !v.getSymbol().isConstant()) {
                addError(v.getName(),
                         "Non-constant static fields cannot be declared inside an inner class",
                         "Change the field's declaration or value, or move the field outside the inner class");
            }
        }
        for (MethodDeclaration m : ast.getMethods()) {
            m.accept(visitor);
            currentClass.addMethod(m.getSymbol());
            if (currentClass.isInner() && m.getSymbol().isStatic()) {
                addError(m.getName(),
                         "Static methods cannot be declared inside an inner class",
                         "Remove the method's 'static' modifier or move the method outside the inner class");
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
