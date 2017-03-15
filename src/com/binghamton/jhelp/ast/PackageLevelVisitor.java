package com.binghamton.jhelp.ast;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Symbol;

/**
 * The package (highest) level Visitor for visiting packages and their top level
 * declarations.
 *
 * This visitor is responsible for:
 * - establishing the package hierarchy
 * - importing establised symbols as necessary into the proper bodies
 * - adding bodies' names to the class symbol table
 *
 * This visitor detects the following errors:
 * - warning for use of default package (TODO if configured)
 * - inability to import symbols
 * - a file does not contain a body with same name as file
 * - more than one public body per file
 */
public class PackageLevelVisitor extends EmptyVisitor {
    private Package pkg = Package.DEFAULT_PACKAGE;
    private ImportManager importer = new ImportManager();
    private Set<String> bodyNames = new HashSet<>();
    private Set<String> simpleImportNames = new HashSet<>();
    private Program program;
    private String filename;

    public PackageLevelVisitor(Program program, String filename) {
        this.program = program;
        this.filename = new File(filename).getName();
        this.filename = this.filename.substring(0,
                                                this.filename.length() - ".java".length());
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
        sym.setPackage(pkg);
        sym.setImportManager(importer);
        if (ast instanceof AnnotationDeclaration) {
            sym.setClassKind(MyClassSymbol.ClassKind.ANNOTATION);
            sym.setSuperClassForAnnotation();
        } else if (ast instanceof ClassDeclaration) {
            sym.setClassKind(MyClassSymbol.ClassKind.CLASS);
            sym.setSuperClassForClass();
        } else if (ast instanceof EnumDeclaration) {
            sym.setClassKind(MyClassSymbol.ClassKind.ENUM);
            sym.setSuperClassForEnum();
        } else if (ast instanceof InterfaceDeclaration) {
            sym.setClassKind(MyClassSymbol.ClassKind.INTERFACE);
        }

        if (!ast.isInnerDeclaration()) {
            pkg.addClass(sym);
            bodyNames.add(ast.getName().getText());
        }

        ast.setSymbol(sym);

        MyClassSymbol[] innerSyms = new MyClassSymbol[ast.getInnerBodies().size() +
                                                      ast.getInnerInterfaces().size()];
        int pos = 0;
        MyClassSymbol cur;
        for (ConcreteBodyDeclaration c : ast.getInnerBodies()) {
            c.setInnerDeclaration(true);
            c.accept(this);
            cur = (MyClassSymbol)c.getSymbol();
            cur.setDeclaringClass(sym);
            innerSyms[pos] = cur;
            ++pos;
        }
        for (AbstractBodyDeclaration a : ast.getInnerInterfaces()) {
            a.setInnerDeclaration(true);
            a.accept(this);
            cur = (MyClassSymbol)a.getSymbol();
            cur.setDeclaringClass(sym);
            innerSyms[pos] = cur;
            ++pos;
        }
        if (pos > 0) {
            sym.setInnerClasses(innerSyms);
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

        if (ast.getImports().size() > 0) {
            for (ImportStatement s : ast.getImports()) {
                s.accept(this);
            }
            pkg.getClassTable().enterScope();
        }

        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            decl.accept(this);
        }
        if (!bodyNames.contains(filename)) {
            System.err.printf("file '%s.java' must declare a body with name of this file\n",
                              filename);
        }
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        // TODO incomplete
        if (ast.isDemand()) {
            if (ast.isStatic()) {
                importer.addOnDemandStaticPackage(ast.getImportName());
            } else {
                importer.addOnDemandPackage(ast.getImportName());
            }
        } else {
            // if (!simpleImportNames.add(ast.getImportName())) {
            //     System.err.printf("cannot import same simple type");
            // }
            try {
                pkg.getClassTable().put(importer.importSymbol(ast.getImportName()));
            } catch (ClassNotFoundException e) {
                System.err.printf("class '%s' not found\n", ast.getImportName());
            }
        }
    }

    /**
     * Visit a PackageStatement node
     * @param ast the AST node being visited
     */
    public void visit(PackageStatement ast) {
        Package parent = null;
        for (Token token : ast.getIdentifiers()) {
            pkg = program.getPackage(token.getText());
            if (pkg == null) {
                if (parent != null) {
                    pkg = parent.makeChildPackage(token.getText());
                } else {
                    pkg = new Package(token.getText());
                    program.addPackage(pkg);
                }
            }
            parent = pkg;
        }
    }
}
