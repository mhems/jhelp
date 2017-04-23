package com.binghamton.jhelp.ast;

import java.io.File;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.ImportingSymbolTable;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.MethodSymbolTable;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyPackage;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.SemanticError;
import com.binghamton.jhelp.error.StyleWarning;

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
    protected MyPackage pkg;
    protected Program program;
    protected MyClassSymbol currentClass;

    private String filename;
    private ImportingSymbolTable importedClasses;
    private MethodSymbolTable importedMethods;
    private NamedSymbolTable<VariableSymbol> importedFields;
    private CompilationUnit currentUnit;

    /**
     * Constructs a FileLevelVisitor for a given Program
     * @param program the Program to visit
     */
    public FileLevelVisitor(Program program) {
        this.program = program;
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
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        if (!Character.isUpperCase(ast.getName().getText().charAt(0))) {
            addError("Body names should be capitalized, '%s' is not\n",
                     ast.getName().getText());
        }
        if (ast.getName().getText().equals(filename) &&
            !ast.getModifiers().contains(Modifier.PUBLIC)) {
            addError("Body '%s' in file '%s.java' should be declared public\n",
                     ast.getName().getText(),
                     filename);
        }

        MyClassSymbol sym = new MyClassSymbol(ast.getName(), ast.getModifiers());
        sym.setProgram(program);

        if (ast.isTop()) {
            if (!pkg.addClass(sym)) {
                addError("duplicate declaration of body");
            }
        } else {
            sym.setDeclaringClass(currentClass);
        }

        currentClass = sym;
        sym.setPackage(pkg);
        sym.setAST(ast);
        ast.setSymbol(sym);

        MyClassSymbol cur;
        for (BodyDeclaration body : ast.getInnerBodies()) {
            body.accept(this);
            currentClass = sym;
            if (body.getSymbol().isStatic()) {
                sym.addMemberType(body.getSymbol());
            } else {
                sym.addInnerClass(body.getSymbol());
            }
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
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        pkg = MyPackage.DEFAULT_PACKAGE;
        importedClasses = new ImportingSymbolTable();
        importedMethods = new MethodSymbolTable();
        importedFields = new NamedSymbolTable<>();

        if (ast.hasPackage()) {
            ast.getPackageStatement().accept(this);
        } else {
            addError(new StyleWarning("class without package"));
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
            addError("file '%s.java' must declare a body with name of this file\n",
                     filename);
        }
    }

    /**
     * Visit a EnumDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(EnumDeclaration ast) {
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.ENUM);
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
                addError("static import must name existing class");
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
                            addError("cannot import something with same name as class you've made");
                        }
                    }
                    added |= importedMethods.importStaticMember(memberName,
                                                                methods);
                    added |= importedFields.importStaticMember(memberName,
                                                               fields);
                    if (!added) {
                        addError(ast.getText() + " must import at least one member");
                    }
                }
            }
        } else {
            if (ast.isDemand()) { // type import on demand
                importedClasses.importTypesOnDemand(name);
            } else { // single type import
                if (pkg.getClassTable().has(name)) {
                    addError("cannot import something with same name as class you've made");
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
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.INTERFACE);
        ast.getSymbol().addModifier(Modifier.ABSTRACT);
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
        List<Token> parts = ast.getName().getTokens();
        Token token = parts.get(0);
        MyPackage pkg = (MyPackage)program.getPackage(token.getText());
        MyPackage sub;
        if (pkg == null) {
            pkg = new MyPackage(token.getText());
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
     * Visit a TypeParameter node
     * @param ast the AST node being visited
     */
    public void visit(TypeParameter ast) {
        String name = ast.getName();
        TypeVariable type = new TypeVariable(name);
        type.setProgram(program);
        type.setDeclaringSymbol(currentClass);
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

    public void visitAll() {
        for (CompilationUnit unit : program.getCompilationUnits()) {
            currentUnit = unit;
            filename = new File(unit.getFilename()).getName();
            filename = filename.substring(0,
                                          filename.length() - ".java".length());
            unit.accept(this);
        }
    }

    public void addError(String msg) {
        program.addError(new SemanticError(msg));
    }

    public void addError(String msg, Object... args) {
        program.addError(new SemanticError(msg, args));
    }

    public void addError(JHelpError error) {
        program.addError(error);
    }
}
