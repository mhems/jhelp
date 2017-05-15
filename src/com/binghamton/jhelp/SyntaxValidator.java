package com.binghamton.jhelp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import com.binghamton.jhelp.antlr.Java8Lexer;
import com.binghamton.jhelp.antlr.Java8Parser;
import com.binghamton.jhelp.antlr.MyTokenFactory;
import com.binghamton.jhelp.antlr.SyntaxErrorListener;
import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.error.ApplicationError;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.util.FileBuffer;

/**
 * Validates the syntax of Java files' contents
 */
public class SyntaxValidator implements Validator {

    @Override
    public void validate(Program program) {
        ANTLRFileStream input;
        Lexer lexer;
        MyTokenFactory factory;
        CommonTokenStream stream;
        Java8Parser parser;
        CompilationUnit cu;
        FileBuffer buffer;
        System.out.println("Compiling " + program.numFiles() + " files...");
        for (File file : program.getFiles()) {
            try {
                buffer = new FileBuffer(file);
                input = new ANTLRFileStream(file.getAbsolutePath());
                lexer = new Java8Lexer(input);
                stream = new CommonTokenStream(lexer);
                factory = new MyTokenFactory(stream, buffer);
                lexer.setTokenFactory(factory);
                parser = new Java8Parser(stream);
                parser.setTokenFactory(factory);
                parser.removeErrorListeners();
                parser.addErrorListener(new SyntaxErrorListener(program));
                parser.setBuildParseTree(false);
                int old = program.numErrors();
                try {
                    cu = parser.compilationUnit().ret;
                } catch (Exception e) {
                    program.addError(new ApplicationError(e, file.getName()));
                    continue;
                }
                if (parser.getNumberOfSyntaxErrors() == 0 &&
                    program.numErrors() == old) {
                    cu.setFilename(file.getAbsolutePath());
                    program.addCompilationUnit(cu);
                }
            } catch (IOException e) {
                program.addError(new JHelpError("An IO error has occured while parsing the file '%s', skipping it",
                                                file.getName()));
            }
        }
    }

    @Override
    public String getExitExplanation() {
        return "There were syntax errors in your file(s)";
    }
}
