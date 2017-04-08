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

    public MyPackage makeChildPackage(String childName) {
        MyPackage child = new MyPackage(childName);
        child.parent = this;
        addSubPackage(child);
        return child;
    }

    public boolean isEmpty() {
        return children.isEmpty() && classes.size() == 0;
    }

    public void setParent(MyPackage pkg) {
        parent = pkg;
    }

    public boolean hasParent() {
        return parent != null;
    }

    public String getQualifiedName() {
        String qname = super.getQualifiedName();
        if (hasParent()) {
            qname = parent.getQualifiedName() + "." + qname;
        }
        return qname;
    }

    public boolean addClass(ClassSymbol cls) {
        return classes.put(cls);
    }

    public AnnotationSymbol[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationSymbol[] annotations) {
        this.annotations = annotations;
    }

    public NamedSymbolTable<ClassSymbol> getClassTable() {
        return classes;
    }

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

    public boolean hasSubPackages() {
        return !children.isEmpty();
    }

    public MyPackage getSubPackage(String name) {
        for (MyPackage p : children) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Attempts to add a subpackage to the package
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
