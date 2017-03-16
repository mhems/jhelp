package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.ParameterizedType;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.WildcardType;

/**
 * The top level Visitor for visiting top-level declarations and adding them to
 * the symbol table
 */
public class DeclarationLevelVisitor extends FileLevelVisitor {

    protected MyClassSymbol currentClass;

    public DeclarationLevelVisitor(Program program) {
        super(program);
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        ast.getLHS().accept(this);

        Type parent = ast.getLHS().getType();
        ClassSymbol sym = parent.getClassSymbol();
        Expression rhs = ast.getRHS();
        if (!(rhs instanceof IdentifierExpression)) {
            System.err.println("unknown rhs type: " + ast.getRHS().getText());
            return;
        }

        for (ClassSymbol inner : sym.getInnerClasses()) {
            if (inner.getName().equals(rhs.getText())) {
                ast.setType(inner);
                break;
            }
        }
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
        currentClass = (MyClassSymbol)ast.getSymbol();

        ClassSymbol enclosingSym = currentClass.getDeclaringClass();
        while (enclosingSym != null) {
            if (enclosingSym.getName().equals(currentClass.getName())) {
                System.err.println("inner body cannot have same name as one of its enclosing classes");
                break;
            }
            enclosingSym = enclosingSym.getDeclaringClass();
        }

        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            c.accept(this);
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            a.accept(this);
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        if (ast.hasTypeParameters()) {
            currentClass.setTypeParameters(makeTypeParameters(ast.getTypeParameters()));
        }
        if (ast.hasSuperClass()) {
            ast.getSuperClass().accept(this);
            ClassSymbol superCls = ast.getSuperClass().getType().getClassSymbol();
            if (superCls.isEnum()) {
                System.err.println("cannot subclass java.lang.Enum");
            } else if (superCls.isInterfaceLike()) {
                System.err.println("cannot subclass interface or annotation");
            } else if (superCls.getModifiers().contains(Modifier.FINAL)) {
                System.err.println("cannot subclass a final class");
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
        if (ast.hasPackage()) {
            ast.getPackage().accept(this);
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
            currentClass.setInterfaces(makeInterfaces(ast.getSuperInterfaces()));
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
        currentClass.getModifiers().addModifier(Modifier.STATIC);
        boolean isFinal = true;
        for (EnumConstant c : ast.getConstants()) {
            if (!c.isEmpty()) {
                isFinal = false;
                break;
            }
        }
        if (isFinal) {
            currentClass.getModifiers().addModifier(Modifier.FINAL);
        }
    }

    /**
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) {
        String id = ast.getIdentifier().getText();
        AnnotationSymbol[] anns = makeAnnotations(ast.getAnnotations());
        ClassSymbol sym = pkg.getClassTable().get(id);
        if (sym != null) {
            ast.setType(sym);
        } else {
            try {
                ast.setType(currentClass.getImportManager().importSymbol(id));
            } catch (ClassNotFoundException e) {
                TypeVariable var = currentClass.getTypeVariable(id);
                if (var != null) {
                    ast.setType(var);
                } else {
                    System.err.println("unknown symbol '" + id + "'");
                }
            }
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        if (ast.hasTypeParameters()) {
            currentClass.setTypeParameters(makeTypeParameters(ast.getTypeParameters()));
        }
        if (ast.hasSuperInterfaces()) {
            currentClass.setInterfaces(makeInterfaces(ast.getSuperInterfaces()));
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        pkg = program.getPackage(ast.getName());
        pkg.setAnnotations(makeAnnotations(ast.getAnnotations()));
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
                                        ast.getBoundType().getType());
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
     * Visit a TypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(TypeExpression ast) {
        Expression raw = ast.getExpression();
        raw.accept(this);

        List<TypeArgument> args = ast.getTypeArguments();
        Type[] tArgs = new Type[args.size()];
        int pos = 0;
        for (TypeArgument arg : args) {
            arg.accept(this);
            tArgs[pos] = arg.getType();
            ++pos;
        }
        ast.setType(new ParameterizedType(raw.getType(), tArgs));
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

    private TypeVariable[] makeTypeParameters(List<TypeParameter> params) {
        TypeVariable[] ret = new TypeVariable[params.size()];
        for (int i = 0; i < ret.length; i++) {
            params.get(i).accept(this);
            ret[i] = (TypeVariable)params.get(i).getType();
        }
        return ret;
    }

    private Type[] makeInterfaces(List<Expression> interfaces) {
        Set<ClassSymbol> set = new HashSet<>();
        Type[] ret = new Type[interfaces.size()];
        for (int i = 0; i < ret.length; i++) {
            interfaces.get(i).accept(this);
            ret[i] = interfaces.get(i).getType();
            if (ret[i].getClassSymbol().isClassLike()) {
                System.err.println("cannot implement a class or enum");
            }
            if (!set.add(ret[i].getClassSymbol())) {
                System.err.println("cannot implement the same interface twice");
            }
        }
        return ret;
    }

    private AnnotationSymbol[] makeAnnotations(Annotation[] annotations) {
        AnnotationSymbol[] ret = new AnnotationSymbol[annotations.length];
        for (int i = 0; i < ret.length; i++) {
            annotations[i].accept(this);
            ret[i] = new AnnotationSymbol((ClassSymbol)annotations[i].getType());
        }
        return ret;
    }
}
