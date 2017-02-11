package com.binghamton.jhelp;

/**
 * A class representing a Java class or interface type
 */
public class ClassInterfaceType extends ReferenceType {
    private List<TypeArgument> args;
    private ClassInterfaceType supertype;

    /**
     * Construct a named class or interface type
     * @param name the name of the class or interface
     */
    public ClassInterfaceType(String name) {
        super(name);
    }

    /**
     * Construct a named, annotated class or interface type
     * @param name the name of the class or interface
     * @param annotations the annotations of this type
     */
    public ClassInterfaceType(String name, Annotations annotations) {
        this(name, annotations, null, null);
    }

    /**
     * Construct a named, annotated, parameterized class or interface type
     * @param name the name of the class or interface
     * @param annotations the annotations of this type
     * @param args the type arguments to this type
     */
    public ClassInterfaceType(String name,
                              Annotations annotations,
                              List<TypeArgument> args) {
        this(name, annotations, args, null);
    }

    /**
     * Construct a named, parameterized class or interface type
     * @param name the name of the class or interface
     * @param args the type arguments to this type
     */
    public ClassInterfaceType(String name,
                              List<TypeArgument> args) {
        this(name, null, args, null);
    }

    /**
     * Construct a complete class or interface type
     * @param name the name of the class or interface
     * @param annotations the annotations of this type
     * @param args the type arguments to this type
     * @param supertype the super type of this type
     */
    public ClassInterfaceType(String name,
                              Annotations annotations,
                              List<TypeArgument> args,
                              ClassInterfaceType supertype) {
        super(name, annotations);
        this.args = args;
        this.supertype = supertype;
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
     * Gets the supertype, if any, of this type
     * @return the supertype, if any, of this type
     */
    public ClassInterfaceType getSuperType() {
        return supertype;
    }

    /**
     * Determines if this type has a supertype
     * @return true iff this type has a supertype
     */
    public boolean hasSuperType() {
        return supertype != null;
    }
}
