package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a statement declaring local variables
 * e.g. {@code { int i; }}
 */
public class LocalVariableStatement extends Statement {
    private final List<VariableDeclaration> vars;

    /**
     * Construct a new statement declaring local variables
     * @param last the terminating semi-colon of this statement
     * @param vars the local variables being declared
     */
    public LocalVariableStatement(Token last, List<VariableDeclaration> vars) {
        super(vars.get(0).getFirstToken(), last);
        this.vars = vars;
    }

    /**
     * Gets the list of variables being declared in this statement
     * @return the list of variables being declared in this statement
     */
    public List<VariableDeclaration> getVariables() {
        return vars;
    }

    /**
     * Gets the number of variables declared in this statement
     * @return the number of variables declared in this statement
     */
    public int numVariables() {
        return vars.size();
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
         for (VariableDeclaration vd : vars)
         {
             vd.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
