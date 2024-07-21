package com.example.untmaprouter;

// Teammates algorithm, I just separated into a external class so need public keyword
// Edge class covering roads with distance, direction, and linked location
// Represents an edge with attributes from, to, weight, and name. It also has a toString method for easy output formatting
public class Edge {
    private Node from;
    private Node to;
    private double weight;
    private String name;

    public Edge(Node from, Node to, double weight, String name) {
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.name = name;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return from.getName() + " -> " + to.getName() + " (" + name + "), ft: " + weight;
    }
}
