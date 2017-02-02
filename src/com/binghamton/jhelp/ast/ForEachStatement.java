package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Type;
import com.binghamton.jhelp.VariableSymbol;

/**
 * A class representing a Java for-each statement
 */
public class ForEachStatement extends Statement {
    private Type elementType;
    private VariableSymbol element;
    private VariableSymbol iterable;
}
