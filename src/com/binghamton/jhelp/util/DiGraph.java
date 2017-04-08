package com.binghamton.jhelp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class DiGraph<E> {

    private static enum Color { WHITE, GRAY, BLACK };
    private final Map<DiGraphNode, List<DiGraphNode>> edgeMap = new HashMap<>();
    private final List<E> sorted = new ArrayList<>();
    private boolean acyclic = true;

    private class DiGraphNode {
        public final E value;
        public Color color = Color.WHITE;

        public DiGraphNode(E value) {
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }
    }

    public void addNode(E value) {
        addNode(new DiGraphNode(value));
    }

    public void addNode(DiGraphNode node) {
        edgeMap.put(node, new ArrayList<>());
    }

    private DiGraphNode getNode(E value) {
        for (DiGraphNode node : edgeMap.keySet()) {
            if (node.value.equals(value)) {
                return node;
            }
        }
        return null;
    }

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

    public boolean isAcyclic() {
        if (sorted.isEmpty()) {
            DFS();
        }
        return acyclic;
    }

    public List<E> topologicalSort() {
        if (sorted.isEmpty()) {
            DFS();
        }
        if (!acyclic)
            return null;
        return sorted;
    }

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

    private void DFS() {
        for (DiGraphNode node : edgeMap.keySet()) {
            if (node.color == Color.WHITE) {
                visit(node);
            }
        }
    }

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
