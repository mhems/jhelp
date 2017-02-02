package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

import com.binghamton.jhelp.VariableSymbol;

/**
 * A class representing a Java for statement
 */
public class ForStatement extends Statement {
    private List<Statement> initializers = new ArrayList<>();
    private List<Statement> updates = new ArrayList<>();
    private List<VariableSymbol> vars = new ArrayList<>();
    private Expression condition;
    private Block body;

}
