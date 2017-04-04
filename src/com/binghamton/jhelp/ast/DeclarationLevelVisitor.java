package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.ParameterizedType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.ReferenceType;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.WildcardType;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;
import static com.binghamton.jhelp.ast.NameExpression.Kind;

/**
 * The top level Visitor for visiting top-level declarations and adding them to
 * the symbol table
 */
public class DeclarationLevelVisitor extends FileLevelVisitor {

    public DeclarationLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        Expression lhs = ast.getLHS();
        NameExpression rhs = ast.getRHS();

        lhs.accept(this);
        // rhs.accept(this);

        Type lType = lhs.getType();
        String rName = rhs.getName();

        if (lType != null) {
            Type type = lType.getClassSymbol().getType(rName);
            if (type == null) {
                System.err.println("unknown type " + ast.getText());
            } else {
                ast.setType(type);
            }
        } else {
            // if not typed yet, must name Package or part of a Package
            Package curPkg = program.getPackage(lhs.getText());
            if (curPkg != null) {
                ClassSymbol cls = curPkg.getClass(rName);
                if (cls != null) {
                    ast.setType(cls);
                } else {
                    rhs.setKind(Kind.PACKAGE);
                }
            } else {
                rhs.setKind(Kind.PACKAGE);
            }
        }
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        Expression expr = ast.getTypeExpression();
        expr.accept(this);
        Type type = expr.getType();
        if (!type.getClassSymbol().isAnnotation()) {
            System.err.println("can only use an annotation type as an annotation");
        }
        ast.setType(type);
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        visitInnerBodies(ast);
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
                System.err.println("inner body cannot have same name as one of its enclosing classes");
                break;
            }
            enclosingSym = enclosingSym.getDeclaringClass();
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        if (ast.hasTypeParameters()) {
            for (TypeParameter p : ast.getTypeParameters()) {
                p.accept(this);
            }
        }

        if (ast.hasSuperClass()) {
            ast.getSuperClass().accept(this);
            ClassSymbol superCls = ast.getSuperClass().getType().getClassSymbol();
            if (superCls.equals(fetch("Enum"))) {
                System.err.println("cannot directly subclass java.lang.Enum");
            } else if (superCls.isInterfaceLike()) {
                System.err.println("cannot subclass interface or annotation");
            } else if (superCls.hasModifier(Modifier.FINAL)) {
                System.err.println("cannot subclass a final class or simple enum");
            } else {
                currentClass.setSuperClass(ast.getSuperClass().getType());
            }
        }
        visitInnerBodies(ast);
    }

    /**
     * Visit a ClassLiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteralExpression ast) {
        // TODO
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
            decl.accept(this);
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

        if (currentClass.hasModifier(Modifier.FINAL) ||
            currentClass.hasModifier(Modifier.ABSTRACT)) {
            System.err.println("an enum cannot be final nor abstract");
        }

        boolean isFinal = true;
        for (EnumConstant c : ast.getConstants()) {
            if (!c.isEmpty()) {
                isFinal = false;
            }
        }
        if (isFinal) {
            currentClass.addModifier(Modifier.FINAL);
        }
        visitInnerBodies(ast);
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        if (ast.hasTypeParameters()) {
            for (TypeParameter p : ast.getTypeParameters()) {
                p.accept(this);
            }
        }

        if (ast.hasSuperInterfaces()) {
            addInterfaces(ast.getSuperInterfaces());
        }
        visitInnerBodies(ast);
    }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast) {
        ast.getDeclaration().accept(this);
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
        boolean reclassed = false;

        if (kind == Kind.AMBIGUOUS) {
            reclassed = true;
            if (!ast.isQualified()) {
                Type type = currentClass.getType(name);
                if (type != null) {
                    ast.setKind(Kind.TYPE);
                    type.setAnnotations(anns);
                    ast.setType(type);
                } else {
                    ast.setKind(Kind.PACKAGE);
                }
            } else {
                NameExpression qual = ast.getQualifyingName();
                qual.accept(this);
                if (qual.getKind() == Kind.PACKAGE) {
                    ClassSymbol cls = qual.getPackage().getClass(rName);
                    if (cls != null) {
                        ast.setKind(Kind.TYPE);
                        cls.setAnnotations(anns);
                        ast.setType(cls);
                    } else {
                        ast.setKind(Kind.PACKAGE);
                    }
                } else if (qual.getKind() == Kind.TYPE) {
                    Type type = qual.getType().getClassSymbol().getType(rName);
                    if (type != null) {
                        ast.setKind(Kind.TYPE);
                        type.setAnnotations(anns);
                        ast.setType(type);
                    } else {
                        System.err.println("unknown type " + rName);
                    }
                }
            }
        } else if (kind == Kind.PACKAGE_OR_TYPE) {
            reclassed = true;
            if (!ast.isQualified()) {
                Type type = currentClass.getType(name);
                if (type != null) {
                    ast.setKind(Kind.TYPE);
                    type.setAnnotations(anns);
                    ast.setType(type);
                } else {
                    ast.setKind(Kind.PACKAGE);
                }
            } else {
                NameExpression qual = ast.getQualifyingName();
                qual.accept(this);
                if (qual.getKind() == Kind.TYPE) {
                    Type type = qual.getType().getClassSymbol().getType(rName);
                    if (type != null) {
                        ast.setKind(Kind.TYPE);
                        type.setAnnotations(anns);
                        ast.setType(type);
                    } else {
                        ast.setKind(Kind.PACKAGE);
                    }
                } else {
                    ClassSymbol cls = qual.getPackage().getClass(rName);
                    if (cls != null) {
                        ast.setKind(Kind.TYPE);
                        cls.setAnnotations(anns);
                        ast.setType(cls);
                    } else {
                        ast.setKind(Kind.PACKAGE);
                    }
                }
            }
        }

        // allow those just reclassified to be resolved
        kind = ast.getKind();
        if (kind == Kind.TYPE) {
            if (!ast.isQualified()) {
                Type type = currentClass.getType(name);
                if (type != null) {
                    type.setAnnotations(anns);
                    ast.setType(type);
                }
            } else {
                NameExpression qual = ast.getQualifyingName();
                if (!reclassed) {
                    qual.accept(this);
                }
                if (qual.getKind() == Kind.TYPE) {
                    Type type = qual.getType().getClassSymbol().getType(rName);
                    if (type != null) {
                        type.setAnnotations(anns);
                        ast.setType(type);
                    }
                } else {
                    ClassSymbol cls = qual.getPackage().getClass(rName);
                    if (cls != null) {
                        cls.setAnnotations(anns);
                        ast.setType(cls);
                    }
                }
            }
            if (ast.getType() == null) {
                System.err.println("unknown type " + name);
            }
        } else if (kind == Kind.PACKAGE) {
            Package pkg = program.getPackage(name);
            if (pkg != null) {
                ast.setPackage(pkg);
            }
            // cannot throw error yet, java.lang.Package will say there is no
            // package named java, must wait and hoist from Access
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

        if (!rawType.getClassSymbol().isGeneric()) {
            System.err.println("cannot parameterize a non-generic class");
        }

        List<TypeArgument> args = ast.getTypeArguments();
        Type[] tArgs = new Type[args.size()];
        int pos = 0;
        for (TypeArgument arg : args) {
            arg.accept(this);
            tArgs[pos] = arg.getType();
            ++pos;
        }
        ast.setType(new ParameterizedType(rawType, tArgs));
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        if (ast.isWildcard()) {
            WildcardType type = new WildcardType();
            if (ast.hasExplicitBound()) {
                ast.getBoundType().accept(this);
                type = new WildcardType(ast.isUpperBounded(),
                                        (ReferenceType)ast.getBoundType().getType());
            } else {
                type = new WildcardType();
            }
            type.setAnnotations(makeAnnotations(ast.getAnnotations()));
            ast.setType(type);
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

    protected void visitInnerBodies(BodyDeclaration ast) {
        MyClassSymbol tmp = currentClass;
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            currentClass = tmp;
            c.accept(this);
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            currentClass = tmp;
            a.accept(this);
        }
        currentClass = tmp;
    }

    private void addInterfaces(List<Expression> interfaces) {
        Type cur;
        for (Expression expr : interfaces) {
            expr.accept(this);
            cur = expr.getType();
            if (cur.getClassSymbol().isClassLike()) {
                System.err.println("cannot implement a class or enum");
            } else {
                currentClass.addInterface(cur);
            }
        }
    }

    protected AnnotationSymbol[] makeAnnotations(Annotation[] annotations) {
        AnnotationSymbol[] ret = new AnnotationSymbol[annotations.length];
        for (int i = 0; i < ret.length; i++) {
            annotations[i].accept(this);
            ret[i] = new AnnotationSymbol((ClassSymbol)annotations[i].getType());
        }
        return ret;
    }
}
