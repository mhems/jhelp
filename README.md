# JHelp

---

The forgiving, error-detecting Java compiler for Java/programming beginners

---

JHelp is a Java 8 recognizer, meaning it strives to accept any valid Java8
compilation unit while also rejecting invalid input. What sets jhelp apart from
the far more complete `javac` is its error messages and detection
categories. While the Java compiler provides decent, detailed error messages,
they are verbiage sometimes intimidating to novice programmers. JHelp strives to
provide a more digestable output that breaks down the errors with mor verbose
explanations of not only what is wrong, but **why** it is wrong. As JHelp's
output is binary, jhelp will invoke `javac` to actually compile the code if it
is found to be correct. As is anticipated, if `jhelp` and `javac` disagree,
`javac` output will be provided to the user as well.

`jhelp` offers such features as
* typo detection
* severe syntax errors typical of beginning (Java) programmers
  * e.g. missing/mismatched braces, code outside of methods, methods outside of
  classes
* detailed explanation of type mismatches

JHelp's parsing is powered by [ANTLR v4](http://www.antlr.org/) and the [Java 8
antlr grammar](https://github.com/antlr/grammars-v4/tree/master/java8).
