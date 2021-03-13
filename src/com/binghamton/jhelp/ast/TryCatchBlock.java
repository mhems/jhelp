package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

/**
 * A class representing a Java try/catch/finally block
 * e.g. try (Resurce r = new Resource()) { ... }
 *      catch (Exception e) {...}
 *      finally { ... }
 */
public class TryCatchBlock extends Statement {
    private Block tryBody;
    private List<VariableDeclaration> resources = new ArrayList<>();
    private List<CatchBlock> catches = new ArrayList<>();
    private Block finallyBody;

    /**
     * Construct a try/catch block without a finally block
     * @param keyword the try keyword
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     */
    public TryCatchBlock(Token keyword,
                         Block tryBody,
                         List<CatchBlock> catches) {
        this(keyword, new ArrayList<>(), tryBody, catches, new NilBlock());
    }

    /**
     * Construct a try/catch/finally block
     * @param keyword the try keyword
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     * @param finallyBody the block to always execute at end
     */
    public TryCatchBlock(Token keyword,
                         Block tryBody,
                         List<CatchBlock> catches,
                         Block finallyBody) {
        this(keyword, new ArrayList<>(), tryBody, catches, finallyBody);
    }

    /**
     * Construct a try-with-resources block, possibly with a catch or finally
     * block
     * @param keyword the try keyword
     * @param resources the list of resources within the try block
     * @param tryBody the code to try to execute
     * @param catches the list of catch statement to execute on exception
     * @param finallyBody the block to always execute at end
     */
    public TryCatchBlock(Token keyword,
                         List<VariableDeclaration> resources,
                         Block tryBody,
                         List<CatchBlock> catches,
                         Block finallyBody) {
        super(keyword,
              (finallyBody.isNil() ? (catches.isEmpty() ? tryBody
                                                        : catches.get(catches.size() - 1))
                                   : finallyBody)
              .getLastToken());
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
     * @return the resources of this statement
     */
    public List<VariableDeclaration> getResources() {
        return resources;
    }

    /**
     * Determines if this statement has any resources
     * @return true iff this statement has any resources
     */
    public boolean hasResources() {
        return !resources.isEmpty();
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
    public int numResources() {
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
        return !catches.isEmpty();
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
        return !finallyBody.isNil();
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
         tryBody.acceptRec(visitor, order);
         for (VariableDeclaration vd : resources)
         {
             vd.acceptRec(visitor, order);
         }
         for (CatchBlock cb : catches)
         {
             cb.acceptRec(visitor, order);
         }
         finallyBody.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
