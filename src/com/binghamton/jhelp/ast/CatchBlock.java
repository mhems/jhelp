package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.ClassInterfaceType;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java catch block
 */
public class CatchBlock extends Block {
    private VariableDeclaration var;
    private List<ClassInterfaceType> types = new ArrayList<>();

    /**
     * Construct an empty catch block
     */
    public CatchBlock() {
        super();
    }

    /**
     * Construct a Java catch block
     * @param body the body of this catch block
     */
    public CatchBlock(Block body) {
        super(body.getStatements());
    }

    /**
     * Adds an exception type this block catches
     * @param type the exception type to catch
     */
    public void addExceptionType(ClassInterfaceType type) {
        types.add(type);
    }

    /**
     * Gets the exception types this block catches
     * @return the exception types this block catches
     */
    public List<ClassInterfaceType> getExceptionTypes() {
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

}
