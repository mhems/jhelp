package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java method call
 */
public class CallExpression extends Expression {
    private Expression methodExpr;
    private List<Expression> args = new ArrayList<>();
}
