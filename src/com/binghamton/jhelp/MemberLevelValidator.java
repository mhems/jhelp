package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.BodyLevelVisitor;
import com.binghamton.jhelp.error.SemanticError;

public class MemberLevelValidator implements Validator {
    private BodyLevelVisitor visitor;

    public BodyLevelVisitor getVisitor() {
        return visitor;
    }

    @Override
    public void validate(Program program) {
        if (!program.isDAG()) {
            program.addError(new SemanticError("The program has a cyclic inheritance hierarchy",
                                 "Alter the inheritance hierarchy so that no class depends on itself"));
        } else {
            visitor = new BodyLevelVisitor(program);
            visitor.visitInOrder();
        }
    }

    @Override
    public String getExitExplanation() {
        return "There were errors with field/method members in your file(s)";
    }
}
