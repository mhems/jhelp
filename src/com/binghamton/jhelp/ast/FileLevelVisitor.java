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
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.ReflectedClassSymbol;
import com.binghamton.jhelp.Symbol;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.SemanticError;
import com.binghamton.jhelp.error.StyleWarning;

import static com.binghamton.jhelp.ast.NameExpression.Kind;

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
    protected CompilationUnit currentUnit;

    private String filename;

    /**
     * Constructs a FileLevelVisitor for a given Program
     * @param program the Program to visit
     */
    public FileLevelVisitor(Program program) {
        this.program = program;
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
                addError(rhs,
                         lType.getClassSymbol().getName() + " has no type named " + rName,
                         String.format("Did you make a typo or forget to add %s to %s?",
                                       rName,
                                       lType.getClassSymbol().getName()));
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
        ast.getSymbol().setClassKind(ClassSymbol.ClassKind.ANNOTATION);
        ast.getSymbol().setSuperClassForAnnotation();
    }

    /**
     * Visit a BodyDeclaration node
     * @param ast the AST node being visited
     */
    public void visit(BodyDeclaration ast) {
        if (!Character.isUpperCase(ast.getName().getText().charAt(0))) {
            addError(new StyleWarning(ast.getName(),
                                      "Body names should be capitalized",
                                      "Capitalize the name"));
        }
        if (ast.getName().getText().equals(filename) &&
            !ast.getModifiers().contains(Modifier.PUBLIC)) {
            addError(new StyleWarning(ast.getName(),
                                      "Bodies with same name as its file should be declared public\n",
                                      "Declare " + ast.getName().getText() + " to be public"));

        }

        MyClassSymbol sym = new MyClassSymbol(ast.getName(), ast.getModifiers());
        sym.setProgram(program);
        sym.setCompilationUnit(currentUnit);

        if (ast.isTop()) {
            if (!pkg.addClass(sym)) {
                addError(sym.getToken(),
                         "A body named " + sym.getName() + " already exists",
                         "Rename the class or remove one of the classes");
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

        if (ast.hasTypeParameters()) {
            int index = 0;
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                if (!currentClass.addTypeParameter(var)) {
                    addError(ast.getTypeParameters().get(index),
                             "A class cannot declare the same type parameter",
                             "Change the name of the type parameter to be unique");
                }
                ++index;
            }
        }
    }

    /**
     * Visit a CompilationUnit node
     * @param ast the AST node being visited
     */
    public void visit(CompilationUnit ast) {
        pkg = MyPackage.DEFAULT_PACKAGE;

        if (ast.hasPackage()) {
            ast.getPackageStatement().accept(this);
        } else {
            addError(new StyleWarning("The file '%s.java' declares no package",
                                      filename));
        }

        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            decl.accept(this);
        }

        // visit import stmts after classes to check naming conflicts
        if (ast.getImports().size() > 0) {
            for (ImportStatement s : ast.getImports()) {
                s.accept(this);
            }
        }

        if (pkg.getClassTable().get(filename) == null) {
            addError("The file '%s.java' must declare a body with name of this file (%s)\n",
                     filename,
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
        if (!ast.getNameExpression().isQualified() &&
            !ast.isStatic() &&
            ast.isDemand()) {
            addError(ast.getNameExpression(),
                     "Imports must be qualified with the package they occur in",
                     "Did you forget to specify the package?");
            return;
        }
        if (ast.isDemand()) {
            addError(new StyleWarning(ast,
                                      "On-demand imports are discouraged",
                                      "Explicitly import only those items you are using"));
        }

        if (ast.isStatic()) {
            String memberName = ast.getNameExpression().getName();
            NameExpression nameExpr;
            if (ast.isDemand()) {
                nameExpr = ast.getNameExpression();
            } else {
                nameExpr = ast.getNameExpression().getQualifyingName();
            }
            name = nameExpr.getName();
            ClassSymbol cls = null;
            try {
                cls = ImportManager.getOrImport(name);
            } catch(ClassNotFoundException e) {
                nameExpr.accept(this);
                if (nameExpr.getType() != null) {
                    cls = nameExpr.getType().getClassSymbol();
                } else {
                    addError(nameExpr,
                             "Cannot import a member from a non-existent class",
                             "Correct the import to name an existing class or remove it");
                }
            }
            if (cls != null) {
                ClassSymbol[] inners = cls.getInnerClasses();
                MethodSymbol[] methods = cls.getMethods();
                VariableSymbol[] fields = cls.getFields();
                if (ast.isDemand()) { // static import on demand
                    currentUnit.importStaticClassMemberOnDemand(inners);
                    currentUnit.importStaticMethodOnDemand(methods);
                    currentUnit.importStaticFieldOnDemand(fields);
                } else { // single static import
                    boolean added = false;
                    if (currentUnit.importStaticClassMember(memberName, inners)) {
                        added = true;
                        if (pkg.getClassTable().has(memberName)) {
                            addError(ast.getNameExpression(),
                                     "Cannot import a class with same name as a class you have created",
                                     "Rename your class or remove the import");
                        }
                    }
                    added |= currentUnit.importStaticMethod(memberName, methods);
                    added |= currentUnit.importStaticField(memberName, fields);
                    if (!added) {
                        addError(ast.getNameExpression(),
                                 "Static imports must import at least one member",
                                 "Modify the import to import at least one member");
                    }
                }
            }
        } else {
            if (ast.isDemand()) { // type import on demand
                currentUnit.importTypesOnDemand(name);
            } else { // single type import
                String simpleName = ast.getNameExpression().getSimpleName();
                if (pkg.getClassTable().has(simpleName)) {
                    addError(ast.getNameExpression().getToken(),
                             "Cannot import a class with same name as a class you have created",
                             "Rename your class or remove the import");
                } else {
                    try {
                        boolean b = currentUnit.importType(name);
                    } catch (ClassNotFoundException e) {
                        ast.getNameExpression().accept(this);
                        if (ast.getNameExpression().getType() != null) {
                            currentUnit.importType(ast.getNameExpression().getType().getClassSymbol());
                        } else {
                            addError(ast.getNameExpression(),
                                     "Cannot import a non-existent class",
                                     "Correct the import to name an existing class or remove it");
                        }
                    }
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
            int index = 0;
            for (TypeVariable var : makeTypeParameters(ast.getTypeParameters())) {
                if (!currentClass.addTypeParameter(var)) {
                    addError(ast.getTypeParameters().get(index),
                             "An interface cannot declare the same type parameter",
                             "Change the name of the type parameter to be unique");
                }
                ++index;
            }
        }
    }

    /**
     * Visit a NameExpression node
     * @param ast the AST node being visited
     */
    public void visit(NameExpression ast) {
        String name = ast.getName();
        String rName = ast.getToken().getText();
        Kind kind = ast.getKind();
        Type type;
        NameExpression qual = ast.getQualifyingName();
        if (kind == Kind.PACKAGE) {
            Package pkg = program.getPackage(name);
            if (pkg != null) {
                ast.setPackage(pkg);
            }
            // cannot throw error yet, must wait and hoist from Access
        } else {
            if (!ast.isQualified()) {
                type = currentClass.getType(name);
                if (type == null) {
                    type = currentUnit.getImportedClass(name);
                }
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
                ast.setType(type);
            } else {
                if (kind == Kind.TYPE) {
                    addError(ast,
                             "Unknown identifier",
                             "Did you forget an import or make a typo");
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
            System.out.println("\nvisiting file " + filename + "\n");
            unit.accept(this);
        }
    }

    public void addError(Token token, String msg) {
        program.addError(new SemanticError(token, msg));
    }

    public void addError(ASTNode ast, String msg, String suggestion) {
        program.addError(new SemanticError(ast, msg, suggestion));
    }

    public void addError(Token token, String msg, String suggestion) {
        program.addError(new SemanticError(token, msg, suggestion));
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
