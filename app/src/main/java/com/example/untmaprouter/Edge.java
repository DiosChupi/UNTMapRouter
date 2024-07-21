package com.example.untmaprouter;

// Teammates algorithm, I just separated into a external class so need public keyword
// Edge class covering roads with distance, direction, and linked location
public class Edge {
    private Node from;              // basically a doubly linked list, prev
    private Node to;                // basically a doubly linked list, next
    private double weight;
    private String direction;

    public Edge(Node from, Node to, double weight, String direction) {
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.direction = direction;
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

    public String getDirection() {
        return direction;
    }
}
