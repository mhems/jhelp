public class Stuff {

}

class FileLocation {
    final String filename;
    final int line;
    final int col;

    public FileLocation(String filename, int line, int col) {
        this.filename = filename;
        this.line = line;
        this.col = col;
    }
}

class Token {
    final Location location
    final String lexeme;

    Token(Location location, String lexeme) {
        this.location = location;
        this.lexeme = lexeme;
    }
}

abstract class ASTNode {

}

class AST {
    ASTNode root;
}

class LiteralNode {
    Type type;
    String value;
}

class VariableDeclarationNode {
    Type type;
    Identifier id;
    Expression initializer;
}

class TypeDeclarationNode {

}

class ArrayLiteralNode {
    Expression[] elements;
}

class ImportNode {
    Package pkg;
    boolean isStatic;
}

class Expression {
    Type type;
}

class Statement {

}

class BlockNode {
    StatementNode[] stmts;
}

class LabelNode extends Statement {
    Identifer id;
}

class IfElseNode extends Statement {
    Expression condition;
    BlockNode thenBody;
    BlockNode elseBody;
}

class AssertNode extends Statement {
    Expression condition;
}

class SwitchNode extends Statement {
    Expression condition;
    CaseNode[] cases;
}

class CaseNode extends Statement {
    Expression condition;
    boolean is_default;
    BlockNode body;
}

class WhileNode extends Statement {
    Expression condition;
    BlockNode body;
}

class DoWhileNode extends Statement {
    Expression condition;
    BlockNode body;
}

class ForNode extends Statement {
    Expression condition;
    Expression updateExpr;
    Variable[] vars;
    BlockNode body;
}

class ForEachNode extends Statement {
    Type elementType;
    Variable element;
    Variable iterable;
}

class BreakNode extends Statement {

}

class ContinueNode extends Statement {

}

class ReturnNode extends Statement {
    Expression expr;
}

class ThrowNode extends Statement {
    Expression expr;
}

class SynchronizedBlockNode {
    Expression lock;
    BlockNode body;
}

class TryNode extends Statement {
    Statement[] resources;
    BlockNode tryBody;
    CatchBlockNode[] catches;
    BlockNode finallyBody;
}

class CatchBlockNode extends Statement {
    Class[] exceptions;
    BlockNode body;
}

class SuperNode extends Expression {
    Class cls;
}

class ThisNode extends Expression {
    Class cls;
}

class ConstructionNode extends Expression {
    Type type;
    Expression[] args;
}

class UnaryOperationNode extends Expression {
    Expression expr;
    UnaryOperator op;
}

class CastOperationNode extends UnaryOperationNode {
    Type type;
    Expression expr;
}

class BinaryOperationNode extends Expression {
    Expression lhs;
    Expression rhs;
    BinaryOperator op;
}

class TernaryOperationNode extends Expression {
    Expression condition;
    Expression thenExpr;
    Expression elseExpr;
}

enum AssignmentOperator {
    EQUALS,
    ADDITION,
    SUBTRACTION,
    MULTIPLACATION,
    DIVISION,
    MODULUS,
    LEFT_SHIFT,
    RIGHT_SHIFT,
    RIGHT_LOGICAL_SHIFT,
    BITWISE_AND,
    BITWISE_XOR,
    BITWISE_OR
}

enum UnaryOperator {
    BITWISE_NEGATION,
    NEGATION,
    INCREMENT,
    PRE_INCREMENT,
    DECREMENT,
    PRE_DECREMENT,
    CAST,
}

enum BinaryOperator {
    ADDITION,
    SUBTRACTION,
    MULTIPLACATION,
    DIVISION,
    MODULUS,
    LEFT_SHIFT,
    RIGHT_SHIFT,
    RIGHT_LOGICAL_SHIFT,
    BITWISE_AND,
    BITWISE_OR,
    BITWISE_XOR,
    AND,
    OR,
    XOR,
    EQUALITY,
    INEQUALITY,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    LESS_THAN,
    LESS_THAN_OR_EQUAL,
    INSTANCE_OF
}

class SymbolAccessNode extends BinaryOperation {

}

class ArrayAccessNode extends BinaryOperation {

}

class MethodCallNode extends BinaryOperation {
    Identifer name;
    Expression[] args;
}

class LambdaExpressionNode extends Expression {
    Variable[] params;
    BlockNode body;
}

class Assignment extends BinaryExpression {
    Expression lhs;
    Expression rhs;
    AssignmentOperator op;
}

enum PrimitiveType {
    BYTE,
    CHAR,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE
}

enum AccessLevel {
    PRIVATE,
    PACKAGE_PRIVATE,
    PROTECTED,
    PUBLIC,
}

enum Scope {
    LOCAL,
    INSTANCE,
    CLASS
}

enum ClassModifier {
    NONE,
    FINAL,
    ABSTRACT,
    STATIC,
    STRICT_FP
}

enum FieldModifier {
    NONE,
    STATIC,
    FINAL,
    TRANSIENT,
    VOLATILE
}

enum VariableModifer {
    NONE,
    FINAL
}

enum ClassMethodModifier {
    NONE,
    ABSTRACT,
    STATIC,
    FINAL,
    SYNCHRONIZED,
    NATIVE,
    STRICT_FP
}

enum InterfaceMethodModifier {
    NONE,
    ABSTRACT,
    DEFAULT,
    STATIC,
    STRICT_FP
}

class Package {
    Symbols[] symbols;
    String name;
    Package[] subpackages;
}

class Identifier {
    String name;
}

abstract class Symbol {
    Identifier id;
    AccessLevel access;
    Modifier[] modifiers;
}

class Enum extends Symbol {
    // ?
}

class Class extends Symbol {
    Class superClass;
    Class[] implentees;
    Class parentClass;
    Variable[] fields;
    Method[] methods;
    BlockNode staticInit;
    Package pkg;
    boolean isAbstract;
}

class Interface extends Symbol {
    Interface[] superInterfaces;
    Variable[] fields;
    Method[] methods;
    Package pkg;
}

class Variable extends Symbol {
    Type type;
    Scope scope;
    ExprNode value;
}

class Method extends Symbol {
    Type returnType;
    Scope scope;
    Variable[] params;
    BlockNode body;
    Class[] exceptions;
}

class Type {
    int dims;
}

class NullType {

}

class VoidType {

}

class PrimitiveType extends Type {

}

class SymbolTable {

}
