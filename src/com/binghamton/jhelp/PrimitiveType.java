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
    private static final Map<PrimitiveType, PrimitiveType> SUBTYPE_MAP = new HashMap<>();
    private static final Map<PrimitiveType, List<PrimitiveType>> WIDENING_MAP = new HashMap<>();
    private static final Map<PrimitiveType, List<PrimitiveType>> NARROWING_MAP = new HashMap<>();
    public static final Map<String, PrimitiveType> UNBOX_MAP = new HashMap<>();

    static {
        for (Primitive p : Primitive.values()) {
            PRIMITIVE_MAP.put(p.name, p);
        }

        SUBTYPE_MAP.put(FLOAT, DOUBLE);
        SUBTYPE_MAP.put(LONG, FLOAT);
        SUBTYPE_MAP.put(INT, LONG);
        SUBTYPE_MAP.put(CHAR, INT);
        SUBTYPE_MAP.put(SHORT, INT);
        SUBTYPE_MAP.put(BYTE, SHORT);

        UNBOX_MAP.put("boolean", BOOLEAN);
        UNBOX_MAP.put("byte", BYTE);
        UNBOX_MAP.put("char", CHAR);
        UNBOX_MAP.put("short", SHORT);
        UNBOX_MAP.put("int", INT);
        UNBOX_MAP.put("long", LONG);
        UNBOX_MAP.put("float", FLOAT);
        UNBOX_MAP.put("double", DOUBLE);
        UNBOX_MAP.put("void", VOID);

        WIDENING_MAP.put(BYTE, new ArrayList<>(Arrays.asList(SHORT, INT, LONG,
                                                             FLOAT, DOUBLE)));
        WIDENING_MAP.put(SHORT, new ArrayList<>(Arrays.asList(INT, LONG,
                                                              FLOAT, DOUBLE)));
        WIDENING_MAP.put(CHAR, WIDENING_MAP.get(SHORT));
        WIDENING_MAP.put(INT, new ArrayList<>(Arrays.asList(LONG, FLOAT, DOUBLE)));
        WIDENING_MAP.put(LONG, new ArrayList<>(Arrays.asList(FLOAT, DOUBLE)));
        WIDENING_MAP.put(FLOAT, new ArrayList<>(Arrays.asList(DOUBLE)));


        NARROWING_MAP.put(SHORT, new ArrayList<>(Arrays.asList(BYTE, CHAR)));
        NARROWING_MAP.put(CHAR, new ArrayList<>(Arrays.asList(BYTE, SHORT)));
        NARROWING_MAP.put(INT, NARROWING_MAP.get(CHAR));
        NARROWING_MAP.get(INT).add(CHAR);
        NARROWING_MAP.put(LONG, NARROWING_MAP.get(INT));
        NARROWING_MAP.get(LONG).add(INT);
        NARROWING_MAP.put(FLOAT, NARROWING_MAP.get(LONG));
        NARROWING_MAP.get(FLOAT).add(LONG);
        NARROWING_MAP.put(DOUBLE, NARROWING_MAP.get(FLOAT));
        NARROWING_MAP.get(DOUBLE).add(FLOAT);
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
            return primitive == ((PrimitiveType)other).primitive;
        }
        return false;
    }

    public int hashCode() {
        return primitive.hashCode();
    }

    public ClassSymbol getClassSymbol() {
        return box();
    }

    @Override
    public ReflectedClassSymbol box() {
        return ImportManager.get("java.lang." + primitive.classname);
    }

    public String getName() {
        return primitive.name;
    }

    public boolean isReifiable() {
        return true;
    }

    public String getTypeName() {
        return getName();
    }

    public boolean isNumeric() {
        return primitive != Primitive.VOID && primitive != Primitive.BOOLEAN;
    }

    @Override
    public boolean isReference() {
        return false;
    }

    @Override
    public PrimitiveType adapt(Type[] args) {
        throw new UnsupportedOperationException("a primitive cannot be adapted");
    }

    public ClassSymbol getDeclaringClass() {
        throw new UnsupportedOperationException("a primitive has no declaring class");
    }

    @Override
    public boolean isSuperTypeOf(Type other) {
        if (other instanceof PrimitiveType) {
            PrimitiveType otherP = (PrimitiveType)other;
            PrimitiveType superType = SUBTYPE_MAP.get(otherP);
            return superType != null && this.primitive == superType.primitive;
        }
        return false;
    }

    @Override
    public boolean canWidenTo(Type type) {
        if (type instanceof PrimitiveType) {
            return WIDENING_MAP.get(this).contains((PrimitiveType)type);
        }
        return false;
    }

    @Override
    public boolean canNarrowTo(Type type) {
        if (type instanceof PrimitiveType) {
            return NARROWING_MAP.get(this).contains((PrimitiveType)type);
        }
        return false;
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
