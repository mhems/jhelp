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
            program.addError(new SemanticError("cyclic inheritance hierarchy"));
        } else {
            visitor = new BodyLevelVisitor(program);
            visitor.visitInOrder();
        }
    }
}
