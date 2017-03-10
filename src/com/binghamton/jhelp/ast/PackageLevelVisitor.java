package com.binghamton.jhelp.ast;

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
    private Program program;
    private String filename;
    private ClassSymbol currentClass;

    public PackageLevelVisitor(Program program, String filename) {
        this.program = program;
        this.filename = filename.substring(0,
                                           filename.length() - ".java".length());
    }

   /**
     * Visit a AnnotationDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(AnnotationDeclaration ast) {
        System.out.println("annotation declaration");
     }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        MyClassSymbol cls = new MyClassSymbol(ast.getName(), ast.getModifiers());
        cls.setImportManager(importer);
        pkg.addClass(cls);
        bodyNames.add(ast.getName().getText());
        currentClass = cls;
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
        System.out.printf("this class has name '%s'\n", ast.getName().getText());
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
            // TODO convert to error
            System.err.printf("file '%s' must declare a body with name of this file\n",
                              filename);
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        System.out.println("enum declared");
    }

    /**
     * Visit a ImportStatement node
     * @param ast the AST node being visited
     */
    public void visit(ImportStatement ast) {
        System.out.printf("importing '%s', static ? %s, demand ? %s\n",
                          ast.getImportName(),
                          ast.isStatic(),
                          ast.isDemand());
        if (ast.isDemand()) {
            importer.addOnDemandPackage(ast.getImportName());
        }
        try {
            pkg.getClassTable().put(importer.importSymbol(ast.getImportName()));
        } catch (ClassNotFoundException e) {
            System.err.printf("class '%s' not found\n", ast.getImportName());
        }
    }

    /**
     * Visit a InterfaceDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(InterfaceDeclaration ast) {
        System.out.printf("declaring interface '%s'\n", ast.getName().getText());
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
        for (Annotation a : ast.getAnnotations()) {
            a.accept(this);
        }
    }
}
