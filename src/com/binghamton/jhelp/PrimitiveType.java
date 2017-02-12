package com.binghamton.jhelp;

/**
 * Class representing valid Java primitive types
 */
public class PrimitiveType extends Type {

    public static final PrimitiveType BYTE    = new PrimitiveType(Primitive.BYTE);
    public static final PrimitiveType CHAR    = new PrimitiveType(Primitive.CHAR);
    public static final PrimitiveType BOOLEAN = new PrimitiveType(Primitive.BOOLEAN);
    public static final PrimitiveType SHORT   = new PrimitiveType(Primitive.SHORT);
    public static final PrimitiveType INT     = new PrimitiveType(Primitive.INT);
    public static final PrimitiveType LONG    = new PrimitiveType(Primitive.LONG);
    public static final PrimitiveType FLOAT   = new PrimitiveType(Primitive.FLOAT);
    public static final PrimitiveType DOUBLE  = new PrimitiveType(Primitive.DOUBLE);

    private enum Primitive {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN
    }

    private Primitive primitive;

    /**
     * Construct a new primitive type
     * @param primitive the type of the primitive
     */
    private PrimitiveType(Primitive primitive) {
        super(primitive.name());
        this.primitive = primitive;
    }
}
