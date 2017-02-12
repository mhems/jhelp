package com.binghamton.jhelp.ast;

import java.util.List;

/**
 * A class representing a Java array initializer
 */
public class ArrayInitializer extends Expression {
    private List<Expression> elements;

    /**
     * Construct a new Java array initializer
     * @param elements the initializers of this array
     */
    public ArrayInitializer(List<Expression> elements) {
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
}
