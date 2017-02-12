package com.binghamton.jhelp;

import java.util.Map;
import java.util.HashMap;

import com.binghamton.jhelp.ast.Expression;

/**
 * A class representing a Java annotation
 */
public class Annotation extends Expression {
    private String typename;
    private Map<String, Expression> nameValueMap = new HashMap<>();

    /**
     * Construct a marker or normal annotation
     * @param typename the type name of the annotation
     */
    public Annotation(String typename) {
        this.typename = typename;
    }

    /**
     * Construct a single element annotation
     * @param typename the type name of the annotation
     * @param value the single element's value
     */
    public Annotation(String typename, Expression value) {
        this.typename = typename;
        nameValueMap.put(typename, value);
    }

    /**
     * Determines if this annotation is a marker annotation
     * @return true iff this annotation is a marker annotation
     */
    public boolean isMarker() {
        return nameValueMap.size() == 0;
    }

    /**
     * Determines if this annotation is a single element annotation
     * @return true iff this annotation is a single element annotation
     */
    public boolean isSingleElement() {
        return nameValueMap.size() == 1;
    }

    /**
     * Determines if this is normal annotation
     * @return true iff this is normal annotation
     */
    public boolean isNormal() {
        return !isMarker() && !isSingleElement();
    }

    /**
     * Gets the name of this annotation
     * @return the name of this annotation
     */
    public String getName() {
        return typename;
    }

    /**
     * Gets the single value of this annotation
     * @return the single value of this annotation
     */
    public Expression getSingleValue() {
        if (isSingleElement()) {
            return nameValueMap.get(typename);
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Gets the mapping from argument name to value
     * @return the mapping from argument name to value
     */
    public Map<String, Expression> getArguments() {
        if (isNormal()) {
            return nameValueMap;
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Adds an named argument and value to the annotation
     * @param name the name of the argument
     * @param value the expression giving the argument value
     */
    public void addArgument(String name, Expression value) {
        nameValueMap.put(name, value);
    }

    /**
     * Gets the value of the particular argument name
     * @param name the name of the argument
     * @return the value of the argument with name `name`
     */
    public Expression getValue(String name) {
        if (isNormal()) {
            return nameValueMap.get(name);
        }
        throw new RuntimeException(); // TODO
    }

    /**
     * Determines if this object is equivalent to other
     * @param other the other object to compare against
     * @return true iff this is equivalent to other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Annotation) {
            Annotation an = (Annotation)other;
            return typename.equals(an.typename) &&
                nameValueMap.equals(an.nameValueMap);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return typename.hashCode() ^ nameValueMap.hashCode();
    }
}
