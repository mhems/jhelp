package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java array literal
 */
public class ArrayDeclaration {
    private List<Expression> elements;

    public ArrayDeclaration(List<Expression> elements) {
        this.elements = elements;
    }
}
