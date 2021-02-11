package com.binghamton.jhelp.ast;

import java.util.List;

import com.binghamton.jhelp.MyPackage;
import com.binghamton.jhelp.ImportingSymbolTable;
import com.binghamton.jhelp.NamedSymbolTable;
import com.binghamton.jhelp.MethodSymbolTable;
import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.symbols.MethodSymbol;
import com.binghamton.jhelp.symbols.VariableSymbol;
import com.binghamton.jhelp.types.MethodType;
import com.binghamton.jhelp.types.Type;

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

    /**
     * Gets the SymbolTable holding this unit's imported classes
     * @return the SymbolTable holding this unit's imported classes
     */
    public ImportingSymbolTable getImportedClasses() {
        return importedClasses;
    }

    /**
     * Gets the SymbolTable holding this unit's imported methods
     * @return the SymbolTable holding this unit's imported methods
     */
    public MethodSymbolTable getImportedMethods() {
        return importedMethods;
    }

    /**
     * Gets the SymbolTable holding this unit's imported fields
     * @return the SymbolTable holding this unit's imported fields
     */
    public NamedSymbolTable<VariableSymbol> getImportedFields() {
        return importedFields;
    }

    /**
     * Gets the imported class with a given name
     * @param name the name of the imported class to get
     * @return the imported class with the given name
     */
    public ClassSymbol getImportedClass(String name) {
        return importedClasses.get(name);
    }

    /**
     * Gets the imported method with a given name and parameter types
     * @param name the name of the imported method to get
     * @param paramTypes the parameter types of the imported method to get
     * @return the imported method with the given name and parameter types
     */
    public MethodSymbol getImportedMethod(String name, Type... paramTypes) {
        return importedMethods.get(MethodType.fromParameters(name, paramTypes));
    }

    /**
     * Gets the imported field with a given name
     * @param name the name of the imported field to get
     * @return the imported field with the given name
     */
    public VariableSymbol getImportedField(String name) {
        return importedFields.get(name);
    }

    /**
     * Imports a static class member.
     * @param name the name of the static class member to import
     * @param inners the ClassSymbols to possibly import
     * @return true iff the import was successful
     */
    public boolean importStaticClassMember(String name,
                                           ClassSymbol[] inners) {
        return importedClasses.importStaticMember(name, inners);
    }

    /**
     * Imports a static field.
     * @param name the name of the static field to import
     * @param fields the fields to possibly import
     * @return true iff the import was successful
     */
    public boolean importStaticField(String name, VariableSymbol[] fields) {
        return importedFields.importStaticMember(name, fields);
    }

    /**
     * Imports a static method.
     * @param name the name of the static method to import
     * @param methods the methods to possibly import
     * @return true iff the import was successful
     */
    public boolean importStaticMethod(String name, MethodSymbol[] methods) {
        return importedMethods.importStaticMember(name, methods);
    }

    /**
     * Imports a static class member on demand.
     * @param inners the ClassSymbols to import on demand
     * @return true iff the import was successful
     */
    public boolean importStaticClassMemberOnDemand(ClassSymbol[] inners) {
        return importedClasses.importStaticMemberOnDemand(inners);
    }

    /**
     * Imports a static field on demand.
     * @param fields the fields to import on demand
     * @return true iff the import was successful
     */
    public boolean importStaticFieldOnDemand(VariableSymbol[] fields) {
        return importedFields.importStaticMemberOnDemand(fields);
    }

    /**
     * Imports a static method on demand.
     * @param methods the methods to import on demand
     * @return true iff the import was successful
     */
    public boolean importStaticMethodOnDemand(MethodSymbol[] methods) {
        return importedMethods.importStaticMemberOnDemand(methods);
    }

    /**
     * Imports types on demand.
     * @param classname the name of the type to import on demand
     * @return true iff the import was successful
     */
    public boolean importTypesOnDemand(String classname) {
        return importedClasses.importTypesOnDemand(classname);
    }

    /**
     * Imports a type
     * @param classname the name of the type to import
     * @return true iff the import was successful
     * @throws ClassNotFoundException if the type was not found
     */
    public boolean importType(String classname) throws ClassNotFoundException {
        return importedClasses.importType(classname);
    }

    /**
     * Imports a static class member.
     * @param cls the existing ClassSymbol to import
     * @return true iff the import was successful
     */
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

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             this.accept(visitor);
         }
         pkg.acceptRec(visitor, order);
         for (ImportStatement is : imports)
         {
             is.acceptRec(visitor, order);
         }
         for (BodyDeclaration b : bodies)
         {
             b.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }
}
