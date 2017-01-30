Primary Design Goals
---
* Correct
* Extensible
* Installable
* Intuitive

Secondary Design Principles
---
* Configurable
* Quick


Warnings (Style/Good Practice)
---
Those things that will compile but should be mentioned
* `if (list.isEmpty() == true)` => unnecessary comparison
* `if (list.size >0 && list != null)` => swap order of conditions
* `if (str1 == str2)` => Objects should be compared with `equals`
* `try { throw new Exception(); } catch(Exception e) { }` => do not catch what you throw
* `throw new Exception();` => include message in exception
* `throw new NullPointerException` => unnecessary throw
* `return 5; doMore();` => unreachable statement
* `throw new Exception(); doMore();` => unreachable statement
* `i = i; ` => assignment has no effect
* if (condition) { } else { foo(); }` => invert condition, drop else
* if (condition) { foo(); } else { }` => drop empty else
* `a = a + b` => `a += b`
* prevent shadowing
* missing access modifier
* no package
* use @Override
* overloading instead of overriding
* empty if with non-empty else/ empty else
* fallthrough
* no default switch case
* casting
* static abuse
* unused imports
* unused variables/functions

CLI Usage
---
Correct program but bad invocation of `javac` or `java`.
* missing flags/flag arguments
* malformed arguments
* no changes since last save
* not all files have been compiled
* mismatched extensions

Compile Errors
---
* Typo forgiveness
* Undeclared variables
* Variables not in scope
* (possibly) Uninitialized variables
* Undeclared class
* Undeclared method
* missing import
* type mismatch
  * method arguments
  * method return statements
  * variable declaration vs. initialization
  * comparsion
  * arithmetic
* array vs. arraylist confusion
* unbalanced matching pairs
* not all branches return
* trying to override private/static
* missing return statement
* not all branches initialize
* variable is statically null
* accessing instance member from static context
* malformed function declaration
* malformed class declaration
* malformed main method
* code at top level
* nested functions
* local variables have modifiers
* missing `new`
* primitives in generics
* call non-static from static context
* access modifier in local vars
* single quote strings
* miscapitalized true/false/null/...
* unchecked exceptions

Anticipated Challenges
---
* Generics
* Handling of jars
* Imports/packages
* Lambdas
* anonymous classes
* exceptions


TODO
---
* Gather corpus of correct and incorrect files of various degrees of difficulty
  for testing
* Test speed of c++11 implementation
* Module Design
* Design extensible AST API
* Create symbol table
* Type checking visitor
* Syntactic pre-processor
* Parallel invocation of `javac` and capture/internalization of any errors
* usage correction
* grammar for error messages
* grammar for class files' symbols as produced by `javap`
* (time permitting) config files
* testing framework
  * API to mock up specific errors
  * API to assert errors
* error messages separate

Usage
---
* options
  * advise, dont compile
  * verbose
  * debug
  * directory
  * classpath
  * help
  * version
  * quiet

* config stuff
  * warnings off
  * warnings are errors

* accept as many java or class files
