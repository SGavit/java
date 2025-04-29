package data_Structure;
import java.util.*;

public class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();

    // Add a vertex
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
        System.out.println("This work");
    }

    // Add an edge (undirected by default)
    public void addEdge(String src, String dest, boolean isBidirectional) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());

        adjList.get(src).add(dest);
        if (isBidirectional) {
            adjList.get(dest).add(src);
        }
    }

    // Print the graph
    public void printGraph() {
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (String neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add edges
        graph.addEdge("A", "B", true);
        graph.addEdge("A", "C", true);
        graph.addEdge("B", "D", true);
        graph.addEdge("C", "D", true);
        graph.addEdge("D", "E", true);

        // Print
        graph.printGraph();
    }
}
