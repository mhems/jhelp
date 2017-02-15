package com.binghamton.jhelp;

import java.util.List;

import com.binghamton.jhelp.ast.ASTVisitor;

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
    public static final PrimitiveType VOID    = new PrimitiveType(Primitive.VOID);

    public enum Primitive {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        VOID
    }

    /**
     * Construct a new primitive type
     * @param primitive the type of the primitive
     */
    public PrimitiveType(Primitive primitive) {
        super(primitive.name());
    }

    /**
     * Construct an annotated primitive type
     * @param primitive the type of the primitive
     * @param annotations the annotations of this type
     */
    public PrimitiveType(Primitive primitive, List<Annotation> annotations) {
        super(primitive.name(), annotations);
    }

    /**
     * Double dispatch super class and this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
        v.visit(this);
    }
}
