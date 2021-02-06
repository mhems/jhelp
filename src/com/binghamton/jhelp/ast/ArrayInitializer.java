package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.types.ArrayType;

/**
 * A class representing a Java array initializer
 */
public class ArrayInitializer extends Expression {
    private final List<Expression> elements;

    /**
     * Construct a new Java array initializer
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     * @param elements the initializers of this array
     */
    public ArrayInitializer(Token first,
                            Token last,
                            List<Expression> elements) {
        super(first, last);
        this.elements = elements;
    }

    /**
     * Gets the initializers of this array initializer
     * @return the initializers of this array initializer
     */
    public List<Expression> getInitializers() {
        return elements;
    }

    /**
     * Gets a particular initializer of this array initializer
     * @param index the index of the initializer to retrieve
     * @return the initializer at index `index`
     */
    public Expression getInitializer(int index) {
        return elements.get(index);
    }

    /**
     * Gets the number of initializers of this array initializer
     * @return the number of initializers of this array initializer
     */
    public int size() {
        return elements.size();
    }

    @Override
    public ArrayType getType() {
        return (ArrayType)type;
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
