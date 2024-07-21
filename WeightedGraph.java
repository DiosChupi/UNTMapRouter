import java.util.*;

// Node class covering buildings and interections
class Node {
    private String name; // Name of building or intersection

    public Node(String name) { // Constructor that initializes name
        this.name = name;
    }

    public String getName() { // Retriever To get name
        return name;
    }
}

// Edge class covering roads with distance, direction, and linked location.
class Edge {
    private Node from; // Start of road segment
    private Node to; // End of road segment
    private double weight; // Length of road segment in miles
    private String direction; // Cardinal direction the road travels in (NEED 2 Segments)

    public Edge(Node from, Node to, double weight, String direction) { // Constructor to build road
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.direction = direction;
    }

    public Node getFrom() { // Retriever to get from destination
        return from;
    }

    public Node getTo() { // Retriever to get to destination
        return to;
    }

    public double getWeight() { // Retriever to get length of road
        return weight;
    }

    public String getDirection() { // Retriever to get direction
        return direction;
    }
}

// Graph class covering functionality of the map and instruction set
class Graph {
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

public class WeightedGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Creating nodes (intersections or buildings)
        Node nodeA = new Node("Chemistry Bldg");
        Node nodeB = new Node("Mulbury/Sycamore Intersection");
        Node nodeC = new Node("Science Research");
        Node nodeD = new Node("Mulbury/GAB Intersection");
        Node nodeE = new Node("GAB");

        // Adding nodes to the graph
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);

        // Adding edges (roads) with weights (lengths in miles) and directions
        graph.addEdge(nodeA, nodeB, 1.2, "east");
        graph.addEdge(nodeB, nodeA, 1.2, "west");  

        graph.addEdge(nodeB, nodeC, 2.5, "east");
        graph.addEdge(nodeC, nodeB, 2.5, "west");  

        graph.addEdge(nodeC, nodeD, 1.0, "east");
        graph.addEdge(nodeD, nodeC, 1.0, "west");  

        graph.addEdge(nodeD, nodeE, 3.0, "south");
        graph.addEdge(nodeE, nodeD, 3.0, "north");  


        // Running Dijkstra's algorithm to test
        List<String> path = graph.dijkstra(nodeE, nodeA);

        // Output the directions
        if (path.isEmpty()) {
            System.out.println("No path found from " + nodeE.getName() + " to " + nodeA.getName());
        } else {
            System.out.println("Shortest path from " + nodeE.getName() + " to " + nodeA.getName() + ":");
            for (String direction : path) {
                System.out.println(direction);
            }
        }
    }
}
