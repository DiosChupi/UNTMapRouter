package com.example.untmaprouter;

// Teammates algorithm, I just separated into a external class so need public keyword
// Node class covering buildings and intersections
public class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
