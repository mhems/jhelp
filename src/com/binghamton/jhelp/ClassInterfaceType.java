package com.binghamton.jhelp;

/**
 * A class representing a Java class or interface type
 */
public class ClassInterfaceType extends ReferenceType {
    private List<TypeArgument> args;
    private ClassInterfaceType subtype;

    /**
     * Construct a named class or interface type
     * @param name the name of the class or interface
     */
    public ClassInterfaceType(String name) {
        super(name);
    }

    /**
     * Construct a named class or interface type
     * @param name the name of the class or interface
     * @param annotations the annotations of this type
     */
    public ClassInterfaceType(String name, Annotations annotations) {
        super(name, annotations);
    }

    /**
     * Construct a named class or interface type
     * @param name the name of the class or interface
     * @param annotations the annotations of this type
     * @param args the type arguments to this type
     */
    public ClassInterfaceType(String name,
                              Annotations annotations,
                              List<TypeArgument> args) {
        super(name, annotations);
        this.args = args;
    }

    /**
     * Get the type arguments to this type
     * @return the type arguments to this type
     */
    public List<TypeArgument> getArgs() {
        return args;
    }

    /**
     * Determines if this type has type arguments
     * @return true iff this type has type arguments
     */
    public boolean hasArgs() {
        return args != null && args.size() > 0;
    }

    /**
     * Gets the number of type arguments to this type
     * @return the number of type arguments to this type
     */
    public int numArgs() {
        if (hasArgs()) {
            return args.size();
        }
        return 0;
    }

    /**
     * Gets the subtype, if any, of this type
     * @return the subtype, if any, of this type
     */
    public ClassInterfaceType getSubType() {
        return subtype;
    }

    /**
     * Determines if this type has a subtype
     * @return true iff this type has a subtype
     */
    public boolean hasSubType() {
        return subtype != null;
    }
}
