package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.ParameterizedType;
import com.binghamton.jhelp.Program;
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

    /**
     * Constructs a DeclarationLevelVisitor for a given Program
     * @param program the Program to visit
     */
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
        // rhs is guaranteed to be unqualified NameExpression
        // instead of visiting, we just hoist its data

        Type lType = lhs.getType();
        String rName = rhs.getName();

        if (lType != null) {
            Type type = lType.getClassSymbol().getType(rName);
            if (type == null) {
                addError("unknown type " + ast.getText());
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
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        // override to do nothing
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
                addError("inner body cannot have same name as one of its enclosing classes");
                break;
            }
            enclosingSym = enclosingSym.getDeclaringClass();
        }

        if (currentClass.isInner() &&
            currentClass.getDeclaringClass().isInterfaceLike()) {

            currentClass.addModifier(Modifier.PUBLIC);
            currentClass.addModifier(Modifier.STATIC);
            currentClass.setAccessLevel(ClassSymbol.AccessLevel.PUBLIC);

            if (currentClass.hasModifier(Modifier.PROTECTED) ||
                currentClass.hasModifier(Modifier.PRIVATE)) {
                addError("a member type in an interface cannot be protected or private");
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
                addError("cannot directly subclass java.lang.Enum");
            } else if (superCls.isInterfaceLike()) {
                addError("cannot subclass interface or annotation");
            } else if (superCls.hasModifier(Modifier.FINAL)) {
                addError("cannot subclass a final class or simple enum");
            } else {
                currentClass.setSuperClass(ast.getSuperClass().getType());
            }
        }
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
            addError("an enum cannot be final nor abstract");
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
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        // override to do nothing
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
        Type type;
        NameExpression qual = ast.getQualifyingName();
        if (kind == Kind.PACKAGE) {
            Package pkg = program.getPackage(name);
            if (pkg != null) {
                ast.setPackage(pkg);
            } else if (!ast.isQualified()) {
            }
            // cannot throw error yet, must wait and hoist from Access
        } else {
            if (!ast.isQualified()) {
                type = currentClass.getType(name);
            } else {
                if (qual.getKind() == Kind.PACKAGE_OR_TYPE) {
                    qual.accept(this);
                }
                if (qual.getKind() == Kind.PACKAGE) {
                    type = qual.getPackage().getClass(rName);
                } else {
                    type = qual.getType().getClassSymbol().getType(rName);
                }
            }
            if (type != null) {
                ast.setKind(Kind.TYPE);
                type.setAnnotations(anns);
                ast.setType(type);
            } else {
                if (kind == Kind.TYPE || !ast.isQualified()) {
                    addError("unknown type " + name);
                } else {
                    ast.setKind(Kind.PACKAGE);
                }
            }
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
                addError("cannot parameterize a non-generic class");
            }
        } else {
            addError("only classes or interfaces may be parameterized");
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

    private void addInterfaces(List<Expression> interfaces) {
        Type cur;
        for (Expression expr : interfaces) {
            expr.accept(this);
            cur = expr.getType();
            if (cur.getClassSymbol().isClassLike()) {
                addError("cannot implement a class or enum");
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
