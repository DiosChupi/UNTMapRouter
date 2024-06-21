package com.example.untmaprouter;

import java.util.*;

// Teammates algorithm, I just separated into a external class so need public keyword
public class Graph {
    private Map<Node, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addNode(Node node) {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node from, Node to, double weight, String direction) {
        adjList.get(from).add(new Edge(from, to, weight, direction));
    }

    public Map<Node, List<Edge>> getAdjList() {
        return adjList;
    }

    public List<String> dijkstra(Node start, Node end) {
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> previous = new HashMap<>();
        Map<Node, String> previousEdgeDirection = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        Set<Node> visited = new HashSet<>();

        for (Node node : adjList.keySet()) {
            distances.put(node, Double.MAX_VALUE);
            previous.put(node, null);
            previousEdgeDirection.put(node, null);
        }
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.equals(end)) {
                break;
            }

            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);

            for (Edge edge : adjList.get(current)) {
                Node neighbor = edge.getTo();
                double newDist = distances.get(current) + edge.getWeight();
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    previous.put(neighbor, current);
                    previousEdgeDirection.put(neighbor, edge.getDirection());
                    pq.add(neighbor);
                }
            }
        }

        List<String> path = new ArrayList<>();
        for (Node at = end; at != null; at = previous.get(at)) {
            if (previous.get(at) != null) {
                path.add("Travel " + previousEdgeDirection.get(at) + " to " + at.getName());
            } else {
                path.add(at.getName());
            }
        }
        Collections.reverse(path);
        return path.size() == 1 && !path.contains(start.getName()) ? new ArrayList<>() : path;
    }

}
