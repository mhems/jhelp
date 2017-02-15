package com.binghamton.jhelp.ast;

/**
 * A class representing a Java import statement
 */
public class ImportStatement extends Statement {
    private String name;
    private boolean isStatic;
    private boolean onDemand;

    /**
     * Constructs a new import statement
     * @param name the name of the symbol(s) being imported
     * @param isStatic true iff this import is static
     * @param onDemand true iff this import imports all symbols of the package
     */
    public ImportStatement(String name, boolean isStatic, boolean onDemand) {
        this.name = name;
        this.isStatic = isStatic;
        this.onDemand = onDemand;
    }

    /**
     * Gets the name of the symbol being imported
     * @return the name of the symbol being imported
     */
    public String getName() {
        return name;
    }

    /**
     * Determines if this import is static
     * @return true iff this import is static
     */
    public boolean isStatic() {
        return isStatic;
    }

    /**
     * Determines if this import is on-demand
     * @return true iff this import is on-demand
     */
    public boolean isDemand() {
        return onDemand;
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
