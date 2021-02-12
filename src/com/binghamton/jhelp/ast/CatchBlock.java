package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java catch block
 */
public class CatchBlock extends Block {
    private VariableDeclaration var;
    private final List<Expression> types = new ArrayList<>();

    /**
     * Construct an empty catch block
     * @param first the first token of this ASTNode
     */
    public CatchBlock(Token first) {
        super(first);
    }

    /**
     * Construct a Java catch block
     * @param first the first token of this ASTNode
     * @param body the body of this catch block
     */
    public CatchBlock(Token first, Block body) {
        super(first, body.getLastToken(), body.getStatements());
    }

    /**
     * Adds an exception type this block catches
     * @param type the exception type to catch
     */
    public void addExceptionType(Expression type) {
        types.add(type);
    }

    /**
     * Gets the exception types this block catches
     * @return the exception types this block catches
     */
    public List<Expression> getExceptionTypes() {
        return types;
    }

    /**
     * Sets the variable this block introduces
     * @param var the variable this block introduces
     */
    public void setVariable(VariableDeclaration var) {
        this.var = var;
    }

    /**
     * Gets the variable name this block introduces
     * @return the variable name this block introduces
     */
    public VariableDeclaration getVariable() {
        return var;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
        // must visit block statements explicitly
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
         for (Expression e : types)
         {
             e.acceptRec(visitor, order);
         }
         var.acceptRec(visitor, order);
         for (Statement s : getStatements())
         {
             s.acceptRec(visitor, order);
         }
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
