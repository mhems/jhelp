package com.binghamton.jhelp.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.Modifier;
import com.binghamton.jhelp.symbols.MyVariableSymbol;

/**
 * A class representing a constant in a Java enum
 * e.g. {@code Foo { ... }}
 */
public class EnumConstant extends Declaration {
    private final List<Expression> arguments;
    private final ClassDeclaration body = new ClassDeclaration();

    /**
     * Construct an enum constant
     * @param name the token holding the name of this constant
     * @param annotations the annotations of this constant
     * @param arguments the arguments to this constant
     */
    public EnumConstant(Token name,
                        List<Annotation> annotations,
                        List<Expression> arguments) {
        super(name, name, new ArrayList<Modifier>(), annotations);
        this.arguments = arguments;
    }

    /**
     * Gets the anonymous body of this EnumConstant
     * @return the anonymous body of this EnumConstant
     */
    public ClassDeclaration getBody() {
        return body;
    }

    /**
     * Gets the field associated with this declaration
     * @return the field associated with this declaration
     */
    public MyVariableSymbol getSymbol() {
        return (MyVariableSymbol)super.getSymbol();
    }

    /**
     * Determines if this constant has a body
     * @return true iff this constant has no body
     */
    public boolean isEmpty() {
        return body.isEmpty();
    }

    /**
     * Gets the arguments to this enum constant
     * @return the arguments to this enum constant
     */
    public List<Expression> getArguments() {
        return arguments;
    }

    /**
     * Gets the number of arguments to this enum constant
     * @return the number of arguments to this enum constant
     */
    public int numArguments() {
        return arguments.size();
    }

    /**
     * Double dispatch this class on parameter
     * @param v the visitor to accept
     */
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    /**
     * Visits the implementor's constituents and then the implementor
     * @param visitor the visitor to visit with
     * @param order the order to vist the implementor with respect to its constituents
     */
    public void acceptRec(ASTVisitor visitor, Visitable.Order order)
     {
         if (order == Visitable.Order.PRE)
         {
             visitor.visit(this);
         }
         for (Annotation a : getAnnotations())
         {
             a.acceptRec(visitor, order);
         }
         for (Expression e : arguments)
         {
             e.acceptRec(visitor, order);
         }
         body.acceptRec(visitor, order);
         if (order == Visitable.Order.POST)
         {
             visitor.visit(this);
         }
     }
}
