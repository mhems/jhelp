package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.error.UnimplementedFeatureWarning;
import com.binghamton.jhelp.symbols.AnnotationSymbol;
import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.symbols.MyClassSymbol;
import com.binghamton.jhelp.types.ArrayType;
import com.binghamton.jhelp.types.ParameterizedType;
import com.binghamton.jhelp.types.PrimitiveType;
import com.binghamton.jhelp.types.ReferenceType;
import com.binghamton.jhelp.types.Type;
import com.binghamton.jhelp.types.TypeVariable;
import com.binghamton.jhelp.types.WildcardType;
import com.binghamton.jhelp.util.Logger;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * The top level Visitor for visiting top-level declarations and adding them to
 * the symbol table
 */
public class DeclarationLevelVisitor extends FileLevelVisitor {

    /**
     * Constructs a DeclarationLevelVisitor for a given Program
     * @param program the Program to visit
     */
    public DeclarationLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        currentClass.establishInheritanceHierarchy();
    }

    /**
     * Visit a ArrayTypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayTypeExpression ast) {
        Type arrayType;
        ast.getExpression().accept(this);
        arrayType = ast.getExpression().getType();
        for (Dimension dim : ast.getDimensions()) {
            arrayType = new ArrayType(arrayType,
                                      makeAnnotations(dim.getAnnotations()));
            arrayType.setProgram(program);
        }
        ast.setType(arrayType);
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        currentClass = ast.getSymbol();
        ClassSymbol enclosingSym = currentClass.getDeclaringClass();
        while (enclosingSym != null) {
            if (enclosingSym.getName().equals(currentClass.getName())) {
                addError(currentClass.getToken(),
                         "An inner body cannot have the same name as one of its enclosing classes",
                         String.format("Rename the inner body or enclosing class to have a name other than '%s'",
                                       currentClass.getName()));
                break;
            }
            enclosingSym = enclosingSym.getDeclaringClass();
        }

        if (currentClass.isInner() &&
            currentClass.getDeclaringClass().isInterfaceLike()) {

            currentClass.addModifier(Modifier.PUBLIC);
            currentClass.addModifier(Modifier.STATIC);
            currentClass.setAccessLevel(ClassSymbol.AccessLevel.PUBLIC);

            if (currentClass.hasModifier(Modifier.PROTECTED)) {
                addError(currentClass.getModifier(Modifier.PROTECTED),
                         "A member type in an interface cannot be protected",
                         String.format("Remove the protected modifier on '%s'",
                                       currentClass.getName()));
            }
            if (currentClass.hasModifier(Modifier.PRIVATE)) {
                addError(currentClass.getModifier(Modifier.PRIVATE),
                         "A member type in an interface cannot be private",
                         String.format("Remove the private modifier on '%s'",
                                       currentClass.getName()));
            }
        }

        MyClassSymbol tmp = currentClass;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = tmp;
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        if (ast.hasSuperClass()) {
            ast.getSuperClass().accept(this);
            ClassSymbol superCls = ast.getSuperClass().getType().getClassSymbol();
            if (superCls.equals(fetch("Enum"))) {
                addError(ast.getName(),
                         "A class cannot directly subclass java.lang.Enum",
                         String.format("Use 'enum' instead of 'class' when declaring '%s'",
                                       ast.getName().getText()));
            } else if (superCls.isInterfaceLike()) {
                addError(ast.getSuperClass(),
                         "A class can only subclass other classes, not interfaces",
                         "Do you mean 'implements' instead of 'extends'?");
            } else if (superCls.hasModifier(Modifier.FINAL)) {
                addError(ast.getName(),
                         String.format("A class cannot extend the final class '%s'",
                                       superCls.getName()),
                         String.format("If you have access to the source code of '%s', remove the 'final' modifier, otherwise '%s' cannot subclass '%s'",
                                       superCls.getName(),
                                       currentClass.getName(),
                                       superCls.getName()));
            } else {
                currentClass.setSuperClass(ast.getSuperClass().getType());
            }
        } else {
            currentClass.setSuperClassForClass();
        }
        currentClass.establishInheritanceHierarchy();
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        pkg = ast.getPackage();
        if (ast.hasPackage()) {
            ast.getPackageStatement().accept(this);
        }

        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            try {
                decl.accept(this);
            } catch (Exception e) {
                Logger.log(e);
            }
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        if (ast.hasSuperInterfaces()) {
            addInterfaces(ast.getSuperInterfaces());
        }
    }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        currentClass.addModifier(Modifier.STATIC);

        if (currentClass.hasModifier(Modifier.FINAL)) {
            addError(currentClass.getModifier(Modifier.FINAL),
                     "An enum cannot be final",
                     String.format("Remove the 'final' modifier on '%s'",
                                   currentClass.getName()));
        }
        if (currentClass.hasModifier(Modifier.ABSTRACT)) {
            addError(currentClass.getModifier(Modifier.ABSTRACT),
                     "An enum cannot be abstract",
                     String.format("Remove the 'abstract' modifier on '%s'",
                                   currentClass.getName()));
        }

        if (currentClass.isInner() &&
            currentClass.isEnum() &&
            currentClass.getDeclaringClass().isEnum()) {
            currentClass.addModifier(Modifier.STATIC);
        }

        boolean isFinal = true;
        MyClassSymbol decl = currentClass;
        for (EnumConstant c : ast.getConstants()) {
            if (!c.isEmpty()) {
                isFinal = false;
            }
            currentClass = decl;
        }
        if (isFinal) {
            currentClass.addModifier(Modifier.FINAL);
        }
        currentClass.establishInheritanceHierarchy();
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        if (ast.hasSuperInterfaces()) {
            addInterfaces(ast.getSuperInterfaces());
        }
        currentClass.establishInheritanceHierarchy();
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        super.visit(ast);
        if (ast.getType() != null) {
            ast.getType().setAnnotations(makeAnnotations(ast.getAnnotations()));
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        pkg.setAnnotations(makeAnnotations(ast.getAnnotations()));
    }

    /**
     * Visit a ParamExpression node
     * @param ast the AST node being visited
     */
    public void visit(ParamExpression ast) {
        Expression raw = ast.getExpression();
        raw.accept(this);
        Type rawType = raw.getType();

        if (rawType instanceof ClassSymbol) {
            ClassSymbol sym = (ClassSymbol)rawType;
            if (sym.isGeneric()) {
                List<TypeArgument> args = ast.getTypeArguments();
                if (args.size() > 0) {
                    Type[] tArgs = new Type[args.size()];
                    int pos = 0;
                    for (TypeArgument arg : args) {
                        arg.accept(this);
                        tArgs[pos] = arg.getType();
                        if (arg.getType() instanceof PrimitiveType) {
                            addError(arg,
                                     String.format("Cannot specify the primitive type '%s' as a type argument",
                                                   arg.getType().getName()),
                                     String.format("Specify '%s' instead of '%s'",
                                                   arg.getType().box().getName(),
                                                   arg.getType().getName()));
                        }
                        ++pos;
                    }
                    ast.setType(new ParameterizedType(sym, tArgs));
                    ast.getType().setProgram(program);
                } else {
                    Type iType = ast.getInferredType();
                    if (iType != null) {
                        ast.setType(new ParameterizedType(sym,
                                                          ((ParameterizedType)iType).getParameters()));
                        ast.getType().setProgram(program);
                    }
                }
            } else {
                addError(ast,
                         String.format("Cannot parameterize (give type arguments to) the non-generic class '%s'",
                                       sym.getName()),
                         "Remove the type arguments or declare " + sym.getName() + " to be generic");
            }
        } else {
            addError(ast,
                     "Only classes and interfaces may be parameterized",
                     "Remove the type arguments");
        }
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        if (ast.isWildcard()) {
            WildcardType type;
            if (ast.hasExplicitBound()) {
                ast.getBoundType().accept(this);
                type = new WildcardType(ast.isUpperBounded(),
                                        (ReferenceType)ast.getBoundType().getType());
            } else {
                type = new WildcardType();
            }
            type.setProgram(program);
            type.setAnnotations(makeAnnotations(ast.getAnnotations()));
            ast.setType(type);
            addError(new UnimplementedFeatureWarning(ast.getWildCard(),
                         "Wildcards may not fully typecheck"));
        }
        else {
            ast.getTypeExpression().accept(this);
            ast.setType(ast.getTypeExpression().getType());
        }
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        TypeVariable type = ast.getType();
        if (ast.hasSuperTypes()) {
            Type[] bounds = new Type[ast.getSuperTypes().size()];
            int pos = 0;
            for (Expression rt : ast.getSuperTypes()) {
                rt.accept(this);
                bounds[pos] = rt.getType();
                ++pos;
            }
            type.setBounds(bounds);
        }
        type.setAnnotations(makeAnnotations(ast.getAnnotations()));
    }

    /**
     * Makes AnnotationSymbols from Annotation ASTs
     * @param annotations the annotation ASTs to visit
     * @return the AnnotationSymbols constructed from the visited ASTs
     */
    protected AnnotationSymbol[] makeAnnotations(Annotation[] annotations) {
        AnnotationSymbol[] ret = new AnnotationSymbol[annotations.length];
        for (int i = 0; i < ret.length; i++) {
            annotations[i].accept(this);
            ret[i] = new AnnotationSymbol(annotations[i].getType());
        }
        return ret;
    }

    /**
     * Resolves interface types and adds them to the current class
     * @param interfaces the Expressions housing the interface types
     */
    private void addInterfaces(List<Expression> interfaces) {
        Type cur;
        for (Expression expr : interfaces) {
            expr.accept(this);
            cur = expr.getType();
            if (cur.getClassSymbol().isClassLike()) {
                addError(expr,
                         "You can only implement interfaces, not classes",
                         "Do you mean 'extends' instead of 'implements'?");
            } else {
                currentClass.addInterface(cur);
            }
        }
    }
}
