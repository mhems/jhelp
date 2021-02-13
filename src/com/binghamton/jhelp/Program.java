package com.binghamton.jhelp;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.binghamton.jhelp.ast.CompilationUnit;
import com.binghamton.jhelp.error.JHelpError;
import com.binghamton.jhelp.symbols.ClassSymbol;
import com.binghamton.jhelp.types.Type;
import com.binghamton.jhelp.util.DiGraph;
import com.binghamton.jhelp.util.StringUtils;

/**
 * A class to represent a program consisting of compilation units.
 */
public class Program {

    /**
     * A simple record of a Program's configuration options
     */
    public static class Configuration {
        public final boolean NO_WARNINGS;
        public final boolean INVOKE_JAVAC;
        public final boolean NO_COLOR;
        public final boolean PRETTY_PRINT;

        /**
         * Constructs a Configuration with default settings
         */
        private Configuration() {
            this(false, false, false, false);
        }

        /**
         * Constructs a Configuration
         * @param nw true iff this Program should issue no warnings
         * @param j true iff this Program should invoke javac if no errors are
         * found
         * @param nc true iff this Program should not color output
         */
        public Configuration(boolean nw, boolean j, boolean nc, boolean pp) {
            NO_WARNINGS = nw;
            INVOKE_JAVAC = j;
            NO_COLOR = nc;
            PRETTY_PRINT = pp;
        }
    }

    public static Configuration config = new Configuration();
    private static final String USAGE;
    private final List<MyPackage> packages = new ArrayList<>();
    private final List<CompilationUnit> units = new ArrayList<>();
    private final List<JHelpError> errors = new ArrayList<>();
    private final String[] args;
    private List<ClassSymbol> classes;
    private File[] files;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("JHelp Version ");
        sb.append(JHelp.VERSION);
        sb.append("\n");
        sb.append("usage: jhelp [options] [FILE | DIR ...]");
        sb.append("\n");
        sb.append("\n");
        sb.append("JHelp - a Java recognizer and error detecter");
        sb.append("\n");
        sb.append("\n");
        sb.append("optional arguments:");
        sb.append("\n");
        sb.append("  -h            show this help message and exit");
        sb.append("\n");
        sb.append("  -cp           specify the classpath");
        sb.append("\n");
        sb.append("  -nw           ignore warnings, only show errors");
        sb.append("\n");
        sb.append("  -nc           do not use color when outputting messages");
        sb.append("\n");
        sb.append("\n");
        sb.append("positional arguments:");
        sb.append("\n");
        sb.append("  FILE | DIR    the files or directories to check for errors,");
        sb.append("\n");
        sb.append("                or the current directory if none specified");
        USAGE = sb.toString();
    }

    {
        packages.add(MyPackage.DEFAULT_PACKAGE);
    }

    /**
     * Constructs a new Program to be analyzed
     * @param args the command-line arguments given to JHelp
     */
    public Program(String[] args) {
        this.args = args;
        List<File> tmp = new ArrayList<>();
        boolean[] flags = new boolean[4];
        for (String arg : args) {
            switch (arg) {
            case "-nw":
                flags[0] = true;
                break;
            case "-j":
                flags[1] = true;
                break;
            case "-nc":
                flags[2] = true;
                break;
            case "-p":
                flags[3] = true;
                break;
            case "-h":
                System.out.println(USAGE);
                System.exit(0);
                break;
            default:
                tmp.add(new File(arg));
            }
        }
        files = tmp.toArray(new File[tmp.size()]);
        if (files.length == 0) {
            files = new File[]{new File(System.getProperty("user.dir"))};
        }
        config = new Configuration(flags[0], flags[1], flags[2], flags[3]);
    }

    /**
     * Adds a CompilationUnit to this Program
     * @param unit the CompilationUnit to add
     */
    public void addCompilationUnit(CompilationUnit unit) {
        units.add(unit);
    }

    /**
     * Gets the CompilationUnits this Program contains
     * @return the CompilationUnits this Program contains
     */
    public List<CompilationUnit> getCompilationUnits() {
        return units;
    }

    /**
     * Determines if this Program declares a Package
     * @param name the name of the Package to search for
     * @return true iff this Program declares a Package with the name `name`
     */
    public boolean hasPackage(String name) {
        return getPackage(name) != null;
    }

    /**
     * Gets the Package this Program declares
     * @param name the name of the Package to search for
     * @return the Package with the name `name`, if one exists, otherwise null.
     */
    public Package getPackage(String name) {
        java.lang.Package existingPkg = java.lang.Package.getPackage(name);
        if (existingPkg != null) {
            return new ReflectedPackage(existingPkg);
        }
        MyPackage pkg = null;
        List<MyPackage> pkgs = packages;
        for (String part : name.split("\\.")) {
            for (MyPackage p : pkgs) {
                if (p.getName().equals(part)) {
                    pkg = p;
                    if (p.hasSubPackages()) {
                        pkgs = pkg.getSubPackages();
                    }
                    break;
                }
            }
        }
        return pkg;
    }

    /**
     * Adds a Package to this Program
     * @param pkg the Package to add
     */
    public void addPackage(MyPackage pkg) {
        packages.add(pkg);
    }

    /**
     * Gets the Packages this Program declares
     * @return the List of Packages this Program declares
     */
    public List<MyPackage> getPackages() {
        return packages;
    }

    /**
     * Determines if this Program has any errors
     * @return true iff this Program has any errors
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     * Gets the number of errors in this Program
     * @return the number of errors in this Program
     */
    public int numErrors() {
        return errors.size();
    }

    /**
     * Gets the errors in this Program
     * @return a List containing all the errors in this Program
     */
    public List<JHelpError> getErrors() {
        return errors;
    }

    /**
     * Adds an error to the List of this Program's errors
     * @param error the error to add
     */
    public void addError(JHelpError error) {
        if (!config.NO_WARNINGS || error.isFatal()) {
            errors.add(error);
        }
    }

    /**
     * Adds errors to the List of this Program's errors
     * @param errors the errors to add
     */
    public void addErrors(JHelpError... errors) {
        for (JHelpError error: errors) {
            addError(error);
        }
    }

    /**
     * Adds errors to the List of this Program's errors
     * @param errors the errors to add
     */
    public void addErrors(Collection<JHelpError> errors) {
        for (JHelpError error : errors) {
            addError(error);
        }
    }

    /**
     * Determines if any of this Program's are fatal
     * @return true iff any of this Program's are fatal
     */
    public boolean hasFatalErrors() {
        for (JHelpError error : errors) {
            if (error.isFatal()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the Java Files this Program analyzes
     * @return the Java Files this Program analyzes
     */
    public File[] getFiles() {
        return files;
    }

    /**
     * Sets the Java Files this Program analyzes
     * @param files the Java Files this Program should analyze
     */
    public void setFiles(File[] files) {
        this.files = files;
    }

    /**
     * Gets the number of Java Files this Program analyzes
     * @return the number of Java Files this Program analyzes
     */
    public int numFiles() {
        return files.length;
    }

    /**
     * Gets the command-line arguments this Program was invoked with
     * @return the command-line arguments this Program was invoked with
     */
    public String[] getArguments() {
        return args;
    }

    /**
     * Builds the String representation of this Program
     * @return the String representation of this Program
     */
    public String repr() {
        return StringUtils.join("\n", packages, p -> p.repr());
    }

    /**
     * Gets all the classes within this Program
     * @return a List of all the classes within this Program
     */
    public List<ClassSymbol> getAllClasses() {
        if (classes == null) {
            gatherClasses();
        }
        return classes;
    }

    /**
     * Gathers all the classes this Program declares
     */
    private void gatherClasses() {
        classes = new ArrayList<>();
        for (MyPackage pkg: packages) {
            gatherClasses(pkg);
        }
    }

    /**
     * Gathers all the classes a Package declares
     * @param pkg the Package whose classes are to be gathered
     */
    private void gatherClasses(MyPackage pkg) {
        for (ClassSymbol cls : pkg.getClassTable()) {
            classes.add(cls);
        }
        for (MyPackage subPkg : pkg.getSubPackages()) {
            gatherClasses(subPkg);
        }
    }

    /**
     * Populates a directed graph with this Program's class hierarchy
     * @param graph the graph to populate
     */
    private void constructGraph(DiGraph<ClassSymbol> graph) {
        if (classes == null) {
            gatherClasses();
        }
        for (ClassSymbol cls : classes) {
            if (cls.hasSuperClass()) {
                graph.addEdge(cls, cls.getSuperClass().getClassSymbol());
            }
            for (Type type : cls.getDeclaredInterfaces()) {
                graph.addEdge(cls, type.getClassSymbol());
            }
        }
    }

    /**
     * Determines if this Program's inheritance hierarchy constitutes a directed
     * acyclic graph.
     * @return true iff this Program's inheritance hierarchy is acyclical
     */
    public boolean isDAG() {
        DiGraph<ClassSymbol> graph = new DiGraph<>();
        constructGraph(graph);
        List<ClassSymbol> ret = graph.topologicalSort();
        if (ret == null) {
            return false;
        }
        Collections.reverse(ret);
        classes = ret;
        return true;
    }
}
