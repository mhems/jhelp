package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.BodyLevelVisitor;
import com.binghamton.jhelp.ast.CodeLevelVisitor;

public class CodeLevelValidator implements Validator {
    private BodyLevelVisitor visitor;

    public CodeLevelValidator(BodyLevelVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void validate(Program program) {
        new CodeLevelVisitor(program, visitor).visitAll();
    }

    @Override
    public String getExitExplanation() {
        return "There were errors with the source code in your file(s)";
    }
}
