package com.example.untmaprouter;

import java.util.*;

// Manages the graph structure and implements Dijkstra's algorithm to compute shortest paths from a given start node. It uses a priority queue (PriorityQueue) to efficiently retrieve nodes with the smallest known distance
class Graph {
    private Map<Node, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addNode(Node node) {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node from, Node to, double weight, String name) {
        adjList.get(from).add(new Edge(from, to, weight, name));
    }

    public Map<Node, Double> dijkstra(Node start, Map<Node, Edge> prevEdges) {
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, List<Edge>> paths = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingDouble(distances::get));

        // Initialize distances to all nodes as infinity
        for (Node node : adjList.keySet()) {
            distances.put(node, Double.POSITIVE_INFINITY);
            paths.put(node, new ArrayList<>());
        }

        // Distance to the start node is 0
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            double currentDistance = distances.get(current);

            // Iterate over neighbors of current node
            for (Edge edge : adjList.get(current)) {
                Node neighbor = edge.getTo();
                double newDistance = currentDistance + edge.getWeight();

                // If a shorter path to neighbor is found, update distance and add to priority queue
                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    pq.add(neighbor);
                    paths.get(neighbor).clear();
                    paths.get(neighbor).add(edge);
                    prevEdges.put(neighbor, edge);
                } else if (newDistance == distances.get(neighbor)) {
                    paths.get(neighbor).add(edge);
                }
            }
        }

        return distances;
    }

    public List<Edge> getPath(Node start, Node end, Map<Node, Edge> prevEdges) {
        List<Edge> path = new ArrayList<>();
        Node current = end;

        while (current != null && !current.equals(start)) {
            Edge edge = prevEdges.get(current);
            if (edge == null) {
                throw new IllegalArgumentException("No path found from " + start + " to " + end);
            }
            path.add(0, edge); // prepend to maintain order
            current = edge.getFrom();
        }

        if (current == null && !end.equals(start)) {
            throw new IllegalArgumentException("No path found from " + start + " to " + end);
        }

        return path;
    }

    public List<Edge> getEdges(Node node) {
        return adjList.get(node);
    }
}