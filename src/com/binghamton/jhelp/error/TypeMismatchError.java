package com.binghamton.jhelp.error;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.types.Type;
import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ast.ASTNode;

import static com.binghamton.jhelp.util.StringUtils.join;

/**
 * A class to represent semantic errors where the resolved type does not match
 * the expected type.
 */
public class TypeMismatchError extends SemanticError {
    private final Type[] expected;
    private final Type actual;

    /**
     * Constructs a new TypeMismatchError on an offending Token
     * @param token the Token this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected the Type this token was expected to yield
     * @param actual the Type this token actually yielded
     */
    public TypeMismatchError(Token token,
                             String msg,
                             String suggestion,
                             Type expected,
                             Type actual) {
        super(token, msg, suggestion);
        this.expected = new Type[]{expected};
        this.actual = actual;
    }

    /**
     * Constructs a new TypeMismatchError on an offending ASTNode
     * @param ast the ASTNode this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected the Type this ASTNode was expected to yield
     * @param actual the Type this ASTNode actually yielded
     */
    public TypeMismatchError(ASTNode ast,
                             String msg,
                             String suggestion,
                             Type expected,
                             Type actual) {
        super(ast, msg, suggestion);
        this.expected = new Type[]{expected};
        this.actual = actual;
    }

    /**
     * Constructs a new TypeMismatchError on an offending ASTNode
     * @param ast the ASTNode this error originated from
     * @param msg the message explaining the error
     * @param suggestion the suggestion suggesting a fix to the error
     * @param expected all Types this ASTNode was expected to yield
     * @param actual the Type this ASTNode actually yielded
     */
    public TypeMismatchError(ASTNode ast,
                             String msg,
                             String suggestion,
                             Type[] expected,
                             Type actual) {
        super(ast, msg, suggestion);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(token.getLocationString());
        sb.append(": ");
        sb.append(msg);
        sb.append("\n");
        sb.append("\n");
        if (ast != null) {
            sb.append(MyToken.getHighlightedLine(ast));
        } else {
            sb.append(token.getHighlightedLine());
        }
        sb.append("\n");
        sb.append("\n");
        sb.append("    Expected type: ");
        if (expected.length == 1) {
            sb.append(expected[0].getName());
        } else {
            sb.append("one of (");
            sb.append(join(", ", expected, t -> t.getName()));
            sb.append(")");
        }
        sb.append("\n");
        sb.append("    Actual type:   ");
        sb.append(actual.getName());
        sb.append("\n");
        sb.append("\n");
        sb.append(suggestion);
        return sb.toString();
    }
}
