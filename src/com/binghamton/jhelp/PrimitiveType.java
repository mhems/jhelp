package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

/**
 * Class representing valid Java primitive types
 */
public class PrimitiveType extends Type {

    public static final PrimitiveType BOOLEAN = new PrimitiveType(Primitive.BOOLEAN);
    public static final PrimitiveType BYTE    = new PrimitiveType(Primitive.BYTE);
    public static final PrimitiveType CHAR    = new PrimitiveType(Primitive.CHAR);
    public static final PrimitiveType SHORT   = new PrimitiveType(Primitive.SHORT);
    public static final PrimitiveType INT     = new PrimitiveType(Primitive.INT);
    public static final PrimitiveType LONG    = new PrimitiveType(Primitive.LONG);
    public static final PrimitiveType FLOAT   = new PrimitiveType(Primitive.FLOAT);
    public static final PrimitiveType DOUBLE  = new PrimitiveType(Primitive.DOUBLE);
    public static final PrimitiveType VOID    = new PrimitiveType(Primitive.VOID);

    private static final Map<String, Primitive> PRIMITIVE_MAP = new HashMap<>();
    public static final Map<String, PrimitiveType> UNBOX_MAP = new HashMap<>();

    static {
        for (Primitive p : Primitive.values()) {
            PRIMITIVE_MAP.put(p.name, p);
        }

        UNBOX_MAP.put("boolean", BOOLEAN);
        UNBOX_MAP.put("byte", BYTE);
        UNBOX_MAP.put("char", CHAR);
        UNBOX_MAP.put("short", SHORT);
        UNBOX_MAP.put("int", INT);
        UNBOX_MAP.put("long", LONG);
        UNBOX_MAP.put("float", FLOAT);
        UNBOX_MAP.put("double", DOUBLE);
        UNBOX_MAP.put("void", VOID);
    }

    private Primitive primitive;
    private Token token;

    /**
     * Construct a new primitive type
     * @param primitive the primitive Token
     */
    public PrimitiveType(Token primitive) {
        this.token = primitive;
        this.primitive = PRIMITIVE_MAP.get(token.getText());
    }

    public boolean equals(Object other) {
        if (other instanceof PrimitiveType) {
            PrimitiveType type = (PrimitiveType)other;
            return primitive == type.primitive &&
                Arrays.equals(annotations, type.annotations);
        }
        return false;
    }

    public int hashCode() {
        return primitive.hashCode();
    }

    public ClassSymbol getClassSymbol() {
        return box();
    }

    public ClassSymbol box() {
        return ImportManager.get("java.lang." + primitive.classname);
    }

    public String getName() {
        return primitive.name;
    }

    public String getTypeName() {
        return getName();
    }

    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException();
    }

    private enum Primitive {
        BOOLEAN("boolean", "Boolean"),
        BYTE("byte", "Byte"),
        CHAR("char", "Character"),
        SHORT("short", "Short"),
        INT("int", "Integer"),
        LONG("long", "Long"),
        FLOAT("float", "Float"),
        DOUBLE("double", "Double"),
        VOID("void", "Void");

        protected final String name;
        protected final String classname;

        Primitive(String name, String classname) {
            this.name = name;
            this.classname = classname;
        }
    }

    private PrimitiveType(Primitive primitive) {
        this.primitive = primitive;
    }
}
