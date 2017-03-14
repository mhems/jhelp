package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.AnnotationSymbol;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MyClassSymbol;
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
public class TopLevelVisitor extends EmptyVisitor {

    private Package pkg = Package.DEFAULT_PACKAGE;
    private Program program;

    public TopLevelVisitor(Program program) {
        this.program = program;
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        System.out.println("visiting access expr");
        ast.getLHS().accept(this);

        Type parent = ast.getLHS().getType();
        ClassSymbol sym;
        // TODO determine class that lhs refers to

        Expression rhs = ast.getRHS();
        rhs.accept(this);
        if (rhs instanceof IdentifierExpression) {
            System.out.println("rhs is a ID expr");
        } else if (rhs instanceof TypeExpression) {
            System.out.println("rhs is a type expr");
        } else {
            throw new IllegalArgumentException("rhs of access is neither id or type (" +
                                               rhs.getText() + ")");
        }
    }

    /**
     * Visit a ArrayTypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayTypeExpression ast) {
        System.out.println("visiting array type expr");
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
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        MyClassSymbol sym = (MyClassSymbol)ast.getSymbol();
        if (ast.hasTypeParameters()) {
            sym.setTypeParameters(makeTypeParameters(ast.getTypeParameters()));
        }
        if (ast.hasSuperClass()) {
            ast.getSuperClass().accept(this);
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
            MyClassSymbol sym = (MyClassSymbol)ast.getSymbol();
            sym.setInterfaces(makeInterfaces(ast.getSuperInterfaces()));
        }
    }

    /**
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) {
        System.out.println("visiting ID expr: " + ast.getText());
        String id = ast.getIdentifier().getText();
        AnnotationSymbol[] anns = makeAnnotations(ast.getAnnotations());
        // TODO
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        MyClassSymbol sym = (MyClassSymbol)ast.getSymbol();
        if (ast.hasTypeParameters()) {
            sym.setTypeParameters(makeTypeParameters(ast.getTypeParameters()));
        }
        if (ast.hasSuperInterfaces()) {
            sym.setInterfaces(makeInterfaces(ast.getSuperInterfaces()));
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
        System.out.println("visiting type expr");
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
        Type[] ret = new Type[interfaces.size()];
        for (int i = 0; i < ret.length; i++) {
            interfaces.get(i).accept(this);
            ret[i] = interfaces.get(i).getType();
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
