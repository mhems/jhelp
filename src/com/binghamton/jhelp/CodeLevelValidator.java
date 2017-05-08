package com.binghamton.jhelp;

import com.binghamton.jhelp.ast.CodeLevelVisitor;

/**
 * Validates Java files' contents at a line-by-line level
 */
public class CodeLevelValidator implements Validator {
    private MemberLevelValidator mV;

    /**
     * Constructs a new CodeLevelValidator
     * @param visitor the Visitor that visits body declarations
     */
    public CodeLevelValidator(MemberLevelValidator validator) {
        this.mV = validator;
    }

    @Override
    public void validate(Program program) {
        new CodeLevelVisitor(program, mV.getVisitor()).visitAll();
    }

    @Override
    public String getExitExplanation() {
        return "There were errors with the source code in your file(s)";
    }
}
