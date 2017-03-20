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
 * - importing establised symbols as necessary into the proper bodies
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
    private String filename;
    private ImportingSymbolTable importedClasses;
    private MethodSymbolTable importedMethods;
    private NamedSymbolTable<VariableSymbol> importedFields;

    protected Package pkg;
    protected Program program;
    protected MyClassSymbol currentClass;

    protected void visitAll() {
        for (CompilationUnit unit : program.getCompilationUnits()) {
            filename = new File(unit.getFilename()).getName();
            filename = filename.substring(0,
                                          filename.length() - ".java".length());
            unit.accept(this);
        }
    }

    public FileLevelVisitor(Program program) {
        this.program = program;
        visitAll();
    }

    public FileLevelVisitor(Program program, String filename) {
        this.program = program;

        visitAll();
    }

    /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        ast.getSymbol().setClassKind(MyClassSymbol.ClassKind.ANNOTATION);
        ast.getSymbol().setSuperClassForAnnotation();
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        if (!Character.isUpperCase(ast.getName().getText().charAt(0))) {
            System.err.printf("Body names should be capitalized, '%s' is not\n",
                              ast.getName().getText());
        }
        if (ast.getName().getText().equals(filename)) {
            if (!ast.getModifiers().contains(Modifier.PUBLIC)) {
                System.err.printf("Body '%s' in file '%s.java' should be declared public",
                                  ast.getName().getText(),
                                  filename);
            }
        }

        MyClassSymbol sym = new MyClassSymbol(ast.getName(), ast.getModifiers());
        currentClass = sym;
        currentClass.setPackage(pkg);
        ast.setSymbol(sym);

        if (!ast.isInnerDeclaration()) {
            if (!pkg.addClass(currentClass)) {
                System.err.println("duplicate declaration of body");
            }
        }

        MyClassSymbol[] innerSyms = new MyClassSymbol[ast.getInnerBodies().size() +
                                                      ast.getInnerInterfaces().size()];
        int pos = 0;
        MyClassSymbol cur;
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            currentClass = sym;
            c.setInnerDeclaration(true);
            c.accept(this);
            cur = c.getSymbol();
            cur.setDeclaringClass(sym);
            cur.setInnerClass(true);
            sym.addInnerClass(cur);
            innerSyms[pos] = cur;
            ++pos;
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            currentClass = sym;
            a.setInnerDeclaration(true);
            a.accept(this);
            cur = a.getSymbol();
            cur.setDeclaringClass(sym);
            cur.setInnerClass(true);
            sym.addInnerClass(cur);
            innerSyms[pos] = cur;
            ++pos;
        }
        currentClass = sym;
    }

    /**
     * Visit a ClassDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(ClassDeclaration ast) {
        ast.getSymbol().setClassKind(MyClassSymbol.ClassKind.CLASS);
        ast.getSymbol().setSuperClassForClass();

        if (ast.hasTypeParameters()) {
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                currentClass.addTypeParameter(var);
            }
        }
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
            ast.getPackage().accept(this);
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
            pkg.getClassTable().enterScope();
        }

        if (pkg.getClassTable().get(filename) == null) {
            System.err.printf("file '%s.java' must declare a body with name of this file\n",
                              filename);
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        ast.getSymbol().setClassKind(MyClassSymbol.ClassKind.ENUM);
        ast.getSymbol().setSuperClassForEnum();
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
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        ast.getSymbol().setClassKind(MyClassSymbol.ClassKind.INTERFACE);

        if (ast.hasTypeParameters()) {
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                currentClass.addTypeParameter(var);
            }
        }
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

    protected TypeVariable[] makeTypeParameters(List<TypeParameter> params) {
        TypeVariable[] ret = new TypeVariable[params.size()];
        for (int i = 0; i < ret.length; i++) {
            params.get(i).accept(this);
            ret[i] = params.get(i).getType();
        }
        return ret;
    }
}
