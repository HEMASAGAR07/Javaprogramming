package DSA_LAB;

import java.util.*;

public class Krushkal {
    private int vertices;
    private List<Edge> edges;

    public Krushkal(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        this.edges.add(new Edge(source, destination, weight));
    }

    public void kruskalMST() {
        // Sort edges based on weight in ascending order
        Collections.sort(edges, Comparator.comparingInt(edge -> edge.weight));

        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i; // Initialize each vertex as its own set
        }

        List<Edge> minimumSpanningTree = new ArrayList<>();

        for (Edge edge : edges) {
            int rootSource = find(parent, edge.source);
            int rootDestination = find(parent, edge.destination);

            // Check if adding this edge creates a cycle
            if (rootSource != rootDestination) {
                minimumSpanningTree.add(edge);
                union(parent, rootSource, rootDestination);
            }
        }

        // Print the Minimum Spanning Tree
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println("Edge: " + edge.source + " - " + edge.destination + ", Weight: " + edge.weight);
        }
    }

    private int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]);
        }
        return parent[vertex];
    }

    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        parent[rootX] = rootY;
    }

    public static void main(String[] args) {
        int vertices = 5;
        Krushkal graph = new Krushkal(vertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        graph.kruskalMST();
    }

    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
}
