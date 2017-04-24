package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.FileLevelVisitor;
import com.binghamton.jhelp.ast.DeclarationLevelVisitor;

public class TopLevelValidator implements Validator {

    @Override
    public void validate(Program program) {
        new FileLevelVisitor(program).visitAll();
        new DeclarationLevelVisitor(program).visitAll();
    }
}
