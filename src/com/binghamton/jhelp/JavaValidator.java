package com.binghamton.jhelp;

import java.io.InputStream;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.NonNullVisitor;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class for validating Java files for syntactic and semantic errors
 */
public class JavaValidator implements Validator {

    /**
     * Validates the InputStreams for syntactic and semantic errors
     * @param streams the InputStreams to validate
     * @return a List of JHelpErrors, if any, that occured during validation
     * @throws IOException if any I/O errors occur during validation
     */
    public List<JHelpError> validateOrThrow(InputStream[] streams) throws IOException {
        Lexer lexer;
        Java8Parser parser;
        CompilationUnit cu;
        NonNullVisitor v;
        List<JHelpError> errors = Validator.buildErrors();
        for (InputStream stream : streams) {
            lexer = new Java8Lexer(new ANTLRInputStream(stream));
            parser = new Java8Parser(new CommonTokenStream(lexer));
            cu = parser.compilationUnit().ret;
            v = new NonNullVisitor();
            cu.accept(v);
            System.out.println(v.getCount() + " objects verified.");
        }
        return errors;
    }
}
