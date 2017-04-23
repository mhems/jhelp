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

    public final Pattern WHITESPACE = Pattern.compile("\\s");

    private String[] args;
    private File[] files;
    private List<File> fileList = new ArrayList<>();
    private List<JHelpError> errors;
    private boolean hasRun = false;

    public UsageValidator(String[] args) {
        this.args = args;
        // TODO
        // for now, just copy directly
        files = new File[args.length];
        for (int i = 0; i < files.length; i++) {
            files[i] = new File(args[i]);
        }
    }

    public File[] getFiles() {
        if (!hasRun) {
            validate();
        }
        return files;
    }

    /**
     * Validates CLI input
     * @return a List of JHelpErrors, if any, that occured during validation
     */
    public List<JHelpError> validate() {
        if (!hasRun) {
            errors = new ArrayList<>();
            if (files.length == 0) {
                errors.add(new InvalidUsageError("must specify at least one file or directory to compile"));
            }
            for (File file : files) {
                if (file.exists() &&
                    file.isFile() &&
                    !file.getName().endsWith(".java")) {
                    errors.add(new InvalidUsageError("cannot compile a non-Java file"));
                }
            }
            errors.addAll(validate(files));
            files = fileList.toArray(new File[fileList.size()]);
            if (files.length == 0) {
                errors.add(new InvalidUsageError("no Java files to compile were found"));
            }
            hasRun = true;
        }
        return errors;
    }

    /**
     * Validates and builds a list of Files to compile
     * @param files the starting Files and directories to validate and expand from
     * @return the List of validation errors that occured during expansion
     */
    private List<JHelpError> validate(File[] files) {
        List<JHelpError> errors = new ArrayList<>();
        String filename;
        Matcher matcher;
        for (File file : files) {
            filename = file.getAbsolutePath();
            matcher = WHITESPACE.matcher(filename);
            if (!file.exists()) {
                errors.add(new InvalidUsageError("The filename '%s' must name an existing file or directory",
                                                 filename));
            }

            if (!file.isFile()) {
                errors.addAll(validate(file.listFiles()));
            }

            if (matcher.find()) {
                errors.add(new InvalidUsageError("The filename '%s' must not contain whitespace (characters %d to %d)",
                                                 filename,
                                                 matcher.start(),
                                                 matcher.end() - 1));
            } else if (filename.endsWith(".java")) {
                fileList.add(file);
            }
        }
        return errors;
    }
}
