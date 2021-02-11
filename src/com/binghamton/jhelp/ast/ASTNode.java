package com.binghamton.jhelp.ast;

import java.util.List;

import org.antlr.v4.runtime.Token;

import com.binghamton.jhelp.antlr.MyToken;

/**
 * Base class representing a node in the AST
 */
public abstract class ASTNode implements Visitable, Comparable<ASTNode> {
    private MyToken first;
    private MyToken last;
    private boolean singular;

    /**
     * Construct a new empty ASTNode, to be used sparingly
     */
    protected ASTNode() {
        first = last = null;
        singular = true;
    }

    /**
     * Construct a new ASTNode with a single underlying ANTLR Token
     * @param token the sole Token of this ASTNode
     */
    public ASTNode(Token token) {
        this(token, token);
    }


    /**
     * Construct a new ASTNode spanning multiple ANTLR tokens
     * @param first the first token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public ASTNode(Token first, Token last) {
        setFirstToken(first);
        setLastToken(last);
        setSingular();
    }

    /**
     * Construct a new ASTNode from a list of nodes
     * @param <E> the type of the node list elements
     * @param nodes the nodes to construct this node from
     */
    public <E extends ASTNode> ASTNode(List<E> nodes) {
        if (!nodes.isEmpty()) {
            setFirstToken(nodes.get(0).getFirstToken());
            setLastToken(nodes.get(nodes.size()-1).getLastToken());
            setSingular();
        }
    }

    /**
     * Determine if this ASTNode spans only one token
     * @return true  if this ASTNode spans only one token
     *         false if this ASTNode spans more than one token
     */
    public boolean isSingular() {
        return singular;
    }

    /**
     * Establishes whether this node is comprised of one or many Tokens
     */
    public final void setSingular() {
        singular = isNil() || first.equals(last);
    }

    /**
     * An ASTNode is nil iff it is comprised of no Tokens
     * @return true  if this Node has no Tokens
     *         false if this Node is comprised of any Token(s)
     */
    public boolean isNil() {
        return first == null;
    }

    /**
     * Gets the first token of this ASTNode
     * @return the first token of this ASTNode
     */
    public final MyToken getFirstToken() {
        return first;
    }

    /**
     * Sets the first token of this ASTNode
     * @param first the first token of this ASTNode
     */
    public final void setFirstToken(Token first) {
        if (first != null && !(first instanceof MyToken)) {
            throw new IllegalArgumentException("AST Node tokens must be MyTokens");
        }
        this.first = (MyToken)first;
        setSingular();
    }

    /**
     * Gets the last token of this ASTNode
     * @return the last token of this ASTNode
     */
    public final MyToken getLastToken() {
        return last;
    }

    /**
     * Sets the last token of this ASTNode
     * @param last the last token of this ASTNode
     */
    public final void setLastToken(Token last) {
        if (last == null) {
            this.last = first;
            singular = true;
        } else if (!(last instanceof MyToken)) {
            throw new IllegalArgumentException("AST Node tokens must be MyTokens");
        } else {
            this.last = (MyToken)last;
            setSingular();
        }
    }

    /**
     * Determines if this object is the other object
     * @param other the other object
     * @return true iff this == other
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof ASTNode){
            ASTNode oNode = (ASTNode)other;
            return first.equals(oNode.first) &&
                last.equals(oNode.last);
        }
        return false;
    }

    /**
     * Determines the hash code of this object
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        int ret = first.hashCode();
        if (!singular) {
            ret ^= last.hashCode();
        }
        return ret;
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
             this.accept(visitor);
         }
         if (order == Visitable.Order.POST)
         {
             this.accept(visitor);
         }
     }

    /**
     * Gets the text of this Node's tokens
     * @return the text of this Node's tokens
     */
    public String getText() {
        if (isNil()) {
            return "";
        }
        return first.getTextUpTo(last);
    }

    /**
     * Gets the text of the Tokens comprising this ASTNode
     * @return the text of the Tokens comprising this ASTNode
     */
    @Override
    public String toString() {
        return getText();
    }

    /**
     * Compares nodes based on their starting Tokens
     * @param other the other node to compare against
     * @return negative number if this node lexically precedes other
     *         exactly 1 if this node is other
     *         positive number if other lexically precedes this node
     */
    @Override
    public int compareTo(ASTNode other) {
        return first.compareTo(other.first);
    }

    /**
     * Determines if any nodes precede candidate
     * @param <E> the type of the Node list
     * @param candidate the Token holding what may appear first
     * @param nodes a non-null, possibly-empty list of ASTNodes
     * @return the lexically earliest Token among candidate and nodes
     */
    public static <E extends ASTNode> Token getFirstToken(Token candidate,
                                                          List<E> nodes) {
        if (nodes.isEmpty()) {
            return candidate;
        } else {
            return nodes.get(0).getFirstToken();
        }
    }

    /**
     * Determines if any nodes follow candidate
     * @param <E> the type of the Node list
     * @param candidate the Token holding what may appear last
     * @param nodes a non-null, possibly-empty list of ASTNodes
     * @return the lexically latest Token among candidate and nodes
     */
    public static <E extends ASTNode> Token getLastToken(Token candidate,
                                                         List<E> nodes) {
        if (nodes.isEmpty()) {
            return candidate;
        } else {
            return nodes.get(nodes.size()-1).getLastToken();
        }
    }
}
