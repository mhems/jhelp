package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.FileLevelVisitor;
import com.binghamton.jhelp.ast.DeclarationLevelVisitor;

/**
 * Validates the top-level declarations among Java Files' contents
 */
public class TopLevelValidator implements Validator {

    @Override
    public void validate(Program program) {
        new FileLevelVisitor(program).visitAll();
        new DeclarationLevelVisitor(program).visitAll();
        for (ClassSymbol sym : program.getAllClasses()) {
            System.out.println(sym.repr());
        }
    }

    @Override
    public String getExitExplanation() {
        return "There were errors with top-level declarations (e.g. classes, interfaces) in your file(s)";
    }
}
