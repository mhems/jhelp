package com.binghamton.jhelp;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.antlr.MyTokenFactory;
import com.binghamton.jhelp.ast.ASTVisitor;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.ast.PackageLevelVisitor;
import com.binghamton.jhelp.ast.TopLevelVisitor;
import com.binghamton.jhelp.ast.BodyLevelVisitor;
import com.binghamton.jhelp.ast.CodeLevelVisitor;
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
        ANTLRFileStream input;
        Lexer lexer;
        MyTokenFactory factory;
        CommonTokenStream stream;
        Java8Parser parser;
        CompilationUnit cu;
        ASTVisitor visitor;
        List<JHelpError> errors = Validator.buildErrors();
        try {
            Program program = new Program();
            for (String filename : filenames) {
                input = new ANTLRFileStream(filename);
                lexer = new Java8Lexer(input);
                stream = new CommonTokenStream(lexer);
                factory = new MyTokenFactory(input, stream);
                lexer.setTokenFactory(factory);
                parser = new Java8Parser(stream);
                parser.setTokenFactory(factory);
                if (false) {
                    // parser.removeErrorListeners();
                    parser.addErrorListener(new DiagnosticErrorListener(false));
                }
                parser.setBuildParseTree(false);
                cu = parser.compilationUnit().ret;
                if (parser.getNumberOfSyntaxErrors() == 0) {
                    System.out.println("---------- PACKAGE ----------");
                    visitor = new PackageLevelVisitor(program, filename);
                    cu.accept(visitor);
                    System.out.println("---------- TOP ----------");
                    visitor = new TopLevelVisitor(program);
                    cu.accept(visitor);
                    System.out.println("---------- BODY ----------");
                    visitor = new BodyLevelVisitor(program);
                    // cu.accept(visitor);
                    System.out.println("---------- CODE ----------");
                    visitor = new CodeLevelVisitor(program);
                    // cu.accept(visitor);
                }
            }
            System.out.println("====================");
            for (Package p : program.getPackages()) {
                System.out.println(p.repr());
            }
        } catch (IOException e) {
            errors.add(new ExceptionError(e));
        }
        return errors;
    }
}
