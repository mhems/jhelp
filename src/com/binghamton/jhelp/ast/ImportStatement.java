package com.binghamton.jhelp.ast;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java import statement
 */
public class ImportStatement extends Statement {
    private final NameExpression nameExpr;
    private final boolean isStatic;
    private final boolean onDemand;

    /**
     * Constructs a new import statement
     * @param keyword the import keyword
     * @param last the terminating Token
     * @param nameExpr the expression yielding the name to import
     * @param isStatic true iff this import is static
     * @param onDemand true iff this import imports all symbols of the package
     */
    public ImportStatement(Token keyword,
                           Token last,
                           NameExpression nameExpr,
                           boolean isStatic,
                           boolean onDemand) {
        super(keyword, last);
        this.nameExpr = nameExpr;
        this.isStatic = isStatic;
        this.onDemand = onDemand;
    }

    /**
     * Gets the expression yielding the name to import
     * @return the expression yielding the name to import
     */
    public NameExpression getNameExpression() {
        return nameExpr;
    }

    /**
     * Gets the name of the symbol being imported
     * @return the name of the symbol being imported
     */
    public String getImportName() {
        return nameExpr.getText();
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
             visitor.visit(this);
         }
         nameExpr.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
