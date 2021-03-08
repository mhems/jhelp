package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Program;

/**
 * Visits and prints each AST node
 */
public class PrintVisitor extends EmptyVisitor {
    private int indent = 0;
    private String indent_string = "_";

    private void indent()
    {
        indent++;
    }

    private void dedent()
    {
        indent--;
    }

    private void print()
    {
        print("", false);
    }

    private void print(String s)
    {
        print(s, false);
    }

    private void println(String s)
    {
        print(s, true);
    }

    private void print(String s, boolean newline)
    {
        for (int i = 0; i < indent; i++)
        {
            System.out.print(indent_string);
        }
        System.out.print(s);
        if (newline)
        {
            System.out.println();
        }
    }

    private void printStatementOrBlock(Statement s)
    {
        boolean isBlock = (s instanceof Block);
        if (!isBlock)
        {
            indent();
            print();
        }
        s.accept(this);
        if (!isBlock)
        {
            System.out.println();
            dedent();
        }
    }

    private <K extends ASTNode> void printList(List<K> elements)
    {
        printList(elements, "", true, true);
    }

    private <K extends ASTNode> void printList(List<K> elements, boolean indent)
    {
        printList(elements, "", indent, false);
    }

    private <K extends ASTNode> void printList(List<K> elements, String separator)
    {
        printList(elements, separator, false, false);
    }

    private <K extends ASTNode> void printList(List<K> elements, String separator, boolean indent)
    {
        printList(elements, separator, indent, false);
    }

    private <K extends ASTNode> void printList(List<K> elements, String separator, boolean indent, boolean newline)
    {
        int n = elements.size();
        int i;
        for (i = 0; i < n; i++)
        {
            if (indent)
                print();
            elements.get(i).accept(this);
            if (n > 1 && i < n - 1)
            {
                System.out.print(separator);
            }
        }
    }

    private <K extends ASTNode> void printArray(K[] elements, String separator)
    {
        int n = elements.length;
        int i;
        for (i = 0; i < n; i++)
        {
            elements[i].accept(this);
            if (n > 1 && i < n - 1)
            {
                System.out.print(separator);
            }
        }
    }

    /**
     * Visit a AccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(AccessExpression ast)
    {
        ast.getLHS().accept(this);
        System.out.print(".");
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Annotation node
     * @param ast the AST node being visited
     */
    public void visit(Annotation ast)
    {
        Map<Token, Expression> args = ast.getArguments();
        System.out.print("@");
        System.out.print(ast.getTypeExpression());
        if (!ast.isMarker())
        {
            indent();
            for (Token token : args.keySet())
            {
                print(token.getText());
                System.out.print(" = ");
                args.get(token).accept(this);
                System.out.println();
            }
            dedent();
        }
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast)
    {
        printArray(ast.getAnnotations(), " ");
        print(ast.getModifiers().toString());
        println("@interface" + ast.getName().getText());

        indent();
        printList(ast.getFields());
        printList(ast.getMethods());
        printList(ast.getInnerBodies());
        dedent();
    }

    /**
     * Visit a ArrayAccessExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayAccessExpression ast)
    {
        ast.getArrayQualifyingExpression().accept(this);
        ast.getArrayExpression().accept(this);
        System.out.print("[");
        ast.getIndexExpression().accept(this);
        System.out.print("]");
    }

    /**
     * Visit a ArrayConstruction node
     * @param ast the AST node being visited
     */
    public void visit(ArrayConstruction ast)
    {
        System.out.print("new ");
        ast.getElementTypeExpression().accept(this);
        printList(ast.getDimensionExpressions(), false);

        if (ast.hasInitializer())
        {
            ast.getInitializer().accept(this);
        }
    }

    /**
     * Visit a ArrayInitializer node
     * @param ast the AST node being visited
     */
    public void visit(ArrayInitializer ast)
    {
        System.out.println("{");
        printList(ast.getInitializers(), ", ");
        System.out.println("}");
    }

    /**
     * Visit a ArrayTypeExpression node
     * @param ast the AST node being visited
     */
    public void visit(ArrayTypeExpression ast)
    {
        ast.getExpression().accept(this);
        printList(ast.getDimensions(), false);
    }

    /**
     * Visit a AssertStatement node
     * @param ast the AST node being visited
     */
    public void visit(AssertStatement ast)
    {
        System.out.print("assert ");
        ast.getCondition().accept(this);
        if (ast.hasMessage())
        {
            System.out.print(" : ");
            ast.getMessage().accept(this);
        }
        System.out.println();
    }

    /**
     * Visit a AssignmentExpression node
     * @param ast the AST node being visited
     */
    public void visit(AssignmentExpression ast)
    {
        ast.getLHS().accept(this);
        System.out.print(" ");
        System.out.print(ast.getOperator().toString());
        System.out.print("= ");
        ast.getRHS().accept(this);
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast)
    {
        ast.getLHS().accept(this);
        System.out.print(" ");
        System.out.print(ast.getOperator().toString());
        System.out.print(" ");
        ast.getRHS().accept(this);
    }

    /**
     * Visit a Block node
     * @param ast the AST node being visited
     */
    public void visit(Block ast)
    {
        indent();
        printList(ast.getStatements(), "\n", true);
        // for (Statement s: ast.getStatements())
        // {
        //     print();
        //     s.accept(this);
        //     System.out.println();
        // }
        dedent();
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast)
    {
        ast.getMethod().accept(this);
        //System.out.print(".");
        //ast.getNameExpression().accept(this);
        if (ast.hasTypeArguments())
        {
            System.out.print("<");
            printList(ast.getTypeArguments(), ", ");
            System.out.print(">");
        }
        System.out.print("(");
        printList(ast.getArguments(), ", ");
        System.out.print(")");
    }

    /**
     * Visit a CaseBlock node
     * @param ast the AST node being visited
     */
    public void visit(CaseBlock ast)
    {
        for (Expression e: ast.getLabels())
        {
            if (e.isNil())
            {
                println("default");
            }
            else
            {
                print();
                e.accept(this);
                System.out.println();
            }
        }

        ast.getBody().accept(this);
    }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast)
    {
        System.out.println("(");
        ast.getTargetExpression().accept(this);

        if (ast.hasBounds())
        {
            System.out.print("& ");
            printList(ast.getBoundExpressions(), " & ");
        }

        System.out.println(")");
        ast.getSourceExpression().accept(this);
    }

    /**
     * Visit a CatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(CatchBlock ast)
    {
        System.out.print("catch ");
        printList(ast.getExceptionTypes(), " | ");
        System.out.print(" ");
        System.out.println(ast.getVariable().getName().getText());

        indent();
        for (Statement s: ast.getStatements())
        {
            print();
            s.accept(this);
            System.out.println();
        }
        dedent();
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());
        System.out.print(" class ");
        System.out.print(ast.getName().getText() + " ");

        if (ast.hasTypeParameters())
        {
            System.out.print("<");
            printList(ast.getTypeParameters(), ", ");
            System.out.print(">");
        }

        if (ast.hasSuperClass())
        {
            System.out.print("extends ");
            ast.getSuperClass().accept(this);
        }

        if (ast.hasSuperInterfaces())
        {
            System.out.print("implements ");
            printList(ast.getSuperInterfaces(), ", ");
        }

        System.out.println();

        indent();
        if (ast.getInstanceInitializers().size() > 0)
        {
            printList(ast.getInstanceInitializers());
        }
        if (ast.getStaticInitializers().size() > 0)
        {
            println("static");
            printList(ast.getStaticInitializers());
        }
        printList(ast.getConstructors());
        printList(ast.getFields());
        printList(ast.getMethods());
        printList(ast.getInnerBodies());
        dedent();
    }

    /**
     * Visit a ClassLiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(ClassLiteralExpression ast)
    {
        ast.getTypeExpression().accept(this);
        System.out.print(".class");
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast)
    {
         if (ast.hasPackage())
         {
             ast.getPackageStatement().accept(this);
         }
         for (ImportStatement is : ast.getImports())
         {
             is.accept(this);
         }
         for (BodyDeclaration b : ast.getBodyDeclarations())
         {
             b.accept(this);
         }
    }

    /**
     * Visit a Dimension node
     * @param ast the AST node being visited
     */
    public void visit(Dimension ast)
    {
        System.out.print("[");
        printArray(ast.getAnnotations(), " ");
        System.out.print("]");
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast)
    {
        System.out.print("[");
        printArray(ast.getAnnotations(), " ");
        ast.getExpression().accept(this);
        System.out.print("]");
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());
        System.out.println(" " + ast.getName().getText());

        if (!ast.getArguments().isEmpty())
        {
            System.out.print("(");
            printList(ast.getArguments(), ", ");
            System.out.print(")");
        }

        System.out.println();

        if (ast.getBody() != null)
        {
            ast.getBody().accept(this);
            System.out.println();
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());
        System.out.print(" enum ");
        System.out.print(ast.getName().getText() + " ");

        if (ast.hasSuperInterfaces())
        {
            System.out.print("implements ");
            printList(ast.getSuperInterfaces(), ", ");
        }
        System.out.println();

        indent();
        printList(ast.getConstants());
        if (ast.getInstanceInitializers().size() > 0)
        {
            printList(ast.getInstanceInitializers());
        }
        if (ast.getStaticInitializers().size() > 0)
        {
            println("static");
            printList(ast.getStaticInitializers());
        }
        printList(ast.getConstructors());
        printList(ast.getFields());
        printList(ast.getMethods());
        printList(ast.getInnerBodies());
        dedent();
    }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast)
    {
        System.out.print("for each ");
        ast.getVariable().accept(this);
        System.out.print(" : ");
        ast.getIterable().accept(this);

        System.out.println();
        printStatementOrBlock(ast.getBody());
    }

    /**
     * Visit a ForStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForStatement ast)
    {
        System.out.print("for ");
        printList(ast.getInitializers(), ", ");
        System.out.print(" ; ");
        ast.getCondition().accept(this);
        System.out.print(" ; ");
        printList(ast.getUpdaters(), ", ");

        System.out.println();
        printStatementOrBlock(ast.getBody());
    }

    /**
     * Visit a IfElseStatement node
     * @param ast the AST node being visited
     */
    public void visit(IfElseStatement ast)
    {
        System.out.print("if ");
        ast.getCondition().accept(this);
        System.out.println();

        printStatementOrBlock(ast.getThenStatement());

        if (ast.hasElseStatement())
        {
            println("else");
            printStatementOrBlock(ast.getElseStatement());
        }
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast)
    {
        System.out.print("import ");
        if (ast.isStatic())
        {
            System.out.print("static ");
        }
        ast.getNameExpression().accept(this);
        if (ast.isDemand())
        {
            System.out.print(".*");
        }
        System.out.println();
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast)
    {
        System.out.print("new ");

        ast.getNameExpression().accept(this);
        if (ast.isDiamond())
        {
            System.out.print("<>");
        }
        if (ast.hasTypeArguments())
        {
            System.out.print("<");
            printList(ast.getTypeArguments(), ", ");
            System.out.print(">");
        }
        System.out.print("(");
        printList(ast.getArguments(), ", ");
        System.out.print(")");

        if (ast.hasAnonymousClass())
        {
            System.out.println();
            indent();
            ast.getAnonymousClass().accept(this);
            dedent();
            System.out.println();
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());
        System.out.print(" interface ");
        System.out.print(ast.getName().getText());

        if (ast.hasTypeParameters())
        {
            System.out.print("<");
            printList(ast.getTypeParameters(), ", ");
            System.out.print(">");
        }

        if (ast.hasSuperInterfaces())
        {
            System.out.print("implements ");
            printList(ast.getSuperInterfaces(), ", ");
        }

        indent();
        printList(ast.getFields());
        printList(ast.getMethods());
        printList(ast.getInnerBodies());
        dedent();
    }

    /**
     * Visit a JumpStatement node
     * @param ast the AST node being visited
     */
    public void visit(JumpStatement ast)
    {
        System.out.print(ast.isBreakStatement() ? "break" : "continue");
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast)
    {
        println(ast.getLabel().getText() + ":");
        ast.getStatement().accept(this);
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast)
    {
        printList(ast.getParameters(), ", ");
        println(" ->");
        ast.getBody().accept(this);
    }

    /**
     * Visit a LiteralExpression node
     * @param ast the AST node being visited
     */
    public void visit(LiteralExpression ast)
    {
        System.out.print(ast.getValue());
    }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast)
    {
        ast.getDeclaration().accept(this);
    }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast)
    {
        List<VariableDeclaration> decls = ast.getVariables();
        decls.get(0).accept(this);
        if (decls.size() > 1)
        {
            System.out.print(", ");
            printList(decls.subList(1, decls.size()), ", ");
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());

        if (ast.hasTypeParameters())
        {
            System.out.print("<");
            printList(ast.getTypeParameters(), ", ");
            System.out.print("> ");
        }

        printArray(ast.getReturnTypeAnnotations(), ", ");
        System.out.print(" ");
        ast.getReturnTypeExpression().accept(this);

        System.out.print(" " + ast.getName().getText());

        System.out.print("(");
        printList(ast.getParameters(), ", ");
        System.out.print(")");

        if (!ast.getExceptions().isEmpty())
        {
            System.out.print(" throws ");
            printList(ast.getExceptions(), ", ");
        }

        System.out.println();

        ast.getBody().accept(this);
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast)
    {

        ast.getLHS().accept(this);
        if (ast.hasTypeArguments())
        {
            System.out.print("<");
            printList(ast.getTypeArguments(), ", ");
            System.out.print(">");
        }
        System.out.print("::");
        ast.getRHS().accept(this);
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getText());
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast)
    {
        printArray(ast.getAnnotations(), " ");
        System.out.print("\npackage ");
        ast.getName().accept(this);
        System.out.println();
    }

    /**
     * Visit a ParamExpression node
     * @param ast the AST node being visited
     */
    public void visit(ParamExpression ast)
    {
        ast.getExpression().accept(this);
        System.out.print("<");
        printList(ast.getTypeArguments(), ", ");
        System.out.print(">");
    }

    /**
     * Visit a ReturnStatement node
     * @param ast the AST node being visited
     */
    public void visit(ReturnStatement ast)
    {
        System.out.print("return");
        if (ast.isNonTrivial())
        {
            System.out.print(" ");
            ast.getExpression().accept(this);
        }
        System.out.println();
    }

    /**
     * Visit a SwitchStatement node
     * @param ast the AST node being visited
     */
    public void visit(SwitchStatement ast)
    {
        System.out.print("switch ");
        ast.getSwitchExpression().accept(this);
        System.out.println();

        indent();
        for (CaseBlock b: ast.getCases())
        {
            b.accept(this);
        }
        dedent();
    }

    /**
     * Visit a SynchronizedBlock node
     * @param ast the AST node being visited
     */
    public void visit(SynchronizedBlock ast)
    {
        System.out.print("synchronized ");
        ast.getLock().accept(this);
        System.out.println();

        indent();
        for (Statement s: ast.getStatements())
        {
            print();
            s.accept(this);
            System.out.println();
        }
        dedent();
    }

    /**
     * Visit a TernaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(TernaryExpression ast)
    {
        ast.getCondition().accept(this);
        System.out.print(" ? ");
        ast.getThenExpression().accept(this);
        System.out.print(" : ");
        ast.getElseExpression().accept(this);
    }

    /**
     * Visit a ThrowStatement node
     * @param ast the AST node being visited
     */
    public void visit(ThrowStatement ast)
    {
        System.out.print("throw");
        ast.getExpression().accept(this);
        System.out.println();
    }

    /**
     * Visit a TryCatchBlock node
     * @param ast the AST node being visited
     */
    public void visit(TryCatchBlock ast)
    {
        System.out.print("try");
        if (ast.hasResources())
        {
            printList(ast.getResources(), ", ");
        }
        System.out.println();

        ast.getTryBody().accept(this);
        for (CatchBlock b: ast.getCatches())
        {
            print();
            b.accept(this);
        }
        if (ast.getFinallyBody() != null && !ast.getFinallyBody().isNil())
        {
            println("finally");
            ast.getFinallyBody().accept(this);
        }
    }

    /**
     * Visit a TypeArgument node
     * @param ast the AST node being visited
     */
    public void visit(TypeArgument ast)
    {
        printArray(ast.getAnnotations(), " ");
        if (ast.isWildcard())
        {
            System.out.print("?");
            if (ast.hasExplicitBound())
            {
                System.out.print(ast.isUpperBounded() ? " extends " : " super ");
                ast.getTypeExpression().accept(this);
            }
        }
        else
        {
            ast.getTypeExpression().accept(this);
        }
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast)
    {
        printArray(ast.getAnnotations(), " ");
        if (ast.isAnnotated())
        {
            System.out.print(" ");
        }
        System.out.print(ast.getName());
        if (ast.hasSuperTypes())
        {
            System.out.print(" extends ");
            printList(ast.getSuperTypes(), " & ");
        }
    }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast)
    {
        if (ast.getOperator().isPostfix())
        {
            ast.getExpression().accept(this);
            System.out.print(ast.getOperator().toString());
        }
        else
        {
            System.out.print(ast.getOperator().toString());
            ast.getExpression().accept(this);
        }
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast)
    {
        Expression expr = ast.getExpression();
        printArray(ast.getAnnotations(), " ");
        System.out.print(ast.getModifiers().toString());

        if (expr != null && !expr.isNil())
        {
            expr.accept(this);
            System.out.print(" ");
        }

        System.out.print(ast.getName().getText());
        if (ast.isReceiverParameter())
        {
            System.out.print(".this");
        }
        else if (ast.isInitialized())
        {
            System.out.print(" = ");
            ast.getInitializer().accept(this);
        }
        else if (ast.isVariadic())
        {
            System.out.print("...");
        }
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast)
    {
        if (ast.isDoWhile())
        {
            println("do");
        }
        else
        {
            System.out.print("while ");
            ast.getCondition().accept(this);
            System.out.println();
        }

        printStatementOrBlock(ast.getBody());

        if (ast.isDoWhile())
        {
            System.out.print("while ");
            ast.getCondition().accept(this);
            System.out.println();
        }
    }
}
