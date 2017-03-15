package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.Package;
import com.binghamton.jhelp.Program;

/**
 * The code (lowest) level Visitor for visiting each line of code contained
 * within all declarations.
 */
public class  CodeLevelVisitor extends EmptyVisitor {

    private Package pkg = Package.DEFAULT_PACKAGE;
    private Program program;

    public CodeLevelVisitor(Program program) {
        this.program = program;
    }

}
