package com.binghamton.jhelp.ast;

import java.io.File;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.ImportingSymbolTable;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.MethodSymbolTable;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.SymbolTable;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;

/**
 * The file (highest) level Visitor for visiting packages, imports, and
 * symbol names.
 *
 * This visitor is responsible for:
 * - establishing the package hierarchy
 * - importing established symbols as necessary into the proper bodies
 * - adding bodies' names to the class symbol table
 *
 * This visitor does not visit declarations, just their names.
 *
 * This visitor detects the following errors:
 * - warning for use of default package (TODO if configured)
 * - inability to import symbols
 * - a file does not contain a body with same name as file
 * - more than one public body per file
 */
public class FileLevelVisitor extends EmptyVisitor {
    protected Package pkg;
    protected Program program;
    protected MyClassSymbol currentClass;

    private String filename;
    private ImportingSymbolTable importedClasses;
    private MethodSymbolTable importedMethods;
    private NamedSymbolTable<VariableSymbol> importedFields;
    private CompilationUnit currentUnit;

    public FileLevelVisitor(Program program) {
        this.program = program;
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
        if (ast.isSingleElement()) {
            ast.getSingleValue().accept(this);
        } else {
            for (Token id : ast.getArguments().keySet()) {
                ast.getValue(id).accept(this);
            }
        }
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.ANNOTATION);
        ast.getSymbol().setSuperClassForAnnotation();
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
        ast.getElementTypeExpression().accept(this);
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
        ast.getRHS().accept(this);
    }

    /**
     * Visit a BinaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(BinaryExpression ast) {
        ast.getLHS().accept(this);
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
        MyClassSymbol sym;
        if (ast.isAnonymous()) {
            sym = new MyClassSymbol(currentClass);
        } else {
            if (!Character.isUpperCase(ast.getName().getText().charAt(0))) {
                System.err.printf("Body names should be capitalized, '%s' is not\n",
                                  ast.getName().getText());
            }
            if (ast.getName().getText().equals(filename)) {
                if (!ast.getModifiers().contains(Modifier.PUBLIC)) {
                    System.err.printf("Body '%s' in file '%s.java' should be declared public\n",
                                      ast.getName().getText(),
                                      filename);
                }
            }
            sym = new MyClassSymbol(ast.getName(), ast.getModifiers());
        }

        if (ast.isTop()) {
            if (!pkg.addClass(sym)) {
                System.err.println("duplicate declaration of body");
            }
        } else {
            sym.setDeclaringClass(currentClass);
        }

        currentClass = sym;
        sym.setPackage(pkg);
        sym.setAST(ast);
        ast.setSymbol(sym);

        MyClassSymbol cur;
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            c.accept(this);
            currentClass = sym;
            sym.addInnerClass(c.getSymbol());
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            a.accept(this);
            currentClass = sym;
            sym.addInnerClass(a.getSymbol());
        }
        for (VariableDeclaration v : ast.getFields()) {
            v.accept(this);
        }
        for (MethodDeclaration m : ast.getMethods()){
            m.accept(this);
        }
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.CLASS);
        ast.getSymbol().setSuperClassForClass();

        if (ast.hasTypeParameters()) {
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                currentClass.addTypeParameter(var);
            }
        }
    }

    /**
     * Visit a CallExpression node
     * @param ast the AST node being visited
     */
    public void visit(CallExpression ast) {
        ast.getMethod().accept(this);
        for (Expression e : ast.getArguments()) {
            e.accept(this);
        }
    }

    /**
     * Visit a CastExpression node
     * @param ast the AST node being visited
     */
    public void visit(CastExpression ast) {
        ast.getSourceExpression().accept(this);
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        pkg = Package.DEFAULT_PACKAGE;
        importedClasses = new ImportingSymbolTable();
        importedMethods = new MethodSymbolTable();
        importedFields = new NamedSymbolTable<>();

        if (ast.hasPackage()) {
            ast.getPackageStatement().accept(this);
        } else {
            System.err.println("WARNING - class without package");
        }

        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            decl.accept(this);
            decl.getSymbol().setImportedTypes(importedClasses);
        }

        // visit import stmts after classes to check naming conflicts
        if (ast.getImports().size() > 0) {
            for (ImportStatement s : ast.getImports()) {
                s.accept(this);
            }
        }

        if (pkg.getClassTable().get(filename) == null) {
            System.err.printf("file '%s.java' must declare a body with name of this file\n",
                              filename);
        }
    }

    /**
     * Visit a ConcreteBodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ConcreteBodyDeclaration ast) {
        for (MethodDeclaration ctor : ast.getConstructors())
            ctor.accept(this);
        for (Block sb : ast.getStaticInitializers())
            sb.accept(this);
        for (Block ib : ast.getInstanceInitializers())
            ib.accept(this);
    }

    /**
     * Visit a DimensionExpression node
     * @param ast the AST node being visited
     */
    public void visit(DimensionExpression ast) {
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
        ast.getExpression().accept(this);
    }

    /**
     * Visit a EnumConstant node
     * @param ast the AST node being visited
     */
    public void visit(EnumConstant ast) {
        for (Expression e : ast.getArguments()) {
            e.accept(this);
        }
        ast.getBody().accept(this);
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.ENUM);
        ast.getSymbol().setSuperClassForEnum();
        MyClassSymbol decl = currentClass;
        for (EnumConstant c : ast.getConstants()) {
            c.accept(this);
            currentClass = decl;
        }
    }

    /**
     * Visit a ForEachStatement node
     * @param ast the AST node being visited
     */
    public void visit(ForEachStatement ast) {
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
        String name = ast.getImportName();
        if (ast.isStatic()) {
            int indexLastSep = name.indexOf('.');
            String memberName = name.substring(indexLastSep + 1);
            name = name.substring(0, indexLastSep);
            ReflectedClassSymbol cls = null;
            try {
                cls = ImportManager.getOrImport(name);
            } catch(ClassNotFoundException e) {
                System.err.println("static import must name existing class");
            }
            if (cls != null) {
                ClassSymbol[] inners = cls.getInnerClasses();
                MethodSymbol[] methods = cls.getMethods();
                VariableSymbol[] fields = cls.getFields();
                if (ast.isDemand()) { // static import on demand
                    importedClasses.importStaticMemberOnDemand(inners);
                    importedMethods.importStaticMemberOnDemand(methods);
                    importedFields.importStaticMemberOnDemand(fields);
                } else { // single static import
                    boolean added = false;
                    if (importedClasses.importStaticMember(memberName, inners)) {
                        added = true;
                        if (pkg.getClassTable().has(memberName)) {
                            System.err.println("cannot import something with same name as class you've made");
                        }
                    }
                    added |= importedMethods.importStaticMember(memberName,
                                                                methods);
                    added |= importedFields.importStaticMember(memberName,
                                                               fields);
                    if (!added) {
                        System.err.println(ast.getText() + " must import at least one member");
                    }
                }
            }
        } else {
            if (ast.isDemand()) { // type import on demand
                importedClasses.importTypesOnDemand(name);
            } else { // single type import
                if (pkg.getClassTable().has(name)) {
                    System.err.println("cannot import something with same name as class you've made");
                } else {
                    importedClasses.importType(name);
                }
            }
        }
    }

    /**
     * Visit a InstantiationExpression node
     * @param ast the AST node being visited
     */
    public void visit(InstantiationExpression ast) {
        if (ast.hasAnonymousClass()) {
            MyClassSymbol decl = currentClass;
            ast.getAnonymousClass().accept(this);
            currentClass = decl;
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.INTERFACE);

        if (ast.hasTypeParameters()) {
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                currentClass.addTypeParameter(var);
            }
        }
    }

    /**
     * Visit a LabelStatement node
     * @param ast the AST node being visited
     */
    public void visit(LabelStatement ast) {
        ast.getStatement().accept(this);
    }

    /**
     * Visit a LambdaExpression node
     * @param ast the AST node being visited
     */
    public void visit(LambdaExpression ast) {
        ast.getBody().accept(this);
    }

    /**
     * Visit a LocalClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(LocalClassDeclaration ast) {
        MyClassSymbol decl = currentClass;
        ast.getDeclaration().accept(this);
        ast.getSymbol().setLocal();
        currentClass = decl;
    }

    /**
     * Visit a LocalVariableStatement node
     * @param ast the AST node being visited
     */
    public void visit(LocalVariableStatement ast) {
        for (VariableDeclaration var : ast.getVariables()) {
            var.accept(this);
        }
    }

    /**
     * Visit a MethodDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(MethodDeclaration ast) {
        ast.getBody().accept(this);
    }

    /**
     * Visit a MethodReferenceExpression node
     * @param ast the AST node being visited
     */
    public void visit(MethodReferenceExpression ast) {
        ast.getLHS().accept(this);
        ast.getRHS().accept(this);
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        List<Token> parts = ast.getIdentifiers();
        Token token = parts.get(0);
        Package pkg = program.getPackage(token.getText());
        Package sub;
        if (pkg == null) {
            pkg = new Package(token.getText());
            program.addPackage(pkg);
        }

        for (int i = 1; i < parts.size(); i++) {
            token = parts.get(i);
            sub = pkg.getSubPackage(token.getText());
            if (sub == null) {
                sub = pkg.makeChildPackage(token.getText());
            }
            pkg = sub;
        }

        this.pkg = pkg;
        currentUnit.setPackage(this.pkg);
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
        for (CaseBlock b : ast.getCases()) {
            b.accept(this);
        }
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
        for (VariableDeclaration d : ast.getResources()) {
            d.accept(this);
        }
        for (CatchBlock b : ast.getCatches()) {
            b.accept(this);
        }
        ast.getFinallyBody().accept(this);
    }

    /**
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        String name = ast.getName();
        TypeVariable type = new TypeVariable(name);
        ast.setType(type);
    }

    /**
     * Visit a UnaryExpression node
     * @param ast the AST node being visited
     */
    public void visit(UnaryExpression ast) {
        ast.getExpression().accept(this);
    }

    /**
     * Visit a VariableDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(VariableDeclaration ast) {
        ast.getInitializer().accept(this);
    }

    /**
     * Visit a WhileStatement node
     * @param ast the AST node being visited
     */
    public void visit(WhileStatement ast) {
        ast.getCondition().accept(this);
    }

    protected TypeVariable[] makeTypeParameters(List<TypeParameter> params) {
        TypeVariable[] ret = new TypeVariable[params.size()];
        for (int i = 0; i < ret.length; i++) {
            params.get(i).accept(this);
            ret[i] = params.get(i).getType();
        }
        return ret;
    }

    public void visitAll() {
        for (CompilationUnit unit : program.getCompilationUnits()) {
            currentUnit = unit;
            filename = new File(unit.getFilename()).getName();
            filename = filename.substring(0,
                                          filename.length() - ".java".length());
            unit.accept(this);
        }
    }
}
