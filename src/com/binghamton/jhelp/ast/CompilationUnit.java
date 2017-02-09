package com.binghamton.jhelp.ast;

/**
 * A class representing a Java compilation unit (file)
 */
public class CompilationUnit {
    private PackageStatement pkg;
    private List<ImportStatement> imports;
    private List<BodyDeclaration> bodies;

    /**
     * Construct a new compilation unit
     * @param pkg the package statement
     * @param imports the import statements
     * @param bodies the type declaration bodies
     */
    public CompilationUnit(PackageStatement pkg,
                           List<ImportStatement> imports,
                           List<BodyDeclaration> bodies) {
        this.pkg = pkg;
        this.imports = imports;
        this.bodies = bodies;
    }

    /**
     * Gets the unit's package statement
     * @return the unit's package statement
     */
    public PackageStatement getPackage() {
        return pkg;
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
}
