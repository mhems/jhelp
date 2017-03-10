package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

/**
 * Class representing valid Java primitive types
 */
public class PrimitiveType implements Type {

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

        UNBOX_MAP.put("Boolean", BOOLEAN);
        UNBOX_MAP.put("Byte", BYTE);
        UNBOX_MAP.put("Character", CHAR);
        UNBOX_MAP.put("Short", SHORT);
        UNBOX_MAP.put("Integer", INT);
        UNBOX_MAP.put("Long", LONG);
        UNBOX_MAP.put("Float", FLOAT);
        UNBOX_MAP.put("Double", DOUBLE);
        UNBOX_MAP.put("Void", VOID);
    }

    private Primitive primitive;
    private Token token;
    private AnnotationSymbol[] annotations = {};

    /**
     * Construct a new primitive type
     * @param primitive the primitive Token
     */
    public PrimitiveType(Token primitive) {
        this.token = primitive;
        this.primitive = PRIMITIVE_MAP.get(token.getText());
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
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
