package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.VariableSymbol;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java lambda expression
 */
public class LambdaExpression extends Expression {
    private List<VariableSymbol> params = new ArrayList<>();
    private Block body;
}
