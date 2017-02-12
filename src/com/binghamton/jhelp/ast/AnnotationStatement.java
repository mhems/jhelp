package com.binghamton.jhelp.ast;

import java.util.Map;
import java.util.HashMap;

/**
 * A class representing a Java annotation
 */
public class AnnotationStatement extends Modifier {
    private String typename;
    private Map<String, Expression> nameValueMap = new HashMap<>();

    /**
     * Construct a marker or normal annotation statement
     * @param typename the type name of the annotation
     */
    public AnnotationStatement(String typename) {
        this.typename = typename;
    }

    /**
     * Construct a single element annotation statement
     * @param typename the type name of the annotation
     * @param value the single element's value
     */
    public AnnotationStatement(String typename, Expression value) {
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
     */
    public String getSingleValue() {
        if (isSingleElement()) {
            return nameValueMap(typename);
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
}
