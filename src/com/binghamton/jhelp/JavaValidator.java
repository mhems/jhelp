package com.binghamton.jhelp;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.NonNullVisitor;
import com.binghamton.jhelp.error.ExceptionError;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class for validating Java files for syntactic and semantic errors
 */
public class JavaValidator implements Validator {

    /**
     * Validates the filenames' contents for syntactic and semantic errors
     * @param filenames the names of the files to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate(String[] filenames) {
        Lexer lexer;
        Java8Parser parser;
        CompilationUnit cu;
        NonNullVisitor v;
        List<JHelpError> errors = Validator.buildErrors();
        try {
            for (String filename : filenames) {
                lexer = new Java8Lexer(new ANTLRFileStream(filename));
                parser = new Java8Parser(new CommonTokenStream(lexer));
                parser.setBuildParseTree(false);
                cu = parser.compilationUnit().ret;
                if (parser.getNumberOfSyntaxErrors() == 0) {
                    v = new NonNullVisitor();
                    cu.accept(v);
                    System.out.println(v.getCount() + " objects verified.");
                }
            }
        } catch (IOException e) {
            errors.add(new ExceptionError(e));
        }
        return errors;
    }
}
