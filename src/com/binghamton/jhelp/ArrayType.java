package com.binghamton.jhelp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.binghamton.jhelp.antlr.MyToken;
import com.binghamton.jhelp.ast.ASTVisitor;

import static com.binghamton.jhelp.ImportingSymbolTable.fetch;

/**
 * Class representing an array type
 */
public class ArrayType extends ReferenceType {
    private static Map<Type, ArrayClassSymbol> cache = new HashMap<>();
    private final Type base;

    /**
     * Construct an array type
     * @param base the base Type of the array
     */
    public ArrayType(Type base) {
        this(base, new AnnotationSymbol[0]);
    }

    /**
     * Construct an annotated array type
     * @param base the base Type of the array
     * @param annotations the AnnotationSymbols annotating this type
     */
    public ArrayType(Type base, AnnotationSymbol[] annotations) {
        super(annotations);
        this.base = base;
        ArrayClassSymbol rep = cache.get(base);
        if (rep == null) {
            rep = new ArrayClassSymbol(base);
            cache.put(base, rep);
            rep.init();
        }
    }

    /**
     * Gets the base type of this ArrayType
     * @return the base type of this ArrayType
     */
    public Type getBaseType() {
        return base;
    }

    @Override
    public String getTypeName() {
        return base.getTypeName() + "[]";
    }

    @Override
    public String getName() {
        return base.getName() + "[]";
    }

    @Override
    public int rank() {
        return 1 + base.rank();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof ArrayType) {
            ArrayType type = (ArrayType)other;
            return Arrays.equals(annotations, type.annotations) &&
                base.equals(type.base);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return base.hashCode() ^ annotations.length;
    }

    @Override
    public Type erase() {
        return base.erase();
    }

    @Override
    public ArrayType adapt(Map<TypeVariable, Type> map) {
        return new ArrayType(base.adapt(map), annotations);
    }

    @Override
    public ClassSymbol getClassSymbol() {
        return cache.get(base);
    }

    /**
     * Gets the ClassSymbol where this type is declared
     * @return the ClassSymbol where this type is declared
     */
    @Override
    public ClassSymbol getDeclaringClass() {
        return base.getDeclaringClass();
    }

    @Override
    public boolean isReifiable() {
        return base.isReifiable();
    }

    @Override
    public boolean isRaw() {
        return base.isRaw();
    }

    @Override
    public boolean isValidClassLiteralType() {
        return base.isValidClassLiteralType();
    }

    @Override
    public boolean canCastTo(Type target) {
        if (target instanceof ClassSymbol) {
            ClassSymbol targetCls = (ClassSymbol)target;
            if (targetCls.isClassLike()) {
                return fetch("Object").equals(target);
            } else {
                return fetch("java.io.Serializable").equals(target) ||
                    fetch("Serializable").equals(target);
            }
        } else if (target instanceof TypeVariable) {
            return canCastTo(((TypeVariable)target).getUpperBound());
        } else if (target instanceof ArrayType) {
            Type targetBaseType = ((ArrayType)target).base;
            if (base instanceof PrimitiveType) {
                return base.equals(targetBaseType);
            }
            return base.canCastTo(targetBaseType);
        }
        return true;
    }

    /**
     * A class to represent the ClassSymbol generated for each new ArrayType
     */
    private static final class ArrayClassSymbol extends ClassSymbol {

        private static final MyVariableSymbol lengthField;
        private Type baseType;

        static {
            lengthField = new MyVariableSymbol("length",
                                               new Modifiers(Modifier.PUBLIC,
                                                             Modifier.FINAL));
            lengthField.setType(PrimitiveType.INT);
        }

        /**
         * Construct a new ArrayClassSymbol from its base Type
         * @param baseType the base Type of the array
         */
        private ArrayClassSymbol(Type baseType) {
            super("[" + baseType.getName());
            this.baseType = baseType;
            superClass = fetch("Object");
        }

        /**
         * Initializes the members of this ClassSymbol.
         * Must be called once per instance before any other operations.
         * Automatically called by all constructors.
         */
        private void init() {
            interfaces.put(fetch("java.io.Serializable"));
            interfaces.put(fetch("Cloneable"));
            fields.put(lengthField);
            MyMethodSymbol cloneMethod = new MyMethodSymbol("clone",
                                                            new Modifiers(Modifier.PUBLIC));
            cloneMethod.setReturnType(new ArrayType(baseType));
            methods.put(cloneMethod);
        }

        @Override
        public ClassSymbol getDeclaringClass() {
            throw new UnsupportedOperationException("a synthetic array class has no declaring class");
        }

        @Override
        public boolean isEnum() {
            return false;
        }

        @Override
        public boolean isClass() {
            return false;
        }

        @Override
        public boolean isInterface() {
            return false;
        }

        @Override
        public boolean isAnnotation() {
            return false;
        }

        @Override
        public boolean isBoxed() {
            return false;
        }

        @Override
        public Package getPackage() {
            return null;
        }

        @Override
        public String getQualifiedName() {
            return getName();
        }

        @Override
        public String getTypeName() {
            return getName();
        }

        @Override
        public ArrayClassSymbol adapt(Map<TypeVariable, Type> map) {
            return this;
        }

        @Override
        protected ArrayClassSymbol makeNew() {
            return new ArrayClassSymbol(baseType);
        }
    }
}
