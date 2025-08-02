package Exercism_java.ex_DOT_DSL;

import java.util.*;

public class Graph {

    private final Map<String,Node> nodes;
    private final Set<Edge> edges;
    private final Map<String, String> attributes;


    public Graph() {
        this.edges = new HashSet<>();
        this.nodes = new HashMap<>();
        this.attributes = new HashMap<>();
    }

    public Graph(Map<String, String> attributes) {
        this();
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Collection<Edge> getEdges() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph node(String name) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph node(String name, Map<String, String> attributes) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph edge(String start, String end) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Map<String, String> getAttributes() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
