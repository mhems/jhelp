package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java compilation unit (file)
 */
public class CompilationUnit extends ASTNode {
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
        super();
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
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
