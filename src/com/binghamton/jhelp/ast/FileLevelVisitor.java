package com.binghamton.jhelp.ast;

import java.io.File;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.ImportManager;
import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MyClassSymbol;
import com.binghamton.jhelp.MyPackage;
import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;
import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.TypeVariable;
import com.binghamton.jhelp.VariableSymbol;
import com.binghamton.jhelp.error.ApplicationError;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.SemanticError;
import com.binghamton.jhelp.error.StyleWarning;
import com.binghamton.jhelp.error.TypeMismatchError;

import static com.binghamton.jhelp.ast.NameExpression.Kind;

/**
 * The file (highest) level Visitor for visiting packages, imports, and
 * symbol names.
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
                                      "Names of classes and interfaces should be capitalized",
                                      "Capitalize the name '" + ast.getName().getText() + "'"));
        }
        if (ast.getName().getText().equals(filename) &&
            !ast.getModifiers().contains(Modifier.PUBLIC)) {
            addError(new StyleWarning(ast.getName(),
                                      "Bodies with the same name as its file should be declared 'public'",
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
                             String.format("A class cannot declare the same type parameter ('%s')",
                                           var.getName()),
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
            addError(new StyleWarning(String.format("The file '%s.java' is not declared inside a package.\n" +
                                                    "Declare the file to be inside a package.",
                                                    filename)));
         }

        for (BodyDeclaration decl : ast.getBodyDeclarations()) {
            try {
                decl.accept(this);
            } catch(Exception e) {
                // squelched
            }
        }

        // visit import stmts after classes to check naming conflicts
        if (ast.getImports().size() > 0) {
            for (ImportStatement s : ast.getImports()) {
                s.accept(this);
            }
        }

        if (pkg.getClassTable().get(filename) == null) {
            addError("The file '%s.java' must declare a body with the name of this file\n." +
                     "Declare a class or interface named %s.",
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
                             String.format("Cannot import the member '%s' from the unknown class '%s'",
                                           memberName,
                                           name),
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
                                     String.format("Cannot import the class '%s' because it has the same name as a class you have created",
                                                   memberName),
                                     "Rename your class or remove the import");
                        }
                    }
                    added |= currentUnit.importStaticMethod(memberName, methods);
                    added |= currentUnit.importStaticField(memberName, fields);
                    if (!added) {
                        addError(ast.getNameExpression(),
                                 "Static imports must import at least one member",
                                 String.format("Modify the import to import at least one member with the name '%s'",
                                               memberName));
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
                             String.format("Cannot import the class '%s' because it has the same name as a class you have created",
                                           simpleName),
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
                                     String.format("Cannot import the unknown class '%s'",
                                                   name),
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
                             String.format("An interface cannot declare the same type parameter ('%s')",
                                           var.getName()),
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
                             String.format("Unknown type '%s'", ast.getText()),
                             "Did you forget an import or make a typo?");
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

    /**
     * Makes TypeVariables from a List of TypeParameters
     * @param params the TypeParameters to visit and resolve
     * @return the TypeVariables constructed from the TypeParameters
     */
    protected TypeVariable[] makeTypeParameters(List<TypeParameter> params) {
        TypeVariable[] ret = new TypeVariable[params.size()];
        for (int i = 0; i < ret.length; i++) {
            params.get(i).accept(this);
            ret[i] = params.get(i).getType();
        }
        return ret;
    }

    /**
     * Visits all the CompilationUnits of the Program this Visitor is visiting.
     */
    public void visitAll() {
        for (CompilationUnit unit : program.getCompilationUnits()) {
            currentUnit = unit;
            filename = new File(unit.getFilename()).getName();
            filename = filename.substring(0,
                                          filename.length() - ".java".length());
            try {
                unit.accept(this);
            } catch (Exception e) {
                addError(new ApplicationError(e, filename + ".java"));
            }
        }
    }

    /**
     * Constructs and adds a SemanticError to this Visitor's Program
     * @param msg a message explaining the error
     * @param token the Token the error originates from
     */
    public void addError(Token token, String msg) {
        program.addError(new SemanticError(token, msg));
    }

    /**
     * Constructs and adds a SemanticError to this Visitor's Program
     * @param ast the AST the error originates from
     * @param msg a message explaining the error
     * @param suggestion a message recommending a fix to the error
     */
    public void addError(ASTNode ast, String msg, String suggestion) {
        program.addError(new SemanticError(ast, msg, suggestion));
    }

    /**
     * Constructs and adds a SemanticError to this Visitor's Program
     * @param token the Token the error originates from
     * @param msg a message explaining the error
     * @param suggestion a message recommending a fix to the error
     */
    public void addError(Token token, String msg, String suggestion) {
        program.addError(new SemanticError(token, msg, suggestion));
    }

    /**
     * Constructs and adds a SemanticError to this Visitor's Program
     * @param msg a message explaining the error
     */
    public void addError(String msg) {
        program.addError(new SemanticError(msg));
    }

    /**
     * Constructs and adds a SemanticError to this Visitor's Program
     * @param msg a format String explaining the error
     * @param args any arguments to the format String message
     */
    public void addError(String msg, Object... args) {
        program.addError(new SemanticError(msg, args));
    }

    /**
     * Adds a error to this Visitor's Program
     * @param error the error to add
     */
    public void addError(JHelpError error) {
        program.addError(error);
    }

    /**
     * Constructs and adds a TypeMismatchError to this Visitor's Program
     * @param token the Token this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected the Type this token was expected to yield
     * @param actual the Type this token actually yielded
     */
    public void addError(Token token,
                         String msg,
                         String suggestion,
                         Type expected,
                         Type actual) {
        program.addError(new TypeMismatchError(token,
                                               msg,
                                               suggestion,
                                               expected,
                                               actual));
    }

    /**
     * Constructs a new TypeMismatchError on an offending ASTNode
     * @param ast the ASTNode this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected the Type this ASTNode was expected to yield
     * @param actual the Type this ASTNode actually yielded
     */
    public void addError(ASTNode ast,
                         String msg,
                         String suggestion,
                         Type expected,
                         Type actual) {
        program.addError(new TypeMismatchError(ast,
                                               msg,
                                               suggestion,
                                               expected,
                                               actual));
    }

    /**
     * Constructs a new TypeMismatchError on an offending ASTNode
     * @param ast the ASTNode this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected all Types this ASTNode was expected to yield
     * @param actual the Type this ASTNode actually yielded
     */
    public void addError(ASTNode ast,
                         String msg,
                         String suggestion,
                         Type[] expected,
                         Type actual) {
        program.addError(new TypeMismatchError(ast,
                                               msg,
                                               suggestion,
                                               expected,
                                               actual));
    }
}
