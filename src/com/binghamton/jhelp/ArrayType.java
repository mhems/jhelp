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
     * Construct a named array type
     * @param base the base Type of the array
     */
    public ArrayType(Type base) {
        this(base, new AnnotationSymbol[0]);
    }

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

    public Type getBaseType() {
        return base;
    }

    public String getTypeName() {
        return base.getTypeName() + "[]";
    }

    public String getName() {
        return base.getName() + "[]";
    }

    public int rank() {
        return 1 + base.rank();
    }

    public boolean equals(Object other) {
        if (other instanceof ArrayType) {
            ArrayType type = (ArrayType)other;
            return Arrays.equals(annotations, type.annotations) &&
                base.equals(type);
        }
        return false;
    }

    public int hashCode() {
        return base.hashCode() ^ annotations.length;
    }

    public Type erase() {
        return base.erase();
    }

    @Override
    public ArrayType adapt(Map<TypeVariable, Type> map) {
        return new ArrayType(base.adapt(map), annotations);
    }

    public ClassSymbol getClassSymbol() {
        return cache.get(base);
    }

    public ClassSymbol getDeclaringClass() {
        return base.getDeclaringClass();
    }

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

    private static final class ArrayClassSymbol extends ClassSymbol {

        private static final MyVariableSymbol lengthField;
        private Type baseType;

        static {
            lengthField = new MyVariableSymbol(new MyToken(0, "length"),
                                               new Modifiers(Modifier.PUBLIC,
                                                             Modifier.FINAL));
            lengthField.setType(PrimitiveType.INT);
        }

        private ArrayClassSymbol(Type baseType) {
            super("[" + baseType.getName());
            this.baseType = baseType;
            superClass = fetch("Object");
        }

        private void init() {
            interfaces.put(fetch("java.io.Serializable"));
            interfaces.put(fetch("Cloneable"));
            fields.put(lengthField);
            MyMethodSymbol cloneMethod = new MyMethodSymbol(new MyToken(0, "clone"),
                                                            new Modifiers(Modifier.PUBLIC));
            cloneMethod.setReturnType(new ArrayType(baseType));
            methods.put(cloneMethod);
        }

        @Override
        public ClassSymbol getDeclaringClass() {
            throw new UnsupportedOperationException("a synthetic array class has no declaring class");
        }

        public boolean isEnum() {
            return false;
        }

        public boolean isClass() {
            return false;
        }

        public boolean isInterface() {
            return false;
        }

        public boolean isAnnotation() {
            return false;
        }

        public boolean isBoxed() {
            return false;
        }

        public Package getPackage() {
            return null;
        }

        public String getQualifiedName() {
            return getName();
        }

        public String getTypeName() {
            return getName();
        }

        @Override
        public ArrayClassSymbol adapt(Map<TypeVariable, Type> map) {
            return this;
        }

        @Override
        protected ArrayClassSymbol adapt(Map<TypeVariable, Type> map,
                                         boolean b) {
            return adapt(map);
        }

        public void visit(ASTVisitor visitor) {
            // wont be visited
        }
    }
}
