# JHelp

---

The forgiving, error-detecting Java compiler for Java or programming
beginners

---

JHelp is a Java 8 recognizer, meaning it strives to accept any valid
Java8 compilation unit while also rejecting invalid input. What sets
jhelp apart from the far more complete and correct `javac` is its
error messages and detection categories. While the Java compiler
provides decent, detailed error messages, its verbiage is sometimes
intimidating to novice programmers. JHelp strives to provide a more
digestable output that breaks down the errors with more verbose
explanations of not only what is wrong, but **why** it is wrong. As
JHelp is merely a recognizer, jhelp will invoke `javac` to compile the
code if it is found to be correct.

JHelp is not meant to be a replacement compiler, it is a merely a
recognizer. As such, `jhelp` will transparently invoke `javac` on its
input as a consultant and verifier. If JHelp finds no errors, the code
has been compiled and can be run. If JHelp and `javac` disagree, `javac` output
will be provided to the user as well.

`jhelp` offers such features as
* identifier typo detection
* static vs non-static woes
* severe syntax errors typical of beginning (Java) programmers
  * e.g. missing/mismatched braces, code outside of methods, methods outside of
  classes, forgotten keywords, etc
* detailed explanation of type mismatches
* failed overring without use of annotation

JHelp's parsing is powered by [ANTLR v4](http://www.antlr.org/) and the [Java 8
antlr grammar](https://github.com/antlr/grammars-v4/tree/master/java8).
