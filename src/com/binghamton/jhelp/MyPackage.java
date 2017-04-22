package com.binghamton.jhelp;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a user-created Java package
 */
public class MyPackage extends Package {
    public static final MyPackage DEFAULT_PACKAGE = new MyPackage("<DEFAULT>") {
            public boolean isDefault() {
                return true;
            }
        };

    private final NamedSymbolTable<ClassSymbol> classes = new NamedSymbolTable<>();
    private MyPackage parent;
    private final List<MyPackage> children = new ArrayList<>();
    private AnnotationSymbol[] annotations = {};

    /**
     * Constructs a new MyPackage with name `name`
     * @param name the name of the package
     */
    public MyPackage(String name) {
        super(name);
    }

    /**
     * Creates a sub-package for this Package
     * @param childName the name of the sub-package to create
     * @return a new named MyPackage, itself a sub-package of this Package
     */
    public MyPackage makeChildPackage(String childName) {
        MyPackage child = new MyPackage(childName);
        child.parent = this;
        addSubPackage(child);
        return child;
    }

    /**
     * Determines if this Package is empty.
     * @return true iff this Package is empty
     */
    public boolean isEmpty() {
        return children.isEmpty() && classes.size() == 0;
    }

    /**
     * Sets the enclosing Package of this Package
     * @param pkg the enclosing Package of this Package
     */
    public void setParent(MyPackage pkg) {
        parent = pkg;
    }

    /**
     * Determines if this Package has an enclosing Package
     * @return true iff this Package has an enclosing Package
     */
    public boolean hasParent() {
        return parent != null;
    }

    /**
     * Builds the qualified name of this Package
     * @return the qualified name of this Package
     */
    @Override
    public String getQualifiedName() {
        String qname = super.getQualifiedName();
        if (hasParent()) {
            qname = parent.getQualifiedName() + "." + qname;
        }
        return qname;
    }

    /**
     * Adds a class this Package declares
     * @param cls the class this Package declares
     * @return true iff the class was added successfully
     */
    public boolean addClass(ClassSymbol cls) {
        return classes.put(cls);
    }

    /**
     * Gets the annotations of this Package
     * @return the annotations of this Package
     */
    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    /**
     * Sets the annotations this Package is annotated with
     * @param annotations the annotations this Package is annotated with
     */
    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    /**
     * Gets the SymbolTable holding the classes this Package declaresn
     * @return the SymbolTable holding the classes this Package declares
     */
    public NamedSymbolTable<ClassSymbol> getClassTable() {
        return classes;
    }

    /**
     * Gets a class of this Package by name
     * @param name the name of the class to get
     * @return the class this Package declares with the given name
     */
    @Override
    public ClassSymbol getClass(String name) {
        return classes.get(name);
    }

    /**
     * Gets the packages within this package
     * @return the packages within this package
     */
    public List<MyPackage> getSubPackages() {
        return children;
    }

    /**
     * Determines if this Package has any sub-packages
     * @return true iff this Package has any sub-packages
     */
    public boolean hasSubPackages() {
        return !children.isEmpty();
    }

    /**
     * Gets a sub-package of this Package by name
     * @param name the name of the sub-package to get
     * @return the sub-package this Packages declares with the given name
     */
    public MyPackage getSubPackage(String name) {
        for (MyPackage p : children) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Adds a subpackage to the package
     * @param subPkg the package to attempt to add
     */
    public void addSubPackage(MyPackage subPkg) {
        children.add(subPkg);
    }

    @Override
    public String repr() {
        StringBuilder sb = new StringBuilder("package ");
        sb.append(name);
        if (!isEmpty()) {
            sb.append("\n");
            sb.append("declares:\n");
            sb.append(classes.repr());
            if (hasSubPackages()) {
                sb.append("\nhas children: \n");
                for (MyPackage cp : children) {
                    sb.append(cp.repr());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
