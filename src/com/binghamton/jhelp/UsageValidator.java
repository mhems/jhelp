package com.binghamton.jhelp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.error.InvalidUsageError;

/**
 * Validates CLI usage
 *
 * USAGE: jhelp [(FILE|DIR)...]
 */
public class UsageValidator implements Validator {

    public static final Pattern WHITESPACE = Pattern.compile("\\s");

    private List<File> fileList = new ArrayList<>();

    /**
     * Validates CLI input
     */
    @Override
    public void validate(Program program) {
        File[] files = program.getFiles();
        if (files.length == 0) {
            program.addError(new InvalidUsageError("must specify at least one file or directory to compile"));
        }
        for (File file : files) {
            if (file.exists() &&
                file.isFile() &&
                !file.getName().endsWith(".java")) {
                program.addError(new InvalidUsageError("cannot compile a non-Java file"));
            }
        }
        validate(program, files);
        File[] newFiles = fileList.toArray(new File[fileList.size()]);
        if (newFiles.length == 0) {
            program.addError(new InvalidUsageError("no Java files to compile were found"));
        }
        program.setFiles(newFiles);
    }

    /**
     * Validates and builds a list of Files to compile
     * @param files the starting Files and directories to validate and expand from
     */
    private void validate(Program program, File[] files) {
        String filename;
        Matcher matcher;
        for (File file : files) {
            filename = file.getAbsolutePath();
            matcher = WHITESPACE.matcher(filename);
            if (!file.exists()) {
                program.addError(new InvalidUsageError("The filename '%s' must name an existing file or directory",
                                                       filename));
            }

            if (!file.isFile()) {
                validate(program, file.listFiles());
            }

            if (matcher.find()) {
                program.addError(new InvalidUsageError("The filename '%s' must not contain whitespace (characters %d to %d)",
                                                       filename,
                                                       matcher.start(),
                                                       matcher.end() - 1));
            } else if (filename.endsWith(".java")) {
                fileList.add(file);
            }
        }
    }
}
