package com.binghamton.jhelp.validators;

import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.PrintVisitor;
import com.binghamton.jhelp.ast.Visitable;
import com.binghamton.jhelp.Program;

public class ASTPrinter implements Validator {

    /**
     * Validates a Program on some criterion.
     * @param program the Program to validate
     */
    public void validate(Program program)
    {
        PrintVisitor v = new PrintVisitor();
        for (CompilationUnit u : program.getCompilationUnits())
        {
            u.acceptRec(v, Visitable.Order.PRE);
        }
    }

    /**
     * Gets an explanation of why the validator is exiting
     * @return a String explaining of why the validator is exiting
     */
    public String getExitExplanation() { return "AST printer exited"; }
}
