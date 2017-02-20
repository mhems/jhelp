package com.binghamton.jhelp;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

import com.binghamton.jhelp.ast.Block;
import com.binghamton.jhelp.ast.NilBlock;

/**
 * A class representing a Java method
 */
public class MethodSymbol extends Symbol {
    private Type returnType;
    private Scope scope;
    private List<VariableSymbol> params = new ArrayList<>();
    private Set<ClassSymbol> exceptions = new TreeSet<>();
    private Block body = new NilBlock();

    /**
     * Constructs a new named method symbol
     * @param id the name of the method
     */
    public MethodSymbol(String id) {
        super(id);
    }

    /**
     * Constructs a new named, scoped method symbol with return type
     * @param id the name of the method
     * @param returnType the return type of the method
     * @param scope the scope of the method
     */
    public MethodSymbol(String id, Type returnType, Scope scope) {
        super(id);
        this.returnType = returnType;
        this.scope = scope;
    }

    /**
     * Gets the return type of this method
     * @return the return type of this method
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Gets the scope of this method
     * @return the scope of this method
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * Gets the formal parameters of this method
     * @return the formal parameters of this method
     */
    public List<VariableSymbol> getParameters() {
        return params;
    }

    /**
     * Gets the nth parameter of the method
     * @param index the 0-indexed index of the parameter to get
     * @return the index-th parameter
     */
    public VariableSymbol getParameter(int index) {
        return params.get(index);
    }

    /**
     * Gets the number of parameters of this method
     * @return the number of parameters of this method
     */
    public int numParameters() {
        return params.size();
    }

    /**
     * Gets the exceptions this method could throw
     * @return the exceptions this method could throw
     */
    public Set<ClassSymbol> getExceptions() {
        return exceptions;
    }

    /**
     * Gets the number of exceptions this method could throw
     * @return the number of exceptions this method could throw
     */
    public int numExceptions() {
        return exceptions.size();
    }

    /**
     * Gets the implementation block of this method
     * @return the implementation block of this method
     */
    public Block getBody() {
        return body;
    }

    /**
     * Determines if this method is implemented
     * @return true iff this method is implemented
     */
    public boolean isImplemented() {
        return !body.isNil();
    }

    /**
     * Sets the return type of this method
     * @param type the return type of this method
     */
    public void setReturnType(Type type) {
        returnType = type;
    }

    /**
     * Sets the scope of this method
     * @param scope the scope of this method
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * Sets the implementation of this method
     * @param body the implementation of this method
     */
    public void setBody(Block body) {
        this.body = body;
    }

    /**
     * Adds a parameter to this method's parameters
     * @param param the parameter to add
     */
    public void addParameter(VariableSymbol param) {
        params.add(param);
    }

    /**
     * Attempts to add an exception to this method's exceptions
     * @param ex the exception to attempt to add
     * @return true iff the exception successfully added
     */
    public boolean addException(ClassSymbol ex) {
        return exceptions.add(ex);
    }

    /**
     * Determines if this method is equivalent to another
     * @param other the other Object to compare against
     * @return true iff this symbol is equivalent ot `other`
     */
    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            if (other instanceof MethodSymbol) {
                MethodSymbol meth = (MethodSymbol)other;
                return returnType.equals(meth.returnType) &&
                    scope == meth.scope &&
                    params.equals(meth.params) &&
                    exceptions.equals(meth.exceptions) &&
                    body.equals(meth.body);
            }
        }
        return false;
    }

    /**
     * Determines the hash code of this method
     * @return the hash code of this method
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ returnType.hashCode() ^ scope.hashCode() ^
            params.hashCode() ^ exceptions.hashCode() ^ body.hashCode();
    }
}
