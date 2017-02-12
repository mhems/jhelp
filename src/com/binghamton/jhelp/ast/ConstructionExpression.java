package com.binghamton.jhelp.ast;

/**
 * A class representing a Java instantiation expression
 */
public class ConstructionExpression extends Expression {
    private List<TypeArgument> typeArgs;
    private List<Annotation> annotations;
    private String name;
    private List<Pair<Annotations, String>> annotatedIds;
    private List<TypeArgument> finalTypeArgs;
    private List<Expression> args;
    private ConcreteBodyDeclaration classBody;

    public ConstructionExpression(List<TypeArgument> typeArgs,
                                  List<Annotation> annotations,
                                  String name,
                                  List<TypeArgument> finalTypeArgs,
                                  List<Expression> arguments,
                                  ConcreteBodyDeclaration classBody) {
        this.typeArgs = typeArgs;
        this.annotations = annotations;
        this.name = name;
        this.finalTypeArgs = finalTypeArgs;
        this.args = arguments;
        this.classBody = classBody;
    }

    public void addAnnotatedIdentifier(Annotations annotations, String id) {
        annotatedIds.add(new Pair(annotations, id));
    }
}
