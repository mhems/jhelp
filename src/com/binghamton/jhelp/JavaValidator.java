package com.binghamton.jhelp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.antlr.MyTokenFactory;
import com.binghamton.jhelp.ast.BodyLevelVisitor;
import com.binghamton.jhelp.ast.CodeLevelVisitor;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.DeclarationLevelVisitor;
import com.binghamton.jhelp.ast.FileLevelVisitor;
import com.binghamton.jhelp.error.ExceptionError;
import com.binghamton.jhelp.error.JHelpError;

/**
 * A class for validating Java files for syntactic and semantic errors
 */
public class JavaValidator implements Validator {

    private File[] files;

    /*
     * Constructs a new JavaValidator
     * @param files the names of the files to validate
     */
    public JavaValidator(File[] files) {
        this.files = files;
    }

    /**
     * Validates the files' contents for syntactic and semantic errors
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate() {
        ANTLRFileStream input;
        Lexer lexer;
        MyTokenFactory factory;
        CommonTokenStream stream;
        Java8Parser parser;
        CompilationUnit cu;
        List<JHelpError> errors = Validator.buildErrors();
        Program program = new Program();
        try {
            System.out.println("Compiling " + files.length + " files...");
            for (File file : files) {
                input = new ANTLRFileStream(file.getAbsolutePath());
                lexer = new Java8Lexer(input);
                stream = new CommonTokenStream(lexer);
                factory = new MyTokenFactory(input, stream);
                lexer.setTokenFactory(factory);
                parser = new Java8Parser(stream);
                parser.setTokenFactory(factory);
                parser.setBuildParseTree(false);
                cu = parser.compilationUnit().ret;
                if (parser.getNumberOfSyntaxErrors() == 0) {
                    cu.setFilename(file.getAbsolutePath());
                    program.addCompilationUnit(cu);
                }
            }
        } catch (IOException e) {
            errors.add(new ExceptionError(e));
        }

        if (!errors.isEmpty()) {
            // return errors;
        }

        // System.out.println("---------- FILE ----------");
        new FileLevelVisitor(program).visitAll();

        if (program.hasFatalErrors()) {
            return program.getErrors();
        }

        // System.out.println("---------- DECLARATION ----------");
        new DeclarationLevelVisitor(program).visitAll();

        if (program.hasFatalErrors()) {
            return program.getErrors();
        }

        program.topologicalSort();

        // System.out.println("---------- BODY ----------");
        BodyLevelVisitor bodyV = new BodyLevelVisitor(program);
        bodyV.visitInOrder();

        if (program.hasFatalErrors()) {
            return program.getErrors();
        }

        // System.out.println("---------- CODE ----------");
        new CodeLevelVisitor(program, bodyV).visitAll();

        return program.getErrors();
    }
}
