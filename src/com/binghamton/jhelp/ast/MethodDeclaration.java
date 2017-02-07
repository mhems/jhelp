package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing the declaration of a Java method
 */
public class MethodDeclaration {
    private String name;
    private Type returnType;
    private List<VariableDeclaration> params;
    private Dimension dim;
    private Block body;

}
