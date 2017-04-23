package com.binghamton.jhelp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * A directed graph
 * @param <E> the type of the elements this DiGraph holds
 */
public class DiGraph<E> {

    private static enum Color { WHITE, GRAY, BLACK };
    private final Map<DiGraphNode, List<DiGraphNode>> edgeMap = new HashMap<>();
    private final List<E> sorted = new ArrayList<>();
    private boolean acyclic = true;

    /**
     * Helper class to hold graph nodes
     */
    private class DiGraphNode {
        public final E value;
        public Color color = Color.WHITE;

        /**
         * Constructs a new DiGraphNode
         * @param value the element the Node is to hold
         */
        public DiGraphNode(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    /**
     * Adds a node to this graph
     * @param value the value the new node should have
     */
    public void addNode(E value) {
        addNode(new DiGraphNode(value));
    }

    /**
     * Adds a node to this graph
     * @param node the node to add
     */
    public void addNode(DiGraphNode node) {
        edgeMap.put(node, new ArrayList<>());
    }

    /**
     * Gets a node by the value it holds
     * @param value the element to search for
     * @return the node that holds the given value
     */
    private DiGraphNode getNode(E value) {
        for (DiGraphNode node : edgeMap.keySet()) {
            if (node.value.equals(value)) {
                return node;
            }
        }
        return null;
    }

    /**
     * Adds an edge to this graph
     * @param from the element to edge is incident from
     * @param to the element to edge is incident to
     */
    public void addEdge(E from, E to) {
        DiGraphNode fromNode = getNode(from);
        DiGraphNode toNode = getNode(to);
        if (fromNode == null) {
            fromNode = new DiGraphNode(from);
            edgeMap.put(fromNode, new ArrayList<>());
        }
        if (toNode == null) {
            toNode = new DiGraphNode(to);
            edgeMap.put(toNode, new ArrayList<>());
        }
        edgeMap.get(fromNode).add(toNode);
    }

    /**
     * Determines if this graph is acyclic
     * @return true iff this graph is acyclic
     */
    public boolean isAcyclic() {
        if (sorted.isEmpty()) {
            DFS();
        }
        return acyclic;
    }

    /**
     * Topologically sorts this graph
     * @return a List of this graph elements in topological order
     */
    public List<E> topologicalSort() {
        if (sorted.isEmpty()) {
            DFS();
        }
        if (!acyclic)
            return null;
        return sorted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DiGraphNode node : edgeMap.keySet()) {
            sb.append(node.toString());
            sb.append(" -> ");
            sb.append(edgeMap.get(node));
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Performs depth-first traversal over this graph
     */
    private void DFS() {
        for (DiGraphNode node : edgeMap.keySet()) {
            if (node.color == Color.WHITE) {
                visit(node);
            }
        }
    }

    /**
     * Visits a node in depth-first order
     */
    private void visit(DiGraphNode node) {
        node.color = Color.GRAY;
        for (DiGraphNode adj : edgeMap.get(node)) {
            if (adj.color == Color.WHITE) {
                visit(adj);
            } else if (adj.color == Color.GRAY) {
                acyclic = false;
            }
        }
        node.color = Color.BLACK;
        sorted.add(0, node.value);
    }
}
