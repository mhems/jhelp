Primary Design Goals
---
* Extensible
* Installable
* Intuitive

Secondary Design Principles
---
* Configurable


Style/Good Practice
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

CLI Usage
---
Correct program but bad invocation of `javac` or `java`.
* missing flags/flag arguments
* malformed arguments
* no changes since last save
* not all files have been compiled

Compile Errors
---
* Typo forgiveness
* Undeclared variables
* Variables not in scope
* Uninitialized variables
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
