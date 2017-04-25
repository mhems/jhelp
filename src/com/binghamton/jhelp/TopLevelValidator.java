package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.FileLevelVisitor;
import com.binghamton.jhelp.ast.DeclarationLevelVisitor;

public class TopLevelValidator implements Validator {

    @Override
    public void validate(Program program) {
        new FileLevelVisitor(program).visitAll();
        new DeclarationLevelVisitor(program).visitAll();
    }

    @Override
    public String getExitExplanation() {
        return "There were errors with top-level declarations (e.g. classes, interfaces) in your file(s)";
    }
}
