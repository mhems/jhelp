package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Annotation;
import com.binghamton.jhelp.Annotations;
import com.binghamton.jhelp.ArrayType;
import com.binghamton.jhelp.ClassInterfaceType;
import com.binghamton.jhelp.MethodType;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.Modifiers;
import com.binghamton.jhelp.PrimitiveType;
import com.binghamton.jhelp.ReferenceType;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeArgument;
import com.binghamton.jhelp.TypeParameter;
import com.binghamton.jhelp.TypeVariable;

/**
 * A testing class to ensure AST is built without any null values
 */
public class NonNullVisitor extends EmptyVisitor {

    private int count = 0;

    /**
     * Gets the number of base entities verified to be non null
     * @return the number of base entities verified to be non null
     */
    public int getCount() {
        return count;
    }

    private void assertNonNull(Object o) {
        assert(o != null);
        // if (o instanceof Token) {
        //     System.out.println(((Token)o).getText());
        // } else {
        //     System.out.println(o);
        // }
        ++count;
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast) {
        if (ast.isMarker()) {
            ast.getTypeExpression().accept(this);
        } else if (ast.isSingleElement()) {
            ast.getSingleValue().accept(this);
        } else {
            for (Token s : ast.getArguments().keySet()) {
                assertNonNull(s);
                ast.getValue(s).accept(this);
            }
        }
    }

    /**
     * Visit a Annotations node
     * @param ast the AST node being visited
     */
    public void visit(Annotations ast) {
        for (Annotation a : ast.getAnnotations())
            a.accept(this);
    }

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast) {
        ast.getArrayExpression().accept(this);
        ast.getIndexExpression().accept(this);
    }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast) {
        ast.getElementType().accept(this);
        for (DimensionExpression e : ast.getDimensionExpressions())
            e.accept(this);
        if (ast.hasInitializer())
            ast.getInitializer().accept(this);
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast) {
        for (Expression e : ast.getInitializers())
            e.accept(this);
    }

    /**
     * Visit a ArrayType node
     * @param ast the AST node being visited
     */
    public void visit(ArrayType ast) {
        for (Dimension d : ast.getDimensions()) {
            d.accept(this);
        }
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast) {
        ast.getCondition().accept(this);
        ast.getMessage().accept(this);
    }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /**
     * Visit a ASTNode node
     * @param ast the AST node being visited
     */
    public void visit(ASTNode ast) {
        if (!ast.isNil()) {
        //     System.out.println("<" + ast.getFirstToken() + ", " +
        //                              ast.getLastToken() + ">");
        }
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
        assertNonNull(ast.getOperator());
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast) {
        for (Statement s : ast.getStatements()) {
            s.accept(this);
        }
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        for (VariableDeclaration var : ast.getFields())
            var.accept(this);
        for (ConcreteBodyDeclaration cls : ast.getInnerBodies())
            cls.accept(this);
        for (AbstractBodyDeclaration intf : ast.getInnerInterfaces())
            intf.accept(this);
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        ast.getMethod().accept(this);
        for (Expression e : ast.getArguments())
            e.accept(this);
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
    }

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast) {
        for (Expression e : ast.getLabels())
            e.accept(this);
    }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) {
        ast.getExpression().accept(this);
        if (ast.isAdditional()) {
            for (ReferenceType t : ast.getTypeBounds())
                t.accept(this);
        } else {
            ast.getTargetType().accept(this);
        }
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast) {
        ast.getVariable().accept(this);
        for (ClassInterfaceType t : ast.getExceptionTypes())
            t.accept(this);
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        if (ast.hasSuperClass())
            ast.getSuperClass().accept(this);
    }

    /**
     * Visit a ClassInterfaceType node
     * @param ast the AST node being visited
     */
    public void visit(ClassInterfaceType ast) {
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
        if (ast.hasSuperType())
            ast.getSuperType().accept(this);
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        if (ast.hasPackage())
            ast.getPackage().accept(this);
        for (ImportStatement s : ast.getImports())
            s.accept(this);
        for (BodyDeclaration d : ast.getBodyDeclarations())
            d.accept(this);
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (ClassInterfaceType im : ast.getSuperInterfaces())
            im.accept(this);
        for (MethodDeclaration m : ast.getMethods())
            m.accept(this);
        for (MethodDeclaration ctor : ast.getConstructors())
            ctor.accept(this);
        for (Block sb : ast.getStaticInitializers())
            sb.accept(this);
        for (Block ib : ast.getInstanceInitializers())
            ib.accept(this);
    }

    /**
     * Visit a Declaration node
     * @param ast the AST node being visited
     */
    public void visit(Declaration ast) {
        assertNonNull(ast.getName());
        ast.getModifiers().accept(this);
    }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast) {
        ast.getAnnotations().accept(this);
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        ast.getAnnotations().accept(this);
        ast.getExpression().accept(this);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        for (Expression e : ast.getArguments())
            e.accept(this);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        for (EnumConstant c : ast.getConstants())
            c.accept(this);
    }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) {
        ast.getVariable().accept(this);
        ast.getIterable().accept(this);
    }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast) {
        for (Statement s : ast.getInitializers())
            s.accept(this);
        ast.getCondition().accept(this);
        for (Statement e : ast.getUpdaters())
            e.accept(this);
    }

    /**
     * Visit a IdentifierExpression node
     * @param ast the AST node being visited
     */
    public void visit(IdentifierExpression ast) {
        ast.getAnnotations().accept(this);
        assertNonNull(ast.getIdentifier());
    }

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast) {
        ast.getCondition().accept(this);
        ast.getThenBlock().accept(this);
        ast.getElseBlock().accept(this);
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        assertNonNull(ast.getName());
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        for (TypeArgument t : ast.getInitialTypeArguments())
            t.accept(this);
        if (ast.hasAnonymousClass())
            ast.getAnonymousClass().accept(this);
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        for (ClassInterfaceType t : ast.getSuperInterfaces())
            t.accept(this);
        for (MethodDeclaration m : ast.getMethods())
            m.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        assertNonNull(ast.getLabel());
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        for (VariableDeclaration d : ast.getParameters())
            d.accept(this);
        ast.getBody().accept(this);
    }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast) {
        assertNonNull(ast.getValue());
    }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast) {
        for (VariableDeclaration var : ast.getVariables())
            var.accept(this);
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        ast.getReturnType().accept(this);
        for (VariableDeclaration v : ast.getParameters())
            v.accept(this);
        for (Type t : ast.getExceptions())
            t.accept(this);
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        ast.getBody().accept(this);
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        ast.getLHS().accept(this);
        for (TypeArgument t : ast.getTypeArguments())
            t.accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a MethodType node
     * @param ast the AST node being visited
     */
    public void visit(MethodType ast) {
        for (TypeParameter p : ast.getTypeParameters())
            p.accept(this);
        ast.getReturnType().accept(this);
        for (Type t : ast.getParameterTypes())
            t.accept(this);
    }

    /**
     * Visit a Modifier node
     * @param ast the AST node being visited
     */
    public void visit(Modifier ast) {
        assertNonNull(ast.getName());
    }

    /**
     * Visit a Modifiers node
     * @param ast the AST node being visited
     */
    public void visit(Modifiers ast) {
        ast.getAnnotations().accept(this);
        for (Modifier m : ast.getModifiers())
            m.accept(this);
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        ast.getAnnotations().accept(this);
        for (Token id : ast.getIdentifiers())
            assertNonNull(id);
    }

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast) {
        ast.getExpression().accept(this);
    }

    /**
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast) {
        ast.getSwitchExpression().accept(this);
        for (CaseBlock b : ast.getCases())
            b.accept(this);
    }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast) {
        ast.getLock().accept(this);
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast) {
        ast.getCondition().accept(this);
        ast.getThenExpression().accept(this);
        ast.getElseExpression().accept(this);
    }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast) {
        ast.getExpression().accept(this);
    }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast) {
        ast.getTryBody().accept(this);
        for (VariableDeclaration d : ast.getResources())
            d.accept(this);
        for (CatchBlock b : ast.getCatches())
            b.accept(this);
        ast.getFinallyBody().accept(this);
    }

    /**
     * Visit a Type node
     * @param ast the AST node being visited
     */
    public void visit(Type ast) {
        ast.getAnnotations().accept(this);
        assertNonNull(ast.getName());
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast) {
        if (ast.isWildcard()) {
            ast.getAnnotations().accept(this);
            if (ast.hasBound()) {
                ast.getBoundType().accept(this);
            }
        }
        else if (!ast.isDiamond()) {
            ast.getType().accept(this);
        }
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        ast.getType().accept(this);
        for (ReferenceType t : ast.getSuperTypes())
            t.accept(this);
    }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) {
        ast.getExpression().accept(this);
        assertNonNull(ast.getOperator());
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        ast.getType().accept(this);
        assertNonNull(ast.getName());
        ast.getInitializer().accept(this);
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        ast.getCondition().accept(this);
    }
}