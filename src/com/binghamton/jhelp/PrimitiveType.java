package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

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
    private static final Map<String, PrimitiveType> UNBOX_MAP = new HashMap<>();

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

        UNBOX_MAP.put("Boolean", BOOLEAN);
        UNBOX_MAP.put("Byte", BYTE);
        UNBOX_MAP.put("Character", CHAR);
        UNBOX_MAP.put("Short", SHORT);
        UNBOX_MAP.put("Integer", INT);
        UNBOX_MAP.put("Long", LONG);
        UNBOX_MAP.put("Float", FLOAT);
        UNBOX_MAP.put("Double", DOUBLE);
        UNBOX_MAP.put("Void", VOID);

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

    /**
     * Determines if a name names a valid primitive type
     * @param name the name to inquire about
     * @return true iff the given name names a valid primitive type
     */
    public static boolean isPrimitiveName(String name) {
        return PRIMITIVE_MAP.containsKey(name);
    }

    /**
     * Gets the PrimitiveType associated with its boxed class name
     * @param name the name of a boxed primitive class
     * @return the corresponding PrimitiveType to the given boxed name
     */
    public static PrimitiveType fromBoxedName(String name) {
        return UNBOX_MAP.get(name);
    }

    /**
     * Gets the PrimitiveType associated with a primitive name
     * @param name the name of the primitive
     * @return the corresponding PrimitiveType to the given primitive name
     */
    public static PrimitiveType fromPrimitiveName(String name) {
        return new PrimitiveType(PRIMITIVE_MAP.get(name));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof PrimitiveType) {
            return primitive == ((PrimitiveType)other).primitive;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return primitive.hashCode();
    }

    @Override
    public ClassSymbol getClassSymbol() {
        return box();
    }

    @Override
    public ClassSymbol box() {
        return fetch(primitive.classname);
    }

    @Override
    public String getName() {
        return primitive.name;
    }

    @Override
    public boolean isReifiable() {
        return true;
    }

    @Override
    public String getTypeName() {
        return getName();
    }

    /**
     * Determines if this primitive is numeric
     * @return true iff this primitive is numeric
     */
    public boolean isNumeric() {
        return primitive != Primitive.VOID && primitive != Primitive.BOOLEAN;
    }

    @Override
    public boolean isReference() {
        return false;
    }

    @Override
    public PrimitiveType adapt(Map<TypeVariable, Type> map) {
        return this;
    }

    @Override
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

    /**
     * An enum to enumerate the Java primitive types
     */
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

        /**
         * Constructs a named primitive
         * @param name the name of this Primitive
         * @param classname the name of the class representing the boxed type of
         *        this Primitive
         */
        Primitive(String name, String classname) {
            this.name = name;
            this.classname = classname;
        }
    }

    /**
     * Copies this Type into a new PrimitiveType
     * @return a new PrimitiveType with a copy of this type's contents
     */
    public PrimitiveType copy() {
        if (token != null) {
            return new PrimitiveType(token);
        }
        return this;
    }

    /**
     * Constructs a PrimitiveType from an underlying Primitive
     * @param primitive the underlying Primitive
     */
    private PrimitiveType(Primitive primitive) {
        this.primitive = primitive;
    }
}
