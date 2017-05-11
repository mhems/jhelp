package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.MyPackage;
import com.binghamton.jhelp.ClassSymbol;
import com.binghamton.jhelp.MethodSymbol;
import com.binghamton.jhelp.MethodType;
import com.binghamton.jhelp.VariableSymbol;
import com.binghamton.jhelp.ImportingSymbolTable;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.MethodSymbolTable;
import com.binghamton.jhelp.Type;

/**
 * A class representing a Java compilation unit (file)
 */
public class CompilationUnit extends ASTNode {
    private String filename;
    private final PackageStatement pkg;
    private final List<ImportStatement> imports;
    private final List<BodyDeclaration> bodies;
    private final ImportingSymbolTable importedClasses = new ImportingSymbolTable();
    private final MethodSymbolTable importedMethods = new MethodSymbolTable();
    private final NamedSymbolTable<VariableSymbol> importedFields = new NamedSymbolTable<>();
    private MyPackage declaringPackage;

    public ImportingSymbolTable getImportedClasses() {
        return importedClasses;
    }

    public MethodSymbolTable getImportedMethods() {
        return importedMethods;
    }

    public NamedSymbolTable<VariableSymbol> getImportedFields() {
        return importedFields;
    }

    public ClassSymbol getImportedClass(String name) {
        return importedClasses.get(name);
    }

    public MethodSymbol getImportedMethod(String name, Type... paramTypes) {
        return importedMethods.get(MethodType.fromParameters(name, paramTypes));
    }

    public VariableSymbol getImportedField(String name) {
        return importedFields.get(name);
    }

    public boolean importStaticClassMember(String name,
                                           ClassSymbol[] inners) {
        return importedClasses.importStaticMember(name, inners);
    }

    public boolean importStaticField(String name, VariableSymbol[] fields) {
        return importedFields.importStaticMember(name, fields);
    }

    public boolean importStaticMethod(String name, MethodSymbol[] methods) {
        return importedMethods.importStaticMember(name, methods);
    }

    public boolean importStaticClassMemberOnDemand(ClassSymbol[] inners) {
        return importedClasses.importStaticMemberOnDemand(inners);
    }

    public boolean importStaticFieldOnDemand(VariableSymbol[] fields) {
        return importedFields.importStaticMemberOnDemand(fields);
    }

    public boolean importStaticMethodOnDemand(MethodSymbol[] methods) {
        return importedMethods.importStaticMemberOnDemand(methods);
    }

    public boolean importTypesOnDemand(String classname) {
        return importedClasses.importTypesOnDemand(classname);
    }

    public boolean importType(String classname) throws ClassNotFoundException {
        return importedClasses.importType(classname);
    }

    public boolean importType(ClassSymbol cls) {
        return importedClasses.put(cls);
    }

    /**
     * Construct a new compilation unit
     * @param pkg the package statement
     * @param imports the import statements
     * @param bodies the type declaration bodies
     */
    public CompilationUnit(PackageStatement pkg,
                           List<ImportStatement> imports,
                           List<BodyDeclaration> bodies) {
        super();
        this.pkg = pkg;
        this.imports = imports;
        this.bodies = bodies;
    }

    /**
     * Sets the filename this CompilationUnit is located in
     * @param name the filename this CompilationUnit is located in
     */
    public void setFilename(String name) {
        this.filename = name;
    }

    /**
     * Gets the filename this CompilationUnit is located in
     * @return the filename this CompilationUnit is located in
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Gets the unit's package statement
     * @return the unit's package statement
     */
    public PackageStatement getPackageStatement() {
        return pkg;
    }

    /**
     * Determines if this unit has a package statement
     * @return true iff this unit has a package statement
     */
    public boolean hasPackage() {
        return pkg != null;
    }

    /**
     * Gets the unit's import statements
     * @return the unit's import statements
     */
    public List<ImportStatement> getImports() {
        return imports;
    }

    /**
     * Gets the unit's body declarations
     * @return the unit's body declarations
     */
    public List<BodyDeclaration> getBodyDeclarations() {
        return bodies;
    }

    /**
     * Gets the Package this unit is located in
     * @return the Package this unit is located in
     */
    public MyPackage getPackage() {
        return declaringPackage;
    }

    /**
     * Sets the Package this unit is located in
     * @param pkg the Package this unit is located in
     */
    public void setPackage(MyPackage pkg) {
        declaringPackage = pkg;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
