package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java try/catch/finally block
 */
public class TryCatchBlock extends Statement {
    private Block tryBody;
    private List<VariableDeclaration> resources;
    private List<CatchBlock> catches;
    private Block finallyBody;

    /**
     * Construct a try/catch block without a finally block
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     */
    public TryCatchBlock(Block tryBody, List<CatchBlock> catches) {
        this(null, tryBody, catches, null);
    }

    /**
     * Construct a try/catch/finally block
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     * @param finally the block to always execute at end
     */
    public TryCatchBlock(Block tryBody,
                         List<CatchBlock> catches,
                         Block finallyBody) {
        this(null, tryBody, catches, finallyBody);
    }

    /**
     * Construct a try-with-resources block, possibly with a catch or finally
     * block
     * @param resources the list of resources within the try block
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     * @param finally the block to always execute at end
     */
    public TryCatchBlock(List<VariableDeclaration> resources,
                         Block tryBody,
                         List<CatchBlock> catches,
                         Block finallyBody) {
        this.resources = resources;
        this.tryBody = tryBody;
        this.catches = catches;
        this.finallyBody = finallyBody;
    }

    /**
     * Gets the try block of this statement
     * @return the try block of this statement
     */
    public Block getTryBody() {
        return tryBody;
    }

    /**
     * Gets the resources of this statement, if any
     * @return the resources of this statement, if any, otherwise `null`
     */
    public List<VariableDeclaration> getResources() {
        return resources;
    }

    /**
     * Determines if this statement has any resources
     * @return true iff this statement has any resources
     */
    public boolean hasResources() {
        return resources != null;
    }

    /**
     * Gets a particular resource of this statement
     * @param index the 0-indexed index of the resource to retrieve
     * @return the resource at index `index`
     */
    public VariableDeclaration getResource(int index) {
        return resources.get(index);
    }

    /**
     * Gets the number of resources of this statement
     * @return the number of resources of this statement
     */
    public int getNumResources() {
        return resources.size();
    }

    /**
     * Determines if this statement has any catch blocks
     * @return true iff this statement has any catch blocks
     */
    public List<CatchBlock> getCatches() {
        return catches;
    }

    /**
     * Determines if this statement has any catch blocks
     * @return true iff this statement has any catch blocks
     */
    public boolean hasCatches() {
        return catches.size() > 0;
    }

    /**
     * Gets a particular catch block of this statement
     * @param index the 0-indexed index of the catch block to retrieve
     * @return the catch block at index `index`
     */
    public CatchBlock getCatch(int index) {
        return catches.get(index);
    }

    /**
     * Gets the number of catch blocks of this statement
     * @return the number of catch block of this statement
     */
    public int getNumCatches() {
        return catches.size();
    }

    /**
     * Gets the finally body of this statement, if any
     * @return the finally body of this statement, if any
     */
    public Block getFinallyBody() {
        return finallyBody;
    }

    /**
     * Determines if this statement has a finally block
     * @return true iff this statement has a finally block
     */
    public boolean hasFinally() {
        return finallyBody != null;
    }
}
